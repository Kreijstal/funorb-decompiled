/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mk {
    private int field_l;
    int field_a;
    int field_b;
    int field_g;
    private dk field_i;
    private int field_n;
    static String field_h;
    int field_e;
    private int field_c;
    static String field_f;
    private int field_m;
    int field_d;
    int field_k;
    static uc field_j;

    public static void d(byte param0) {
        field_j = null;
        field_f = null;
        int var1 = 61 % ((-36 - param0) / 54);
        field_h = null;
    }

    final void b(int param0) {
        int var2 = 0;
        dl var3 = null;
        int var4 = 0;
        int var5 = 0;
        dl stackIn_106_0 = null;
        dl stackIn_107_0 = null;
        dl stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        dl stackIn_111_0 = null;
        dl stackIn_112_0 = null;
        dl stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        dl stackIn_117_0 = null;
        dl stackIn_118_0 = null;
        dl stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        dl stackOut_105_0 = null;
        dl stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        dl stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        dl stackOut_110_0 = null;
        dl stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        dl stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        dl stackOut_116_0 = null;
        dl stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        dl stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        L0: {
          var5 = Terraphoenix.field_V;
          if (1 == this.field_a) {
            L1: {
              if ((this.field_b ^ -1) >= -1) {
                break L1;
              } else {
                this.field_b = this.field_b - 1;
                this.field_m = this.field_m + 1;
                break L1;
              }
            }
            L2: {
              if ((this.field_b ^ -1) <= -1) {
                break L2;
              } else {
                this.field_b = this.field_b + 1;
                this.field_m = this.field_m - 1;
                break L2;
              }
            }
            L3: {
              if ((this.field_m ^ -1) > -1) {
                this.field_m = this.field_m + 16;
                break L3;
              } else {
                break L3;
              }
            }
            if (16 > this.field_m) {
              break L0;
            } else {
              this.field_m = this.field_m - 16;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L4: {
          if (0 >= j.field_R) {
            break L4;
          } else {
            j.field_R = j.field_R - 1;
            break L4;
          }
        }
        L5: {
          if (this.field_a == 2) {
            L6: {
              if (this.field_b <= 0) {
                break L6;
              } else {
                this.field_b = this.field_b - 1;
                this.field_l = this.field_l + 4;
                break L6;
              }
            }
            L7: {
              if ((this.field_b ^ -1) > -1) {
                this.field_b = this.field_b + 1;
                this.field_l = this.field_l - 4;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (this.field_l < 0) {
                this.field_l = this.field_l + 84;
                break L8;
              } else {
                break L8;
              }
            }
            if (-85 < (this.field_l ^ -1)) {
              break L5;
            } else {
              this.field_l = this.field_l - 84;
              break L5;
            }
          } else {
            break L5;
          }
        }
        L9: {
          var2 = -51 % ((param0 - 35) / 37);
          if (3 != this.field_a) {
            break L9;
          } else {
            L10: {
              if (-1 <= (this.field_b ^ -1)) {
                break L10;
              } else {
                this.field_b = this.field_b - 1;
                this.field_n = this.field_n + 1;
                break L10;
              }
            }
            L11: {
              if ((this.field_b ^ -1) <= -1) {
                break L11;
              } else {
                this.field_n = this.field_n - 1;
                this.field_b = this.field_b + 1;
                break L11;
              }
            }
            L12: {
              if ((this.field_n ^ -1) > -1) {
                this.field_n = this.field_n + 80;
                break L12;
              } else {
                break L12;
              }
            }
            if ((this.field_n ^ -1) > -81) {
              break L9;
            } else {
              this.field_n = this.field_n - 80;
              break L9;
            }
          }
        }
        L13: {
          L14: {
            if ((this.field_g ^ -1) != -1) {
              break L14;
            } else {
              if ((this.field_e ^ -1) == -1) {
                break L13;
              } else {
                break L14;
              }
            }
          }
          L15: {
            if (null == this.field_i) {
              break L15;
            } else {
              if (uf.field_c != -1) {
                L16: {
                  var3 = this.field_i.field_f[uf.field_c][vf.field_a];
                  if (this.field_a != 0) {
                    L17: {
                      if (var3 != null) {
                        break L17;
                      } else {
                        this.field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, this.field_i);
                        break L17;
                      }
                    }
                    var3 = this.field_i.field_f[uf.field_c][vf.field_a];
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L18: {
                  if ((tg.field_l ^ -1) >= -1) {
                    break L18;
                  } else {
                    if (var3 == null) {
                      break L18;
                    } else {
                      L19: {
                        if (null == var3.field_C) {
                          break L19;
                        } else {
                          if (tg.field_l <= var3.field_r) {
                            break L19;
                          } else {
                            var3 = var3.field_C;
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (var3.field_C == null) {
                          break L20;
                        } else {
                          if ((var3.field_r ^ -1) <= (tg.field_l ^ -1)) {
                            break L20;
                          } else {
                            var3 = var3.field_C;
                            break L20;
                          }
                        }
                      }
                      L21: {
                        if (null == var3.field_C) {
                          break L21;
                        } else {
                          if ((tg.field_l ^ -1) >= (var3.field_r ^ -1)) {
                            break L21;
                          } else {
                            var3 = var3.field_C;
                            break L21;
                          }
                        }
                      }
                      L22: {
                        if (var3.field_C == null) {
                          break L22;
                        } else {
                          if ((var3.field_r ^ -1) <= (tg.field_l ^ -1)) {
                            break L22;
                          } else {
                            var3 = var3.field_C;
                            break L22;
                          }
                        }
                      }
                      L23: while (true) {
                        if ((var3.field_r ^ -1) <= (tg.field_l ^ -1)) {
                          break L18;
                        } else {
                          var3.field_C = new dl(uf.field_c, vf.field_a, 1 + var3.field_r, this.field_i);
                          var3.field_C.field_c = var3;
                          var3 = var3.field_C;
                          if (var5 != 0) {
                            break L15;
                          } else {
                            if (var5 == 0) {
                              continue L23;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                L24: {
                  L25: {
                    L26: {
                      L27: {
                        L28: {
                          var4 = this.field_a;
                          if (var4 != 0) {
                            break L28;
                          } else {
                            if (var5 == 0) {
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                        L29: {
                          if (var4 != 1) {
                            break L29;
                          } else {
                            if (var5 == 0) {
                              break L26;
                            } else {
                              break L29;
                            }
                          }
                        }
                        L30: {
                          if (var4 != 2) {
                            break L30;
                          } else {
                            if (var5 == 0) {
                              break L25;
                            } else {
                              break L30;
                            }
                          }
                        }
                        if ((var4 ^ -1) != -4) {
                          break L15;
                        } else {
                          if (var5 == 0) {
                            break L24;
                          } else {
                            break L27;
                          }
                        }
                      }
                      L31: {
                        if ((this.field_g ^ -1) != -2) {
                          break L31;
                        } else {
                          L32: {
                            if (var3 != null) {
                              break L32;
                            } else {
                              this.field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, this.field_i);
                              if (var5 == 0) {
                                break L31;
                              } else {
                                break L32;
                              }
                            }
                          }
                          L33: while (true) {
                            L34: {
                              L35: {
                                if (null == var3.field_C) {
                                  break L35;
                                } else {
                                  var3 = var3.field_C;
                                  if (var5 != 0) {
                                    break L34;
                                  } else {
                                    if (var5 == 0) {
                                      continue L33;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                              }
                              var3.field_C = new dl(uf.field_c, vf.field_a, 1 + var3.field_r, this.field_i);
                              break L34;
                            }
                            var3.field_C.field_c = var3;
                            break L31;
                          }
                        }
                      }
                      if (-3 != (this.field_e ^ -1)) {
                        break L15;
                      } else {
                        if (var3 != null) {
                          L36: while (true) {
                            L37: {
                              L38: {
                                if (null == var3.field_C) {
                                  break L38;
                                } else {
                                  var3 = var3.field_C;
                                  if (var5 != 0) {
                                    break L37;
                                  } else {
                                    if (var5 == 0) {
                                      continue L36;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                              }
                              L39: {
                                if (var3.field_c == null) {
                                  break L39;
                                } else {
                                  var3.field_c.field_C = null;
                                  if (var5 == 0) {
                                    break L15;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                              this.field_i.field_f[uf.field_c][vf.field_a] = null;
                              break L37;
                            }
                            if (var5 == 0) {
                              break L15;
                            } else {
                              break L26;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L40: {
                      if (1 != this.field_e) {
                        break L40;
                      } else {
                        var3.field_b = this.field_m;
                        break L40;
                      }
                    }
                    if (this.field_e != 2) {
                      break L15;
                    } else {
                      var3.field_b = -1;
                      if (var5 == 0) {
                        break L15;
                      } else {
                        break L25;
                      }
                    }
                  }
                  L41: {
                    if (this.field_g != 2) {
                      break L41;
                    } else {
                      L42: {
                        stackOut_105_0 = (dl) (var3);
                        stackIn_107_0 = stackOut_105_0;
                        stackIn_106_0 = stackOut_105_0;
                        if ((this.field_l ^ -1) == (var3.field_k ^ -1)) {
                          stackOut_107_0 = (dl) ((Object) stackIn_107_0);
                          stackOut_107_1 = -1;
                          stackIn_108_0 = stackOut_107_0;
                          stackIn_108_1 = stackOut_107_1;
                          break L42;
                        } else {
                          stackOut_106_0 = (dl) ((Object) stackIn_106_0);
                          stackOut_106_1 = this.field_l;
                          stackIn_108_0 = stackOut_106_0;
                          stackIn_108_1 = stackOut_106_1;
                          break L42;
                        }
                      }
                      stackIn_108_0.field_k = stackIn_108_1;
                      break L41;
                    }
                  }
                  if (-2 != (this.field_g ^ -1)) {
                    break L15;
                  } else {
                    L43: {
                      stackOut_110_0 = (dl) (var3);
                      stackIn_112_0 = stackOut_110_0;
                      stackIn_111_0 = stackOut_110_0;
                      if ((var3.field_g ^ -1) != (this.field_l ^ -1)) {
                        stackOut_112_0 = (dl) ((Object) stackIn_112_0);
                        stackOut_112_1 = this.field_l;
                        stackIn_113_0 = stackOut_112_0;
                        stackIn_113_1 = stackOut_112_1;
                        break L43;
                      } else {
                        stackOut_111_0 = (dl) ((Object) stackIn_111_0);
                        stackOut_111_1 = -1;
                        stackIn_113_0 = stackOut_111_0;
                        stackIn_113_1 = stackOut_111_1;
                        break L43;
                      }
                    }
                    stackIn_113_0.field_g = stackIn_113_1;
                    if (var5 == 0) {
                      break L15;
                    } else {
                      break L24;
                    }
                  }
                }
                L44: {
                  if (1 == this.field_g) {
                    L45: {
                      stackOut_116_0 = (dl) (var3);
                      stackIn_118_0 = stackOut_116_0;
                      stackIn_117_0 = stackOut_116_0;
                      if ((this.field_n ^ -1) != (var3.field_j ^ -1)) {
                        stackOut_118_0 = (dl) ((Object) stackIn_118_0);
                        stackOut_118_1 = this.field_n;
                        stackIn_119_0 = stackOut_118_0;
                        stackIn_119_1 = stackOut_118_1;
                        break L45;
                      } else {
                        stackOut_117_0 = (dl) ((Object) stackIn_117_0);
                        stackOut_117_1 = -1;
                        stackIn_119_0 = stackOut_117_0;
                        stackIn_119_1 = stackOut_117_1;
                        break L45;
                      }
                    }
                    stackIn_119_0.field_j = stackIn_119_1;
                    break L44;
                  } else {
                    break L44;
                  }
                }
                if (-3 == (this.field_e ^ -1)) {
                  var3.field_j = -1;
                  break L15;
                } else {
                  break L13;
                }
              } else {
                break L13;
              }
            }
          }
          break L13;
        }
    }

    final void a(byte param0) {
        Object var2 = null;
        byte[] var2_array = of.field_k[this.field_c];
        if (var2_array == null) {
            this.field_i = new dk(16, 16);
            this.field_i.field_l = (mk) (this);
            return;
        }
        this.a(false, var2_array);
        if (param0 > -42) {
            this.a(true, (byte[]) null);
        }
    }

    final void b(byte param0) {
        dl var2 = null;
        int var3 = 0;
        L0: {
          var3 = Terraphoenix.field_V;
          var2 = this.field_i.field_f[uf.field_c][vf.field_a];
          if (param0 > 121) {
            break L0;
          } else {
            mk.d((byte) 89);
            break L0;
          }
        }
        L1: {
          if (0 != this.field_a) {
            L2: {
              if (var2 != null) {
                break L2;
              } else {
                this.field_i.field_f[uf.field_c][vf.field_a] = new dl(uf.field_c, vf.field_a, 0, this.field_i);
                break L2;
              }
            }
            var2 = this.field_i.field_f[uf.field_c][vf.field_a];
            break L1;
          } else {
            break L1;
          }
        }
        L3: {
          L4: {
            L5: {
              if (tg.field_l <= 0) {
                break L5;
              } else {
                if (var2 == null) {
                  break L5;
                } else {
                  L6: {
                    if (null == var2.field_C) {
                      break L6;
                    } else {
                      if ((var2.field_r ^ -1) <= (tg.field_l ^ -1)) {
                        break L6;
                      } else {
                        var2 = var2.field_C;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (null == var2.field_C) {
                      break L7;
                    } else {
                      if ((var2.field_r ^ -1) > (tg.field_l ^ -1)) {
                        var2 = var2.field_C;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if (null == var2.field_C) {
                      break L8;
                    } else {
                      if (var2.field_r < tg.field_l) {
                        var2 = var2.field_C;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var2.field_C == null) {
                      break L9;
                    } else {
                      if (var2.field_r >= tg.field_l) {
                        break L9;
                      } else {
                        var2 = var2.field_C;
                        break L9;
                      }
                    }
                  }
                  L10: while (true) {
                    if ((tg.field_l ^ -1) >= (var2.field_r ^ -1)) {
                      break L5;
                    } else {
                      var2.field_C = new dl(uf.field_c, vf.field_a, 1 + var2.field_r, this.field_i);
                      var2.field_C.field_c = var2;
                      var2 = var2.field_C;
                      if (var3 != 0) {
                        break L4;
                      } else {
                        if (var3 == 0) {
                          continue L10;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
              }
            }
            if (var2 != null) {
              break L4;
            } else {
              break L3;
            }
          }
          L11: {
            if (var2.field_k == -1) {
              break L11;
            } else {
              var2.field_k = 3 + var2.field_k / 4 * 4;
              break L11;
            }
          }
          if (0 != (var2.field_g ^ -1)) {
            var2.field_g = 3 + 4 * (var2.field_g / 4);
            break L3;
          } else {
            break L3;
          }
        }
    }

    final void a(int param0, int param1) {
        this.c(-13859);
        this.field_c = this.field_c + param1;
        if (param0 != 23172) {
            this.a(true, (byte[]) null);
        }
        if (this.field_c < 0) {
            this.field_c = ph.field_n.length + -1;
        }
        if (!(this.field_c < ph.field_n.length)) {
            this.field_c = 0;
        }
        this.a((byte) -118);
        fg.field_c = "LEVEL CHANGED";
        j.field_R = 256;
    }

    final void c(int param0) {
        if (!(null != this.field_i)) {
            return;
        }
        fg.field_c = "MAP SAVING";
        j.field_R = 256;
        String var2 = ph.field_n[this.field_c] + ".lev";
        byte[] var3 = this.field_i.a(true);
        of.field_k[wf.a(var2, true)] = var3;
        fg.field_c = "MAP SAVED";
        j.field_R = 256;
        if (param0 != -13859) {
            this.b(-93, 17);
        }
    }

    final static int a(int param0) {
        if (param0 != -1) {
            field_f = (String) null;
        }
        return -vi.field_o + ql.field_g;
    }

    private final void a(boolean param0, String param1, int param2, int param3, int param4) {
        og.field_f.a(param1, param4 - -3, param2 - -3, 8421504, -1);
        og.field_f.a(param1, param4 - -2, param2 + 2, 8421504, -1);
        if (param0) {
            return;
        }
        try {
            og.field_f.a(param1, 1 + param4, param2 + 1, 8421504, -1);
            og.field_f.a(param1, param4 - -1, param2, 0, -1);
            og.field_f.a(param1, param4 + -1, param2, 0, -1);
            og.field_f.a(param1, param4, -1 + param2, 0, -1);
            og.field_f.a(param1, param4, param2 - -1, 0, -1);
            og.field_f.a(param1, param4, param2, param3, -1);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "mk.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0, byte[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              fg.field_c = "MAP LOADING";
              j.field_R = 256;
              this.field_i = new dk(param1);
              if (!param0) {
                break L1;
              } else {
                this.b((byte) -127);
                break L1;
              }
            }
            L2: {
              fg.field_c = "MAP LOADED";
              j.field_R = 256;
              if (this.field_i == null) {
                break L2;
              } else {
                this.field_i.field_l = (mk) (this);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("mk.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    final void b(int param0, int param1) {
        Exception exception = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        byte[] var5_array = null;
        String var6 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (null == this.field_i) {
            break L0;
          } else {
            L1: {
              if ((param0 ^ -1) >= -1) {
                break L1;
              } else {
                var3 = param0 + this.field_i.field_b;
                var4 = this.field_i.field_e + param0;
                this.c(-13859);
                var5 = null;
                var6 = ph.field_n[this.field_c] + ".lev";
                try {
                  L2: {
                    var5_array = vl.a(75, new File(var6));
                    break L2;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    System.out.println(exception);
                    break L3;
                  }
                }
                L4: {
                  this.field_i = new dk(var3, var4);
                  this.field_i.field_l = (mk) (this);
                  if (var5_array == null) {
                    break L4;
                  } else {
                    this.field_i.a(0, (byte) 104, 0, var5_array);
                    break L4;
                  }
                }
                if (Terraphoenix.field_V == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              this.field_i.field_b = this.field_i.field_b + param0;
              this.field_i.field_e = this.field_i.field_e + param0;
              if (this.field_i.field_b < 2) {
                this.field_i.field_b = 2;
                break L5;
              } else {
                break L5;
              }
            }
            if (-3 >= (this.field_i.field_e ^ -1)) {
              break L0;
            } else {
              this.field_i.field_e = 2;
              break L0;
            }
          }
        }
        L6: {
          if (param1 > 83) {
            break L6;
          } else {
            this.b(51, -121);
            break L6;
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        byte stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        L0: {
          L1: {
            var7 = Terraphoenix.field_V;
            vc.field_f.b(ph.field_n[this.field_c], 24, 24, 0, -1);
            if (this.field_i == null) {
              break L1;
            } else {
              vc.field_f.b("MAP: " + this.field_i.field_b + " x " + this.field_i.field_e, 24, 48, 16711935, -1);
              vc.field_f.b("Level:" + tg.field_l, 24, 72, 16711935, -1);
              this.field_i.d(-125);
              if (var7 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          vc.field_f.b("MAP IS NULL", 24, 48, 16711680, -1);
          break L0;
        }
        L2: {
          if ((this.field_a ^ -1) > -1) {
            this.field_a = 0;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (3 < this.field_a) {
            this.field_a = 3;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (0 != this.field_a) {
            break L4;
          } else {
            var2 = 616;
            var3 = 36;
            this.a(false, "MODE: Add/Remove Squares", var3, 16777215, var2);
            var3 += 14;
            this.a(false, "lmb - add square", var3, 16777215, var2);
            var3 += 12;
            this.a(false, "rmb - remove square", var3, 16777215, var2);
            var3 += 20;
            this.a(false, "a/s - change mode", var3, 16777215, var2);
            break L4;
          }
        }
        L5: {
          if ((this.field_a ^ -1) == -2) {
            var2 = 616;
            var3 = 36;
            this.a(false, "MODE: Floors", var3, 16777215, var2);
            var3 += 14;
            this.a(false, "lmb - set floor", var3, 16777215, var2);
            var3 += 12;
            this.a(false, "rmb - remove floor", var3, 16777215, var2);
            var3 += 12;
            this.a(false, "z/x - change floor", var3, 16777215, var2);
            var3 += 20;
            this.a(false, "a/s - change mode", var3, 16777215, var2);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if (2 != this.field_a) {
              break L7;
            } else {
              var2 = 616;
              var3 = 36;
              this.a(false, "MODE: Walls", var3, 16777215, var2);
              var3 += 14;
              this.a(false, "lmb - toggle left", var3, 16777215, var2);
              var3 += 12;
              this.a(false, "rmb - toggle right", var3, 16777215, var2);
              var3 += 12;
              this.a(false, "z/x - change wall", var3, 16777215, var2);
              var3 += 20;
              this.a(false, "a/s - change mode", var3, 16777215, var2);
              this.a(false, "MODE: Objects", var3, 16777215, var2);
              var3 += 14;
              this.a(false, "lmb - add object", var3, 16777215, var2);
              var3 += 12;
              this.a(false, "rmb - remove object", var3, 16777215, var2);
              var3 += 12;
              this.a(false, "z/x - change object", var3, 16777215, var2);
              var3 += 20;
              this.a(false, "a/s - change mode", var3, 16777215, var2);
              var4 = 40;
              var5 = 32;
              var6 = 0;
              L8: while (true) {
                if (80 <= var6) {
                  break L7;
                } else {
                  var3 = -192 + (var5 * (var6 / 16) - -480);
                  var2 = var4 * (var6 % 16);
                  kg.field_r[var6].a(var2, var3, var4, var5);
                  stackOut_18_0 = this.field_n;
                  stackOut_18_1 = var6;
                  stackIn_37_0 = stackOut_18_0;
                  stackIn_37_1 = stackOut_18_1;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  if (var7 != 0) {
                    break L6;
                  } else {
                    L9: {
                      if (stackIn_19_0 == stackIn_19_1) {
                        l.e(var2, var3, var4, var5, 65280);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    var6++;
                    if (var7 == 0) {
                      continue L8;
                    } else {
                      break L7;
                    }
                  }
                }
              }
            }
          }
          L10: {
            var2 = 616;
            var3 = 110;
            this.a(false, "9 / 0 - change level size", var3, 16711680, var2);
            var3 += 14;
            this.a(false, "[ / ] - switch level", var3, 16711680, var2);
            var3 += 14;
            this.a(false, "o / p - change view level", var3, 16777215, var2);
            var3 += 14;
            if (!dh.field_j) {
              break L10;
            } else {
              this.a(false, "q - view current level", var3, 65535, var2);
              break L10;
            }
          }
          L11: {
            var3 += 14;
            if (dh.field_j) {
              break L11;
            } else {
              this.a(false, "q - view below", var3, 16776960, var2);
              break L11;
            }
          }
          L12: {
            var3 += 14;
            if (!ll.field_c) {
              break L12;
            } else {
              this.a(false, "w - turn off walls", var3, 65535, var2);
              break L12;
            }
          }
          L13: {
            var3 += 14;
            if (ll.field_c) {
              break L13;
            } else {
              this.a(false, "w - turn on walls", var3, 16776960, var2);
              break L13;
            }
          }
          L14: {
            var3 += 14;
            if (!jb.field_a) {
              break L14;
            } else {
              this.a(false, "e - hide objects", var3, 65535, var2);
              break L14;
            }
          }
          L15: {
            var3 += 14;
            if (!jb.field_a) {
              this.a(false, "e - show objects", var3, 16776960, var2);
              break L15;
            } else {
              break L15;
            }
          }
          var3 += 14;
          var3 += 14;
          this.a(false, "IMPORTANT", var3, 16711680, var2);
          var3 += 14;
          this.a(false, "YOU CANNOT SAVE LEVELS", var3, 16711680, var2);
          var3 += 14;
          this.a(false, "DO NOT BUILD LEVELS ON", var3, 16711680, var2);
          stackOut_36_0 = param0;
          stackOut_36_1 = -17;
          stackIn_37_0 = stackOut_36_0;
          stackIn_37_1 = stackOut_36_1;
          break L6;
        }
        if (stackIn_37_0 <= stackIn_37_1) {
          L16: {
            var3 += 14;
            this.a(false, "THIS VERSION THAT YOU", var3, 16711680, var2);
            var3 += 14;
            this.a(false, "WISH TO KEEP", var3, 16711680, var2);
            var3 += 14;
            if (null != fg.field_c) {
              vc.field_f.b(fg.field_c, 24, 456, j.field_R, -1);
              break L16;
            } else {
              break L16;
            }
          }
          return;
        } else {
          return;
        }
    }

    mk() {
        j.field_R = 256;
        this.field_l = 0;
        this.field_a = 0;
        this.field_n = 0;
        this.field_m = 0;
        this.field_b = 0;
        this.field_c = 0;
        fg.field_c = "Editor started";
    }

    static {
        field_h = "Try again";
        field_f = "Enemy Turn";
    }
}
