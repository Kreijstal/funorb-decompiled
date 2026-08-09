/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uf extends wl {
    private int field_v;
    private ee field_u;
    private int field_x;
    static int field_A;
    static vj field_z;
    static ck field_w;
    static String field_t;
    static ck[] field_y;
    static String[] field_B;

    uf(byte[] param0) {
        super(param0);
    }

    final int i(byte param0) {
        int var2 = -7 / ((param0 - -78) / 33);
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        return this.field_r[fieldTemp$0] - this.field_u.a(false) & 255;
    }

    final void l(int param0) {
        this.field_r[this.field_n] = (byte) 0;
        this.field_v = 8;
        if (param0 > 44) {
            return;
        }
        uf.a((byte) 40, -33L);
    }

    final void j(int param0) {
        if (-9 >= (this.field_v ^ -1)) {
          if (param0 == 20) {
            return;
          } else {
            this.i((byte) -104);
            return;
          }
        } else {
          this.field_n = this.field_n + 1;
          this.field_v = 8;
          if (param0 == 20) {
            return;
          } else {
            this.i((byte) -104);
            return;
          }
        }
    }

    uf(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2) {
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int fieldTemp$10 = 0;
        int fieldTemp$11 = 0;
        int fieldTemp$12 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        int fieldTemp$16 = 0;
        int var5 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = client.field_A ? 1 : 0;
                    param2 = param2 & ee.field_b[param0];
                    if (param1 != 0) {
                        statePc = 15;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    if (param0 <= this.field_v) {
                        statePc = 9;
                    } else {
                        statePc = 2;
                    }
                    continue stateLoop;
                }
                case 2: {
                    param0 = param0 - this.field_v;
                    fieldTemp$8 = this.field_n;
                    this.field_n = this.field_n + 1;
                    this.field_r[fieldTemp$8] = (byte)(this.field_r[fieldTemp$8] + (param2 >>> param0));
                    this.field_r[this.field_n] = (byte) 0;
                    this.field_v = 8;
                    if (var5 == 0) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    this.field_v = 8;
                    return;
                }
                case 4: {
                    if (var5 == 0) {
                        statePc = 1;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (this.field_v != param0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    fieldTemp$9 = this.field_n;
                    this.field_n = this.field_n + 1;
                    this.field_r[fieldTemp$9] = (byte)(this.field_r[fieldTemp$9] + param2);
                    this.field_r[this.field_n] = (byte) 0;
                    this.field_v = 8;
                    return;
                }
                case 7: {
                    this.field_v = this.field_v - param0;
                    this.field_r[this.field_n] = (byte)(this.field_r[this.field_n] + (param2 << this.field_v));
                    return;
                }
                case 9: {
                    if (this.field_v == param0) {
                        statePc = 12;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    this.field_v = this.field_v - param0;
                    this.field_r[this.field_n] = (byte)(this.field_r[this.field_n] + (param2 << this.field_v));
                    if (var5 != 0) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    return;
                }
                case 12: {
                    fieldTemp$10 = this.field_n;
                    this.field_n = this.field_n + 1;
                    this.field_r[fieldTemp$10] = (byte)(this.field_r[fieldTemp$10] + param2);
                    this.field_r[this.field_n] = (byte) 0;
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    this.field_v = 8;
                    return;
                }
                case 15: {
                    field_w = (ck) null;
                    statePc = 39;
                    continue stateLoop;
                }
                case 17: {
                    if (this.field_v != param0) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    fieldTemp$11 = this.field_n;
                    this.field_n = this.field_n + 1;
                    this.field_r[fieldTemp$11] = (byte)(this.field_r[fieldTemp$11] + param2);
                    this.field_r[this.field_n] = (byte) 0;
                    this.field_v = 8;
                    return;
                }
                case 19: {
                    this.field_v = this.field_v - param0;
                    this.field_r[this.field_n] = (byte)(this.field_r[this.field_n] + (param2 << this.field_v));
                    if (var5 == 0) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    fieldTemp$12 = this.field_n;
                    this.field_n = this.field_n + 1;
                    this.field_r[fieldTemp$12] = (byte)(this.field_r[fieldTemp$12] + param2);
                    this.field_r[this.field_n] = (byte) 0;
                    this.field_v = 8;
                    return;
                }
                case 21: {
                    return;
                }
                case 24: {
                    this.field_v = 8;
                    return;
                }
                case 26: {
                    if (this.field_v != param0) {
                        statePc = 29;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    fieldTemp$14 = this.field_n;
                    this.field_n = this.field_n + 1;
                    this.field_r[fieldTemp$14] = (byte)(this.field_r[fieldTemp$14] + param2);
                    this.field_r[this.field_n] = (byte) 0;
                    this.field_v = 8;
                    return;
                }
                case 29: {
                    this.field_v = this.field_v - param0;
                    this.field_r[this.field_n] = (byte)(this.field_r[this.field_n] + (param2 << this.field_v));
                    if (var5 != 0) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    return;
                }
                case 31: {
                    fieldTemp$15 = this.field_n;
                    this.field_n = this.field_n + 1;
                    this.field_r[fieldTemp$15] = (byte)(this.field_r[fieldTemp$15] + param2);
                    this.field_r[this.field_n] = (byte) 0;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    this.field_v = 8;
                    return;
                }
                case 35: {
                    if (var5 == 0) {
                        statePc = 39;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 37: {
                    param0 = param0 - this.field_v;
                    fieldTemp$16 = this.field_n;
                    this.field_n = this.field_n + 1;
                    this.field_r[fieldTemp$16] = (byte)(this.field_r[fieldTemp$16] + (param2 >>> param0));
                    this.field_r[this.field_n] = (byte) 0;
                    this.field_v = 8;
                    if (var5 == 0) {
                        statePc = 35;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (param0 > this.field_v) {
                        statePc = 37;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void g(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -2093) {
                break L1;
              } else {
                field_w = (ck) null;
                break L1;
              }
            }
            fl.a(130, 256, 16694016, mb.field_e, param0 + 80, w.field_kb);
            var2_int = 140;
            var3 = 0;
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var4 >= 6) {
                  break L3;
                } else {
                  var5 = 245 * (var4 % 2) + (80 + param0);
                  fl.a(var2_int - -14, 256, 16777215, nk.field_d[var4][0], var5, w.field_kb);
                  tg.a(true, var4).c(var5 - -param0, 20 + var2_int, 18, 18);
                  var6 = ga.a(211, 0, var2_int + 20, nk.field_d[var4][1], 16, 64, 16777215, se.field_S, (byte) -128, 0, var5 + 24);
                  if (var7 == 0) {
                    L4: {
                      if (var3 < var6) {
                        var3 = var6;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (-2 == (var4 % 2 ^ -1)) {
                        var2_int = var2_int + (16 * var3 + 20 - -8);
                        var3 = 0;
                        if ((var4 ^ -1) > -5) {
                          hk.a(param0 + 80, -5 + var2_int, 480, 394758);
                          hk.a(param0 + 80, -4 + var2_int, 480, 6316128);
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var4++;
                    if (var7 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  } else {
                    return;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "uf.NA(" + param0 + ',' + param1 + ')');
        }
    }

    final void j(byte param0) {
        this.field_x = 8 * this.field_n;
        if (param0 == -108) {
            return;
        }
        this.j(119);
    }

    final static void k(int param0) {
        int var2;
        var2 = client.field_A ? 1 : 0;
        if (lg.field_W <= 0) {
          L0: {
            if ((bf.field_r ^ -1) >= -1) {
              if (-1 <= (tg.field_e ^ -1)) {
                break L0;
              } else {
                L1: {
                  tg.field_e = tg.field_e - 1;
                  if ((lg.field_W ^ -1) < -1) {
                    pa.g((byte) -89);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (bf.field_r <= 0) {
                  L2: {
                    if ((tg.field_e ^ -1) < -1) {
                      qf.a(tg.field_e, 112);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (param0 != -4840) {
                    uf.h((byte) 73);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L3: {
                    qf.a(bf.field_r, 114);
                    if ((tg.field_e ^ -1) < -1) {
                      qf.a(tg.field_e, 112);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (param0 != -4840) {
                    uf.h((byte) 73);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              bf.field_r = bf.field_r - 1;
              if (var2 == 0) {
                break L0;
              } else {
                if (-1 <= (tg.field_e ^ -1)) {
                  L4: {
                    if ((lg.field_W ^ -1) < -1) {
                      pa.g((byte) -89);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (bf.field_r <= 0) {
                    L5: {
                      if ((tg.field_e ^ -1) < -1) {
                        qf.a(tg.field_e, 112);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (param0 != -4840) {
                      uf.h((byte) 73);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L6: {
                      qf.a(bf.field_r, 114);
                      if ((tg.field_e ^ -1) < -1) {
                        qf.a(tg.field_e, 112);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    if (param0 != -4840) {
                      uf.h((byte) 73);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L7: {
                    tg.field_e = tg.field_e - 1;
                    if ((lg.field_W ^ -1) < -1) {
                      pa.g((byte) -89);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (bf.field_r <= 0) {
                    L8: {
                      if ((tg.field_e ^ -1) < -1) {
                        qf.a(tg.field_e, 112);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (param0 == -4840) {
                      return;
                    } else {
                      uf.h((byte) 73);
                      return;
                    }
                  } else {
                    L9: {
                      qf.a(bf.field_r, 114);
                      if ((tg.field_e ^ -1) < -1) {
                        qf.a(tg.field_e, 112);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (param0 == -4840) {
                      return;
                    } else {
                      uf.h((byte) 73);
                      return;
                    }
                  }
                }
              }
            }
          }
          L10: {
            if ((lg.field_W ^ -1) < -1) {
              pa.g((byte) -89);
              break L10;
            } else {
              break L10;
            }
          }
          if (bf.field_r <= 0) {
            L11: {
              if ((tg.field_e ^ -1) < -1) {
                qf.a(tg.field_e, 112);
                break L11;
              } else {
                break L11;
              }
            }
            if (param0 != -4840) {
              uf.h((byte) 73);
              return;
            } else {
              return;
            }
          } else {
            L12: {
              qf.a(bf.field_r, 114);
              if ((tg.field_e ^ -1) < -1) {
                qf.a(tg.field_e, 112);
                break L12;
              } else {
                break L12;
              }
            }
            if (param0 != -4840) {
              uf.h((byte) 73);
              return;
            } else {
              return;
            }
          }
        } else {
          lg.field_W = lg.field_W - 1;
          if (var2 != 0) {
            if ((bf.field_r ^ -1) < -1) {
              L13: {
                bf.field_r = bf.field_r - 1;
                if (var2 == 0) {
                  break L13;
                } else {
                  if (-1 <= (tg.field_e ^ -1)) {
                    break L13;
                  } else {
                    L14: {
                      tg.field_e = tg.field_e - 1;
                      if ((lg.field_W ^ -1) < -1) {
                        pa.g((byte) -89);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (bf.field_r <= 0) {
                        break L15;
                      } else {
                        qf.a(bf.field_r, 114);
                        break L15;
                      }
                    }
                    L16: {
                      if ((tg.field_e ^ -1) < -1) {
                        qf.a(tg.field_e, 112);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (param0 == -4840) {
                      return;
                    } else {
                      uf.h((byte) 73);
                      return;
                    }
                  }
                }
              }
              L17: {
                if ((lg.field_W ^ -1) < -1) {
                  pa.g((byte) -89);
                  break L17;
                } else {
                  break L17;
                }
              }
              if (bf.field_r <= 0) {
                L18: {
                  if ((tg.field_e ^ -1) < -1) {
                    qf.a(tg.field_e, 112);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                if (param0 == -4840) {
                  return;
                } else {
                  uf.h((byte) 73);
                  return;
                }
              } else {
                L19: {
                  qf.a(bf.field_r, 114);
                  if ((tg.field_e ^ -1) < -1) {
                    qf.a(tg.field_e, 112);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                if (param0 == -4840) {
                  return;
                } else {
                  uf.h((byte) 73);
                  return;
                }
              }
            } else {
              L20: {
                if (-1 <= (tg.field_e ^ -1)) {
                  break L20;
                } else {
                  tg.field_e = tg.field_e - 1;
                  break L20;
                }
              }
              L21: {
                if ((lg.field_W ^ -1) < -1) {
                  pa.g((byte) -89);
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if (bf.field_r <= 0) {
                  break L22;
                } else {
                  qf.a(bf.field_r, 114);
                  break L22;
                }
              }
              L23: {
                if ((tg.field_e ^ -1) < -1) {
                  qf.a(tg.field_e, 112);
                  break L23;
                } else {
                  break L23;
                }
              }
              if (param0 == -4840) {
                return;
              } else {
                uf.h((byte) 73);
                return;
              }
            }
          } else {
            L24: {
              if ((lg.field_W ^ -1) < -1) {
                pa.g((byte) -89);
                break L24;
              } else {
                break L24;
              }
            }
            if (bf.field_r <= 0) {
              L25: {
                if ((tg.field_e ^ -1) < -1) {
                  qf.a(tg.field_e, 112);
                  break L25;
                } else {
                  break L25;
                }
              }
              if (param0 == -4840) {
                return;
              } else {
                uf.h((byte) 73);
                return;
              }
            } else {
              L26: {
                qf.a(bf.field_r, 114);
                if ((tg.field_e ^ -1) < -1) {
                  qf.a(tg.field_e, 112);
                  break L26;
                } else {
                  break L26;
                }
              }
              if (param0 == -4840) {
                return;
              } else {
                uf.h((byte) 73);
                return;
              }
            }
          }
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var5 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = 55 / ((5 - param0) / 45);
                        var5_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5_int >= param2) {
                            statePc = 12;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        fieldTemp$1 = this.field_n;
                        this.field_n = this.field_n + 1;
                        param1[param3 + var5_int] = (byte)(this.field_r[fieldTemp$1] + -this.field_u.a(false));
                        var5_int++;
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var7 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_10_0 = (RuntimeException) (var5);
                    stackIn_9_0 = stackIn_10_0;
                    stackIn_10_1 = new StringBuilder().append("uf.TA(").append(param0).append(',');
                    stackIn_9_1 = stackIn_10_1;
                    if (param1 == null) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_9_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_9_1);
                    stackIn_11_2 = "{...}";
                    statePc = 11;
                    continue stateLoop;
                }
                case 10: {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    statePc = 11;
                    continue stateLoop;
                }
                case 11: {
                    throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
                }
                case 12: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void k(byte param0) {
        this.field_n = (7 + this.field_x) / 8;
        if (param0 < -97) {
            return;
        }
        field_w = (ck) null;
    }

    public static void h(byte param0) {
        field_z = null;
        field_y = null;
        if (param0 <= 111) {
          field_A = -90;
          field_t = null;
          field_w = null;
          field_B = null;
          return;
        } else {
          field_t = null;
          field_w = null;
          field_B = null;
          return;
        }
    }

    final void f(int param0, int param1) {
        int fieldTemp$1 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_r[fieldTemp$1] = (byte)(param0 + this.field_u.a(false));
        if (param1 == -4) {
          return;
        } else {
          field_y = (ck[]) null;
          return;
        }
    }

    final int a(int param0, byte param1) {
        int incrementValue$1 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int statePc = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    if (param1 > 39) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return 9;
                }
                case 2: {
                    var3 = this.field_x >> 227270371;
                    var4 = -(7 & this.field_x) + 8;
                    var5 = 0;
                    this.field_x = this.field_x + param0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    if (var4 < param0) {
                        statePc = 8;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (param0 == var4) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    var5 = var5 + (this.field_r[var3] >> -param0 + var4 & ee.field_b[param0]);
                    if (var6 == 0) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    var5 = var5 + (ee.field_b[var4] & this.field_r[var3]);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return var5;
                }
                case 8: {
                    incrementValue$1 = var3;
                    var3++;
                    var5 = var5 + ((ee.field_b[var4] & this.field_r[incrementValue$1]) << param0 + -var4);
                    param0 = param0 - var4;
                    var4 = 8;
                    if (var6 == 0) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    var5 = var5 + (ee.field_b[var4] & this.field_r[var3]);
                    return var5;
                }
                case 10: {
                    if (var6 == 0) {
                        statePc = 3;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    if (param0 == var4) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    var5 = var5 + (this.field_r[var3] >> -param0 + var4 & ee.field_b[param0]);
                    if (var6 == 0) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    var5 = var5 + (ee.field_b[var4] & this.field_r[var3]);
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(byte param0, long param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        ed.field_a.setTime(new Date(param1));
        var3 = ed.field_a.get(7);
        var4 = ed.field_a.get(5);
        var5 = ed.field_a.get(2);
        var6 = ed.field_a.get(1);
        var7 = ed.field_a.get(11);
        if (param0 != 60) {
          uf.a((byte) -1, 45L);
          var8 = ed.field_a.get(12);
          var9 = ed.field_a.get(13);
          return tm.field_f[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + db.field_e[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          var8 = ed.field_a.get(12);
          var9 = ed.field_a.get(13);
          return tm.field_f[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + db.field_e[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    final void a(int[] param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_u = new ee(param0);
              if (param1 > 61) {
                break L1;
              } else {
                this.i((byte) -25);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("uf.RA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    static {
        field_t = "Concluded";
        field_B = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
