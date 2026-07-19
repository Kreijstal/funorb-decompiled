/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fb extends fa {
    boolean field_C;
    int field_x;
    int field_t;
    private int field_v;
    static vn[] field_w;
    int field_s;
    private int field_A;
    int field_y;
    int field_u;
    int field_z;
    int field_B;

    void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (!ng.field_e) {
          var2 = -113 / ((param0 - 66) / 50);
          var3 = this.field_y >> -711645929;
          var4 = this.field_x >> -957330697;
          if (this.field_B == var3) {
            if (this.field_u != var4) {
              this.field_u = var4;
              this.field_B = var3;
              dj.field_e.a(false, (fb) (this));
              return;
            } else {
              return;
            }
          } else {
            this.field_u = var4;
            this.field_B = var3;
            dj.field_e.a(false, (fb) (this));
            return;
          }
        } else {
          return;
        }
    }

    final fb e(byte param0) {
        fb var3 = null;
        fb var6 = null;
        if (param0 == 32) {
          if (-1 != this.field_v) {
            L0: while (true) {
              var6 = (fb) ((Object) dj.field_e.field_n.b(false));
              if (var6 != null) {
                if (var6.a((byte) 75, this.field_v)) {
                  L1: {
                    if (-1 == this.field_A) {
                      break L1;
                    } else {
                      if (this.a(var6, 1654152400) < this.field_A) {
                        break L1;
                      } else {
                        continue L0;
                      }
                    }
                  }
                  return var6;
                } else {
                  continue L0;
                }
              } else {
                return null;
              }
            }
          } else {
            return (fb) ((Object) dj.field_e.field_n.b(false));
          }
        } else {
          this.field_x = -55;
          if (-1 != this.field_v) {
            L2: while (true) {
              var3 = (fb) ((Object) dj.field_e.field_n.b(false));
              if (var3 != null) {
                if (var3.a((byte) 75, this.field_v)) {
                  if (-1 != this.field_A) {
                    if (this.a(var3, 1654152400) >= this.field_A) {
                      continue L2;
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                } else {
                  continue L2;
                }
              } else {
                return null;
              }
            }
          } else {
            return (fb) ((Object) dj.field_e.field_n.b(false));
          }
        }
    }

    final int a(fb param0, int param1) {
        boolean discarded$2 = false;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3_int = param0.field_y - this.field_y >> 1654152400;
              if (param1 == 1654152400) {
                break L1;
              } else {
                discarded$2 = this.a((byte) 21, -16);
                break L1;
              }
            }
            var4 = -this.field_x + param0.field_x >> -190016048;
            this.field_s = var3_int * var3_int - -(var4 * var4);
            stackOut_2_0 = this.field_s;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("fb.BB(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    abstract void a(byte param0, wk param1);

    final boolean a(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        if (this instanceof ah) {
          L0: {
            if (-1 == (param1 & 1 ^ -1)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            }
          }
          return stackIn_5_0 != 0;
        } else {
          if (this instanceof kd) {
            L1: {
              if (0 == (param1 & 2)) {
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L1;
              } else {
                stackOut_9_0 = 1;
                stackIn_11_0 = stackOut_9_0;
                break L1;
              }
            }
            return stackIn_11_0 != 0;
          } else {
            if (this instanceof id) {
              L2: {
                if (0 == (4 & param1)) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              return stackIn_17_0 != 0;
            } else {
              if (!(this instanceof vb)) {
                if (param0 > 29) {
                  if (this instanceof gb) {
                    if ((param1 & 16) == 0) {
                      return false;
                    } else {
                      return true;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                L3: {
                  if (0 == (param1 & 8)) {
                    stackOut_21_0 = 0;
                    stackIn_22_0 = stackOut_21_0;
                    break L3;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_22_0 = stackOut_20_0;
                    break L3;
                  }
                }
                return stackIn_22_0 != 0;
              }
            }
          }
        }
    }

    final fb a(byte param0, int param1, int param2) {
        Object var4 = null;
        fb var4_ref = null;
        int var5 = 0;
        if ((param1 ^ -1) != 0) {
          L0: {
            this.field_A = param1 * param1;
            this.field_v = param2;
            var4 = null;
            if (param1 != -1) {
              var5 = 1 + (param1 >> -1058930521);
              var4_ref = (fb) ((Object) dj.field_e.field_n.a(var5, this.field_u, 29845, this.field_B));
              break L0;
            } else {
              var4_ref = (fb) ((Object) dj.field_e.field_n.a(true));
              break L0;
            }
          }
          if (param0 == -74) {
            if (var4_ref != null) {
              if (var4_ref.a((byte) 114, param2)) {
                if ((this.field_A ^ -1) != 0) {
                  if (this.a(var4_ref, param0 ^ -1654152346) < this.field_A) {
                    return var4_ref;
                  } else {
                    return this.e((byte) 32);
                  }
                } else {
                  return var4_ref;
                }
              } else {
                return this.e((byte) 32);
              }
            } else {
              return null;
            }
          } else {
            return (fb) null;
          }
        } else {
          L1: {
            this.field_A = -1;
            this.field_v = param2;
            var4_ref = null;
            if (param1 != -1) {
              var5 = 1 + (param1 >> -1058930521);
              var4_ref = (fb) ((Object) dj.field_e.field_n.a(var5, this.field_u, 29845, this.field_B));
              break L1;
            } else {
              var4_ref = (fb) ((Object) dj.field_e.field_n.a(true));
              break L1;
            }
          }
          if (param0 == -74) {
            if (var4_ref != null) {
              if (var4_ref.a((byte) 114, param2)) {
                if ((this.field_A ^ -1) != 0) {
                  if (this.a(var4_ref, param0 ^ -1654152346) >= this.field_A) {
                    return this.e((byte) 32);
                  } else {
                    return var4_ref;
                  }
                } else {
                  return var4_ref;
                }
              } else {
                return this.e((byte) 32);
              }
            } else {
              return null;
            }
          } else {
            return (fb) null;
          }
        }
    }

    final fb b(int param0, int param1) {
        int var3 = 0;
        if ((param0 ^ -1) == 0) {
          this.field_A = -1;
          this.field_v = -1;
          if (param1 != 16) {
            this.field_x = 64;
            if (param0 != -1) {
              var3 = (param0 >> 1311979239) + 1;
              return (fb) ((Object) dj.field_e.field_n.a(var3, this.field_u, 29845, this.field_B));
            } else {
              return (fb) ((Object) dj.field_e.field_n.a(true));
            }
          } else {
            if (param0 != -1) {
              var3 = (param0 >> 1311979239) + 1;
              return (fb) ((Object) dj.field_e.field_n.a(var3, this.field_u, 29845, this.field_B));
            } else {
              return (fb) ((Object) dj.field_e.field_n.a(true));
            }
          }
        } else {
          this.field_A = param0 * param0;
          this.field_v = -1;
          if (param1 != 16) {
            this.field_x = 64;
            if (param0 != -1) {
              var3 = (param0 >> 1311979239) + 1;
              return (fb) ((Object) dj.field_e.field_n.a(var3, this.field_u, 29845, this.field_B));
            } else {
              return (fb) ((Object) dj.field_e.field_n.a(true));
            }
          } else {
            if (param0 != -1) {
              var3 = (param0 >> 1311979239) + 1;
              return (fb) ((Object) dj.field_e.field_n.a(var3, this.field_u, 29845, this.field_B));
            } else {
              return (fb) ((Object) dj.field_e.field_n.a(true));
            }
          }
        }
    }

    final static void a(int param0, byte[] param1, byte param2, int param3) {
        try {
            int var4_int = -40 / ((param2 - -5) / 42);
            param1[param0 * 4] = (byte)(param3 >>> -334589448);
            param1[1 + param0 * 4] = (byte)(param3 >>> -1382138256);
            param1[2 + 4 * param0] = (byte)(param3 >>> -463986840);
            param1[param0 * 4 - -3] = (byte)param3;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "fb.CB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int f(int param0) {
        if (param0 != 237239984) {
            fb.h(-58);
            return this.field_x >> 237239984;
        }
        return this.field_x >> 237239984;
    }

    final int a(boolean param0) {
        int discarded$0 = 0;
        if (!param0) {
            discarded$0 = fb.a(-36, -98);
            return this.field_y >> 644333776;
        }
        return this.field_y >> 644333776;
    }

    final static int a(int param0, int param1) {
        byte[] var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 1311979239) {
          param1 = param1 & 8191;
          if (4096 > param1) {
            L0: {
              if (2048 <= param1) {
                stackOut_18_0 = -lo.field_q[-2048 + param1];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = lo.field_q[-param1 + 2048];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (param1 < 6144) {
                stackOut_14_0 = -lo.field_q[-param1 + 6144];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = lo.field_q[param1 + -6144];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          var3 = (byte[]) null;
          fb.a(28, (byte[]) null, (byte) -56, 124);
          param1 = param1 & 8191;
          if (4096 > param1) {
            L2: {
              if (2048 <= param1) {
                stackOut_8_0 = -lo.field_q[-2048 + param1];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = lo.field_q[-param1 + 2048];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (param1 < 6144) {
                stackOut_4_0 = -lo.field_q[-param1 + 6144];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = lo.field_q[param1 + -6144];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    abstract void g(int param0);

    public static void h(int param0) {
        if (param0 != 237239984) {
            field_w = (vn[]) null;
            field_w = null;
            return;
        }
        field_w = null;
    }

    fb(int param0, int param1, int param2) {
        this.field_z = 0;
        this.field_C = false;
        this.field_B = -1;
        this.field_u = -1;
        this.field_x = param1 << 471093520;
        this.field_y = param0 << -959571120;
        this.field_t = param2;
    }

    static {
    }
}
