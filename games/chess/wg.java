/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends pk {
    private int field_s;
    private int field_u;
    private rk field_n;
    private boolean field_z;
    private km field_o;
    private km field_t;
    private rk field_m;
    private boolean field_v;
    static hg field_r;
    int field_y;
    static String field_p;
    static um field_q;
    int field_x;
    static int field_w;
    private rk field_A;
    static int field_B;

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var2 = this.field_i;
          var3 = 0;
          if (null == this.field_n) {
            break L0;
          } else {
            var3 = var3 + this.field_n.field_j;
            break L0;
          }
        }
        L1: {
          if (null == this.field_m) {
            break L1;
          } else {
            var3 = var3 + this.field_m.field_j;
            break L1;
          }
        }
        L2: {
          if (null != this.field_n) {
            this.field_n.a(var2, this.field_k);
            var2 = var2 + this.field_n.field_k;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          this.field_A.c(var2, this.field_k, this.field_u - var3, this.field_A.field_i);
          var4 = 126 % ((param0 - -4) / 63);
          var2 = var2 + (-var3 + this.field_u);
          if (this.field_m != null) {
            this.field_m.a(var2, this.field_k);
            break L3;
          } else {
            break L3;
          }
        }
        var5 = (this.field_x - this.field_s) * this.field_u / (this.field_y + -this.field_s);
        if (this.field_v) {
          if (null == this.field_t) {
            this.field_o.a(var5 + this.field_i + -(this.field_o.field_w / 8), this.field_k + -(this.field_o.field_t / 8));
            return;
          } else {
            this.field_t.b(this.field_i - -var5 - this.field_t.field_w / 2, this.field_k + -(this.field_t.field_t / 2));
            return;
          }
        } else {
          this.field_o.a(var5 + this.field_i + -(this.field_o.field_w / 8), this.field_k + -(this.field_o.field_t / 8));
          return;
        }
    }

    final static void a(String param0, byte param1, long param2) {
        CharSequence var5 = null;
        try {
            ij.field_c = param0;
            vk.field_g = 2;
            var5 = (CharSequence) ((Object) param0);
            ec.field_f = ad.a(var5, -2);
            re.field_p = param2;
            if (param1 > -74) {
                wg.b(88);
            }
            kn.field_L = true;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "wg.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        L0: {
          var2 = 0;
          var3 = this.field_i;
          var4 = 0;
          if (this.field_n == null) {
            break L0;
          } else {
            var4 = var4 + this.field_n.field_j;
            break L0;
          }
        }
        L1: {
          if (null != this.field_m) {
            var4 = var4 + this.field_m.field_j;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (null != this.field_n) {
            var2 = var2 != 0 | this.field_n.b(var3, this.field_k, hn.field_k, rf.field_b) ? 1 : 0;
            var3 = var3 + this.field_n.field_k;
            break L2;
          } else {
            break L2;
          }
        }
        stackOut_8_0 = var2;
        stackIn_16_0 = stackOut_8_0;
        stackIn_9_0 = stackOut_8_0;
        if (hn.field_k < var3) {
          stackOut_16_0 = stackIn_16_0;
          stackIn_24_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (rf.field_b < this.field_k) {
            L3: {
              stackOut_24_0 = stackIn_24_0;
              stackIn_33_0 = stackOut_24_0;
              stackIn_25_0 = stackOut_24_0;
              if (hn.field_k <= this.field_u - var4) {
                stackOut_33_0 = stackIn_33_0;
                stackOut_33_1 = 1;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                break L3;
              } else {
                stackOut_25_0 = stackIn_25_0;
                stackIn_34_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (rf.field_b > this.field_A.field_i) {
                  stackOut_34_0 = stackIn_34_0;
                  stackOut_34_1 = 0;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  break L3;
                } else {
                  L4: {
                    var2 = stackIn_26_0 | 1;
                    var3 = var3 + (this.field_u + -var4);
                    if (this.field_m != null) {
                      var2 = var2 != 0 | this.field_m.b(var3, this.field_k, hn.field_k, rf.field_b) ? 1 : 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (param0 != -9) {
                    return true;
                  } else {
                    return var2 != 0;
                  }
                }
              }
            }
            L5: {
              var2 = stackIn_35_0 | stackIn_35_1;
              var3 = var3 + (this.field_u + -var4);
              if (this.field_m != null) {
                var2 = var2 != 0 | this.field_m.b(var3, this.field_k, hn.field_k, rf.field_b) ? 1 : 0;
                break L5;
              } else {
                break L5;
              }
            }
            if (param0 != -9) {
              return true;
            } else {
              return var2 != 0;
            }
          } else {
            L6: {
              var2 = stackIn_17_0 | 1;
              var3 = var3 + (this.field_u + -var4);
              if (this.field_m != null) {
                var2 = var2 != 0 | this.field_m.b(var3, this.field_k, hn.field_k, rf.field_b) ? 1 : 0;
                break L6;
              } else {
                break L6;
              }
            }
            if (param0 != -9) {
              return true;
            } else {
              return var2 != 0;
            }
          }
        } else {
          L7: {
            var2 = stackIn_9_0 | 1;
            var3 = var3 + (this.field_u + -var4);
            if (this.field_m != null) {
              var2 = var2 != 0 | this.field_m.b(var3, this.field_k, hn.field_k, rf.field_b) ? 1 : 0;
              break L7;
            } else {
              break L7;
            }
          }
          if (param0 != -9) {
            return true;
          } else {
            return var2 != 0;
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Chess.field_G;
        if (this.field_v) {
          L0: {
            if (null != this.field_t) {
              var2 = this.field_t.field_t;
              break L0;
            } else {
              var2 = this.field_o.field_t / 4;
              break L0;
            }
          }
          if (th.field_d == 0) {
            if (wh.field_f == 0) {
              L1: {
                this.field_d = false;
                this.field_z = false;
                if (this.field_s > this.field_x) {
                  this.field_x = this.field_s;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (this.field_y >= this.field_x) {
                var3 = 77 / ((-32 - param0) / 63);
                return;
              } else {
                this.field_x = this.field_y;
                var3 = 77 / ((-32 - param0) / 63);
                return;
              }
            } else {
              L2: {
                if (this.field_z) {
                  break L2;
                } else {
                  if (this.field_k - var2 / 2 > rf.field_b) {
                    L3: {
                      this.field_d = false;
                      if (this.field_s > this.field_x) {
                        this.field_x = this.field_s;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (this.field_y < this.field_x) {
                      this.field_x = this.field_y;
                      var3 = 77 / ((-32 - param0) / 63);
                      return;
                    } else {
                      var3 = 77 / ((-32 - param0) / 63);
                      return;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              if (this.field_z) {
                var3 = -this.field_i + hn.field_k;
                if (this.field_z) {
                  L4: {
                    var3 = var3 + (this.field_u / (-this.field_s + this.field_y) >> 1303210433);
                    this.field_x = this.field_s - -((this.field_y + -this.field_s) * var3 / this.field_u);
                    this.field_z = true;
                    this.field_d = true;
                    if (this.field_s > this.field_x) {
                      this.field_x = this.field_s;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (this.field_y < this.field_x) {
                    this.field_x = this.field_y;
                    var3 = 77 / ((-32 - param0) / 63);
                    return;
                  } else {
                    var3 = 77 / ((-32 - param0) / 63);
                    return;
                  }
                } else {
                  if (-1 >= (var3 ^ -1)) {
                    if (this.field_u >= var3) {
                      L5: {
                        var3 = var3 + (this.field_u / (-this.field_s + this.field_y) >> 1303210433);
                        this.field_x = this.field_s - -((this.field_y + -this.field_s) * var3 / this.field_u);
                        this.field_z = true;
                        this.field_d = true;
                        if (this.field_s > this.field_x) {
                          this.field_x = this.field_s;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (this.field_y < this.field_x) {
                        this.field_x = this.field_y;
                        var3 = 77 / ((-32 - param0) / 63);
                        return;
                      } else {
                        var3 = 77 / ((-32 - param0) / 63);
                        return;
                      }
                    } else {
                      this.field_d = false;
                      return;
                    }
                  } else {
                    this.field_d = false;
                    return;
                  }
                }
              } else {
                if (-(var2 / 2) + this.field_k + var2 < rf.field_b) {
                  L6: {
                    this.field_d = false;
                    if (this.field_s > this.field_x) {
                      this.field_x = this.field_s;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (this.field_y < this.field_x) {
                    this.field_x = this.field_y;
                    var3 = 77 / ((-32 - param0) / 63);
                    return;
                  } else {
                    var3 = 77 / ((-32 - param0) / 63);
                    return;
                  }
                } else {
                  var3 = -this.field_i + hn.field_k;
                  if (!this.field_z) {
                    if (-1 >= (var3 ^ -1)) {
                      if (this.field_u < var3) {
                        this.field_d = false;
                        return;
                      } else {
                        L7: {
                          var3 = var3 + (this.field_u / (-this.field_s + this.field_y) >> 1303210433);
                          this.field_x = this.field_s - -((this.field_y + -this.field_s) * var3 / this.field_u);
                          this.field_z = true;
                          this.field_d = true;
                          if (this.field_s > this.field_x) {
                            this.field_x = this.field_s;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (this.field_y >= this.field_x) {
                            break L8;
                          } else {
                            this.field_x = this.field_y;
                            break L8;
                          }
                        }
                        var3 = 77 / ((-32 - param0) / 63);
                        return;
                      }
                    } else {
                      this.field_d = false;
                      return;
                    }
                  } else {
                    L9: {
                      var3 = var3 + (this.field_u / (-this.field_s + this.field_y) >> 1303210433);
                      this.field_x = this.field_s - -((this.field_y + -this.field_s) * var3 / this.field_u);
                      this.field_z = true;
                      this.field_d = true;
                      if (this.field_s > this.field_x) {
                        this.field_x = this.field_s;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (this.field_y >= this.field_x) {
                        break L10;
                      } else {
                        this.field_x = this.field_y;
                        break L10;
                      }
                    }
                    var3 = 77 / ((-32 - param0) / 63);
                    return;
                  }
                }
              }
            }
          } else {
            L11: {
              if (this.field_z) {
                break L11;
              } else {
                if (this.field_k - var2 / 2 <= rf.field_b) {
                  break L11;
                } else {
                  L12: {
                    this.field_d = false;
                    if (this.field_s > this.field_x) {
                      this.field_x = this.field_s;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (this.field_y >= this.field_x) {
                      break L13;
                    } else {
                      this.field_x = this.field_y;
                      break L13;
                    }
                  }
                  var3 = 77 / ((-32 - param0) / 63);
                  return;
                }
              }
            }
            L14: {
              if (this.field_z) {
                break L14;
              } else {
                if (-(var2 / 2) + this.field_k + var2 >= rf.field_b) {
                  break L14;
                } else {
                  L15: {
                    this.field_d = false;
                    if (this.field_s > this.field_x) {
                      this.field_x = this.field_s;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (this.field_y >= this.field_x) {
                      break L16;
                    } else {
                      this.field_x = this.field_y;
                      break L16;
                    }
                  }
                  var3 = 77 / ((-32 - param0) / 63);
                  return;
                }
              }
            }
            var3 = -this.field_i + hn.field_k;
            if (!this.field_z) {
              if (-1 >= (var3 ^ -1)) {
                if (this.field_u < var3) {
                  this.field_d = false;
                  return;
                } else {
                  L17: {
                    var3 = var3 + (this.field_u / (-this.field_s + this.field_y) >> 1303210433);
                    this.field_x = this.field_s - -((this.field_y + -this.field_s) * var3 / this.field_u);
                    this.field_z = true;
                    this.field_d = true;
                    if (this.field_s > this.field_x) {
                      this.field_x = this.field_s;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (this.field_y >= this.field_x) {
                      break L18;
                    } else {
                      this.field_x = this.field_y;
                      break L18;
                    }
                  }
                  var3 = 77 / ((-32 - param0) / 63);
                  return;
                }
              } else {
                this.field_d = false;
                return;
              }
            } else {
              L19: {
                var3 = var3 + (this.field_u / (-this.field_s + this.field_y) >> 1303210433);
                this.field_x = this.field_s - -((this.field_y + -this.field_s) * var3 / this.field_u);
                this.field_z = true;
                this.field_d = true;
                if (this.field_s > this.field_x) {
                  this.field_x = this.field_s;
                  break L19;
                } else {
                  break L19;
                }
              }
              L20: {
                if (this.field_y >= this.field_x) {
                  break L20;
                } else {
                  this.field_x = this.field_y;
                  break L20;
                }
              }
              var3 = 77 / ((-32 - param0) / 63);
              return;
            }
          }
        } else {
          L21: {
            var2 = this.field_o.field_t / 4;
            if (th.field_d != 0) {
              break L21;
            } else {
              if (wh.field_f != 0) {
                break L21;
              } else {
                L22: {
                  this.field_d = false;
                  this.field_z = false;
                  if (this.field_s > this.field_x) {
                    this.field_x = this.field_s;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (this.field_y >= this.field_x) {
                    break L23;
                  } else {
                    this.field_x = this.field_y;
                    break L23;
                  }
                }
                var3 = 77 / ((-32 - param0) / 63);
                return;
              }
            }
          }
          L24: {
            if (this.field_z) {
              break L24;
            } else {
              if (this.field_k - var2 / 2 <= rf.field_b) {
                break L24;
              } else {
                L25: {
                  this.field_d = false;
                  if (this.field_s > this.field_x) {
                    this.field_x = this.field_s;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (this.field_y >= this.field_x) {
                    break L26;
                  } else {
                    this.field_x = this.field_y;
                    break L26;
                  }
                }
                var3 = 77 / ((-32 - param0) / 63);
                return;
              }
            }
          }
          L27: {
            if (this.field_z) {
              break L27;
            } else {
              if (-(var2 / 2) + this.field_k + var2 >= rf.field_b) {
                break L27;
              } else {
                L28: {
                  this.field_d = false;
                  if (this.field_s > this.field_x) {
                    this.field_x = this.field_s;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (this.field_y >= this.field_x) {
                    break L29;
                  } else {
                    this.field_x = this.field_y;
                    break L29;
                  }
                }
                var3 = 77 / ((-32 - param0) / 63);
                return;
              }
            }
          }
          var3 = -this.field_i + hn.field_k;
          if (!this.field_z) {
            if (-1 >= (var3 ^ -1)) {
              if (this.field_u >= var3) {
                L30: {
                  var3 = var3 + (this.field_u / (-this.field_s + this.field_y) >> 1303210433);
                  this.field_x = this.field_s - -((this.field_y + -this.field_s) * var3 / this.field_u);
                  this.field_z = true;
                  this.field_d = true;
                  if (this.field_s > this.field_x) {
                    this.field_x = this.field_s;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (this.field_y >= this.field_x) {
                    break L31;
                  } else {
                    this.field_x = this.field_y;
                    break L31;
                  }
                }
                var3 = 77 / ((-32 - param0) / 63);
                return;
              } else {
                this.field_d = false;
                return;
              }
            } else {
              this.field_d = false;
              return;
            }
          } else {
            L32: {
              var3 = var3 + (this.field_u / (-this.field_s + this.field_y) >> 1303210433);
              this.field_x = this.field_s - -((this.field_y + -this.field_s) * var3 / this.field_u);
              this.field_z = true;
              this.field_d = true;
              if (this.field_s > this.field_x) {
                this.field_x = this.field_s;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              if (this.field_y >= this.field_x) {
                break L33;
              } else {
                this.field_x = this.field_y;
                break L33;
              }
            }
            var3 = 77 / ((-32 - param0) / 63);
            return;
          }
        }
    }

    public static void b(int param0) {
        field_p = null;
        field_r = null;
        field_q = null;
        if (param0 <= 60) {
            field_w = 21;
        }
    }

    wg(int param0, int param1, int param2, rk param3, rk param4, rk param5, km param6, km param7) {
        this.field_s = 0;
        this.field_v = false;
        this.field_z = false;
        this.field_y = 100;
        this.field_x = 50;
        try {
            this.field_o = param6;
            this.field_i = param1;
            this.field_t = param7;
            this.field_A = param4;
            this.field_m = param5;
            this.field_k = param0;
            this.field_n = param3;
            this.field_u = param2;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "wg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = new hg(8, 0, 4, 1);
        field_B = -1;
    }
}
