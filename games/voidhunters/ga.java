/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga extends fnb {
    private pfa field_f;
    private int field_n;
    private gnb field_u;
    private qp field_t;
    private fo field_l;
    private int field_p;
    private fo field_j;
    static llb field_s;
    private byte[] field_k;
    private int field_w;
    private ona field_g;
    private byte[] field_d;
    private jtb field_r;
    private boolean field_o;
    private ij field_v;
    private ij field_i;
    private int field_h;
    private boolean field_q;
    private long field_e;
    private boolean field_m;

    final qp a(byte param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        if (((ga) this).field_t != null) {
          return ((ga) this).field_t;
        } else {
          L0: {
            if (null == ((ga) this).field_r) {
              if (!((ga) this).field_g.d(126)) {
                ((ga) this).field_r = (jtb) (Object) ((ga) this).field_g.a(true, param0 ^ -30, ((ga) this).field_p, (byte) 0, 255);
                break L0;
              } else {
                return null;
              }
            } else {
              break L0;
            }
          }
          if (!((ga) this).field_r.field_n) {
            if (param0 == 9) {
              L1: {
                var5 = ((ga) this).field_r.a(param0 ^ -97);
                var2 = var5;
                if (!(((ga) this).field_r instanceof jma)) {
                  try {
                    L2: {
                      if (var5 == null) {
                        throw new RuntimeException();
                      } else {
                        ((ga) this).field_t = new qp(var5, ((ga) this).field_n, ((ga) this).field_k);
                        break L2;
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3 = decompiledCaughtException;
                    ((ga) this).field_g.a((byte) -25);
                    ((ga) this).field_t = null;
                    if (!((ga) this).field_g.d(param0 ^ 89)) {
                      ((ga) this).field_r = (jtb) (Object) ((ga) this).field_g.a(true, param0 + -30, ((ga) this).field_p, (byte) 0, 255);
                      if (var4 == 0) {
                        return null;
                      } else {
                        ((ga) this).field_r = null;
                        return null;
                      }
                    } else {
                      ((ga) this).field_r = null;
                      return null;
                    }
                  }
                  if (null != ((ga) this).field_j) {
                    jma discarded$1 = ((ga) this).field_f.a(((ga) this).field_j, var5, (byte) 92, ((ga) this).field_p);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  try {
                    L3: {
                      if (var5 != null) {
                        ((ga) this).field_t = new qp(var5, ((ga) this).field_n, ((ga) this).field_k);
                        if (((ga) this).field_t.field_e == ((ga) this).field_w) {
                          break L3;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var3 = decompiledCaughtException;
                    ((ga) this).field_t = null;
                    if (!((ga) this).field_g.d(121)) {
                      ((ga) this).field_r = (jtb) (Object) ((ga) this).field_g.a(true, -21, ((ga) this).field_p, (byte) 0, 255);
                      if (var4 == 0) {
                        return null;
                      } else {
                        ((ga) this).field_r = null;
                        return null;
                      }
                    } else {
                      ((ga) this).field_r = null;
                      return null;
                    }
                  }
                  break L1;
                }
              }
              L4: {
                ((ga) this).field_r = null;
                if (null != ((ga) this).field_l) {
                  ((ga) this).field_d = new byte[((ga) this).field_t.field_l];
                  break L4;
                } else {
                  break L4;
                }
              }
              return ((ga) this).field_t;
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final int a(int param0, boolean param1) {
        jtb var3 = (jtb) (Object) ((ga) this).field_u.a((long)param0, 122);
        if (!(var3 == null)) {
            return var3.e((byte) -4);
        }
        if (param1) {
            ga.c((byte) 114);
        }
        return 0;
    }

    final void b(int param0) {
        int var2_int = 0;
        jtb var2 = null;
        ksa var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        byte stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        byte stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_79_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        byte stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_62_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_78_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        L0: {
          L1: {
            var5 = VoidHunters.field_G;
            if (((ga) this).field_i == null) {
              break L1;
            } else {
              if (((ga) this).a((byte) 9) != null) {
                L2: {
                  if (!((ga) this).field_o) {
                    break L2;
                  } else {
                    var2_int = 1;
                    var3 = ((ga) this).field_i.d(0);
                    L3: while (true) {
                      L4: {
                        L5: {
                          if (var3 == null) {
                            break L5;
                          } else {
                            var4 = (int)var3.field_b;
                            stackOut_6_0 = -1;
                            stackOut_6_1 = ~((ga) this).field_d[var4];
                            stackIn_23_0 = stackOut_6_0;
                            stackIn_23_1 = stackOut_6_1;
                            stackIn_7_0 = stackOut_6_0;
                            stackIn_7_1 = stackOut_6_1;
                            if (var5 == 0) {
                              L6: {
                                if (stackIn_23_0 == stackIn_23_1) {
                                  jtb discarded$6 = this.a(1, -26489, var4);
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              L7: {
                                L8: {
                                  if (((ga) this).field_d[var4] != 0) {
                                    break L8;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L7;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var3.b(-3846);
                                break L7;
                              }
                              var3 = ((ga) this).field_i.a((byte) 80);
                              continue L3;
                            } else {
                              if (stackIn_7_0 <= stackIn_7_1) {
                                break L4;
                              } else {
                                stackOut_8_0 = 0;
                                stackOut_8_1 = ((ga) this).field_t.field_j[((ga) this).field_h];
                                stackIn_97_0 = stackOut_8_0;
                                stackIn_97_1 = stackOut_8_1;
                                stackIn_9_0 = stackOut_8_0;
                                stackIn_9_1 = stackOut_8_1;
                                if (var5 != 0) {
                                  break L0;
                                } else {
                                  L9: {
                                    if (stackIn_9_0 == stackIn_9_1) {
                                      ((ga) this).field_h = ((ga) this).field_h + 1;
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L9;
                                      }
                                    } else {
                                      break L9;
                                    }
                                  }
                                  L10: {
                                    if (((ga) this).field_f.field_e < 250) {
                                      break L10;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L4;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  L11: {
                                    if (((ga) this).field_d[((ga) this).field_h] == 0) {
                                      jtb discarded$7 = this.a(1, -26489, ((ga) this).field_h);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    if (((ga) this).field_d[((ga) this).field_h] == 0) {
                                      var3 = new ksa();
                                      var3.field_b = (long)((ga) this).field_h;
                                      var2_int = 0;
                                      ((ga) this).field_i.b(-10258, var3);
                                      break L12;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  ((ga) this).field_h = ((ga) this).field_h + 1;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L13: while (true) {
                          if (((ga) this).field_t.field_j.length <= ((ga) this).field_h) {
                            break L4;
                          } else {
                            stackOut_32_0 = 0;
                            stackOut_32_1 = ((ga) this).field_t.field_j[((ga) this).field_h];
                            stackIn_97_0 = stackOut_32_0;
                            stackIn_97_1 = stackOut_32_1;
                            stackIn_33_0 = stackOut_32_0;
                            stackIn_33_1 = stackOut_32_1;
                            if (var5 != 0) {
                              break L0;
                            } else {
                              L14: {
                                if (stackIn_33_0 == stackIn_33_1) {
                                  ((ga) this).field_h = ((ga) this).field_h + 1;
                                  if (var5 == 0) {
                                    continue L13;
                                  } else {
                                    break L14;
                                  }
                                } else {
                                  break L14;
                                }
                              }
                              L15: {
                                if (((ga) this).field_f.field_e < 250) {
                                  break L15;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L4;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L16: {
                                if (((ga) this).field_d[((ga) this).field_h] == 0) {
                                  jtb discarded$8 = this.a(1, -26489, ((ga) this).field_h);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              L17: {
                                if (((ga) this).field_d[((ga) this).field_h] == 0) {
                                  var3 = new ksa();
                                  var3.field_b = (long)((ga) this).field_h;
                                  var2_int = 0;
                                  ((ga) this).field_i.b(-10258, var3);
                                  break L17;
                                } else {
                                  break L17;
                                }
                              }
                              ((ga) this).field_h = ((ga) this).field_h + 1;
                              if (var5 == 0) {
                                continue L13;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      L18: {
                        if (var2_int == 0) {
                          break L18;
                        } else {
                          ((ga) this).field_o = false;
                          ((ga) this).field_h = 0;
                          break L18;
                        }
                      }
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                L19: {
                  if (!((ga) this).field_q) {
                    break L19;
                  } else {
                    var2_int = 1;
                    var3 = ((ga) this).field_i.d(0);
                    L20: while (true) {
                      L21: {
                        L22: {
                          if (var3 == null) {
                            break L22;
                          } else {
                            var4 = (int)var3.field_b;
                            stackOut_51_0 = ((ga) this).field_d[var4];
                            stackOut_51_1 = 1;
                            stackIn_61_0 = stackOut_51_0;
                            stackIn_61_1 = stackOut_51_1;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            if (var5 != 0) {
                              if (stackIn_61_0 >= stackIn_61_1) {
                                break L21;
                              } else {
                                stackOut_62_0 = -1;
                                stackOut_62_1 = ~((ga) this).field_t.field_j[((ga) this).field_h];
                                stackIn_97_0 = stackOut_62_0;
                                stackIn_97_1 = stackOut_62_1;
                                stackIn_63_0 = stackOut_62_0;
                                stackIn_63_1 = stackOut_62_1;
                                if (var5 != 0) {
                                  break L0;
                                } else {
                                  L23: {
                                    if (stackIn_63_0 == stackIn_63_1) {
                                      ((ga) this).field_h = ((ga) this).field_h + 1;
                                      if (var5 == 0) {
                                        break L22;
                                      } else {
                                        break L23;
                                      }
                                    } else {
                                      break L23;
                                    }
                                  }
                                  L24: {
                                    if (!((ga) this).field_g.b((byte) 32)) {
                                      break L24;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L21;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  L25: {
                                    if (((ga) this).field_d[((ga) this).field_h] != 1) {
                                      jtb discarded$9 = this.a(2, -26489, ((ga) this).field_h);
                                      break L25;
                                    } else {
                                      break L25;
                                    }
                                  }
                                  L26: {
                                    if (1 != ((ga) this).field_d[((ga) this).field_h]) {
                                      var3 = new ksa();
                                      var3.field_b = (long)((ga) this).field_h;
                                      ((ga) this).field_i.b(-10258, var3);
                                      var2_int = 0;
                                      break L26;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  ((ga) this).field_h = ((ga) this).field_h + 1;
                                  if (var5 == 0) {
                                    break L22;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            } else {
                              L27: {
                                if (stackIn_52_0 != stackIn_52_1) {
                                  jtb discarded$10 = this.a(2, -26489, var4);
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                              L28: {
                                L29: {
                                  if (((ga) this).field_d[var4] != 1) {
                                    break L29;
                                  } else {
                                    var3.b(-3846);
                                    if (var5 == 0) {
                                      break L28;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L28;
                              }
                              var3 = ((ga) this).field_i.a((byte) 121);
                              continue L20;
                            }
                          }
                        }
                        L30: while (true) {
                          if (((ga) this).field_h >= ((ga) this).field_t.field_j.length) {
                            break L21;
                          } else {
                            stackOut_78_0 = -1;
                            stackOut_78_1 = ~((ga) this).field_t.field_j[((ga) this).field_h];
                            stackIn_97_0 = stackOut_78_0;
                            stackIn_97_1 = stackOut_78_1;
                            stackIn_79_0 = stackOut_78_0;
                            stackIn_79_1 = stackOut_78_1;
                            if (var5 != 0) {
                              break L0;
                            } else {
                              L31: {
                                if (stackIn_79_0 == stackIn_79_1) {
                                  break L31;
                                } else {
                                  L32: {
                                    if (!((ga) this).field_g.b((byte) 32)) {
                                      break L32;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L21;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  L33: {
                                    if (((ga) this).field_d[((ga) this).field_h] != 1) {
                                      jtb discarded$11 = this.a(2, -26489, ((ga) this).field_h);
                                      break L33;
                                    } else {
                                      break L33;
                                    }
                                  }
                                  if (1 != ((ga) this).field_d[((ga) this).field_h]) {
                                    var3 = new ksa();
                                    var3.field_b = (long)((ga) this).field_h;
                                    ((ga) this).field_i.b(-10258, var3);
                                    var2_int = 0;
                                    break L31;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                              ((ga) this).field_h = ((ga) this).field_h + 1;
                              continue L30;
                            }
                          }
                        }
                      }
                      L34: {
                        if (var2_int != 0) {
                          ((ga) this).field_h = 0;
                          ((ga) this).field_q = false;
                          break L34;
                        } else {
                          break L34;
                        }
                      }
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L19;
                      }
                    }
                  }
                }
                ((ga) this).field_i = null;
                break L1;
              } else {
                return;
              }
            }
          }
          stackOut_96_0 = param0;
          stackOut_96_1 = -27;
          stackIn_97_0 = stackOut_96_0;
          stackIn_97_1 = stackOut_96_1;
          break L0;
        }
        L35: {
          if (stackIn_97_0 <= stackIn_97_1) {
            break L35;
          } else {
            ((ga) this).b((byte) -14);
            break L35;
          }
        }
        if (((ga) this).field_m) {
          if (((ga) this).field_e <= wt.a(false)) {
            var2 = (jtb) (Object) ((ga) this).field_u.c((byte) 48);
            L36: while (true) {
              if (var2 != null) {
                if (var5 == 0) {
                  L37: {
                    if (var2.field_n) {
                      break L37;
                    } else {
                      L38: {
                        if (var2.field_k) {
                          break L38;
                        } else {
                          var2.field_k = true;
                          if (var5 == 0) {
                            break L37;
                          } else {
                            break L38;
                          }
                        }
                      }
                      if (var2.field_l) {
                        var2.b(-3846);
                        break L37;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  var2 = (jtb) (Object) ((ga) this).field_u.b(-91);
                  continue L36;
                } else {
                  return;
                }
              } else {
                ((ga) this).field_e = wt.a(false) + 1000L;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void b(byte param0) {
        if (param0 <= -9) {
          if (null == ((ga) this).field_l) {
            return;
          } else {
            L0: {
              ((ga) this).field_q = true;
              if (((ga) this).field_i != null) {
                break L0;
              } else {
                ((ga) this).field_i = new ij();
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final byte[] a(int param0, int param1) {
        jtb var3 = null;
        byte[] var4 = null;
        var3 = this.a(0, -26489, param1);
        if (var3 != null) {
          var4 = var3.a(-95);
          if (param0 <= 112) {
            return null;
          } else {
            var3.b(-3846);
            return var4;
          }
        } else {
          return null;
        }
    }

    final void c(int param0) {
        ksa var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        if (((ga) this).field_i != null) {
          if (((ga) this).a((byte) 9) == null) {
            return;
          } else {
            var2 = ((ga) this).field_v.d(param0);
            L0: while (true) {
              L1: {
                if (var2 == null) {
                  break L1;
                } else {
                  var3 = (int)var2.field_b;
                  if (var4 != 0) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        L4: {
                          if (0 > var3) {
                            break L4;
                          } else {
                            if (var3 >= ((ga) this).field_t.field_l) {
                              break L4;
                            } else {
                              if (((ga) this).field_t.field_j[var3] == 0) {
                                break L4;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        var2.b(param0 + -3846);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                      L5: {
                        if (((ga) this).field_d[var3] == 0) {
                          jtb discarded$2 = this.a(1, -26489, var3);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (((ga) this).field_d[var3] == -1) {
                          jtb discarded$3 = this.a(2, -26489, var3);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      if (((ga) this).field_d[var3] != 1) {
                        break L2;
                      } else {
                        var2.b(-3846);
                        break L2;
                      }
                    }
                    var2 = ((ga) this).field_v.a((byte) 10);
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
          }
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        int var1 = 0;
        field_s = null;
    }

    private final jtb a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte stackIn_51_0 = 0;
        byte stackIn_51_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        byte stackIn_83_0 = 0;
        byte stackIn_83_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        Object stackIn_98_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_82_0 = 0;
        byte stackOut_82_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        Object stackOut_97_0 = null;
        byte stackOut_50_0 = 0;
        byte stackOut_50_1 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        var10 = VoidHunters.field_G;
        if (param1 == -26489) {
          L0: {
            var4 = (Object) (Object) (jtb) (Object) ((ga) this).field_u.a((long)param2, 100);
            if (var4 == null) {
              break L0;
            } else {
              if (0 != param0) {
                break L0;
              } else {
                if (((jtb) var4).field_l) {
                  break L0;
                } else {
                  if (!((jtb) var4).field_n) {
                    break L0;
                  } else {
                    ((jtb) var4).b(-3846);
                    var4 = null;
                    break L0;
                  }
                }
              }
            }
          }
          L1: {
            if (var4 == null) {
              L2: {
                if (param0 != 0) {
                  L3: {
                    if (param0 != 1) {
                      break L3;
                    } else {
                      if (((ga) this).field_l == null) {
                        throw new RuntimeException();
                      } else {
                        var4 = (Object) (Object) ((ga) this).field_f.a((byte) 121, ((ga) this).field_l, param2);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0 == 2) {
                    if (((ga) this).field_l == null) {
                      throw new RuntimeException();
                    } else {
                      if (((ga) this).field_d[param2] != -1) {
                        throw new RuntimeException();
                      } else {
                        if (!((ga) this).field_g.b((byte) 32)) {
                          var4 = (Object) (Object) ((ga) this).field_g.a(false, -21, param2, (byte) 2, ((ga) this).field_p);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            return null;
                          }
                        } else {
                          return null;
                        }
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                } else {
                  L4: {
                    if (null == ((ga) this).field_l) {
                      break L4;
                    } else {
                      if (((ga) this).field_d[param2] == -1) {
                        break L4;
                      } else {
                        var4 = (Object) (Object) ((ga) this).field_f.a(param2, ((ga) this).field_l, (byte) 104);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (!((ga) this).field_g.d(104)) {
                    var4 = (Object) (Object) ((ga) this).field_g.a(true, -21, param2, (byte) 2, ((ga) this).field_p);
                    if (var10 == 0) {
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              ((ga) this).field_u.a((long)param2, (ksa) var4, (byte) -119);
              break L1;
            } else {
              break L1;
            }
          }
          if (!((jtb) var4).field_n) {
            var5 = ((jtb) var4).a(77);
            if (var4 instanceof jma) {
              try {
                L5: {
                  L6: {
                    if (var5 == null) {
                      break L6;
                    } else {
                      if (var5.length > 2) {
                        gkb.field_p.reset();
                        gkb.field_p.update(var5, 0, var5.length - 2);
                        var6_int = (int)gkb.field_p.getValue();
                        if (((ga) this).field_t.field_d[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L7: {
                            L8: {
                              if (((ga) this).field_t.field_c == null) {
                                break L8;
                              } else {
                                if (((ga) this).field_t.field_c[param2] != null) {
                                  var7_ref_byte__ = ((ga) this).field_t.field_c[param2];
                                  var8 = fqb.a((byte) 25, -2 + var5.length, var5, 0);
                                  var9 = 0;
                                  L9: while (true) {
                                    if (64 <= var9) {
                                      break L8;
                                    } else {
                                      stackOut_82_0 = var7_ref_byte__[var9];
                                      stackOut_82_1 = var8[var9];
                                      stackIn_88_0 = stackOut_82_0;
                                      stackIn_88_1 = stackOut_82_1;
                                      stackIn_83_0 = stackOut_82_0;
                                      stackIn_83_1 = stackOut_82_1;
                                      if (var10 != 0) {
                                        break L7;
                                      } else {
                                        if (stackIn_83_0 != stackIn_83_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L9;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L8;
                                }
                              }
                            }
                            stackOut_87_0 = (255 & var5[-2 + var5.length]) << 8;
                            stackOut_87_1 = 255 & var5[-1 + var5.length];
                            stackIn_88_0 = stackOut_87_0;
                            stackIn_88_1 = stackOut_87_1;
                            break L7;
                          }
                          var7 = stackIn_88_0 + stackIn_88_1;
                          if (var7 != (65535 & ((ga) this).field_t.field_h[param2])) {
                            throw new RuntimeException();
                          } else {
                            L10: {
                              if (((ga) this).field_d[param2] == 1) {
                                break L10;
                              } else {
                                L11: {
                                  if (((ga) this).field_d[param2] != 0) {
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                ((ga) this).field_d[param2] = (byte) 1;
                                break L10;
                              }
                            }
                            L12: {
                              if (((jtb) var4).field_l) {
                                break L12;
                              } else {
                                ((jtb) var4).b(-3846);
                                break L12;
                              }
                            }
                            stackOut_97_0 = var4;
                            stackIn_98_0 = stackOut_97_0;
                            break L5;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6_ref = (Exception) (Object) decompiledCaughtException;
                ((ga) this).field_d[param2] = (byte) -1;
                ((jtb) var4).b(-3846);
                if (((jtb) var4).field_l) {
                  if (((ga) this).field_g.d(92)) {
                    return null;
                  } else {
                    var4 = (Object) (Object) ((ga) this).field_g.a(true, -21, param2, (byte) 2, ((ga) this).field_p);
                    ((ga) this).field_u.a((long)param2, (ksa) var4, (byte) -127);
                    return null;
                  }
                } else {
                  return null;
                }
              }
              return (jtb) (Object) stackIn_98_0;
            } else {
              try {
                L13: {
                  L14: {
                    if (var5 == null) {
                      break L14;
                    } else {
                      if (2 < var5.length) {
                        gkb.field_p.reset();
                        gkb.field_p.update(var5, 0, var5.length - 2);
                        var6_int = (int)gkb.field_p.getValue();
                        if (((ga) this).field_t.field_d[param2] != var6_int) {
                          throw new RuntimeException();
                        } else {
                          L15: {
                            L16: {
                              if (((ga) this).field_t.field_c == null) {
                                break L16;
                              } else {
                                if (((ga) this).field_t.field_c[param2] != null) {
                                  var7_ref_byte__ = ((ga) this).field_t.field_c[param2];
                                  var8 = fqb.a((byte) 25, -2 + var5.length, var5, 0);
                                  var9 = 0;
                                  L17: while (true) {
                                    if (var9 >= 64) {
                                      break L16;
                                    } else {
                                      stackOut_50_0 = var8[var9];
                                      stackOut_50_1 = var7_ref_byte__[var9];
                                      stackIn_65_0 = stackOut_50_0;
                                      stackIn_65_1 = stackOut_50_1;
                                      stackIn_51_0 = stackOut_50_0;
                                      stackIn_51_1 = stackOut_50_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 1;
                                        break L13;
                                      } else {
                                        if (stackIn_51_0 == stackIn_51_1) {
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
                                } else {
                                  ((ga) this).field_g.field_g = 0;
                                  ((ga) this).field_g.field_k = 0;
                                  break L15;
                                }
                              }
                            }
                            ((ga) this).field_g.field_g = 0;
                            ((ga) this).field_g.field_k = 0;
                            break L15;
                          }
                          decompiledRegionSelector0 = 0;
                          break L13;
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  throw new RuntimeException();
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                ((ga) this).field_g.a((byte) -25);
                ((jtb) var4).b(-3846);
                if (((jtb) var4).field_l) {
                  if (((ga) this).field_g.d(54)) {
                    return null;
                  } else {
                    var4 = (Object) (Object) ((ga) this).field_g.a(true, -21, param2, (byte) 2, ((ga) this).field_p);
                    ((ga) this).field_u.a((long)param2, (ksa) var4, (byte) -118);
                    return null;
                  }
                } else {
                  return null;
                }
              }
              L18: {
                L19: {
                  if (decompiledRegionSelector0 == 0) {
                    var5[var5.length + -2] = (byte)(((ga) this).field_t.field_h[param2] >>> 8);
                    var5[-1 + var5.length] = (byte)((ga) this).field_t.field_h[param2];
                    if (null == ((ga) this).field_l) {
                      break L18;
                    } else {
                      jma discarded$1 = ((ga) this).field_f.a(((ga) this).field_l, var5, (byte) 111, param2);
                      stackOut_64_0 = -2;
                      stackOut_64_1 = ~((ga) this).field_d[param2];
                      stackIn_65_0 = stackOut_64_0;
                      stackIn_65_1 = stackOut_64_1;
                      break L19;
                    }
                  } else {
                    break L19;
                  }
                }
                if (stackIn_65_0 == stackIn_65_1) {
                  break L18;
                } else {
                  ((ga) this).field_d[param2] = (byte) 1;
                  break L18;
                }
              }
              L20: {
                if (((jtb) var4).field_l) {
                  break L20;
                } else {
                  ((jtb) var4).b(-3846);
                  break L20;
                }
              }
              return (jtb) var4;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        L0: {
          L1: {
            if (li.field_i) {
              break L1;
            } else {
              dma.e(param2, param3, param5, param4, param6, param0);
              if (VoidHunters.field_G == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (!ne.field_v) {
            break L0;
          } else {
            og.field_r.a(param5, (byte) 120, param6 | param0 << 24, param4, param3, param2);
            break L0;
          }
        }
        L2: {
          if (!param1) {
            break L2;
          } else {
            field_s = null;
            break L2;
          }
        }
    }

    ga(int param0, fo param1, fo param2, ona param3, pfa param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        ((ga) this).field_u = new gnb(16);
        ((ga) this).field_h = 0;
        ((ga) this).field_v = new ij();
        ((ga) this).field_e = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((ga) this).field_p = param0;
                ((ga) this).field_l = param1;
                if (null == ((ga) this).field_l) {
                  break L2;
                } else {
                  ((ga) this).field_o = true;
                  ((ga) this).field_i = new ij();
                  if (VoidHunters.field_G == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ga) this).field_o = false;
              break L1;
            }
            L3: {
              ((ga) this).field_j = param2;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((ga) this).field_m = stackIn_7_1 != 0;
              ((ga) this).field_f = param4;
              ((ga) this).field_g = param3;
              ((ga) this).field_k = param6;
              ((ga) this).field_w = param7;
              ((ga) this).field_n = param5;
              if (((ga) this).field_j == null) {
                break L4;
              } else {
                ((ga) this).field_r = (jtb) (Object) ((ga) this).field_f.a(((ga) this).field_p, ((ga) this).field_j, (byte) -65);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("ga.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
    }
}
