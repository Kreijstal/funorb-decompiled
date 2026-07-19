/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    private int field_e;
    static boolean field_m;
    private boolean field_r;
    private int field_h;
    private int field_d;
    private int field_x;
    private int field_q;
    private int field_i;
    static dd field_g;
    private int field_l;
    static String field_k;
    static int field_u;
    private int field_a;
    static String field_s;
    private int field_b;
    private int field_n;
    static int[] field_t;
    private int field_w;
    private int field_c;
    private int field_j;
    private int field_f;
    private int field_o;
    private le field_p;
    private float field_v;

    final void a(int param0) {
        this.field_p.a(this.field_b, -1062, this.field_c);
        if (param0 > -113) {
            field_m = true;
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = fleas.field_A ? 1 : 0;
        var2 = this.field_o;
        var3 = this.field_l;
        if (this.c((byte) -114)) {
          L0: {
            L1: {
              if (var2 <= this.field_w) {
                break L1;
              } else {
                var2 = this.field_w;
                if (var5 == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (var2 >= this.field_e) {
              break L0;
            } else {
              var2 = this.field_e;
              break L0;
            }
          }
          L2: {
            L3: {
              if (var3 <= this.field_q) {
                break L3;
              } else {
                var3 = this.field_q;
                if (var5 == 0) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (this.field_a > var3) {
              var3 = this.field_a;
              break L2;
            } else {
              L4: {
                if (this.field_v > 0.0f) {
                  L5: {
                    var4 = (int)((float)var3 * this.field_v + 0.5f);
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
                  var3 = (int)((float)var2 / this.field_v);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (var2 == ki.field_a) {
                if (gm.field_nb == var3) {
                  L6: {
                    if (this.field_o > 0) {
                      field_u = (-ki.field_a + this.field_o) / 2;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (param0 == -61) {
                      break L7;
                    } else {
                      this.field_q = 84;
                      break L7;
                    }
                  }
                  return;
                } else {
                  L8: {
                    this.field_p.a(var3, param0 + -1001, var2);
                    if (this.field_o > 0) {
                      field_u = (-ki.field_a + this.field_o) / 2;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (param0 == -61) {
                      break L9;
                    } else {
                      this.field_q = 84;
                      break L9;
                    }
                  }
                  return;
                }
              } else {
                L10: {
                  this.field_p.a(var3, param0 + -1001, var2);
                  if (this.field_o > 0) {
                    field_u = (-ki.field_a + this.field_o) / 2;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param0 == -61) {
                    break L11;
                  } else {
                    this.field_q = 84;
                    break L11;
                  }
                }
                return;
              }
            }
          }
          if (this.field_v > 0.0f) {
            L12: {
              L13: {
                var4 = (int)((float)var3 * this.field_v + 0.5f);
                if (var4 > var2) {
                  break L13;
                } else {
                  if (var2 > var4) {
                    var2 = var4;
                    if (var5 == 0) {
                      break L12;
                    } else {
                      break L13;
                    }
                  } else {
                    if (var2 != ki.field_a) {
                      L14: {
                        this.field_p.a(var3, param0 + -1001, var2);
                        if (this.field_o > 0) {
                          field_u = (-ki.field_a + this.field_o) / 2;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      if (param0 != -61) {
                        this.field_q = 84;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      if (gm.field_nb == var3) {
                        L15: {
                          if (this.field_o > 0) {
                            field_u = (-ki.field_a + this.field_o) / 2;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        if (param0 != -61) {
                          this.field_q = 84;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L16: {
                          this.field_p.a(var3, param0 + -1001, var2);
                          if (this.field_o > 0) {
                            field_u = (-ki.field_a + this.field_o) / 2;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        if (param0 == -61) {
                          return;
                        } else {
                          this.field_q = 84;
                          return;
                        }
                      }
                    }
                  }
                }
              }
              var3 = (int)((float)var2 / this.field_v);
              break L12;
            }
            if (var2 != ki.field_a) {
              L17: {
                this.field_p.a(var3, param0 + -1001, var2);
                if (this.field_o > 0) {
                  field_u = (-ki.field_a + this.field_o) / 2;
                  break L17;
                } else {
                  break L17;
                }
              }
              if (param0 != -61) {
                this.field_q = 84;
                return;
              } else {
                return;
              }
            } else {
              if (gm.field_nb == var3) {
                L18: {
                  if (this.field_o > 0) {
                    field_u = (-ki.field_a + this.field_o) / 2;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                if (param0 != -61) {
                  this.field_q = 84;
                  return;
                } else {
                  return;
                }
              } else {
                L19: {
                  this.field_p.a(var3, param0 + -1001, var2);
                  if (this.field_o > 0) {
                    field_u = (-ki.field_a + this.field_o) / 2;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                if (param0 != -61) {
                  this.field_q = 84;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            L20: {
              L21: {
                if (var2 != ki.field_a) {
                  break L21;
                } else {
                  if (gm.field_nb == var3) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              this.field_p.a(var3, param0 + -1001, var2);
              break L20;
            }
            L22: {
              if (this.field_o > 0) {
                field_u = (-ki.field_a + this.field_o) / 2;
                break L22;
              } else {
                break L22;
              }
            }
            if (param0 != -61) {
              this.field_q = 84;
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_r = false;
          return;
        }
    }

    final vb b(int param0) {
        vb var2 = null;
        this.field_c = ki.field_a;
        this.field_b = gm.field_nb;
        this.field_p.a(this.field_h, param0 + 6874, this.field_f);
        if (param0 == -7936) {
          h.field_h = false;
          var2 = wf.a(0, this.field_f, 0, fg.field_q, 0, this.field_h);
          if (var2 == null) {
            this.a(-121);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_n = -70;
          h.field_h = false;
          var2 = wf.a(0, this.field_f, 0, fg.field_q, 0, this.field_h);
          if (var2 != null) {
            return var2;
          } else {
            this.a(-121);
            return var2;
          }
        }
    }

    final void a(byte param0) {
        int fieldTemp$1 = 0;
        int var2 = 0;
        if (null != rh.field_p) {
          return;
        } else {
          L0: {
            if (-1 <= (wc.field_q ^ -1)) {
              this.field_r = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (this.field_r) {
            fieldTemp$1 = this.field_n - 1;
            this.field_n = this.field_n - 1;
            if (-1 > (fieldTemp$1 ^ -1)) {
              return;
            } else {
              this.field_n = this.field_d;
              if (this.field_j <= kf.field_k) {
                this.d((byte) -61);
                var2 = -56 / ((param0 - 24) / 47);
                return;
              } else {
                this.field_r = false;
                return;
              }
            }
          } else {
            if (ki.field_a < this.field_o) {
              field_u = (-ki.field_a + this.field_o) / 2;
              if (ki.field_a == this.field_x) {
                if (this.field_i != gm.field_nb) {
                  this.field_p.a(this.field_i, -1062, this.field_x);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_p.a(this.field_i, -1062, this.field_x);
                return;
              }
            } else {
              if (-1 > (this.field_o ^ -1)) {
                field_u = 0;
                if (fleas.field_A) {
                  field_u = (-ki.field_a + this.field_o) / 2;
                  if (ki.field_a == this.field_x) {
                    if (this.field_i != gm.field_nb) {
                      this.field_p.a(this.field_i, -1062, this.field_x);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_p.a(this.field_i, -1062, this.field_x);
                    return;
                  }
                } else {
                  if (ki.field_a == this.field_x) {
                    if (this.field_i != gm.field_nb) {
                      this.field_p.a(this.field_i, -1062, this.field_x);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_p.a(this.field_i, -1062, this.field_x);
                    return;
                  }
                }
              } else {
                if (ki.field_a == this.field_x) {
                  if (this.field_i != gm.field_nb) {
                    this.field_p.a(this.field_i, -1062, this.field_x);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_p.a(this.field_i, -1062, this.field_x);
                  return;
                }
              }
            }
          }
        }
    }

    final static bh a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int[] param7, int param8) {
        bh var9 = null;
        RuntimeException var9_ref = null;
        int var10 = 0;
        bh stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        bh stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var10 = -124 % ((param5 - 37) / 55);
            var9 = new bh(param1, param3, param4, param2, param0, param8, param7);
            wi.field_j.a(false, var9);
            s.a(-4471, param6, var9);
            stackOut_0_0 = (bh) (var9);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var9_ref);
            stackOut_2_1 = new StringBuilder().append("va.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param7 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param8 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1, int param2) {
        this.field_o = param0;
        if (param1 != 0) {
            this.field_d = -117;
            this.field_l = param2;
            return;
        }
        this.field_l = param2;
    }

    final boolean c(byte param0) {
        int var2 = 0;
        var2 = -30 / ((-74 - param0) / 38);
        if (kf.field_k >= this.field_j) {
          if ((wc.field_q ^ -1) >= -1) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    public static void b(byte param0) {
        bh discarded$0 = null;
        field_t = null;
        field_k = null;
        field_g = null;
        field_s = null;
        if (param0 != 126) {
            int[] var2 = (int[]) null;
            discarded$0 = va.a(-115, -85, -112, -17, 89, (byte) -77, -98, (int[]) null, 75);
        }
    }

    private va() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "Type your age in years";
        field_s = "Rescued: <%0>/<%1>";
        field_t = new int[40];
        field_u = 0;
    }
}
