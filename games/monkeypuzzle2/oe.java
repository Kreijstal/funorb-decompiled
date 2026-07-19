/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    private int field_c;
    private int field_h;
    private int field_s;
    static cd field_l;
    private int field_f;
    private float field_m;
    private int field_b;
    private int field_j;
    private int field_a;
    private int field_q;
    private boolean field_n;
    private int field_p;
    private rg field_r;
    static hi field_o;
    private int field_k;
    private int field_e;
    private int field_g;
    static boolean field_d;
    private int field_i;

    final void e(int param0) {
        this.field_r.a(this.field_i, this.field_b, param0 ^ -122);
        if (param0 != 0) {
            this.a(89, -36, 56);
        }
    }

    final static void a(m param0, int param1, byte param2) {
        hb var3 = null;
        if (param2 > -90) {
            return;
        }
        try {
            var3 = gf.field_c;
            var3.b(true, param1);
            var3.b(param0.field_g, -49152);
            var3.b(param0.field_j, -49152);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "oe.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_f = param2;
        this.field_j = param1;
        if (param0 >= -97) {
            this.field_i = -44;
        }
    }

    final void b(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        if (null == ba.field_f) {
          if ((af.field_c ^ -1) < -1) {
            if (!this.field_n) {
              L0: {
                if (this.field_j <= ub.field_b) {
                  if ((this.field_j ^ -1) < -1) {
                    ue.field_D = 0;
                    break L0;
                  } else {
                    if (ub.field_b == this.field_p) {
                      if (this.field_q != lb.field_z) {
                        this.field_r.a(this.field_q, this.field_p, -116);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_r.a(this.field_q, this.field_p, -116);
                      return;
                    }
                  }
                } else {
                  ue.field_D = (-ub.field_b + this.field_j) / 2;
                  if (!MonkeyPuzzle2.field_F) {
                    break L0;
                  } else {
                    L1: {
                      if ((this.field_j ^ -1) < -1) {
                        ue.field_D = 0;
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    if (ub.field_b == this.field_p) {
                      if (this.field_q != lb.field_z) {
                        this.field_r.a(this.field_q, this.field_p, -116);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_r.a(this.field_q, this.field_p, -116);
                      return;
                    }
                  }
                }
              }
              if (ub.field_b == this.field_p) {
                if (this.field_q != lb.field_z) {
                  this.field_r.a(this.field_q, this.field_p, -116);
                  return;
                } else {
                  return;
                }
              } else {
                this.field_r.a(this.field_q, this.field_p, -116);
                return;
              }
            } else {
              if (param0 < -40) {
                fieldTemp$2 = this.field_k - 1;
                this.field_k = this.field_k - 1;
                if (fieldTemp$2 <= 0) {
                  this.field_k = this.field_c;
                  if (this.field_h > gb.field_i) {
                    this.field_n = false;
                    return;
                  } else {
                    this.a(363);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            this.field_n = false;
            if (!this.field_n) {
              if (this.field_j > ub.field_b) {
                ue.field_D = (-ub.field_b + this.field_j) / 2;
                if (MonkeyPuzzle2.field_F) {
                  L2: {
                    if ((this.field_j ^ -1) < -1) {
                      ue.field_D = 0;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (ub.field_b == this.field_p) {
                    if (this.field_q != lb.field_z) {
                      this.field_r.a(this.field_q, this.field_p, -116);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_r.a(this.field_q, this.field_p, -116);
                    return;
                  }
                } else {
                  L3: {
                    if (ub.field_b != this.field_p) {
                      this.field_r.a(this.field_q, this.field_p, -116);
                      break L3;
                    } else {
                      if (this.field_q == lb.field_z) {
                        break L3;
                      } else {
                        this.field_r.a(this.field_q, this.field_p, -116);
                        break L3;
                      }
                    }
                  }
                  return;
                }
              } else {
                L4: {
                  if ((this.field_j ^ -1) < -1) {
                    ue.field_D = 0;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (ub.field_b != this.field_p) {
                    this.field_r.a(this.field_q, this.field_p, -116);
                    break L5;
                  } else {
                    if (this.field_q == lb.field_z) {
                      break L5;
                    } else {
                      this.field_r.a(this.field_q, this.field_p, -116);
                      break L5;
                    }
                  }
                }
                return;
              }
            } else {
              if (param0 < -40) {
                fieldTemp$3 = this.field_k - 1;
                this.field_k = this.field_k - 1;
                if (fieldTemp$3 <= 0) {
                  this.field_k = this.field_c;
                  if (this.field_h > gb.field_i) {
                    this.field_n = false;
                    return;
                  } else {
                    this.a(363);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 == -1) {
          if (this.field_h <= gb.field_i) {
            if (-1 <= (af.field_c ^ -1)) {
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
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            ne.field_c.a(true);
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var1_int ^ -1) <= -33) {
                    break L3;
                  } else {
                    dl.field_a[var1_int] = 0L;
                    var1_int++;
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 > 100) {
                  break L2;
                } else {
                  oe.d(-61);
                  break L2;
                }
              }
              var1_int = 0;
              L4: while (true) {
                L5: {
                  if (var1_int >= 32) {
                    bg.field_E = 0;
                    break L5;
                  } else {
                    ve.field_w[var1_int] = 0L;
                    var1_int++;
                    if (var2 != 0) {
                      break L5;
                    } else {
                      continue L4;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "oe.F(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != -12248) {
            field_d = true;
            field_o = null;
            field_l = null;
            return;
        }
        field_o = null;
        field_l = null;
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = this.field_j;
        var3 = this.field_f;
        if (param0 != 363) {
          this.field_r = (rg) null;
          if (this.c(-1)) {
            L0: {
              L1: {
                if (var3 > this.field_e) {
                  break L1;
                } else {
                  if (var3 < this.field_s) {
                    var3 = this.field_s;
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
              var3 = this.field_e;
              break L0;
            }
            L2: {
              L3: {
                if (this.field_g < var2) {
                  break L3;
                } else {
                  if (var2 >= this.field_a) {
                    break L2;
                  } else {
                    var2 = this.field_a;
                    if (var5 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var2 = this.field_g;
              break L2;
            }
            if (this.field_m > 0.0f) {
              L4: {
                L5: {
                  var4 = (int)(0.5f + (float)var3 * this.field_m);
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
                      if (ub.field_b == var2) {
                        if (var3 == lb.field_z) {
                          if ((this.field_j ^ -1) < -1) {
                            ue.field_D = (-ub.field_b + this.field_j) / 2;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          L6: {
                            this.field_r.a(var3, var2, -121);
                            if ((this.field_j ^ -1) >= -1) {
                              break L6;
                            } else {
                              ue.field_D = (-ub.field_b + this.field_j) / 2;
                              break L6;
                            }
                          }
                          return;
                        }
                      } else {
                        L7: {
                          this.field_r.a(var3, var2, -121);
                          if ((this.field_j ^ -1) >= -1) {
                            break L7;
                          } else {
                            ue.field_D = (-ub.field_b + this.field_j) / 2;
                            break L7;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                var3 = (int)((float)var2 / this.field_m);
                break L4;
              }
              if (ub.field_b != var2) {
                this.field_r.a(var3, var2, -121);
                if ((this.field_j ^ -1) < -1) {
                  ue.field_D = (-ub.field_b + this.field_j) / 2;
                  return;
                } else {
                  return;
                }
              } else {
                if (var3 != lb.field_z) {
                  this.field_r.a(var3, var2, -121);
                  if ((this.field_j ^ -1) < -1) {
                    ue.field_D = (-ub.field_b + this.field_j) / 2;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if ((this.field_j ^ -1) < -1) {
                    ue.field_D = (-ub.field_b + this.field_j) / 2;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              L8: {
                if (ub.field_b != var2) {
                  this.field_r.a(var3, var2, -121);
                  break L8;
                } else {
                  if (var3 != lb.field_z) {
                    this.field_r.a(var3, var2, -121);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              if ((this.field_j ^ -1) >= -1) {
                return;
              } else {
                ue.field_D = (-ub.field_b + this.field_j) / 2;
                return;
              }
            }
          } else {
            this.field_n = false;
            return;
          }
        } else {
          if (this.c(-1)) {
            L9: {
              L10: {
                if (var3 > this.field_e) {
                  break L10;
                } else {
                  if (var3 < this.field_s) {
                    var3 = this.field_s;
                    if (var5 == 0) {
                      break L9;
                    } else {
                      break L10;
                    }
                  } else {
                    break L9;
                  }
                }
              }
              var3 = this.field_e;
              break L9;
            }
            L11: {
              L12: {
                if (this.field_g < var2) {
                  break L12;
                } else {
                  if (var2 >= this.field_a) {
                    break L11;
                  } else {
                    var2 = this.field_a;
                    if (var5 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              var2 = this.field_g;
              break L11;
            }
            if (this.field_m > 0.0f) {
              L13: {
                L14: {
                  var4 = (int)(0.5f + (float)var3 * this.field_m);
                  if (var4 > var2) {
                    break L14;
                  } else {
                    if (var2 > var4) {
                      var2 = var4;
                      if (var5 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    } else {
                      L15: {
                        if (ub.field_b != var2) {
                          this.field_r.a(var3, var2, -121);
                          break L15;
                        } else {
                          if (var3 != lb.field_z) {
                            this.field_r.a(var3, var2, -121);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if ((this.field_j ^ -1) >= -1) {
                          break L16;
                        } else {
                          ue.field_D = (-ub.field_b + this.field_j) / 2;
                          break L16;
                        }
                      }
                      return;
                    }
                  }
                }
                var3 = (int)((float)var2 / this.field_m);
                break L13;
              }
              if (ub.field_b == var2) {
                if (var3 == lb.field_z) {
                  L17: {
                    if ((this.field_j ^ -1) >= -1) {
                      break L17;
                    } else {
                      ue.field_D = (-ub.field_b + this.field_j) / 2;
                      break L17;
                    }
                  }
                  return;
                } else {
                  L18: {
                    this.field_r.a(var3, var2, -121);
                    if ((this.field_j ^ -1) >= -1) {
                      break L18;
                    } else {
                      ue.field_D = (-ub.field_b + this.field_j) / 2;
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                L19: {
                  this.field_r.a(var3, var2, -121);
                  if ((this.field_j ^ -1) >= -1) {
                    break L19;
                  } else {
                    ue.field_D = (-ub.field_b + this.field_j) / 2;
                    break L19;
                  }
                }
                return;
              }
            } else {
              L20: {
                if (ub.field_b != var2) {
                  this.field_r.a(var3, var2, -121);
                  break L20;
                } else {
                  if (var3 != lb.field_z) {
                    this.field_r.a(var3, var2, -121);
                    break L20;
                  } else {
                    break L20;
                  }
                }
              }
              L21: {
                if ((this.field_j ^ -1) >= -1) {
                  break L21;
                } else {
                  ue.field_D = (-ub.field_b + this.field_j) / 2;
                  break L21;
                }
              }
              return;
            }
          } else {
            this.field_n = false;
            return;
          }
        }
    }

    private oe() throws Throwable {
        throw new Error();
    }

    static {
        field_l = new cd("email");
        field_o = new hi();
        field_d = false;
    }
}
