/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gsa {
    boolean field_h;
    boolean field_l;
    int field_m;
    private double field_g;
    boolean field_d;
    private double field_e;
    double field_q;
    int field_x;
    int field_f;
    int field_a;
    private fla field_t;
    int field_u;
    int field_r;
    static int field_j;
    static fpa field_y;
    int field_v;
    int field_c;
    boolean field_o;
    boolean field_b;
    int field_z;
    static String field_w;
    int field_n;
    double field_i;
    int field_p;
    boolean field_k;
    static String field_s;

    final void a(int param0, int param1, int param2) {
        fla discarded$1 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        L0: {
          L1: {
            L2: {
              var9 = TombRacer.field_G ? 1 : 0;
              var4 = -1;
              if (efa.field_y > param1) {
                break L2;
              } else {
                if (param1 < ona.field_H) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (nta.field_d > param1) {
                  break L4;
                } else {
                  if (param1 < og.field_m) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (iv.field_ub > param1) {
                break L0;
              } else {
                if (ema.field_b > param1) {
                  L5: {
                    if (this.field_l) {
                      break L5;
                    } else {
                      if (param1 >= iv.field_ub - -(50 * param2)) {
                        L6: {
                          this.field_l = true;
                          if (-1 <= (this.field_a ^ -1)) {
                            break L6;
                          } else {
                            var4 = 65;
                            break L6;
                          }
                        }
                        this.field_x = this.field_x + this.field_a;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (this.field_o) {
                    break L0;
                  } else {
                    if (param2 * 50 + iv.field_ub + 25 <= param1) {
                      L7: {
                        this.field_o = true;
                        if (this.field_f <= 0) {
                          break L7;
                        } else {
                          if (this.field_a != 0) {
                            break L7;
                          } else {
                            var4 = 65;
                            break L7;
                          }
                        }
                      }
                      this.field_x = this.field_x + this.field_f;
                      if (var9 == 0) {
                        break L0;
                      } else {
                        break L3;
                      }
                    } else {
                      break L0;
                    }
                  }
                } else {
                  break L0;
                }
              }
            }
            L8: {
              if (this.field_d) {
                break L8;
              } else {
                if (nta.field_d + param2 * 50 > param1) {
                  break L8;
                } else {
                  this.field_x = this.field_x + this.field_n;
                  this.field_d = true;
                  if ((this.field_n ^ -1) >= -1) {
                    break L8;
                  } else {
                    var4 = 64;
                    break L8;
                  }
                }
              }
            }
            if (this.field_h) {
              break L0;
            } else {
              if (param1 >= 25 + (50 * param2 + nta.field_d)) {
                L9: {
                  this.field_x = this.field_x + this.field_z;
                  if (-1 <= (this.field_z ^ -1)) {
                    break L9;
                  } else {
                    if (this.field_n != 0) {
                      break L9;
                    } else {
                      var4 = 64;
                      break L9;
                    }
                  }
                }
                this.field_h = true;
                if (var9 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L0;
              }
            }
          }
          L10: {
            if (this.field_k) {
              break L10;
            } else {
              if (param1 < efa.field_y - -(50 * param2)) {
                break L10;
              } else {
                L11: {
                  if ((this.field_v ^ -1) < -1) {
                    var4 = 63;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                this.field_k = true;
                this.field_x = this.field_x + this.field_v;
                break L10;
              }
            }
          }
          if (this.field_b) {
            break L0;
          } else {
            if (25 + (efa.field_y - -(param2 * 50)) <= param1) {
              L12: {
                if (this.field_u <= 0) {
                  break L12;
                } else {
                  if (this.field_v == 0) {
                    var4 = 63;
                    break L12;
                  } else {
                    break L12;
                  }
                }
              }
              this.field_b = true;
              this.field_x = this.field_x + this.field_u;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L13: {
          if ((var4 ^ -1) == 0) {
            break L13;
          } else {
            discarded$1 = mr.field_w.a(new fm(var4, 0, 0, 0), -58);
            break L13;
          }
        }
        L14: {
          var5 = -this.field_m + this.field_x;
          var6 = 0;
          if (var5 <= 0) {
            break L14;
          } else {
            var6 = 1;
            break L14;
          }
        }
        L15: {
          if (var6 > 0) {
            this.field_m = this.field_m + var6;
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          if (var6 != param0) {
            L17: {
              if (this.field_t == null) {
                break L17;
              } else {
                if (!this.field_t.l((byte) -98)) {
                  break L17;
                } else {
                  if (-1 != (var6 ^ -1)) {
                    break L16;
                  } else {
                    if (null == this.field_t) {
                      break L16;
                    } else {
                      this.field_t.a(mr.field_w, (byte) -113);
                      this.field_t = null;
                      break L16;
                    }
                  }
                }
              }
            }
            this.field_t = mr.field_w.a(new fm(param2 + 94, 0, 0, 0), -58);
            if (-1 != (var6 ^ -1)) {
              break L16;
            } else {
              if (null == this.field_t) {
                break L16;
              } else {
                this.field_t.a(mr.field_w, (byte) -113);
                this.field_t = null;
                break L16;
              }
            }
          } else {
            if (-1 != (var6 ^ -1)) {
              break L16;
            } else {
              if (null == this.field_t) {
                break L16;
              } else {
                this.field_t.a(mr.field_w, (byte) -113);
                this.field_t = null;
                break L16;
              }
            }
          }
        }
        L18: {
          this.field_q = 73.0;
          if (param1 < ona.field_H) {
            break L18;
          } else {
            L19: {
              var7 = (double)(param1 + -ona.field_H);
              if (var7 > 100.0) {
                var7 = 100.0;
                break L19;
              } else {
                break L19;
              }
            }
            this.field_q = this.field_q + this.field_i * var7;
            break L18;
          }
        }
        L20: {
          if (og.field_m > param1) {
            break L20;
          } else {
            L21: {
              var7 = (double)(param1 - og.field_m);
              if (100.0 < var7) {
                var7 = 100.0;
                break L21;
              } else {
                break L21;
              }
            }
            this.field_q = this.field_q + var7 * this.field_g;
            break L20;
          }
        }
        L22: {
          if (param1 < ema.field_b) {
            break L22;
          } else {
            L23: {
              var7 = (double)(param1 + -ema.field_b);
              if (var7 > 100.0) {
                var7 = 100.0;
                break L23;
              } else {
                break L23;
              }
            }
            this.field_q = this.field_q + var7 * this.field_e;
            break L22;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_w = (String) null;
        }
        field_w = null;
        field_s = null;
        field_y = null;
    }

    final void a(double param0, double param1, double param2, boolean param3) {
        this.field_i = param2;
        this.field_e = param1;
        this.field_g = param0;
        if (!param3) {
            this.field_i = -0.9605648251097887;
        }
    }

    gsa(hca param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              this.field_o = false;
              this.field_l = false;
              this.field_h = false;
              this.field_p = param1[0];
              this.field_r = param1[1];
              this.field_q = 73.0;
              this.field_k = false;
              this.field_b = false;
              this.field_x = 0;
              this.field_c = param1[2];
              this.field_d = false;
              this.field_m = 0;
              this.field_n = gp.field_i[1] * this.field_r;
              this.field_a = gp.field_i[2] * this.field_c;
              this.field_v = this.field_p * gp.field_i[0];
              var3_int = param0.z(-96);
              if (var3_int == -1) {
                break L1;
              } else {
                L2: {
                  if (-1 != (bta.field_n[var3_int] ^ -1)) {
                    break L2;
                  } else {
                    this.field_u = this.field_u + param0.j(false);
                    break L2;
                  }
                }
                L3: {
                  if (1 != bta.field_n[var3_int]) {
                    break L3;
                  } else {
                    this.field_z = this.field_z + param0.j(false);
                    break L3;
                  }
                }
                if (2 != bta.field_n[var3_int]) {
                  break L1;
                } else {
                  this.field_f = this.field_f + param0.j(false);
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("gsa.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    static {
        field_j = 83;
        field_y = new fpa();
        field_s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
