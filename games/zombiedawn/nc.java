/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nc extends le {
    private int field_l;
    int field_m;
    static fn field_r;
    static int field_j;
    private int field_i;
    static vn field_k;
    private int field_s;
    private int field_n;
    int field_q;
    private fn field_o;
    static tp field_p;
    private int field_h;

    final boolean c(int param0) {
        if (param0 >= 81) {
          if (-751 >= (this.field_n ^ -1)) {
            if (this.field_l != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0) {
        sl.field_b = new be(so.field_a.nextInt(), 3, 256, 256, 256, 2.0f, true);
        if (param0 != 11800) {
          return;
        } else {
          na.field_c = sl.field_b.c(256, 256, param0 + -11827);
          return;
        }
    }

    public static void d(int param0) {
        field_p = null;
        if (param0 != -2135443998) {
            nc.d(30);
            field_r = null;
            field_k = null;
            return;
        }
        field_r = null;
        field_k = null;
    }

    final void a(boolean param0) {
        int fieldTemp$0 = 0;
        fb var2;
        ah var3;
        int var4;
        var4 = ZombieDawn.field_J;
        if (!this.c(116)) {
          fieldTemp$0 = this.field_s;
          this.field_s = this.field_s + 1;
          if (fieldTemp$0 > 10) {
            this.field_s = 0;
            var2 = (fb) ((Object) dj.field_e.field_R.b((byte) 26));
            L0: while (true) {
              if (var2 != null) {
                L1: {
                  if (var2 instanceof ah) {
                    var3 = (ah) ((Object) var2);
                    var3.a((nc) (this), -26246);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var2 = (fb) ((Object) dj.field_e.field_R.a(false));
                continue L0;
              } else {
                this.field_i = this.field_i + 7;
                if (!param0) {
                  if (256 >= this.field_i) {
                    if ((this.field_n ^ -1) > -751) {
                      L2: {
                        if (-257 < (this.field_l ^ -1)) {
                          this.field_l = this.field_l + this.field_h;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        this.field_n = this.field_n + 1;
                        if ((this.field_l ^ -1) >= -257) {
                          break L3;
                        } else {
                          this.field_l = 256;
                          break L3;
                        }
                      }
                      L4: {
                        if (0 <= this.field_l) {
                          break L4;
                        } else {
                          this.field_l = 0;
                          break L4;
                        }
                      }
                      return;
                    } else {
                      L5: {
                        this.field_l = this.field_l - this.field_h;
                        if ((this.field_l ^ -1) >= -257) {
                          break L5;
                        } else {
                          this.field_l = 256;
                          break L5;
                        }
                      }
                      L6: {
                        if (0 <= this.field_l) {
                          break L6;
                        } else {
                          this.field_l = 0;
                          break L6;
                        }
                      }
                      return;
                    }
                  } else {
                    L7: {
                      this.field_i = 0;
                      if ((this.field_n ^ -1) <= -751) {
                        this.field_l = this.field_l - this.field_h;
                        break L7;
                      } else {
                        L8: {
                          if (-257 < (this.field_l ^ -1)) {
                            this.field_l = this.field_l + this.field_h;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        this.field_n = this.field_n + 1;
                        break L7;
                      }
                    }
                    L9: {
                      if ((this.field_l ^ -1) >= -257) {
                        break L9;
                      } else {
                        this.field_l = 256;
                        break L9;
                      }
                    }
                    L10: {
                      if (0 <= this.field_l) {
                        break L10;
                      } else {
                        this.field_l = 0;
                        break L10;
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            this.field_i = this.field_i + 7;
            if (!param0) {
              if (256 >= this.field_i) {
                if ((this.field_n ^ -1) > -751) {
                  L11: {
                    if (-257 < (this.field_l ^ -1)) {
                      this.field_l = this.field_l + this.field_h;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    this.field_n = this.field_n + 1;
                    if ((this.field_l ^ -1) >= -257) {
                      break L12;
                    } else {
                      this.field_l = 256;
                      break L12;
                    }
                  }
                  L13: {
                    if (0 <= this.field_l) {
                      break L13;
                    } else {
                      this.field_l = 0;
                      break L13;
                    }
                  }
                  return;
                } else {
                  L14: {
                    this.field_l = this.field_l - this.field_h;
                    if ((this.field_l ^ -1) >= -257) {
                      break L14;
                    } else {
                      this.field_l = 256;
                      break L14;
                    }
                  }
                  L15: {
                    if (0 <= this.field_l) {
                      break L15;
                    } else {
                      this.field_l = 0;
                      break L15;
                    }
                  }
                  return;
                }
              } else {
                L16: {
                  this.field_i = 0;
                  if ((this.field_n ^ -1) <= -751) {
                    this.field_l = this.field_l - this.field_h;
                    break L16;
                  } else {
                    L17: {
                      if (-257 < (this.field_l ^ -1)) {
                        this.field_l = this.field_l + this.field_h;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                    this.field_n = this.field_n + 1;
                    break L16;
                  }
                }
                L18: {
                  if ((this.field_l ^ -1) >= -257) {
                    break L18;
                  } else {
                    this.field_l = 256;
                    break L18;
                  }
                }
                L19: {
                  if (0 <= this.field_l) {
                    break L19;
                  } else {
                    this.field_l = 0;
                    break L19;
                  }
                }
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void c(byte param0) {
        this.field_n = 750;
        if (param0 != -64) {
            return;
        }
        this.field_l = 0;
    }

    final static void d(byte param0) {
        int var1;
        if ((fl.field_a ^ -1) != -11) {
          if (nm.c(-23022)) {
            ma.field_p = true;
            var1 = 39 / ((46 - param0) / 34);
            return;
          } else {
            gf.a((byte) 41);
            fl.field_a = 11;
            ma.field_p = true;
            var1 = 39 / ((46 - param0) / 34);
            return;
          }
        } else {
          gf.a((byte) 41);
          fl.field_a = 11;
          ma.field_p = true;
          var1 = 39 / ((46 - param0) / 34);
          return;
        }
    }

    final void a(wk param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = param0.a(this.field_m, (byte) -61);
            var4 = param0.a(this.field_q, 0);
            this.field_o.h(pj.a(var4, 51, var3_int));
            if (param1) {
              L1: {
                if (255 < (var3_int ^ -1)) {
                  break L1;
                } else {
                  if (-256 > var4) {
                    break L1;
                  } else {
                    if (var3_int > bd.field_e - -256) {
                      break L1;
                    } else {
                      if (256 + nh.field_P < var4) {
                        break L1;
                      } else {
                        L2: {
                          if ((this.field_l ^ -1) > -257) {
                            stackIn_11_0 = (-this.field_i + 256) * this.field_l >> -243899286;
                            break L2;
                          } else {
                            stackIn_11_0 = -this.field_i + 256 >> -2135443998;
                            break L2;
                          }
                        }
                        var5 = stackIn_11_0;
                        bi.d(var3_int, var4, this.field_i, 0, var5);
                        so.b(wk.field_o, -256 + var3_int, -256 + var4, this.field_l);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (runtimeException);

            stackIn_15_1 = new StringBuilder().append("nc.C(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    nc(int param0, int param1) {
        this.field_s = 0;
        this.field_o = null;
        this.field_i = 0;
        this.field_l = 0;
        this.field_q = param1;
        this.field_n = 0;
        this.field_h = 3;
        this.field_m = param0;
        this.field_o = kh.a(17, false);
    }

    static {
        field_r = null;
        field_j = 0;
    }
}
