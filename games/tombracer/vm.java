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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_d;
        var3 = this.field_t;
        if (!this.a((byte) -115)) {
          this.field_h = false;
          return;
        } else {
          L0: {
            L1: {
              if (var3 > this.field_m) {
                break L1;
              } else {
                if (var3 < this.field_e) {
                  var3 = this.field_e;
                  if (var5 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  break L0;
                }
              }
            }
            var3 = this.field_m;
            break L0;
          }
          L2: {
            L3: {
              if (var2 > this.field_o) {
                break L3;
              } else {
                if (var2 < this.field_n) {
                  var2 = this.field_n;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                } else {
                  if (this.field_r > 0.0f) {
                    var4 = (int)(0.5f + this.field_r * (float)var3);
                    if (var4 > var2) {
                      var3 = (int)((float)var2 / this.field_r);
                      if (var5 == 0) {
                        L4: {
                          if (param0 <= -31) {
                            break L4;
                          } else {
                            this.field_k = -11;
                            break L4;
                          }
                        }
                        L5: {
                          if (mma.field_a != var2) {
                            this.field_l.a(var2, -117, var3);
                            break L5;
                          } else {
                            if (var3 == qf.field_i) {
                              break L5;
                            } else {
                              this.field_l.a(var2, -117, var3);
                              break L5;
                            }
                          }
                        }
                        L6: {
                          if (this.field_d <= 0) {
                            break L6;
                          } else {
                            lp.field_g = (this.field_d + -mma.field_a) / 2;
                            break L6;
                          }
                        }
                        return;
                      } else {
                        L7: {
                          if (var4 < var2) {
                            var2 = var4;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (param0 <= -31) {
                            break L8;
                          } else {
                            this.field_k = -11;
                            break L8;
                          }
                        }
                        L9: {
                          if (mma.field_a != var2) {
                            this.field_l.a(var2, -117, var3);
                            break L9;
                          } else {
                            if (var3 == qf.field_i) {
                              break L9;
                            } else {
                              this.field_l.a(var2, -117, var3);
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (this.field_d <= 0) {
                            break L10;
                          } else {
                            lp.field_g = (this.field_d + -mma.field_a) / 2;
                            break L10;
                          }
                        }
                        return;
                      }
                    } else {
                      L11: {
                        if (var4 < var2) {
                          var2 = var4;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      L12: {
                        if (param0 <= -31) {
                          break L12;
                        } else {
                          this.field_k = -11;
                          break L12;
                        }
                      }
                      L13: {
                        if (mma.field_a != var2) {
                          this.field_l.a(var2, -117, var3);
                          break L13;
                        } else {
                          if (var3 == qf.field_i) {
                            break L13;
                          } else {
                            this.field_l.a(var2, -117, var3);
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (this.field_d <= 0) {
                          break L14;
                        } else {
                          lp.field_g = (this.field_d + -mma.field_a) / 2;
                          break L14;
                        }
                      }
                      return;
                    }
                  } else {
                    L15: {
                      if (param0 <= -31) {
                        break L15;
                      } else {
                        this.field_k = -11;
                        break L15;
                      }
                    }
                    L16: {
                      if (mma.field_a != var2) {
                        this.field_l.a(var2, -117, var3);
                        break L16;
                      } else {
                        if (var3 == qf.field_i) {
                          break L16;
                        } else {
                          this.field_l.a(var2, -117, var3);
                          break L16;
                        }
                      }
                    }
                    L17: {
                      if (this.field_d <= 0) {
                        break L17;
                      } else {
                        lp.field_g = (this.field_d + -mma.field_a) / 2;
                        break L17;
                      }
                    }
                    return;
                  }
                }
              }
            }
            var2 = this.field_o;
            break L2;
          }
          if (this.field_r > 0.0f) {
            L18: {
              var4 = (int)(0.5f + this.field_r * (float)var3);
              if (var4 <= var2) {
                break L18;
              } else {
                var3 = (int)((float)var2 / this.field_r);
                if (var5 != 0) {
                  break L18;
                } else {
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
                        if (this.field_d <= 0) {
                          return;
                        } else {
                          lp.field_g = (this.field_d + -mma.field_a) / 2;
                          return;
                        }
                      }
                    }
                  } else {
                    this.field_k = -11;
                    if (mma.field_a != var2) {
                      L19: {
                        this.field_l.a(var2, -117, var3);
                        if (this.field_d <= 0) {
                          break L19;
                        } else {
                          lp.field_g = (this.field_d + -mma.field_a) / 2;
                          break L19;
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
                        L20: {
                          this.field_l.a(var2, -117, var3);
                          if (this.field_d <= 0) {
                            break L20;
                          } else {
                            lp.field_g = (this.field_d + -mma.field_a) / 2;
                            break L20;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
            }
            if (var4 < var2) {
              var2 = var4;
              if (param0 <= -31) {
                if (mma.field_a != var2) {
                  this.field_l.a(var2, -117, var3);
                  if (this.field_d <= 0) {
                    return;
                  } else {
                    lp.field_g = (this.field_d + -mma.field_a) / 2;
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
                    if (this.field_d <= 0) {
                      return;
                    } else {
                      lp.field_g = (this.field_d + -mma.field_a) / 2;
                      return;
                    }
                  }
                }
              } else {
                this.field_k = -11;
                if (mma.field_a != var2) {
                  L21: {
                    this.field_l.a(var2, -117, var3);
                    if (this.field_d <= 0) {
                      break L21;
                    } else {
                      lp.field_g = (this.field_d + -mma.field_a) / 2;
                      break L21;
                    }
                  }
                  return;
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
                    if (this.field_d <= 0) {
                      return;
                    } else {
                      lp.field_g = (this.field_d + -mma.field_a) / 2;
                      return;
                    }
                  }
                }
              }
            } else {
              L22: {
                if (param0 <= -31) {
                  break L22;
                } else {
                  this.field_k = -11;
                  break L22;
                }
              }
              L23: {
                if (mma.field_a != var2) {
                  this.field_l.a(var2, -117, var3);
                  break L23;
                } else {
                  if (var3 == qf.field_i) {
                    break L23;
                  } else {
                    this.field_l.a(var2, -117, var3);
                    break L23;
                  }
                }
              }
              if (this.field_d <= 0) {
                return;
              } else {
                lp.field_g = (this.field_d + -mma.field_a) / 2;
                return;
              }
            }
          } else {
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
            } else {
              this.field_k = -11;
              if (mma.field_a != var2) {
                L24: {
                  this.field_l.a(var2, -117, var3);
                  if (this.field_d <= 0) {
                    break L24;
                  } else {
                    lp.field_g = (this.field_d + -mma.field_a) / 2;
                    break L24;
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
                  L25: {
                    this.field_l.a(var2, -117, var3);
                    if (this.field_d <= 0) {
                      break L25;
                    } else {
                      lp.field_g = (this.field_d + -mma.field_a) / 2;
                      break L25;
                    }
                  }
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
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        if (param0) {
          this.a(true);
          if (null != dq.field_f) {
            return;
          } else {
            if (-1 > (wla.field_ub ^ -1)) {
              if (this.field_h) {
                fieldTemp$4 = this.field_q - 1;
                this.field_q = this.field_q - 1;
                if (-1 > (fieldTemp$4 ^ -1)) {
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
                L0: {
                  if (this.field_d > mma.field_a) {
                    break L0;
                  } else {
                    if (-1 > (this.field_d ^ -1)) {
                      lp.field_g = 0;
                      if (!TombRacer.field_G) {
                        if (this.field_b == mma.field_a) {
                          if (this.field_g != qf.field_i) {
                            this.field_l.a(this.field_b, -124, this.field_g);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          this.field_l.a(this.field_b, -124, this.field_g);
                          return;
                        }
                      } else {
                        break L0;
                      }
                    } else {
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
                    }
                  }
                }
                lp.field_g = (this.field_d + -mma.field_a) / 2;
                if (this.field_b == mma.field_a) {
                  if (this.field_g != qf.field_i) {
                    this.field_l.a(this.field_b, -124, this.field_g);
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.field_l.a(this.field_b, -124, this.field_g);
                  return;
                }
              }
            } else {
              this.field_h = false;
              if (this.field_h) {
                fieldTemp$5 = this.field_q - 1;
                this.field_q = this.field_q - 1;
                if (-1 > (fieldTemp$5 ^ -1)) {
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
                  if (-1 > (this.field_d ^ -1)) {
                    lp.field_g = 0;
                    if (!TombRacer.field_G) {
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
                      lp.field_g = (this.field_d + -mma.field_a) / 2;
                      L2: {
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
                } else {
                  lp.field_g = (this.field_d + -mma.field_a) / 2;
                  L4: {
                    if (this.field_b != mma.field_a) {
                      this.field_l.a(this.field_b, -124, this.field_g);
                      break L4;
                    } else {
                      if (this.field_g != qf.field_i) {
                        this.field_l.a(this.field_b, -124, this.field_g);
                        break L4;
                      } else {
                        break L4;
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
            if (-1 > (wla.field_ub ^ -1)) {
              if (this.field_h) {
                fieldTemp$6 = this.field_q - 1;
                this.field_q = this.field_q - 1;
                if (-1 > (fieldTemp$6 ^ -1)) {
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
                  if (-1 > (this.field_d ^ -1)) {
                    lp.field_g = 0;
                    if (!TombRacer.field_G) {
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
                      L5: {
                        lp.field_g = (this.field_d + -mma.field_a) / 2;
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
                    }
                  } else {
                    L6: {
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
            } else {
              this.field_h = false;
              if (this.field_h) {
                fieldTemp$7 = this.field_q - 1;
                this.field_q = this.field_q - 1;
                if (-1 > (fieldTemp$7 ^ -1)) {
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
                L8: {
                  L9: {
                    if (this.field_d > mma.field_a) {
                      break L9;
                    } else {
                      if (-1 > (this.field_d ^ -1)) {
                        lp.field_g = 0;
                        if (!TombRacer.field_G) {
                          break L8;
                        } else {
                          break L9;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  lp.field_g = (this.field_d + -mma.field_a) / 2;
                  break L8;
                }
                L10: {
                  if (this.field_b != mma.field_a) {
                    this.field_l.a(this.field_b, -124, this.field_g);
                    break L10;
                  } else {
                    if (this.field_g != qf.field_i) {
                      this.field_l.a(this.field_b, -124, this.field_g);
                      break L10;
                    } else {
                      break L10;
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
        via var2 = null;
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
        int stackOut_25_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
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
                    stackOut_25_0 = 1;
                    stackIn_27_0 = stackOut_25_0;
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
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L0;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
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
