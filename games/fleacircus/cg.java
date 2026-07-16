/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends gi {
    private ah field_x;
    private hc field_n;
    private rf field_j;
    private ah field_r;
    static int field_y;
    private w field_f;
    private int field_A;
    static String field_v;
    private byte[] field_i;
    static fh field_h;
    static volatile long field_z;
    private int field_e;
    private byte[] field_u;
    private int field_m;
    private af field_o;
    private dl field_g;
    private boolean field_t;
    private boolean field_q;
    private int field_l;
    private vc field_p;
    private vc field_s;
    private boolean field_k;
    private long field_w;

    final static void a(byte param0, int param1) {
        if (param0 != -105) {
            field_h = null;
        }
        cl.field_b = param1;
    }

    final rf a(int param0) {
        byte[] var2 = null;
        int var4 = 0;
        byte[] var5 = null;
        var4 = fleas.field_A ? 1 : 0;
        if (null == ((cg) this).field_j) {
          L0: {
            if (((cg) this).field_g != null) {
              break L0;
            } else {
              if (!((cg) this).field_f.a(param0 + 1805)) {
                ((cg) this).field_g = (dl) (Object) ((cg) this).field_f.a(param0 ^ -1745, true, ((cg) this).field_m, 255, (byte) 0);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((cg) this).field_g.field_q) {
            L1: {
              var5 = ((cg) this).field_g.g(100);
              var2 = var5;
              if (!(((cg) this).field_g instanceof qh)) {
                if (var5 != null) {
                  ((cg) this).field_j = new rf(var5, ((cg) this).field_A, ((cg) this).field_u);
                  if (null != ((cg) this).field_r) {
                    qh discarded$1 = ((cg) this).field_o.a(83, ((cg) this).field_m, ((cg) this).field_r, var5);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  throw new RuntimeException();
                }
              } else {
                if (var5 == null) {
                  throw new RuntimeException();
                } else {
                  ((cg) this).field_j = new rf(var5, ((cg) this).field_A, ((cg) this).field_u);
                  if ((((cg) this).field_e ^ -1) == (((cg) this).field_j.field_t ^ -1)) {
                    break L1;
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            L2: {
              if (param0 == -1712) {
                break L2;
              } else {
                ((cg) this).c(117);
                break L2;
              }
            }
            L3: {
              if (null == ((cg) this).field_x) {
                break L3;
              } else {
                ((cg) this).field_i = new byte[((cg) this).field_j.field_i];
                break L3;
              }
            }
            ((cg) this).field_g = null;
            return ((cg) this).field_j;
          } else {
            return null;
          }
        } else {
          return ((cg) this).field_j;
        }
    }

    final void c(int param0) {
        if (!(((cg) this).field_x != null)) {
            return;
        }
        if (param0 >= -57) {
            dl discarded$0 = this.a(81, -1, 27);
        }
        ((cg) this).field_q = true;
        if (!(((cg) this).field_p != null)) {
            ((cg) this).field_p = new vc();
        }
    }

    final int a(int param0, byte param1) {
        if (param1 != -5) {
            byte[] discarded$0 = ((cg) this).b(60, true);
        }
        dl var3 = (dl) (Object) ((cg) this).field_n.a((long)param0, param1 ^ 1105);
        if (var3 == null) {
            return 0;
        }
        return var3.f(8651);
    }

    final void b(byte param0) {
        dl var2 = null;
        int var2_int = 0;
        lh var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_43_0 = 0;
        byte stackIn_43_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_131_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_135_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_137_0 = 0;
        int stackOut_137_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_42_0 = 0;
        byte stackOut_42_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_67_0 = 0;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          if (param0 > 119) {
            break L0;
          } else {
            field_z = -93L;
            break L0;
          }
        }
        L1: {
          if (null == ((cg) this).field_p) {
            break L1;
          } else {
            if (((cg) this).a(-1712) != null) {
              L2: {
                if (((cg) this).field_t) {
                  break L2;
                } else {
                  L3: {
                    if (!((cg) this).field_q) {
                      break L3;
                    } else {
                      var2_int = 1;
                      var3 = ((cg) this).field_p.c((byte) 47);
                      L4: while (true) {
                        L5: {
                          L6: {
                            L7: {
                              if (var3 == null) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_c;
                                stackOut_9_0 = ((cg) this).field_i[var4] ^ -1;
                                stackOut_9_1 = -2;
                                stackIn_19_0 = stackOut_9_0;
                                stackIn_19_1 = stackOut_9_1;
                                stackIn_10_0 = stackOut_9_0;
                                stackIn_10_1 = stackOut_9_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_19_0 <= stackIn_19_1) {
                                      break L6;
                                    } else {
                                      stackOut_20_0 = -1;
                                      stackIn_35_0 = stackOut_20_0;
                                      stackIn_21_0 = stackOut_20_0;
                                      if (var5 != 0) {
                                        break L5;
                                      } else {
                                        L9: {
                                          L10: {
                                            if (stackIn_21_0 != (((cg) this).field_j.field_f[((cg) this).field_l] ^ -1)) {
                                              break L10;
                                            } else {
                                              ((cg) this).field_l = ((cg) this).field_l + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (((cg) this).field_f.b(113)) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L6;
                                              } else {
                                                break L11;
                                              }
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (((cg) this).field_i[((cg) this).field_l] != 1) {
                                              dl discarded$6 = this.a(2, 2, ((cg) this).field_l);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if ((((cg) this).field_i[((cg) this).field_l] ^ -1) != -2) {
                                              var3 = new lh();
                                              var3.field_c = (long)((cg) this).field_l;
                                              var2_int = 0;
                                              ((cg) this).field_p.a(false, var3);
                                              break L13;
                                            } else {
                                              break L13;
                                            }
                                          }
                                          ((cg) this).field_l = ((cg) this).field_l + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_18_0 = ((cg) this).field_j.field_f.length;
                                        stackOut_18_1 = ((cg) this).field_l;
                                        stackIn_19_0 = stackOut_18_0;
                                        stackIn_19_1 = stackOut_18_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_10_0 == stackIn_10_1) {
                                      break L14;
                                    } else {
                                      dl discarded$7 = this.a(2, 2, var4);
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (-2 != (((cg) this).field_i[var4] ^ -1)) {
                                        break L16;
                                      } else {
                                        var3.c(-1);
                                        if (var5 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L15;
                                  }
                                  var3 = ((cg) this).field_p.b((byte) -105);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_137_0 = ((cg) this).field_j.field_f.length;
                              stackOut_137_1 = ((cg) this).field_l;
                              stackIn_135_0 = stackOut_137_0;
                              stackIn_135_1 = stackOut_137_1;
                              if (stackIn_135_0 <= stackIn_135_1) {
                                break L6;
                              } else {
                                stackOut_133_0 = -1;
                                stackIn_35_0 = stackOut_133_0;
                                stackIn_134_0 = stackOut_133_0;
                                if (var5 != 0) {
                                  break L5;
                                } else {
                                  stackOut_134_0 = stackIn_134_0;
                                  stackIn_131_0 = stackOut_134_0;
                                  L18: {
                                    if (stackIn_131_0 != (((cg) this).field_j.field_f[((cg) this).field_l] ^ -1)) {
                                      break L18;
                                    } else {
                                      ((cg) this).field_l = ((cg) this).field_l + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (((cg) this).field_f.b(113)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L19;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (((cg) this).field_i[((cg) this).field_l] != 1) {
                                      dl discarded$8 = this.a(2, 2, ((cg) this).field_l);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if ((((cg) this).field_i[((cg) this).field_l] ^ -1) != -2) {
                                      var3 = new lh();
                                      var3.field_c = (long)((cg) this).field_l;
                                      var2_int = 0;
                                      ((cg) this).field_p.a(false, var3);
                                      break L21;
                                    } else {
                                      break L21;
                                    }
                                  }
                                  ((cg) this).field_l = ((cg) this).field_l + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_34_0 = var2_int;
                          stackIn_35_0 = stackOut_34_0;
                          break L5;
                        }
                        L22: {
                          if (stackIn_35_0 == 0) {
                            break L22;
                          } else {
                            ((cg) this).field_q = false;
                            ((cg) this).field_l = 0;
                            break L22;
                          }
                        }
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  ((cg) this).field_p = null;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var2_int = 1;
              var3 = ((cg) this).field_p.c((byte) 47);
              L23: while (true) {
                L24: {
                  L25: {
                    L26: {
                      if (var3 == null) {
                        break L26;
                      } else {
                        var4 = (int)var3.field_c;
                        stackOut_42_0 = 0;
                        stackOut_42_1 = ((cg) this).field_i[var4];
                        stackIn_52_0 = stackOut_42_0;
                        stackIn_52_1 = stackOut_42_1;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        if (var5 != 0) {
                          L27: while (true) {
                            if (stackIn_52_0 >= stackIn_52_1) {
                              break L25;
                            } else {
                              stackOut_53_0 = -1;
                              stackIn_68_0 = stackOut_53_0;
                              stackIn_54_0 = stackOut_53_0;
                              if (var5 != 0) {
                                break L24;
                              } else {
                                L28: {
                                  L29: {
                                    if (stackIn_54_0 == (((cg) this).field_j.field_f[((cg) this).field_l] ^ -1)) {
                                      ((cg) this).field_l = ((cg) this).field_l + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L29;
                                      }
                                    } else {
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if ((((cg) this).field_o.field_d ^ -1) <= -251) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L25;
                                      } else {
                                        break L30;
                                      }
                                    } else {
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if ((((cg) this).field_i[((cg) this).field_l] ^ -1) == -1) {
                                      dl discarded$9 = this.a(2, 1, ((cg) this).field_l);
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    if (0 == ((cg) this).field_i[((cg) this).field_l]) {
                                      var3 = new lh();
                                      var3.field_c = (long)((cg) this).field_l;
                                      var2_int = 0;
                                      ((cg) this).field_p.a(false, var3);
                                      break L32;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  ((cg) this).field_l = ((cg) this).field_l + 1;
                                  if (var5 == 0) {
                                    break L28;
                                  } else {
                                    break L25;
                                  }
                                }
                                stackOut_51_0 = ((cg) this).field_l;
                                stackOut_51_1 = ((cg) this).field_j.field_f.length;
                                stackIn_52_0 = stackOut_51_0;
                                stackIn_52_1 = stackOut_51_1;
                                continue L27;
                              }
                            }
                          }
                        } else {
                          L33: {
                            if (stackIn_43_0 == stackIn_43_1) {
                              dl discarded$10 = this.a(2, 1, var4);
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                          L34: {
                            L35: {
                              if (-1 != (((cg) this).field_i[var4] ^ -1)) {
                                break L35;
                              } else {
                                var2_int = 0;
                                if (var5 == 0) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var3.c(-1);
                            break L34;
                          }
                          var3 = ((cg) this).field_p.b((byte) -105);
                          if (var5 == 0) {
                            continue L23;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    L36: while (true) {
                      stackOut_112_0 = ((cg) this).field_l;
                      stackOut_112_1 = ((cg) this).field_j.field_f.length;
                      stackIn_110_0 = stackOut_112_0;
                      stackIn_110_1 = stackOut_112_1;
                      if (stackIn_110_0 >= stackIn_110_1) {
                        break L25;
                      } else {
                        stackOut_108_0 = -1;
                        stackIn_68_0 = stackOut_108_0;
                        stackIn_109_0 = stackOut_108_0;
                        if (var5 != 0) {
                          break L24;
                        } else {
                          stackOut_109_0 = stackIn_109_0;
                          stackIn_106_0 = stackOut_109_0;
                          L37: {
                            if (stackIn_106_0 == (((cg) this).field_j.field_f[((cg) this).field_l] ^ -1)) {
                              ((cg) this).field_l = ((cg) this).field_l + 1;
                              if (var5 == 0) {
                                continue L36;
                              } else {
                                break L37;
                              }
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            if ((((cg) this).field_o.field_d ^ -1) <= -251) {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L25;
                              } else {
                                break L38;
                              }
                            } else {
                              break L38;
                            }
                          }
                          L39: {
                            if ((((cg) this).field_i[((cg) this).field_l] ^ -1) == -1) {
                              dl discarded$11 = this.a(2, 1, ((cg) this).field_l);
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                          L40: {
                            if (0 == ((cg) this).field_i[((cg) this).field_l]) {
                              var3 = new lh();
                              var3.field_c = (long)((cg) this).field_l;
                              var2_int = 0;
                              ((cg) this).field_p.a(false, var3);
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          ((cg) this).field_l = ((cg) this).field_l + 1;
                          if (var5 == 0) {
                            continue L36;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                  }
                  stackOut_67_0 = var2_int;
                  stackIn_68_0 = stackOut_67_0;
                  break L24;
                }
                if (stackIn_68_0 == 0) {
                  break L1;
                } else {
                  ((cg) this).field_l = 0;
                  ((cg) this).field_t = false;
                  break L1;
                }
              }
            } else {
              return;
            }
          }
        }
        L41: {
          if (!((cg) this).field_k) {
            break L41;
          } else {
            if ((((cg) this).field_w ^ -1L) >= (lj.a((byte) -56) ^ -1L)) {
              var2 = (dl) (Object) ((cg) this).field_n.a(true);
              L42: while (true) {
                L43: {
                  L44: {
                    if (var2 == null) {
                      break L44;
                    } else {
                      if (var5 != 0) {
                        break L43;
                      } else {
                        L45: {
                          if (var2.field_q) {
                            break L45;
                          } else {
                            L46: {
                              if (var2.field_r) {
                                break L46;
                              } else {
                                var2.field_r = true;
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            if (!var2.field_v) {
                              throw new RuntimeException();
                            } else {
                              var2.c(-1);
                              break L45;
                            }
                          }
                        }
                        var2 = (dl) (Object) ((cg) this).field_n.b((byte) 97);
                        if (var5 == 0) {
                          continue L42;
                        } else {
                          break L44;
                        }
                      }
                    }
                  }
                  ((cg) this).field_w = 1000L + lj.a((byte) -28);
                  break L43;
                }
                break L41;
              }
            } else {
              break L41;
            }
          }
        }
    }

    final static void a(java.math.BigInteger param0, int param1, ni param2, ni param3, java.math.BigInteger param4) {
        if (param1 >= -104) {
            field_v = null;
        }
        qi.a(param4, param2.field_i, 0, param2.field_k, param3, param0, (byte) -60);
    }

    private final dl a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6_ref_Exception = null;
        int var6 = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_50_0 = 0;
        byte stackIn_50_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        Object stackIn_64_0 = null;
        byte stackIn_82_0 = 0;
        byte stackIn_82_1 = 0;
        byte stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_81_0 = 0;
        byte stackOut_81_1 = 0;
        byte stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        byte stackOut_49_0 = 0;
        byte stackOut_49_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        Object stackOut_63_0 = null;
        L0: {
          var10 = fleas.field_A ? 1 : 0;
          if (param0 == 2) {
            break L0;
          } else {
            int discarded$2 = ((cg) this).a(-58, (byte) -93);
            break L0;
          }
        }
        L1: {
          var4 = (Object) (Object) (dl) (Object) ((cg) this).field_n.a((long)param2, -1110);
          if (var4 == null) {
            break L1;
          } else {
            if ((param1 ^ -1) != -1) {
              break L1;
            } else {
              if (((dl) var4).field_v) {
                break L1;
              } else {
                if (((dl) var4).field_q) {
                  ((dl) var4).c(-1);
                  var4 = null;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (var4 == null) {
            L3: {
              L4: {
                if (0 != param1) {
                  break L4;
                } else {
                  L5: {
                    if (null == ((cg) this).field_x) {
                      break L5;
                    } else {
                      if ((((cg) this).field_i[param2] ^ -1) != 0) {
                        var4 = (Object) (Object) ((cg) this).field_o.a(param2, ((cg) this).field_x, true);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (!((cg) this).field_f.a(-112)) {
                    var4 = (Object) (Object) ((cg) this).field_f.a(param0 + 125, true, param2, ((cg) this).field_m, (byte) 2);
                    if (var10 == 0) {
                      break L3;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              L6: {
                if (-2 != (param1 ^ -1)) {
                  break L6;
                } else {
                  if (((cg) this).field_x == null) {
                    throw new RuntimeException();
                  } else {
                    var4 = (Object) (Object) ((cg) this).field_o.a(126, param2, ((cg) this).field_x);
                    if (var10 == 0) {
                      break L3;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              if (-3 != (param1 ^ -1)) {
                throw new RuntimeException();
              } else {
                if (null == ((cg) this).field_x) {
                  throw new RuntimeException();
                } else {
                  if ((((cg) this).field_i[param2] ^ -1) == 0) {
                    if (!((cg) this).field_f.b(-49)) {
                      var4 = (Object) (Object) ((cg) this).field_f.a(127, false, param2, ((cg) this).field_m, (byte) 2);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        return null;
                      }
                    } else {
                      return null;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
            }
            ((cg) this).field_n.a((lh) var4, true, (long)param2);
            break L2;
          } else {
            break L2;
          }
        }
        if (!((dl) var4).field_q) {
          var5 = ((dl) var4).g(100);
          if (!(var4 instanceof qh)) {
            L7: {
              if (var5 == null) {
                break L7;
              } else {
                if (var5.length <= 2) {
                  break L7;
                } else {
                  ql.field_j.reset();
                  ql.field_j.update(var5, 0, var5.length + -2);
                  var6 = (int)ql.field_j.getValue();
                  if (var6 != ((cg) this).field_j.field_u[param2]) {
                    throw new RuntimeException();
                  } else {
                    L8: {
                      L9: {
                        L10: {
                          if (((cg) this).field_j.field_o == null) {
                            break L10;
                          } else {
                            if (null == ((cg) this).field_j.field_o[param2]) {
                              break L10;
                            } else {
                              var7 = ((cg) this).field_j.field_o[param2];
                              var8 = kb.a(var5, var5.length + -2, (byte) 99, 0);
                              var9 = 0;
                              L11: while (true) {
                                if (-65 >= (var9 ^ -1)) {
                                  break L10;
                                } else {
                                  stackOut_81_0 = var8[var9];
                                  stackOut_81_1 = var7[var9];
                                  stackIn_87_0 = stackOut_81_0;
                                  stackIn_87_1 = stackOut_81_1;
                                  stackIn_82_0 = stackOut_81_0;
                                  stackIn_82_1 = stackOut_81_1;
                                  if (var10 != 0) {
                                    break L9;
                                  } else {
                                    if (stackIn_82_0 == stackIn_82_1) {
                                      var9++;
                                      if (var10 == 0) {
                                        continue L11;
                                      } else {
                                        break L10;
                                      }
                                    } else {
                                      throw new RuntimeException();
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((cg) this).field_f.field_c = 0;
                        ((cg) this).field_f.field_b = 0;
                        var5[var5.length - 2] = (byte)(((cg) this).field_j.field_n[param2] >>> 932087816);
                        var5[-1 + var5.length] = (byte)((cg) this).field_j.field_n[param2];
                        if (null == ((cg) this).field_x) {
                          break L8;
                        } else {
                          qh discarded$3 = ((cg) this).field_o.a(param0 + -125, param2, ((cg) this).field_x, var5);
                          stackOut_86_0 = ((cg) this).field_i[param2];
                          stackOut_86_1 = 1;
                          stackIn_87_0 = stackOut_86_0;
                          stackIn_87_1 = stackOut_86_1;
                          break L9;
                        }
                      }
                      if (stackIn_87_0 != stackIn_87_1) {
                        ((cg) this).field_i[param2] = (byte) 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L12: {
                      if (((dl) var4).field_v) {
                        break L12;
                      } else {
                        ((dl) var4).c(-1);
                        break L12;
                      }
                    }
                    return (dl) var4;
                  }
                }
              }
            }
            throw new RuntimeException();
          } else {
            try {
              L13: {
                L14: {
                  if (var5 == null) {
                    break L14;
                  } else {
                    if (2 < var5.length) {
                      ql.field_j.reset();
                      ql.field_j.update(var5, 0, var5.length - 2);
                      var6 = (int)ql.field_j.getValue();
                      if ((var6 ^ -1) == (((cg) this).field_j.field_u[param2] ^ -1)) {
                        L15: {
                          L16: {
                            if (((cg) this).field_j.field_o == null) {
                              break L16;
                            } else {
                              if (((cg) this).field_j.field_o[param2] == null) {
                                break L16;
                              } else {
                                var7 = ((cg) this).field_j.field_o[param2];
                                var8 = kb.a(var5, -2 + var5.length, (byte) 124, 0);
                                var9 = 0;
                                L17: while (true) {
                                  if (var9 >= 64) {
                                    break L16;
                                  } else {
                                    stackOut_49_0 = var8[var9];
                                    stackOut_49_1 = var7[var9];
                                    stackIn_54_0 = stackOut_49_0;
                                    stackIn_54_1 = stackOut_49_1;
                                    stackIn_50_0 = stackOut_49_0;
                                    stackIn_50_1 = stackOut_49_1;
                                    if (var10 != 0) {
                                      break L15;
                                    } else {
                                      if (stackIn_50_0 == stackIn_50_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L17;
                                        } else {
                                          break L16;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_53_0 = (var5[-2 + var5.length] & 255) << 519320712;
                          stackOut_53_1 = var5[var5.length + -1] & 255;
                          stackIn_54_0 = stackOut_53_0;
                          stackIn_54_1 = stackOut_53_1;
                          break L15;
                        }
                        var7_int = stackIn_54_0 + stackIn_54_1;
                        if ((65535 & ((cg) this).field_j.field_n[param2] ^ -1) != (var7_int ^ -1)) {
                          throw new RuntimeException();
                        } else {
                          L18: {
                            if ((((cg) this).field_i[param2] ^ -1) != -2) {
                              L19: {
                                if (-1 != (((cg) this).field_i[param2] ^ -1)) {
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              ((cg) this).field_i[param2] = (byte) 1;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          L20: {
                            if (((dl) var4).field_v) {
                              break L20;
                            } else {
                              ((dl) var4).c(-1);
                              break L20;
                            }
                          }
                          stackOut_63_0 = var4;
                          stackIn_64_0 = stackOut_63_0;
                          break L13;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref_Exception = (Exception) (Object) decompiledCaughtException;
              ((cg) this).field_i[param2] = (byte)-1;
              ((dl) var4).c(param0 + -3);
              if (((dl) var4).field_v) {
                if (!((cg) this).field_f.a(-92)) {
                  var4 = (Object) (Object) ((cg) this).field_f.a(param0 ^ 125, true, param2, ((cg) this).field_m, (byte) 2);
                  ((cg) this).field_n.a((lh) var4, true, (long)param2);
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (dl) (Object) stackIn_64_0;
          }
        } else {
          return null;
        }
    }

    final void a(boolean param0) {
        lh var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        if (!param0) {
          if (null == ((cg) this).field_p) {
            return;
          } else {
            if (((cg) this).a(-1712) != null) {
              var2 = ((cg) this).field_s.c((byte) 47);
              L0: while (true) {
                L1: {
                  if (var2 == null) {
                    break L1;
                  } else {
                    var3 = (int)var2.field_c;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L2: {
                        L3: {
                          L4: {
                            if ((var3 ^ -1) > -1) {
                              break L4;
                            } else {
                              if (((cg) this).field_j.field_i <= var3) {
                                break L4;
                              } else {
                                if (-1 != (((cg) this).field_j.field_f[var3] ^ -1)) {
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var2.c(-1);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                        L5: {
                          if (((cg) this).field_i[var3] == 0) {
                            dl discarded$4 = this.a(2, 1, var3);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (0 == (((cg) this).field_i[var3] ^ -1)) {
                            dl discarded$5 = this.a(2, 2, var3);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        if (((cg) this).field_i[var3] != 1) {
                          break L2;
                        } else {
                          var2.c(-1);
                          break L2;
                        }
                      }
                      var2 = ((cg) this).field_s.b((byte) -105);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final byte[] b(int param0, boolean param1) {
        dl var3 = this.a(2, 0, param0);
        if (var3 == null) {
            return null;
        }
        if (param1) {
            ((cg) this).field_A = 116;
        }
        byte[] var4 = var3.g(100);
        var3.c(-1);
        return var4;
    }

    public static void b(int param0) {
        field_h = null;
        field_v = null;
        if (param0 != 1) {
            cg.a((java.math.BigInteger) null, -72, (ni) null, (ni) null, (java.math.BigInteger) null);
        }
    }

    cg(int param0, ah param1, ah param2, w param3, af param4, int param5, byte[] param6, int param7, boolean param8) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          L1: {
            ((cg) this).field_n = new hc(16);
            ((cg) this).field_l = 0;
            ((cg) this).field_s = new vc();
            ((cg) this).field_w = 0L;
            ((cg) this).field_m = param0;
            ((cg) this).field_x = param1;
            if (((cg) this).field_x == null) {
              break L1;
            } else {
              ((cg) this).field_t = true;
              ((cg) this).field_p = new vc();
              if (!fleas.field_A) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((cg) this).field_t = false;
          break L0;
        }
        L2: {
          ((cg) this).field_e = param7;
          ((cg) this).field_u = param6;
          ((cg) this).field_r = param2;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param8) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L2;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L2;
          }
        }
        L3: {
          ((cg) this).field_k = stackIn_6_1 != 0;
          ((cg) this).field_o = param4;
          ((cg) this).field_f = param3;
          ((cg) this).field_A = param5;
          if (null == ((cg) this).field_r) {
            break L3;
          } else {
            ((cg) this).field_g = (dl) (Object) ((cg) this).field_o.a(((cg) this).field_m, ((cg) this).field_r, true);
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Type your email address again to make sure it's correct";
        field_z = 0L;
        field_h = new fh(4, 1, 1, 1);
    }
}
