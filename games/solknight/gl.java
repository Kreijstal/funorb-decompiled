/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gl {
    private int field_j;
    private int field_b;
    private int field_k;
    private int field_d;
    private int field_c;
    private int field_h;
    private int field_o;
    private ni field_i;
    private int field_e;
    private int field_a;
    private int field_f;
    private int field_p;
    private float field_l;
    static java.util.zip.CRC32 field_g;
    private int field_q;
    private boolean field_m;
    private int field_n;
    static kb field_s;
    private int field_t;
    private int field_r;

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = SolKnight.field_L ? 1 : 0;
        var2 = this.field_h;
        var3 = this.field_o;
        if (!this.b((byte) -91)) {
          this.field_m = false;
          return;
        } else {
          L0: {
            L1: {
              if (this.field_f >= var2) {
                break L1;
              } else {
                var2 = this.field_f;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (var2 < this.field_b) {
              var2 = this.field_b;
              break L0;
            } else {
              L2: {
                L3: {
                  if (this.field_e >= var3) {
                    break L3;
                  } else {
                    var3 = this.field_e;
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.field_q <= var3) {
                  break L2;
                } else {
                  var3 = this.field_q;
                  break L2;
                }
              }
              if (param0 >= -51) {
                L4: {
                  this.a(-106, -107, -71);
                  if (0.0f < this.field_l) {
                    L5: {
                      var4 = (int)(0.5f + (float)var3 * this.field_l);
                      if (var4 > var2) {
                        break L5;
                      } else {
                        if (var2 > var4) {
                          var2 = var4;
                          if (var5 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    var3 = (int)((float)var2 / this.field_l);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (var2 == ec.field_h) {
                  if (cf.field_d == var3) {
                    L6: {
                      if (-1 > (this.field_h ^ -1)) {
                        ib.field_j = (this.field_h - ec.field_h) / 2;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    return;
                  } else {
                    this.field_i.a(false, var2, var3);
                    L7: {
                      if (-1 > (this.field_h ^ -1)) {
                        ib.field_j = (this.field_h - ec.field_h) / 2;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  this.field_i.a(false, var2, var3);
                  L8: {
                    if (-1 > (this.field_h ^ -1)) {
                      ib.field_j = (this.field_h - ec.field_h) / 2;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  return;
                }
              } else {
                L9: {
                  if (0.0f < this.field_l) {
                    L10: {
                      var4 = (int)(0.5f + (float)var3 * this.field_l);
                      if (var4 > var2) {
                        break L10;
                      } else {
                        if (var2 > var4) {
                          var2 = var4;
                          if (var5 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                    var3 = (int)((float)var2 / this.field_l);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L11: {
                  if (var2 != ec.field_h) {
                    this.field_i.a(false, var2, var3);
                    break L11;
                  } else {
                    if (cf.field_d == var3) {
                      break L11;
                    } else {
                      this.field_i.a(false, var2, var3);
                      break L11;
                    }
                  }
                }
                L12: {
                  if (-1 > (this.field_h ^ -1)) {
                    ib.field_j = (this.field_h - ec.field_h) / 2;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                return;
              }
            }
          }
          L13: {
            L14: {
              if (this.field_e >= var3) {
                break L14;
              } else {
                var3 = this.field_e;
                if (var5 == 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (this.field_q <= var3) {
              break L13;
            } else {
              var3 = this.field_q;
              break L13;
            }
          }
          if (param0 < -51) {
            if (0.0f < this.field_l) {
              L15: {
                L16: {
                  var4 = (int)(0.5f + (float)var3 * this.field_l);
                  if (var4 > var2) {
                    break L16;
                  } else {
                    if (var2 > var4) {
                      var2 = var4;
                      if (var5 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    } else {
                      if (var2 == ec.field_h) {
                        if (cf.field_d != var3) {
                          L17: {
                            this.field_i.a(false, var2, var3);
                            if (-1 > (this.field_h ^ -1)) {
                              ib.field_j = (this.field_h - ec.field_h) / 2;
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          return;
                        } else {
                          L18: {
                            if (-1 > (this.field_h ^ -1)) {
                              ib.field_j = (this.field_h - ec.field_h) / 2;
                              break L18;
                            } else {
                              break L18;
                            }
                          }
                          return;
                        }
                      } else {
                        L19: {
                          this.field_i.a(false, var2, var3);
                          if (-1 > (this.field_h ^ -1)) {
                            ib.field_j = (this.field_h - ec.field_h) / 2;
                            break L19;
                          } else {
                            break L19;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                var3 = (int)((float)var2 / this.field_l);
                break L15;
              }
              if (var2 == ec.field_h) {
                if (cf.field_d == var3) {
                  L20: {
                    if (-1 > (this.field_h ^ -1)) {
                      ib.field_j = (this.field_h - ec.field_h) / 2;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  return;
                } else {
                  L21: {
                    this.field_i.a(false, var2, var3);
                    if (-1 > (this.field_h ^ -1)) {
                      ib.field_j = (this.field_h - ec.field_h) / 2;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  return;
                }
              } else {
                L22: {
                  this.field_i.a(false, var2, var3);
                  if (-1 > (this.field_h ^ -1)) {
                    ib.field_j = (this.field_h - ec.field_h) / 2;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                return;
              }
            } else {
              if (var2 == ec.field_h) {
                if (cf.field_d != var3) {
                  L23: {
                    this.field_i.a(false, var2, var3);
                    if (-1 > (this.field_h ^ -1)) {
                      ib.field_j = (this.field_h - ec.field_h) / 2;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  return;
                } else {
                  L24: {
                    if (-1 > (this.field_h ^ -1)) {
                      ib.field_j = (this.field_h - ec.field_h) / 2;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  return;
                }
              } else {
                L25: {
                  this.field_i.a(false, var2, var3);
                  if (-1 > (this.field_h ^ -1)) {
                    ib.field_j = (this.field_h - ec.field_h) / 2;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                return;
              }
            }
          } else {
            L26: {
              this.a(-106, -107, -71);
              if (0.0f < this.field_l) {
                L27: {
                  var4 = (int)(0.5f + (float)var3 * this.field_l);
                  if (var4 > var2) {
                    break L27;
                  } else {
                    if (var2 > var4) {
                      var2 = var4;
                      if (var5 == 0) {
                        break L26;
                      } else {
                        break L27;
                      }
                    } else {
                      break L26;
                    }
                  }
                }
                var3 = (int)((float)var2 / this.field_l);
                break L26;
              } else {
                break L26;
              }
            }
            if (var2 == ec.field_h) {
              if (cf.field_d != var3) {
                L28: {
                  this.field_i.a(false, var2, var3);
                  if (-1 > (this.field_h ^ -1)) {
                    ib.field_j = (this.field_h - ec.field_h) / 2;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                return;
              } else {
                L29: {
                  if (-1 > (this.field_h ^ -1)) {
                    ib.field_j = (this.field_h - ec.field_h) / 2;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                return;
              }
            } else {
              L30: {
                this.field_i.a(false, var2, var3);
                if (-1 > (this.field_h ^ -1)) {
                  ib.field_j = (this.field_h - ec.field_h) / 2;
                  break L30;
                } else {
                  break L30;
                }
              }
              return;
            }
          }
        }
    }

    final void a(int param0) {
        int fieldTemp$0 = 0;
        if (dj.field_k != null) {
          return;
        } else {
          L0: {
            if (param0 >= ob.field_l) {
              this.field_m = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!this.field_m) {
            if (ec.field_h < this.field_h) {
              ib.field_j = (this.field_h - ec.field_h) / 2;
              if (this.field_c == ec.field_h) {
                if (cf.field_d != this.field_k) {
                  this.field_i.a(false, this.field_c, this.field_k);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_i.a(false, this.field_c, this.field_k);
                return;
              }
            } else {
              if ((this.field_h ^ -1) < -1) {
                ib.field_j = 0;
                if (SolKnight.field_L) {
                  ib.field_j = (this.field_h - ec.field_h) / 2;
                  if (this.field_c == ec.field_h) {
                    if (cf.field_d != this.field_k) {
                      this.field_i.a(false, this.field_c, this.field_k);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_i.a(false, this.field_c, this.field_k);
                    return;
                  }
                } else {
                  if (this.field_c == ec.field_h) {
                    if (cf.field_d != this.field_k) {
                      this.field_i.a(false, this.field_c, this.field_k);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_i.a(false, this.field_c, this.field_k);
                    return;
                  }
                }
              } else {
                if (this.field_c == ec.field_h) {
                  if (cf.field_d != this.field_k) {
                    this.field_i.a(false, this.field_c, this.field_k);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_i.a(false, this.field_c, this.field_k);
                  return;
                }
              }
            }
          } else {
            fieldTemp$0 = this.field_r - 1;
            this.field_r = this.field_r - 1;
            if ((fieldTemp$0 ^ -1) >= -1) {
              this.field_r = this.field_a;
              if (bi.field_a >= this.field_j) {
                this.b(-110);
                return;
              } else {
                this.field_m = false;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            param2 = ml.a("", -30614, '_', param2);
            if (param1 > 60) {
              L1: {
                L2: {
                  var3 = ji.a(21762, param0);
                  if ((param2.indexOf(param0) ^ -1) != 0) {
                    break L2;
                  } else {
                    if ((param2.indexOf(var3) ^ -1) == 0) {
                      stackIn_8_0 = 0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackIn_8_0 = 1;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("gl.J(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    final static int a(String param0, int param1, String param2, int param3, int param4, String param5, boolean param6) {
        mb var7 = null;
        RuntimeException var7_ref = null;
        mb var8 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 140) {
              var7 = new mb(param2);
              var8 = new mb(param5);
              stackIn_4_0 = vb.a(param3, param4, param6, param0, var8, var7, -21760);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 122;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7_ref);

            stackIn_7_1 = new StringBuilder().append("gl.G(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), stackIn_14_2 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void a(boolean param0) {
        this.field_i.a(param0, this.field_p, this.field_t);
    }

    final jg b(boolean param0) {
        this.field_t = cf.field_d;
        this.field_p = ec.field_h;
        this.field_i.a(param0, this.field_n, this.field_d);
        jd.field_p = false;
        jg var2 = g.a(this.field_d, 0, wh.field_c, this.field_n, (byte) -81, 0);
        if (!(var2 != null)) {
            this.a(false);
        }
        return var2;
    }

    final static void a(byte param0) {
        RuntimeException runtimeException = null;
        o var1 = null;
        o var2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = SolKnight.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1 = new o(540, 140);
                        cl.a(-104, var1);
                        hk.a();
                        mi.a();
                        ad.field_h = 0;
                        ee.g(101);
                        var2 = var1.c();
                        var3 = 0;
                        if (param0 == 28) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var5 = (String) null;
                        gl.a((String) null, -104, (String) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var3 >= 15) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var2.d(-2, -2, 16777215);
                        mi.d(4, 4, 0, 0, 540, 140);
                        var3++;
                        if (var4 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        tg.field_I.a();
                        var1.f(0, 0);
                        mf.e(4096);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fc.a((Throwable) ((Object) runtimeException), "gl.H(" + param0 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != -25195) {
            return;
        }
        this.field_h = param1;
        this.field_o = param0;
    }

    final boolean b(byte param0) {
        if (param0 == -91) {
          if (bi.field_a >= this.field_j) {
            if (-1 <= (ob.field_l ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_n = -40;
          if (bi.field_a >= this.field_j) {
            if (-1 <= (ob.field_l ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, byte[] param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 > 92) {
                break L1;
              } else {
                field_g = (java.util.zip.CRC32) null;
                break L1;
              }
            }
            stackIn_3_0 = ki.a(-27129, param1, param0, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("gl.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void c(byte param0) {
        if (param0 != 95) {
            return;
        }
        field_s = null;
        field_g = null;
    }

    private gl() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new java.util.zip.CRC32();
        field_s = new kb();
    }
}
