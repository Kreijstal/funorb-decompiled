/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm {
    boolean field_h;
    private int field_i;
    int field_p;
    private int field_d;
    private int field_c;
    static pl field_f;
    private int field_e;
    private int field_n;
    private int field_o;
    private int field_q;
    private int field_j;
    int field_s;
    private int field_m;
    private int field_g;
    static String field_a;
    private float field_r;
    private int field_k;
    private int field_t;
    private sh field_l;
    private int field_b;

    final boolean a(byte param0) {
        if (param0 < -113) {
          if (this.field_i <= cba.field_d) {
            if (-1 <= (wla.field_ub ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.field_n = -43;
          if (this.field_i <= cba.field_d) {
            if (-1 <= (wla.field_ub ^ -1)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_d;
        var3 = this.field_t;
        if (!this.a((byte) -115)) {
          this.field_h = false;
          return;
        } else {
          L0: {
            if (var3 > this.field_m) {
              var3 = this.field_m;
              break L0;
            } else {
              if (var3 < this.field_e) {
                var3 = this.field_e;
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (var2 > this.field_o) {
              var2 = this.field_o;
              break L1;
            } else {
              if (var2 < this.field_n) {
                var2 = this.field_n;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (this.field_r <= 0.0f) {
              break L2;
            } else {
              var4 = (int)(0.5f + this.field_r * (float)var3);
              if (var4 <= var2) {
                if (var4 < var2) {
                  var2 = var4;
                  break L2;
                } else {
                  L3: {
                    if (param0 <= -31) {
                      break L3;
                    } else {
                      this.field_k = -11;
                      break L3;
                    }
                  }
                  L4: {
                    if (mma.field_a != var2) {
                      this.field_l.a(var2, -117, var3);
                      break L4;
                    } else {
                      if (var3 != qf.field_i) {
                        this.field_l.a(var2, -117, var3);
                        break L4;
                      } else {
                        if (this.field_d > 0) {
                          lp.field_g = (this.field_d + -mma.field_a) / 2;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (this.field_d > 0) {
                    lp.field_g = (this.field_d + -mma.field_a) / 2;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var3 = (int)((float)var2 / this.field_r);
                if (param0 > -31) {
                  this.field_k = -11;
                  if (mma.field_a == var2) {
                    if (var3 == qf.field_i) {
                      L5: {
                        if (this.field_d <= 0) {
                          break L5;
                        } else {
                          lp.field_g = (this.field_d + -mma.field_a) / 2;
                          break L5;
                        }
                      }
                      return;
                    } else {
                      this.field_l.a(var2, -117, var3);
                      L6: {
                        if (this.field_d <= 0) {
                          break L6;
                        } else {
                          lp.field_g = (this.field_d + -mma.field_a) / 2;
                          break L6;
                        }
                      }
                      return;
                    }
                  } else {
                    this.field_l.a(var2, -117, var3);
                    L7: {
                      if (this.field_d <= 0) {
                        break L7;
                      } else {
                        lp.field_g = (this.field_d + -mma.field_a) / 2;
                        break L7;
                      }
                    }
                    return;
                  }
                } else {
                  L8: {
                    if (mma.field_a != var2) {
                      this.field_l.a(var2, -117, var3);
                      break L8;
                    } else {
                      if (var3 == qf.field_i) {
                        break L8;
                      } else {
                        this.field_l.a(var2, -117, var3);
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (this.field_d <= 0) {
                      break L9;
                    } else {
                      lp.field_g = (this.field_d + -mma.field_a) / 2;
                      break L9;
                    }
                  }
                  return;
                }
              }
            }
          }
          if (param0 <= -31) {
            if (mma.field_a != var2) {
              this.field_l.a(var2, -117, var3);
              if (this.field_d > 0) {
                lp.field_g = (this.field_d + -mma.field_a) / 2;
                return;
              } else {
                return;
              }
            } else {
              if (var3 == qf.field_i) {
                if (this.field_d <= 0) {
                  return;
                } else {
                  lp.field_g = (this.field_d + -mma.field_a) / 2;
                  return;
                }
              } else {
                this.field_l.a(var2, -117, var3);
                if (this.field_d > 0) {
                  lp.field_g = (this.field_d + -mma.field_a) / 2;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            this.field_k = -11;
            if (mma.field_a != var2) {
              L10: {
                this.field_l.a(var2, -117, var3);
                if (this.field_d <= 0) {
                  break L10;
                } else {
                  lp.field_g = (this.field_d + -mma.field_a) / 2;
                  break L10;
                }
              }
              return;
            } else {
              if (var3 == qf.field_i) {
                if (this.field_d > 0) {
                  lp.field_g = (this.field_d + -mma.field_a) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                this.field_l.a(var2, -117, var3);
                if (this.field_d > 0) {
                  lp.field_g = (this.field_d + -mma.field_a) / 2;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void e(int param0) {
        field_f = null;
        field_a = null;
        if (param0 != 26583) {
            vm.e(-62);
        }
    }

    final void a(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        if (param0) {
          this.a(true);
          if (null != dq.field_f) {
            return;
          } else {
            if (-1 <= (wla.field_ub ^ -1)) {
              this.field_h = false;
              if (this.field_h) {
                fieldTemp$0 = this.field_q - 1;
                this.field_q = this.field_q - 1;
                if (-1 > (fieldTemp$0 ^ -1)) {
                  return;
                } else {
                  this.field_q = this.field_k;
                  if (this.field_i > cba.field_d) {
                    this.field_h = false;
                    return;
                  } else {
                    this.c(-102);
                    return;
                  }
                }
              } else {
                if (this.field_d > mma.field_a) {
                  lp.field_g = (this.field_d + -mma.field_a) / 2;
                  if (this.field_b == mma.field_a) {
                    if (this.field_g == qf.field_i) {
                      return;
                    } else {
                      this.field_l.a(this.field_b, -124, this.field_g);
                      return;
                    }
                  } else {
                    this.field_l.a(this.field_b, -124, this.field_g);
                    return;
                  }
                } else {
                  if (-1 > (this.field_d ^ -1)) {
                    lp.field_g = 0;
                    if (this.field_b == mma.field_a) {
                      if (this.field_g == qf.field_i) {
                        return;
                      } else {
                        this.field_l.a(this.field_b, -124, this.field_g);
                        return;
                      }
                    } else {
                      this.field_l.a(this.field_b, -124, this.field_g);
                      return;
                    }
                  } else {
                    L0: {
                      if (this.field_b != mma.field_a) {
                        this.field_l.a(this.field_b, -124, this.field_g);
                        break L0;
                      } else {
                        if (this.field_g != qf.field_i) {
                          this.field_l.a(this.field_b, -124, this.field_g);
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            } else {
              if (this.field_h) {
                fieldTemp$1 = this.field_q - 1;
                this.field_q = this.field_q - 1;
                if (-1 > (fieldTemp$1 ^ -1)) {
                  return;
                } else {
                  this.field_q = this.field_k;
                  if (this.field_i > cba.field_d) {
                    this.field_h = false;
                    return;
                  } else {
                    this.c(-102);
                    return;
                  }
                }
              } else {
                if (this.field_d <= mma.field_a) {
                  if (-1 <= (this.field_d ^ -1)) {
                    L1: {
                      if (this.field_b != mma.field_a) {
                        this.field_l.a(this.field_b, -124, this.field_g);
                        break L1;
                      } else {
                        if (this.field_g != qf.field_i) {
                          this.field_l.a(this.field_b, -124, this.field_g);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    return;
                  } else {
                    L2: {
                      lp.field_g = 0;
                      if (this.field_b != mma.field_a) {
                        this.field_l.a(this.field_b, -124, this.field_g);
                        break L2;
                      } else {
                        if (this.field_g != qf.field_i) {
                          this.field_l.a(this.field_b, -124, this.field_g);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L3: {
                    lp.field_g = (this.field_d + -mma.field_a) / 2;
                    if (this.field_b != mma.field_a) {
                      this.field_l.a(this.field_b, -124, this.field_g);
                      break L3;
                    } else {
                      if (this.field_g != qf.field_i) {
                        this.field_l.a(this.field_b, -124, this.field_g);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          if (null != dq.field_f) {
            return;
          } else {
            L4: {
              if (-1 > (wla.field_ub ^ -1)) {
                break L4;
              } else {
                this.field_h = false;
                break L4;
              }
            }
            if (this.field_h) {
              fieldTemp$2 = this.field_q - 1;
              this.field_q = this.field_q - 1;
              if (-1 > (fieldTemp$2 ^ -1)) {
                return;
              } else {
                this.field_q = this.field_k;
                if (this.field_i > cba.field_d) {
                  this.field_h = false;
                  return;
                } else {
                  this.c(-102);
                  return;
                }
              }
            } else {
              if (this.field_d <= mma.field_a) {
                if (-1 <= (this.field_d ^ -1)) {
                  L5: {
                    if (this.field_b != mma.field_a) {
                      this.field_l.a(this.field_b, -124, this.field_g);
                      break L5;
                    } else {
                      if (this.field_g != qf.field_i) {
                        this.field_l.a(this.field_b, -124, this.field_g);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  return;
                } else {
                  L6: {
                    lp.field_g = 0;
                    if (this.field_b != mma.field_a) {
                      this.field_l.a(this.field_b, -124, this.field_g);
                      break L6;
                    } else {
                      if (this.field_g != qf.field_i) {
                        this.field_l.a(this.field_b, -124, this.field_g);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  return;
                }
              } else {
                L7: {
                  lp.field_g = (this.field_d + -mma.field_a) / 2;
                  if (this.field_b != mma.field_a) {
                    this.field_l.a(this.field_b, -124, this.field_g);
                    break L7;
                  } else {
                    if (this.field_g != qf.field_i) {
                      this.field_l.a(this.field_b, -124, this.field_g);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                return;
              }
            }
          }
        }
    }

    final void a(int param0) {
        this.field_l.a(this.field_c, -122, this.field_j);
        if (param0 < 51) {
            this.field_o = 114;
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_s = param0;
        this.field_p = param1;
        if (param2 != -1) {
            field_a = (String) null;
        }
    }

    final via b(int param0) {
        via var2;
        this.field_j = qf.field_i;
        if (param0 == 27013) {
          this.field_c = mma.field_a;
          this.field_l.a(this.field_s, -123, this.field_p);
          wla.field_Cb = false;
          var2 = r.a(this.field_p, 0, param0 + -7720, dsa.field_c, this.field_s, 0);
          if (var2 == null) {
            this.a(53);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_s = -44;
          this.field_c = mma.field_a;
          this.field_l.a(this.field_s, -123, this.field_p);
          wla.field_Cb = false;
          var2 = r.a(this.field_p, 0, param0 + -7720, dsa.field_c, this.field_s, 0);
          if (var2 != null) {
            return var2;
          } else {
            this.a(53);
            return var2;
          }
        }
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_d = param0;
        if (param1) {
            this.a(true);
            this.field_t = param2;
            return;
        }
        this.field_t = param2;
    }

    final boolean a(int param0, byte param1, int param2) {
        int stackIn_13_0 = 0;
        int stackIn_27_0 = 0;
        if (param1 >= 37) {
          if (this.field_n <= param2) {
            if (this.field_o >= param2) {
              if (param0 >= this.field_e) {
                if (param0 <= this.field_m) {
                  if (0.0f != this.field_r) {
                    if (Math.round(this.field_r * (float)param0) == param2) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackIn_27_0 = 1;
                    return stackIn_27_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          this.a(6, -40, -5);
          if (this.field_n <= param2) {
            if (this.field_o >= param2) {
              if (param0 >= this.field_e) {
                if (param0 <= this.field_m) {
                  if (0.0f == this.field_r) {
                    return true;
                  } else {
                    L0: {
                      if (Math.round(this.field_r * (float)param0) != param2) {
                        stackIn_13_0 = 0;
                        break L0;
                      } else {
                        stackIn_13_0 = 1;
                        break L0;
                      }
                    }
                    return stackIn_13_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final boolean d(int param0) {
        if (param0 == -1) {
          if (wla.field_ub > 0) {
            if (this.field_i <= cba.field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.a(-62, true, 91);
          if (wla.field_ub > 0) {
            if (this.field_i <= cba.field_d) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private vm() throws Throwable {
        throw new Error();
    }

    static {
        field_f = new pl(2);
        field_a = "Hey you! Get out of the way of these boulders of doom.";
    }
}
