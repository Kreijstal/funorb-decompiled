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
        String discarded$0 = uf.a((byte) 40, -33L);
    }

    final void j(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        if (-9 >= (this.field_v ^ -1)) {
          if (param0 == 20) {
            return;
          } else {
            discarded$4 = this.i((byte) -104);
            return;
          }
        } else {
          this.field_n = this.field_n + 1;
          this.field_v = 8;
          if (param0 == 20) {
            return;
          } else {
            discarded$5 = this.i((byte) -104);
            return;
          }
        }
    }

    uf(int param0) {
        super(param0);
    }

    final void a(int param0, int param1, int param2) {
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int fieldTemp$8 = 0;
        int fieldTemp$9 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        param2 = param2 & ee.field_b[param0];
        if (param1 != 0) {
          field_w = (ck) null;
          L0: while (true) {
            if (param0 > this.field_v) {
              param0 = param0 - this.field_v;
              fieldTemp$5 = this.field_n;
              this.field_n = this.field_n + 1;
              this.field_r[fieldTemp$5] = (byte)(this.field_r[fieldTemp$5] + (param2 >>> param0));
              this.field_r[this.field_n] = (byte) 0;
              this.field_v = 8;
              if (var5 == 0) {
                continue L0;
              } else {
                this.field_v = 8;
                return;
              }
            } else {
              if (this.field_v != param0) {
                this.field_v = this.field_v - param0;
                this.field_r[this.field_n] = (byte)(this.field_r[this.field_n] + (param2 << this.field_v));
                if (var5 == 0) {
                  return;
                } else {
                  fieldTemp$6 = this.field_n;
                  this.field_n = this.field_n + 1;
                  this.field_r[fieldTemp$6] = (byte)(this.field_r[fieldTemp$6] + param2);
                  this.field_r[this.field_n] = (byte) 0;
                  this.field_v = 8;
                  return;
                }
              } else {
                fieldTemp$7 = this.field_n;
                this.field_n = this.field_n + 1;
                this.field_r[fieldTemp$7] = (byte)(this.field_r[fieldTemp$7] + param2);
                this.field_r[this.field_n] = (byte) 0;
                this.field_v = 8;
                return;
              }
            }
          }
        } else {
          L1: while (true) {
            if (param0 <= this.field_v) {
              L2: {
                if (this.field_v == param0) {
                  break L2;
                } else {
                  this.field_v = this.field_v - param0;
                  this.field_r[this.field_n] = (byte)(this.field_r[this.field_n] + (param2 << this.field_v));
                  if (var5 != 0) {
                    break L2;
                  } else {
                    return;
                  }
                }
              }
              fieldTemp$8 = this.field_n;
              this.field_n = this.field_n + 1;
              this.field_r[fieldTemp$8] = (byte)(this.field_r[fieldTemp$8] + param2);
              this.field_r[this.field_n] = (byte) 0;
              this.field_v = 8;
              return;
            } else {
              param0 = param0 - this.field_v;
              fieldTemp$9 = this.field_n;
              this.field_n = this.field_n + 1;
              this.field_r[fieldTemp$9] = (byte)(this.field_r[fieldTemp$9] + (param2 >>> param0));
              this.field_r[this.field_n] = (byte) 0;
              this.field_v = 8;
              if (var5 == 0) {
                continue L1;
              } else {
                this.field_v = 8;
                return;
              }
            }
          }
        }
    }

    final static void g(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
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
              if (var4 >= 6) {
                break L0;
              } else {
                var5 = 245 * (var4 % 2) + (80 + param0);
                fl.a(var2_int - -14, 256, 16777215, nk.field_d[var4][0], var5, w.field_kb);
                tg.a(true, var4).c(var5 - -param0, 20 + var2_int, 18, 18);
                var6 = ga.a(211, 0, var2_int + 20, nk.field_d[var4][1], 16, 64, 16777215, se.field_S, (byte) -128, 0, var5 + 24);
                if (var7 == 0) {
                  L3: {
                    if (var3 < var6) {
                      var3 = var6;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (-2 == (var4 % 2 ^ -1)) {
                      var2_int = var2_int + (16 * var3 + 20 - -8);
                      var3 = 0;
                      if ((var4 ^ -1) > -5) {
                        hk.a(param0 + 80, -5 + var2_int, 480, 394758);
                        hk.a(param0 + 80, -4 + var2_int, 480, 6316128);
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  var4++;
                  continue L2;
                } else {
                  return;
                }
              }
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
        int var2 = 0;
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
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var7 = client.field_A ? 1 : 0;
        try {
          L0: {
            var6 = 55 / ((5 - param0) / 45);
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param2) {
                break L0;
              } else {
                fieldTemp$5 = this.field_n;
                this.field_n = this.field_n + 1;
                param1[param3 + var5_int] = (byte)(this.field_r[fieldTemp$5] + -this.field_u.a(false));
                var5_int++;
                if (var7 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("uf.TA(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
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
        int fieldTemp$2 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_r[fieldTemp$2] = (byte)(param0 + this.field_u.a(false));
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
        var6 = client.field_A ? 1 : 0;
        if (param1 > 39) {
          var3 = this.field_x >> 227270371;
          var4 = -(7 & this.field_x) + 8;
          var5 = 0;
          this.field_x = this.field_x + param0;
          L0: while (true) {
            if (var4 < param0) {
              incrementValue$1 = var3;
              var3++;
              var5 = var5 + ((ee.field_b[var4] & this.field_r[incrementValue$1]) << param0 + -var4);
              param0 = param0 - var4;
              var4 = 8;
              if (var6 == 0) {
                continue L0;
              } else {
                var5 = var5 + (ee.field_b[var4] & this.field_r[var3]);
                return var5;
              }
            } else {
              L1: {
                L2: {
                  if (param0 == var4) {
                    break L2;
                  } else {
                    var5 = var5 + (this.field_r[var3] >> -param0 + var4 & ee.field_b[param0]);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = var5 + (ee.field_b[var4] & this.field_r[var3]);
                break L1;
              }
              return var5;
            }
          }
        } else {
          return 9;
        }
    }

    final static String a(byte param0, long param1) {
        String discarded$1 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ed.field_a.setTime(new Date(param1));
        var3 = ed.field_a.get(7);
        var4 = ed.field_a.get(5);
        var5 = ed.field_a.get(2);
        var6 = ed.field_a.get(1);
        var7 = ed.field_a.get(11);
        if (param0 != 60) {
          discarded$1 = uf.a((byte) -1, 45L);
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
        int discarded$2 = 0;
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_u = new ee(param0);
              if (param1 > 61) {
                break L1;
              } else {
                discarded$2 = this.i((byte) -25);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("uf.RA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
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
