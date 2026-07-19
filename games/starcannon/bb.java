/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    private int field_i;
    private boolean field_a;
    private int field_n;
    private int field_m;
    private aa field_s;
    private float field_d;
    static o field_j;
    private int field_e;
    private int field_g;
    private int field_p;
    private int field_f;
    private int field_b;
    private int field_l;
    private int field_o;
    private int field_c;
    private int field_k;
    private int field_q;
    private int field_r;
    private int field_h;

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = StarCannon.field_A;
        var2 = this.field_b;
        var3 = this.field_r;
        if (this.c(param0 ^ 2)) {
          L0: {
            if (var2 <= this.field_l) {
              if (var2 < this.field_q) {
                var2 = this.field_q;
                break L0;
              } else {
                break L0;
              }
            } else {
              var2 = this.field_l;
              break L0;
            }
          }
          L1: {
            if (var3 > this.field_k) {
              var3 = this.field_k;
              break L1;
            } else {
              if (var3 < this.field_m) {
                var3 = this.field_m;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (this.field_d > 0.0f) {
              var4 = (int)(0.5f + (float)var3 * this.field_d);
              if (var4 > var2) {
                var3 = (int)((float)var2 / this.field_d);
                break L2;
              } else {
                if (var2 > var4) {
                  var2 = var4;
                  if (param0 == 2) {
                    if (var2 != eh.field_n) {
                      this.field_s.a((byte) 61, var2, var3);
                      if ((this.field_b ^ -1) >= -1) {
                        return;
                      } else {
                        k.field_a = (this.field_b - eh.field_n) / 2;
                        return;
                      }
                    } else {
                      if (ef.field_d != var3) {
                        this.field_s.a((byte) 61, var2, var3);
                        if ((this.field_b ^ -1) >= -1) {
                          return;
                        } else {
                          k.field_a = (this.field_b - eh.field_n) / 2;
                          return;
                        }
                      } else {
                        if ((this.field_b ^ -1) >= -1) {
                          return;
                        } else {
                          k.field_a = (this.field_b - eh.field_n) / 2;
                          return;
                        }
                      }
                    }
                  } else {
                    field_j = (o) null;
                    if (var2 != eh.field_n) {
                      this.field_s.a((byte) 61, var2, var3);
                      if ((this.field_b ^ -1) >= -1) {
                        return;
                      } else {
                        k.field_a = (this.field_b - eh.field_n) / 2;
                        return;
                      }
                    } else {
                      if (ef.field_d != var3) {
                        this.field_s.a((byte) 61, var2, var3);
                        if ((this.field_b ^ -1) >= -1) {
                          return;
                        } else {
                          k.field_a = (this.field_b - eh.field_n) / 2;
                          return;
                        }
                      } else {
                        if ((this.field_b ^ -1) >= -1) {
                          return;
                        } else {
                          k.field_a = (this.field_b - eh.field_n) / 2;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  if (param0 != 2) {
                    field_j = (o) null;
                    if (var2 != eh.field_n) {
                      this.field_s.a((byte) 61, var2, var3);
                      if ((this.field_b ^ -1) >= -1) {
                        return;
                      } else {
                        k.field_a = (this.field_b - eh.field_n) / 2;
                        return;
                      }
                    } else {
                      if (ef.field_d != var3) {
                        this.field_s.a((byte) 61, var2, var3);
                        if ((this.field_b ^ -1) >= -1) {
                          return;
                        } else {
                          k.field_a = (this.field_b - eh.field_n) / 2;
                          return;
                        }
                      } else {
                        if ((this.field_b ^ -1) >= -1) {
                          return;
                        } else {
                          k.field_a = (this.field_b - eh.field_n) / 2;
                          return;
                        }
                      }
                    }
                  } else {
                    L3: {
                      if (var2 != eh.field_n) {
                        this.field_s.a((byte) 61, var2, var3);
                        break L3;
                      } else {
                        if (ef.field_d == var3) {
                          break L3;
                        } else {
                          L4: {
                            this.field_s.a((byte) 61, var2, var3);
                            if ((this.field_b ^ -1) >= -1) {
                              break L4;
                            } else {
                              k.field_a = (this.field_b - eh.field_n) / 2;
                              break L4;
                            }
                          }
                          return;
                        }
                      }
                    }
                    if ((this.field_b ^ -1) >= -1) {
                      return;
                    } else {
                      k.field_a = (this.field_b - eh.field_n) / 2;
                      return;
                    }
                  }
                }
              }
            } else {
              break L2;
            }
          }
          if (param0 == 2) {
            if (var2 != eh.field_n) {
              this.field_s.a((byte) 61, var2, var3);
              if ((this.field_b ^ -1) >= -1) {
                return;
              } else {
                k.field_a = (this.field_b - eh.field_n) / 2;
                return;
              }
            } else {
              if (ef.field_d == var3) {
                if ((this.field_b ^ -1) >= -1) {
                  return;
                } else {
                  k.field_a = (this.field_b - eh.field_n) / 2;
                  return;
                }
              } else {
                this.field_s.a((byte) 61, var2, var3);
                if ((this.field_b ^ -1) >= -1) {
                  return;
                } else {
                  k.field_a = (this.field_b - eh.field_n) / 2;
                  return;
                }
              }
            }
          } else {
            field_j = (o) null;
            if (var2 != eh.field_n) {
              this.field_s.a((byte) 61, var2, var3);
              if ((this.field_b ^ -1) >= -1) {
                return;
              } else {
                k.field_a = (this.field_b - eh.field_n) / 2;
                return;
              }
            } else {
              if (ef.field_d == var3) {
                if ((this.field_b ^ -1) >= -1) {
                  return;
                } else {
                  k.field_a = (this.field_b - eh.field_n) / 2;
                  return;
                }
              } else {
                this.field_s.a((byte) 61, var2, var3);
                if ((this.field_b ^ -1) >= -1) {
                  return;
                } else {
                  k.field_a = (this.field_b - eh.field_n) / 2;
                  return;
                }
              }
            }
          }
        } else {
          this.field_a = false;
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 == 0) {
          if (this.field_i <= la.field_b) {
            if (u.field_d <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          this.a((byte) -125);
          if (this.field_i <= la.field_b) {
            if (u.field_d <= 0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void b(byte param0) {
        int fieldTemp$1 = 0;
        if (n.field_a != null) {
          return;
        } else {
          if (param0 == 44) {
            L0: {
              if (0 >= u.field_d) {
                this.field_a = false;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_a) {
              fieldTemp$1 = this.field_e - 1;
              this.field_e = this.field_e - 1;
              if (fieldTemp$1 <= 0) {
                this.field_e = this.field_c;
                if (this.field_i > la.field_b) {
                  this.field_a = false;
                  return;
                } else {
                  this.a((byte) 2);
                  return;
                }
              } else {
                return;
              }
            } else {
              if (eh.field_n >= this.field_b) {
                if (this.field_b <= 0) {
                  if (this.field_g == eh.field_n) {
                    if (ef.field_d == this.field_h) {
                      return;
                    } else {
                      this.field_s.a((byte) 61, this.field_g, this.field_h);
                      return;
                    }
                  } else {
                    this.field_s.a((byte) 61, this.field_g, this.field_h);
                    return;
                  }
                } else {
                  k.field_a = 0;
                  if (this.field_g == eh.field_n) {
                    if (ef.field_d == this.field_h) {
                      return;
                    } else {
                      this.field_s.a((byte) 61, this.field_g, this.field_h);
                      return;
                    }
                  } else {
                    this.field_s.a((byte) 61, this.field_g, this.field_h);
                    return;
                  }
                }
              } else {
                k.field_a = (this.field_b + -eh.field_n) / 2;
                if (this.field_g == eh.field_n) {
                  if (ef.field_d == this.field_h) {
                    return;
                  } else {
                    this.field_s.a((byte) 61, this.field_g, this.field_h);
                    return;
                  }
                } else {
                  this.field_s.a((byte) 61, this.field_g, this.field_h);
                  return;
                }
              }
            }
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 2) {
            field_j = (o) null;
            field_j = null;
            return;
        }
        field_j = null;
    }

    final static void a(int param0, int param1, of param2) {
        int var4 = 0;
        int discarded$0 = 0;
        ia var5 = d.field_b;
        var5.d((byte) 67, param1);
        if (param0 != 2) {
            return;
        }
        try {
            var5.field_g = var5.field_g + 1;
            var4 = var5.field_g;
            var5.a(1, -63);
            if (null != param2.field_i) {
                var5.a(param2.field_i.length, param0 + -96);
                var5.a(param2.field_i, param2.field_i.length, -20144, 0);
            } else {
                var5.a(0, -111);
            }
            discarded$0 = var5.b((byte) -121, var4);
            var5.field_g = var5.field_g - 4;
            param2.field_h = var5.f((byte) -109);
            var5.b(-var4 + var5.field_g, param0 ^ 31702);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "bb.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(boolean param0) {
        this.field_s.a((byte) 61, this.field_n, this.field_o);
        if (param0) {
            of var3 = (of) null;
            bb.a(-125, 125, (of) null);
        }
    }

    final void a(int param0, int param1, int param2) {
        this.field_b = param1;
        if (param0 <= 102) {
            this.field_f = -108;
            this.field_r = param2;
            return;
        }
        this.field_r = param2;
    }

    final qc a(int param0) {
        qc var2 = null;
        if (param0 == 2) {
          this.field_n = eh.field_n;
          this.field_o = ef.field_d;
          this.field_s.a((byte) 61, this.field_p, this.field_f);
          jj.field_E = false;
          var2 = re.a(0, nb.field_e, 0, true, this.field_p, this.field_f);
          if (var2 == null) {
            this.a(false);
            return var2;
          } else {
            return var2;
          }
        } else {
          return (qc) null;
        }
    }

    private bb() throws Throwable {
        throw new Error();
    }

    static {
        field_j = new o(12, 0, 1, 0);
    }
}
