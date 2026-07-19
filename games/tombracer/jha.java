/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jha extends vg {
    private String field_n;
    private int field_f;
    private int field_l;
    private int field_g;
    private int field_m;
    private int field_j;
    private int field_k;
    private int field_u;
    private String field_h;
    private int field_s;
    private int field_o;
    private int field_p;
    private String field_q;
    private int field_r;
    private int field_t;
    private int field_i;

    final void a(int param0, int param1, int param2) {
        this.field_p = param2;
        if (param1 != 4) {
            this.field_s = 34;
            this.field_u = param0;
            return;
        }
        this.field_u = param0;
    }

    final String b(int param0) {
        int discarded$0 = 0;
        if (param0 != 29161) {
            discarded$0 = this.a(true);
            return this.field_n;
        }
        return this.field_n;
    }

    final void b(byte param0) {
        int var3 = -52 % ((param0 - -59) / 45);
        int var2 = 255 - (this.field_o * 255 >> 1568147408);
        rba.a(var2 / 2, this.field_k, 1, this.field_g, (byte) 99, this.field_s, this.field_t);
        int var4 = fn.field_f[this.field_r];
        int discarded$0 = dh.a(kn.field_p, var2, 0, 16, 4 + this.field_t, this.field_k - 8, var4, this.field_s - -4, 1, 29870, 1, -8 + this.field_g, this.field_q);
    }

    final int a(boolean param0) {
        int discarded$0 = 0;
        if (!param0) {
            discarded$0 = this.a(true);
            return this.field_k;
        }
        return this.field_k;
    }

    final int a(byte param0) {
        if (param0 != -100) {
            this.field_o = 82;
            return this.field_j;
        }
        return this.field_j;
    }

    final void a(int param0) {
        int discarded$26 = 0;
        int discarded$27 = 0;
        int discarded$28 = 0;
        int discarded$29 = 0;
        int discarded$30 = 0;
        int discarded$31 = 0;
        int discarded$32 = 0;
        int discarded$33 = 0;
        int discarded$34 = 0;
        int discarded$35 = 0;
        int discarded$36 = 0;
        int discarded$37 = 0;
        int discarded$38 = 0;
        int discarded$39 = 0;
        int discarded$40 = 0;
        int discarded$41 = 0;
        int discarded$42 = 0;
        int discarded$43 = 0;
        int discarded$44 = 0;
        int discarded$45 = 0;
        int discarded$46 = 0;
        int discarded$47 = 0;
        int discarded$48 = 0;
        int discarded$49 = 0;
        int discarded$50 = 0;
        int discarded$51 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = TombRacer.field_G ? 1 : 0;
            this.field_m = this.field_m + 1;
            if (this.field_m < this.field_f) {
              break L1;
            } else {
              L2: {
                if (this.field_m <= this.field_l + -this.field_i) {
                  break L2;
                } else {
                  var3 = this.field_i;
                  var2 = -this.field_l + this.field_i + this.field_m;
                  if (var6 == 0) {
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              var2 = 0;
              var3 = 1;
              if (var6 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var2 = -this.field_m + this.field_f;
          var3 = this.field_f;
          break L0;
        }
        if (0 >= var2) {
          this.field_o = 0;
          if (var6 != 0) {
            L3: {
              this.field_o = var2 * 65536 / var3;
              this.field_o = (this.field_o >> -2140331064) * (this.field_o >> 1140461480);
              if ((this.field_m ^ -1) != -2) {
                break L3;
              } else {
                this.field_s = this.field_u;
                if (var6 != 0) {
                  break L3;
                } else {
                  this.field_t = this.field_p + (256 * this.field_o >> -1740220208);
                  if (null != this.field_q) {
                    if (param0 >= -36) {
                      discarded$26 = this.c((byte) 42);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (null == this.field_h) {
                      this.field_q = this.field_n;
                      var4 = this.field_g - 8;
                      var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                      this.field_k = 8 + var5;
                      if (param0 >= -36) {
                        discarded$27 = this.c((byte) 42);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_q = this.field_h + ": " + this.field_n;
                      if (var6 == 0) {
                        var4 = this.field_g - 8;
                        var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                        this.field_k = 8 + var5;
                        if (param0 >= -36) {
                          discarded$28 = this.c((byte) 42);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        this.field_q = this.field_n;
                        var4 = this.field_g - 8;
                        var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                        this.field_k = 8 + var5;
                        if (param0 >= -36) {
                          discarded$29 = this.c((byte) 42);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              }
            }
            L4: {
              if (this.field_s < this.field_u) {
                break L4;
              } else {
                if (this.field_s > this.field_u) {
                  this.field_s = this.field_s - 1;
                  if (var6 != 0) {
                    break L4;
                  } else {
                    this.field_t = this.field_p + (256 * this.field_o >> -1740220208);
                    if (null != this.field_q) {
                      if (param0 < -36) {
                        return;
                      } else {
                        discarded$30 = this.c((byte) 42);
                        return;
                      }
                    } else {
                      if (null == this.field_h) {
                        this.field_q = this.field_n;
                        var4 = this.field_g - 8;
                        var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                        this.field_k = 8 + var5;
                        if (param0 < -36) {
                          return;
                        } else {
                          discarded$31 = this.c((byte) 42);
                          return;
                        }
                      } else {
                        this.field_q = this.field_h + ": " + this.field_n;
                        if (var6 == 0) {
                          var4 = this.field_g - 8;
                          var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                          this.field_k = 8 + var5;
                          if (param0 < -36) {
                            return;
                          } else {
                            discarded$32 = this.c((byte) 42);
                            return;
                          }
                        } else {
                          this.field_q = this.field_n;
                          var4 = this.field_g - 8;
                          var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                          this.field_k = 8 + var5;
                          if (param0 < -36) {
                            return;
                          } else {
                            discarded$33 = this.c((byte) 42);
                            return;
                          }
                        }
                      }
                    }
                  }
                } else {
                  L5: {
                    this.field_t = this.field_p + (256 * this.field_o >> -1740220208);
                    if (null != this.field_q) {
                      break L5;
                    } else {
                      if (null == this.field_h) {
                        this.field_q = this.field_n;
                        var4 = this.field_g - 8;
                        var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                        this.field_k = 8 + var5;
                        break L5;
                      } else {
                        this.field_q = this.field_h + ": " + this.field_n;
                        if (var6 == 0) {
                          var4 = this.field_g - 8;
                          var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                          this.field_k = 8 + var5;
                          break L5;
                        } else {
                          this.field_q = this.field_n;
                          var4 = this.field_g - 8;
                          var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                          this.field_k = 8 + var5;
                          break L5;
                        }
                      }
                    }
                  }
                  L6: {
                    if (param0 < -36) {
                      break L6;
                    } else {
                      discarded$34 = this.c((byte) 42);
                      break L6;
                    }
                  }
                  return;
                }
              }
            }
            L7: {
              this.field_s = this.field_s + 1;
              this.field_t = this.field_p + (256 * this.field_o >> -1740220208);
              if (null != this.field_q) {
                break L7;
              } else {
                if (null == this.field_h) {
                  this.field_q = this.field_n;
                  L8: {
                    var4 = this.field_g - 8;
                    var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                    this.field_k = 8 + var5;
                    if (param0 < -36) {
                      break L8;
                    } else {
                      discarded$35 = this.c((byte) 42);
                      break L8;
                    }
                  }
                  return;
                } else {
                  this.field_q = this.field_h + ": " + this.field_n;
                  if (var6 == 0) {
                    var4 = this.field_g - 8;
                    var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                    this.field_k = 8 + var5;
                    break L7;
                  } else {
                    this.field_q = this.field_n;
                    L9: {
                      var4 = this.field_g - 8;
                      var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                      this.field_k = 8 + var5;
                      if (param0 < -36) {
                        break L9;
                      } else {
                        discarded$36 = this.c((byte) 42);
                        break L9;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (param0 < -36) {
              return;
            } else {
              discarded$37 = this.c((byte) 42);
              return;
            }
          } else {
            L10: {
              L11: {
                if ((this.field_m ^ -1) != -2) {
                  break L11;
                } else {
                  this.field_s = this.field_u;
                  if (var6 == 0) {
                    break L10;
                  } else {
                    break L11;
                  }
                }
              }
              if (this.field_s >= this.field_u) {
                if (this.field_s > this.field_u) {
                  this.field_s = this.field_s - 1;
                  if (var6 == 0) {
                    break L10;
                  } else {
                    L12: {
                      this.field_s = this.field_s + 1;
                      this.field_t = this.field_p + (256 * this.field_o >> -1740220208);
                      if (null != this.field_q) {
                        break L12;
                      } else {
                        if (null == this.field_h) {
                          this.field_q = this.field_n;
                          var4 = this.field_g - 8;
                          var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                          this.field_k = 8 + var5;
                          break L12;
                        } else {
                          this.field_q = this.field_h + ": " + this.field_n;
                          this.field_q = this.field_n;
                          var4 = this.field_g - 8;
                          var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                          this.field_k = 8 + var5;
                          break L12;
                        }
                      }
                    }
                    L13: {
                      if (param0 < -36) {
                        break L13;
                      } else {
                        discarded$38 = this.c((byte) 42);
                        break L13;
                      }
                    }
                    return;
                  }
                } else {
                  L14: {
                    this.field_t = this.field_p + (256 * this.field_o >> -1740220208);
                    if (null != this.field_q) {
                      break L14;
                    } else {
                      if (null == this.field_h) {
                        this.field_q = this.field_n;
                        var4 = this.field_g - 8;
                        var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                        this.field_k = 8 + var5;
                        break L14;
                      } else {
                        this.field_q = this.field_h + ": " + this.field_n;
                        if (var6 == 0) {
                          var4 = this.field_g - 8;
                          var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                          this.field_k = 8 + var5;
                          break L14;
                        } else {
                          this.field_q = this.field_n;
                          var4 = this.field_g - 8;
                          var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                          this.field_k = 8 + var5;
                          break L14;
                        }
                      }
                    }
                  }
                  L15: {
                    if (param0 < -36) {
                      break L15;
                    } else {
                      discarded$39 = this.c((byte) 42);
                      break L15;
                    }
                  }
                  return;
                }
              } else {
                L16: {
                  this.field_s = this.field_s + 1;
                  this.field_t = this.field_p + (256 * this.field_o >> -1740220208);
                  if (null != this.field_q) {
                    break L16;
                  } else {
                    if (null == this.field_h) {
                      this.field_q = this.field_n;
                      var4 = this.field_g - 8;
                      var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                      this.field_k = 8 + var5;
                      break L16;
                    } else {
                      this.field_q = this.field_h + ": " + this.field_n;
                      if (var6 == 0) {
                        var4 = this.field_g - 8;
                        var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                        this.field_k = 8 + var5;
                        break L16;
                      } else {
                        this.field_q = this.field_n;
                        var4 = this.field_g - 8;
                        var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                        this.field_k = 8 + var5;
                        break L16;
                      }
                    }
                  }
                }
                L17: {
                  if (param0 < -36) {
                    break L17;
                  } else {
                    discarded$40 = this.c((byte) 42);
                    break L17;
                  }
                }
                return;
              }
            }
            this.field_t = this.field_p + (256 * this.field_o >> -1740220208);
            if (null != this.field_q) {
              if (param0 >= -36) {
                discarded$41 = this.c((byte) 42);
                return;
              } else {
                return;
              }
            } else {
              if (null == this.field_h) {
                this.field_q = this.field_n;
                L18: {
                  var4 = this.field_g - 8;
                  var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                  this.field_k = 8 + var5;
                  if (param0 < -36) {
                    break L18;
                  } else {
                    discarded$42 = this.c((byte) 42);
                    break L18;
                  }
                }
                return;
              } else {
                this.field_q = this.field_h + ": " + this.field_n;
                if (var6 == 0) {
                  L19: {
                    var4 = this.field_g - 8;
                    var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                    this.field_k = 8 + var5;
                    if (param0 < -36) {
                      break L19;
                    } else {
                      discarded$43 = this.c((byte) 42);
                      break L19;
                    }
                  }
                  return;
                } else {
                  this.field_q = this.field_n;
                  L20: {
                    var4 = this.field_g - 8;
                    var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                    this.field_k = 8 + var5;
                    if (param0 < -36) {
                      break L20;
                    } else {
                      discarded$44 = this.c((byte) 42);
                      break L20;
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          L21: {
            L22: {
              this.field_o = var2 * 65536 / var3;
              this.field_o = (this.field_o >> -2140331064) * (this.field_o >> 1140461480);
              if ((this.field_m ^ -1) != -2) {
                break L22;
              } else {
                this.field_s = this.field_u;
                if (var6 == 0) {
                  break L21;
                } else {
                  break L22;
                }
              }
            }
            if (this.field_s >= this.field_u) {
              if (this.field_s > this.field_u) {
                this.field_s = this.field_s - 1;
                if (var6 == 0) {
                  break L21;
                } else {
                  L23: {
                    this.field_s = this.field_s + 1;
                    this.field_t = this.field_p + (256 * this.field_o >> -1740220208);
                    if (null != this.field_q) {
                      break L23;
                    } else {
                      if (null == this.field_h) {
                        this.field_q = this.field_n;
                        var4 = this.field_g - 8;
                        var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                        this.field_k = 8 + var5;
                        break L23;
                      } else {
                        this.field_q = this.field_h + ": " + this.field_n;
                        this.field_q = this.field_n;
                        var4 = this.field_g - 8;
                        var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                        this.field_k = 8 + var5;
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (param0 < -36) {
                      break L24;
                    } else {
                      discarded$45 = this.c((byte) 42);
                      break L24;
                    }
                  }
                  return;
                }
              } else {
                L25: {
                  this.field_t = this.field_p + (256 * this.field_o >> -1740220208);
                  if (null != this.field_q) {
                    break L25;
                  } else {
                    if (null == this.field_h) {
                      this.field_q = this.field_n;
                      var4 = this.field_g - 8;
                      var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                      this.field_k = 8 + var5;
                      break L25;
                    } else {
                      this.field_q = this.field_h + ": " + this.field_n;
                      if (var6 == 0) {
                        var4 = this.field_g - 8;
                        var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                        this.field_k = 8 + var5;
                        break L25;
                      } else {
                        this.field_q = this.field_n;
                        var4 = this.field_g - 8;
                        var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                        this.field_k = 8 + var5;
                        break L25;
                      }
                    }
                  }
                }
                L26: {
                  if (param0 < -36) {
                    break L26;
                  } else {
                    discarded$46 = this.c((byte) 42);
                    break L26;
                  }
                }
                return;
              }
            } else {
              L27: {
                this.field_s = this.field_s + 1;
                this.field_t = this.field_p + (256 * this.field_o >> -1740220208);
                if (null != this.field_q) {
                  break L27;
                } else {
                  if (null == this.field_h) {
                    this.field_q = this.field_n;
                    var4 = this.field_g - 8;
                    var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                    this.field_k = 8 + var5;
                    break L27;
                  } else {
                    this.field_q = this.field_h + ": " + this.field_n;
                    if (var6 == 0) {
                      var4 = this.field_g - 8;
                      var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                      this.field_k = 8 + var5;
                      break L27;
                    } else {
                      this.field_q = this.field_n;
                      var4 = this.field_g - 8;
                      var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                      this.field_k = 8 + var5;
                      break L27;
                    }
                  }
                }
              }
              L28: {
                if (param0 < -36) {
                  break L28;
                } else {
                  discarded$47 = this.c((byte) 42);
                  break L28;
                }
              }
              return;
            }
          }
          this.field_t = this.field_p + (256 * this.field_o >> -1740220208);
          if (null != this.field_q) {
            if (param0 >= -36) {
              discarded$48 = this.c((byte) 42);
              return;
            } else {
              return;
            }
          } else {
            if (null == this.field_h) {
              this.field_q = this.field_n;
              L29: {
                var4 = this.field_g - 8;
                var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                this.field_k = 8 + var5;
                if (param0 < -36) {
                  break L29;
                } else {
                  discarded$49 = this.c((byte) 42);
                  break L29;
                }
              }
              return;
            } else {
              this.field_q = this.field_h + ": " + this.field_n;
              if (var6 == 0) {
                L30: {
                  var4 = this.field_g - 8;
                  var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                  this.field_k = 8 + var5;
                  if (param0 < -36) {
                    break L30;
                  } else {
                    discarded$50 = this.c((byte) 42);
                    break L30;
                  }
                }
                return;
              } else {
                this.field_q = this.field_n;
                L31: {
                  var4 = this.field_g - 8;
                  var5 = kv.field_a.a(this.field_q, var4, (nh[]) null, 51, 16);
                  this.field_k = 8 + var5;
                  if (param0 < -36) {
                    break L31;
                  } else {
                    discarded$51 = this.c((byte) 42);
                    break L31;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final int c(byte param0) {
        boolean discarded$0 = false;
        if (param0 != -96) {
            discarded$0 = this.c(-105);
            return this.field_g;
        }
        return this.field_g;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        this.field_i = param1;
        this.field_l = param1 + param3 + param2;
        this.field_f = param2;
        this.field_m = 0;
        if (param0) {
            this.field_m = -96;
        }
    }

    final void d(byte param0) {
        this.field_j = this.field_j - 1;
        if (param0 <= 2) {
            this.field_s = -20;
        }
    }

    final boolean e(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -39) {
          L0: {
            this.d((byte) 38);
            if (this.field_l > this.field_m) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (this.field_l > this.field_m) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 1) {
            this.a(-94);
            this.field_g = param1;
            return;
        }
        this.field_g = param1;
    }

    final void a(boolean param0, int param1) {
        this.field_j = param1;
        if (param0) {
            this.field_i = -2;
        }
    }

    final boolean c(int param0) {
        String discarded$7 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -1) {
          if (this.field_o != 0) {
            if (this.field_m < -this.field_i + this.field_l) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          discarded$7 = this.b(-122);
          if (this.field_o == 0) {
            return true;
          } else {
            L0: {
              if (this.field_m >= -this.field_i + this.field_l) {
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
          }
        }
    }

    jha(int param0, String param1, String param2) {
        try {
            this.field_h = param1;
            this.field_r = param0;
            this.field_n = param2;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "jha.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
