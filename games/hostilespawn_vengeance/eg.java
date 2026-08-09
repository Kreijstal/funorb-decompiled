/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    private int field_t;
    private int field_u;
    private int field_s;
    private int field_r;
    private int field_x;
    private int field_y;
    private int field_z;
    private String field_c;
    static String field_j;
    private int field_i;
    private vm field_a;
    private String[] field_d;
    private int field_b;
    static String field_l;
    private String field_o;
    private int field_m;
    private int field_q;
    static String field_p;
    static bd field_v;
    private int field_e;
    static int field_h;
    private int field_n;
    boolean field_g;
    private int field_f;
    private int field_k;
    static String field_w;

    final boolean b(byte param0) {
        if (param0 != -66) {
            return false;
        }
        return (this.field_z ^ -1) == -1 ? true : false;
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (param0 > 39) {
          if (bm.field_c != 0) {
            vg.field_c.a(0, 0, this.field_y / 2);
            if (0 <= this.field_z) {
              L0: {
                var2 = -(736 * this.field_z / 50) + 480;
                var3 = 256 + var2;
                if (-1 > (var2 ^ -1)) {
                  si.c(0, 0, 640, var2, 0);
                  break L0;
                } else {
                  break L0;
                }
              }
              if (-1 <= (var3 ^ -1)) {
                return;
              } else {
                hj.a(0, var2, 0, 256, -var2 + var3, 32101, 640);
                return;
              }
            } else {
              this.b(-7068);
              return;
            }
          } else {
            uf.field_i[4].b(0, 0, this.field_y);
            this.b(-7068);
            if (0 > this.field_z) {
              return;
            } else {
              si.a(0, 0, 640, 480, 0, 256 - this.field_z * 4);
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(byte param0) {
        int var3;
        L0: {
          var3 = HostileSpawn.field_I ? 1 : 0;
          if ((em.field_c & 7) == 0) {
            L1: {
              if (-257 < (this.field_y ^ -1)) {
                this.field_y = this.field_y + 1;
                break L1;
              } else {
                break L1;
              }
            }
            if (-257 >= (this.field_u ^ -1)) {
              break L0;
            } else {
              this.field_u = this.field_u + 1;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          if (-1 <= (this.field_z ^ -1)) {
            break L2;
          } else {
            this.field_z = this.field_z - 1;
            break L2;
          }
        }
        if (param0 < -113) {
          if (this.field_s > this.field_n) {
            if (this.field_r <= 0) {
              if (-1 < (this.field_b ^ -1)) {
                if (em.field_c % this.field_t == 0) {
                  L3: {
                    this.field_i = this.field_i + 1;
                    if (0 >= this.field_i) {
                      break L3;
                    } else {
                      if (-47 == (this.field_d[this.field_n].charAt(this.field_i - 1) ^ -1)) {
                        if (this.field_g) {
                          this.field_r = 40;
                          break L3;
                        } else {
                          L4: {
                            if (-3 < (this.field_i ^ -1)) {
                              break L4;
                            } else {
                              if (this.field_d[this.field_n].charAt(this.field_i - 2) == 46) {
                                break L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (this.field_i >= this.field_d[this.field_n].length()) {
                            this.field_r = 40;
                            break L3;
                          } else {
                            if (-47 != (this.field_d[this.field_n].charAt(this.field_i) ^ -1)) {
                              this.field_r = 40;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  if (this.field_i < this.field_d[this.field_n].length()) {
                    if (-61 == (this.field_d[this.field_n].charAt(this.field_i) ^ -1)) {
                      L5: while (true) {
                        if (this.field_i < this.field_d[this.field_n].length()) {
                          if ((this.field_d[this.field_n].charAt(this.field_i) ^ -1) != -63) {
                            this.field_i = this.field_i + 1;
                            continue L5;
                          } else {
                            if (this.field_i >= this.field_d[this.field_n].length()) {
                              this.field_b = 0;
                              return;
                            } else {
                              return;
                            }
                          }
                        } else {
                          if (this.field_i >= this.field_d[this.field_n].length()) {
                            this.field_b = 0;
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    } else {
                      if (this.field_i >= this.field_d[this.field_n].length()) {
                        this.field_b = 0;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (this.field_i >= this.field_d[this.field_n].length()) {
                      this.field_b = 0;
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                this.field_b = this.field_b + 1;
                if (this.field_b != this.field_m) {
                  return;
                } else {
                  this.field_n = this.field_n + 1;
                  this.field_b = -1;
                  this.field_i = 0;
                  return;
                }
              }
            } else {
              this.field_r = this.field_r - 1;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param1 = v.a(-18214, '_', "", param1);
              if (!param0) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = ia.a(param1, -90);
                if (param2.indexOf(param1) != -1) {
                  break L3;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("eg.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    public static void c(int param0) {
        field_l = null;
        if (param0 != -1) {
          field_p = (String) null;
          field_v = null;
          field_j = null;
          field_w = null;
          field_p = null;
          return;
        } else {
          field_v = null;
          field_j = null;
          field_w = null;
          field_p = null;
          return;
        }
    }

    final void a(String param0, byte param1) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = null;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 75 % ((43 - param1) / 48);
            L1: while (true) {
              try {
                L2: {
                  this.field_s = this.field_a.a(param0.toUpperCase(), new int[]{500}, this.field_d);
                  break L2;
                }
              } catch (java.lang.ArrayIndexOutOfBoundsException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L3: {
                  arrayIndexOutOfBoundsException = (ArrayIndexOutOfBoundsException) (Object) decompiledCaughtException;
                  this.field_s = -1;
                  this.field_d = new String[2 * this.field_d.length];
                  break L3;
                }
              }
              if (-1 == this.field_s) {
                continue L1;
              } else {
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("eg.C(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        if (param0 != -868) {
          L0: {
            this.field_z = -20;
            if (0 > this.field_z) {
              this.field_z = 50;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (0 > this.field_z) {
              this.field_z = 50;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final void b(int param0) {
        int var2;
        int var3;
        int var4;
        var4 = HostileSpawn.field_I ? 1 : 0;
        var2 = this.field_q - (this.field_b - -(this.field_n * this.field_m));
        var3 = 0;
        L0: while (true) {
          if (this.field_n <= var3) {
            if (this.field_n < this.field_s) {
              if ((this.field_i ^ -1) < -1) {
                this.field_a.c(this.field_d[this.field_n].substring(0, this.field_i), this.field_e, var2, this.field_x, this.field_k);
                if (param0 != -7068) {
                  return;
                } else {
                  L1: {
                    var3 = 0;
                    if (this.field_n != this.field_s) {
                      break L1;
                    } else {
                      if (0 < this.field_f) {
                        this.field_f = this.field_f - 1;
                        break L1;
                      } else {
                        if (this.field_o != null) {
                          var3 = 1;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                  L2: {
                    if ((this.field_z ^ -1) > -1) {
                      if (var3 != 0) {
                        this.field_a.b(this.field_o, 320, this.field_q - -(this.field_m * 2), 16776960, -1);
                        break L2;
                      } else {
                        this.field_a.a(this.field_c, 320, 2 * this.field_m + this.field_q, 8421504, -1, this.field_u);
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  return;
                }
              } else {
                if (param0 == -7068) {
                  var3 = 0;
                  if (this.field_n != this.field_s) {
                    if ((this.field_z ^ -1) > -1) {
                      if (var3 != 0) {
                        this.field_a.b(this.field_o, 320, this.field_q - -(this.field_m * 2), 16776960, -1);
                        return;
                      } else {
                        this.field_a.a(this.field_c, 320, 2 * this.field_m + this.field_q, 8421504, -1, this.field_u);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (0 >= this.field_f) {
                      if (this.field_o == null) {
                        L3: {
                          if ((this.field_z ^ -1) > -1) {
                            if (var3 != 0) {
                              this.field_a.b(this.field_o, 320, this.field_q - -(this.field_m * 2), 16776960, -1);
                              break L3;
                            } else {
                              this.field_a.a(this.field_c, 320, 2 * this.field_m + this.field_q, 8421504, -1, this.field_u);
                              break L3;
                            }
                          } else {
                            break L3;
                          }
                        }
                        return;
                      } else {
                        L4: {
                          var3 = 1;
                          if ((this.field_z ^ -1) > -1) {
                            if (var3 != 0) {
                              this.field_a.b(this.field_o, 320, this.field_q - -(this.field_m * 2), 16776960, -1);
                              break L4;
                            } else {
                              this.field_a.a(this.field_c, 320, 2 * this.field_m + this.field_q, 8421504, -1, this.field_u);
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        return;
                      }
                    } else {
                      L5: {
                        this.field_f = this.field_f - 1;
                        if ((this.field_z ^ -1) > -1) {
                          if (var3 != 0) {
                            this.field_a.b(this.field_o, 320, this.field_q - -(this.field_m * 2), 16776960, -1);
                            break L5;
                          } else {
                            this.field_a.a(this.field_c, 320, 2 * this.field_m + this.field_q, 8421504, -1, this.field_u);
                            break L5;
                          }
                        } else {
                          break L5;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              if (param0 == -7068) {
                var3 = 0;
                if (this.field_n != this.field_s) {
                  if ((this.field_z ^ -1) > -1) {
                    if (var3 != 0) {
                      this.field_a.b(this.field_o, 320, this.field_q - -(this.field_m * 2), 16776960, -1);
                      return;
                    } else {
                      this.field_a.a(this.field_c, 320, 2 * this.field_m + this.field_q, 8421504, -1, this.field_u);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  if (0 >= this.field_f) {
                    if (this.field_o == null) {
                      L6: {
                        if ((this.field_z ^ -1) > -1) {
                          if (var3 != 0) {
                            this.field_a.b(this.field_o, 320, this.field_q - -(this.field_m * 2), 16776960, -1);
                            break L6;
                          } else {
                            this.field_a.a(this.field_c, 320, 2 * this.field_m + this.field_q, 8421504, -1, this.field_u);
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      return;
                    } else {
                      L7: {
                        var3 = 1;
                        if ((this.field_z ^ -1) > -1) {
                          if (var3 != 0) {
                            this.field_a.b(this.field_o, 320, this.field_q - -(this.field_m * 2), 16776960, -1);
                            break L7;
                          } else {
                            this.field_a.a(this.field_c, 320, 2 * this.field_m + this.field_q, 8421504, -1, this.field_u);
                            break L7;
                          }
                        } else {
                          break L7;
                        }
                      }
                      return;
                    }
                  } else {
                    L8: {
                      this.field_f = this.field_f - 1;
                      if ((this.field_z ^ -1) > -1) {
                        if (var3 != 0) {
                          this.field_a.b(this.field_o, 320, this.field_q - -(this.field_m * 2), 16776960, -1);
                          break L8;
                        } else {
                          this.field_a.a(this.field_c, 320, 2 * this.field_m + this.field_q, 8421504, -1, this.field_u);
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            this.field_a.c(this.field_d[var3], this.field_e, var2, this.field_x, this.field_k);
            var2 = var2 + this.field_m;
            var3++;
            continue L0;
          }
        }
    }

    eg() {
        this.field_r = 0;
        this.field_u = 0;
        this.field_i = 0;
        this.field_y = 0;
        this.field_t = 4;
        this.field_c = jd.field_x;
        this.field_d = new String[32];
        this.field_a = (vm) ((Object) al.field_Z);
        this.field_x = 13684944;
        this.field_b = -1;
        this.field_z = -1;
        this.field_o = lb.field_c;
        this.field_e = 70;
        this.field_m = 18;
        this.field_q = 400;
        this.field_n = 0;
        this.field_f = 50;
        this.field_g = true;
        this.field_k = -1;
    }

    static {
        field_j = "Vengeance Expansion Installed";
        field_l = "I should be able to make my way around the blockage via this vent.";
        field_h = 2;
        field_p = "Why is there always a crate blocking the way I want to go?";
    }
}
