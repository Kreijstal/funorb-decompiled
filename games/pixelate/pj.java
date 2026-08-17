/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj {
    static tf field_a;
    private int field_h;
    private tf field_e;
    static ak field_i;
    boolean field_f;
    private int field_b;
    private int field_g;
    private int field_d;
    private int field_j;
    private int field_c;

    final static void a(byte param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (param0 > 87) {
              break L0;
            } else {
              field_i = (ak) null;
              break L0;
            }
          }
          L1: {
            L2: {
              if (param1) {
                break L2;
              } else {
                if (io.field_c == null) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            bm.field_o = false;
            break L1;
          }
          if (param1) {
            if (0 >= oo.field_b) {
              if ((vn.field_g ^ -1) < -1) {
                vn.field_g = vn.field_g - 1;
                return;
              } else {
                if (0 < h.field_W) {
                  h.field_W = h.field_W - 1;
                  return;
                } else {
                  return;
                }
              }
            } else {
              oo.field_b = oo.field_b - 1;
              return;
            }
          } else {
            if (io.field_c == null) {
              if (null == bn.field_S) {
                bm.field_o = false;
                if ((vn.field_g ^ -1) < -1) {
                  vn.field_g = vn.field_g - 1;
                  return;
                } else {
                  if (-1 > (h.field_W ^ -1)) {
                    h.field_W = h.field_W - 1;
                    return;
                  } else {
                    if (qh.field_c > oo.field_b) {
                      L3: {
                        if (oo.field_b != 0) {
                          break L3;
                        } else {
                          gd.a((byte) -7);
                          break L3;
                        }
                      }
                      oo.field_b = oo.field_b + 1;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if ((oo.field_b ^ -1) >= -1) {
                  if (h.field_W <= 0) {
                    if (vn.field_g < qh.field_c) {
                      L4: {
                        if (-1 != (vn.field_g ^ -1)) {
                          break L4;
                        } else {
                          nl.a(true, -71);
                          break L4;
                        }
                      }
                      vn.field_g = vn.field_g + 1;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    h.field_W = h.field_W - 1;
                    return;
                  }
                } else {
                  oo.field_b = oo.field_b - 1;
                  return;
                }
              }
            } else {
              if (0 >= oo.field_b) {
                if (vn.field_g <= 0) {
                  if (qh.field_c > h.field_W) {
                    L5: {
                      if (0 == h.field_W) {
                        nl.a(false, -102);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    h.field_W = h.field_W + 1;
                    return;
                  } else {
                    return;
                  }
                } else {
                  vn.field_g = vn.field_g - 1;
                  return;
                }
              } else {
                oo.field_b = oo.field_b - 1;
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "pj.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(String param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              this.field_h = 0;
              this.field_c = param1;
              if (param2 == -1379417087) {
                break L1;
              } else {
                this.field_b = -57;
                break L1;
              }
            }
            L2: {
              this.field_g = 0;
              this.field_d = param3;
              this.field_f = false;
              this.field_j = 0;
              var5_int = rk.field_e.c(param0);
              if (var5_int > this.field_e.field_A) {
                this.field_e = new tf(10 + var5_int, this.field_e.field_B);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_e.c();
            t.d();
            rk.field_e.b(param0, this.field_e.field_A >> -1379417087, this.field_e.field_B, 0, -1);
            qa.field_f.a(19692);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var5);

            stackIn_11_1 = new StringBuilder().append("pj.F(");

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
          throw aa.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int a(int param0, int param1, int param2, byte param3) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param3 > 19) {
                break L1;
              } else {
                field_a = (tf) null;
                break L1;
              }
            }
            if (t.field_d < param1 - -param2 - -param0) {
              if (0 <= -param0 + param1) {
                stackIn_9_0 = -param0 + param1;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_11_0 = t.field_d + -param0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackIn_4_0 = param1 + param2;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4), "pj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final void a(byte param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -22) {
                break L1;
              } else {
                this.field_j = -90;
                break L1;
              }
            }
            if (this.field_f) {
              break L0;
            } else {
              if ((this.field_h ^ -1) <= -9) {
                if (66 > this.field_h) {
                  this.field_e.b(this.field_c + -(this.field_e.field_A >> 1343830689), this.field_d - (this.field_e.field_B >> 802407105));
                  return;
                } else {
                  if (0 < this.field_b) {
                    this.field_e.c(this.field_c - (this.field_j >> -371053727), -(this.field_g >> -1824177279) + this.field_d, this.field_j, this.field_g, this.field_b);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                this.field_e.d(-(this.field_j >> 1692418881) + this.field_c, -(this.field_g >> 221394785) + this.field_d, this.field_j, this.field_g);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "pj.A(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (this.field_f) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                this.field_h = this.field_h + 1;
                if (this.field_h < 8) {
                  this.field_g = this.field_h * this.field_e.field_B / 8;
                  this.field_j = this.field_h * this.field_e.field_A / 8;
                  break L1;
                } else {
                  if (66 <= this.field_h) {
                    if (-77 >= (this.field_h ^ -1)) {
                      this.field_f = true;
                      break L1;
                    } else {
                      var2_int = -58 + (-8 + this.field_h);
                      this.field_g = this.field_e.field_B;
                      this.field_j = (var2_int << -845252860) + this.field_e.field_A;
                      this.field_b = (10 - var2_int) * 256 / 10;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              if (param0 <= -55) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                pj.a(31, 2, 48, (byte) 8);
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "pj.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    pj() {
        this.field_h = 0;
        this.field_e = new tf(320, 21);
        this.field_f = true;
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        try {
            field_a = null;
            field_i = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "pj.E(" + param0 + ')');
        }
    }

    static {
    }
}
