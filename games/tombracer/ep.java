/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep extends c implements fo, ffa, t {
    private int field_j;
    private boolean field_p;
    private int field_u;
    private int field_w;
    private boolean field_l;
    private int field_s;
    private boolean field_F;
    private boolean field_C;
    private int field_x;
    private int field_J;
    private int field_y;
    private int field_E;
    private int field_i;
    static ss field_k;
    private la field_z;
    private int field_H;
    private int field_K;
    private up field_t;
    private boolean field_B;
    private int field_G;
    static nh field_n;
    static jea field_r;
    private int field_v;
    private int field_o;
    private int field_I;
    private on field_q;
    private int field_D;
    int field_m;

    final int g(int param0) {
        if (param0 != -1) {
            return 72;
        }
        return this.field_x;
    }

    final void a(int param0, int param1) {
        int var3 = -21 % ((20 - param1) / 42);
        this.field_i = param0;
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            this.field_z = (la) null;
            return this.field_G;
        }
        return this.field_G;
    }

    public final int a(byte param0) {
        if (param0 != 55) {
            uw var3 = (uw) null;
            this.a((uw) null, -69);
            return this.field_o;
        }
        return this.field_o;
    }

    final int k(int param0) {
        int var2 = -72 / ((param0 - -24) / 39);
        return this.field_s;
    }

    public final boolean j(byte param0) {
        if (param0 >= -102) {
            field_n = (nh) null;
            return true;
        }
        return true;
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 <= 17) {
          this.a(65, (byte) -64, 122, false);
          this.field_u = param0;
          this.field_K = param1;
          return;
        } else {
          this.field_u = param0;
          this.field_K = param1;
          return;
        }
    }

    final void a(la param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_u = param0.a(this.field_u, (byte) 71);
              this.field_s = -this.field_s;
              this.field_H = dfa.a(-this.field_H, 8192, 105);
              if (param1 < -16) {
                break L1;
              } else {
                this.field_I = 44;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ep.MA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        boolean discarded$0 = false;
        this.field_K = param2;
        this.field_G = param3;
        this.field_u = param0;
        if (param1 != -78) {
            discarded$0 = this.a(53);
        }
    }

    final boolean h(int param0) {
        if (param0 != 18407) {
            this.a(false, true);
            return this.field_F;
        }
        return this.field_F;
    }

    private final void b(boolean param0, boolean param1) {
        if (param0) {
          this.field_z.a(this.field_K, this.field_u, this.field_m, this.field_G, (byte) 6);
          if (this.field_B) {
            if (-1 == (this.field_s ^ -1)) {
              if (this.field_y == 0) {
                L0: {
                  this.h((byte) 32);
                  if (!param1) {
                    this.field_I = this.field_I - 1;
                    if (this.field_I > 0) {
                      break L0;
                    } else {
                      this.a(true, 0);
                      if (!this.field_C) {
                        return;
                      } else {
                        this.field_t.field_g = null;
                        return;
                      }
                    }
                  } else {
                    this.a(true, 0);
                    if (!TombRacer.field_G) {
                      break L0;
                    } else {
                      this.field_I = this.field_I - 1;
                      if (this.field_I > 0) {
                        if (!this.field_C) {
                          return;
                        } else {
                          this.field_t.field_g = null;
                          return;
                        }
                      } else {
                        this.a(true, 0);
                        if (this.field_C) {
                          this.field_t.field_g = null;
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                if (!this.field_C) {
                  return;
                } else {
                  this.field_t.field_g = null;
                  return;
                }
              } else {
                this.field_s = 0;
                this.field_B = false;
                this.field_J = this.field_J * 2;
                this.field_y = 0;
                this.field_C = false;
                return;
              }
            } else {
              this.field_s = 0;
              this.field_B = false;
              this.field_J = this.field_J * 2;
              this.field_y = 0;
              this.field_C = false;
              return;
            }
          } else {
            L1: {
              this.h((byte) 32);
              if (!param1) {
                this.field_I = this.field_I - 1;
                if (this.field_I > 0) {
                  break L1;
                } else {
                  this.a(true, 0);
                  if (this.field_C) {
                    this.field_t.field_g = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                this.a(true, 0);
                if (!TombRacer.field_G) {
                  break L1;
                } else {
                  this.field_I = this.field_I - 1;
                  if (this.field_I > 0) {
                    if (this.field_C) {
                      this.field_t.field_g = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.a(true, 0);
                    if (this.field_C) {
                      this.field_t.field_g = null;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            if (this.field_C) {
              this.field_t.field_g = null;
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_o = -115;
          this.field_z.a(this.field_K, this.field_u, this.field_m, this.field_G, (byte) 6);
          if (this.field_B) {
            if (-1 == (this.field_s ^ -1)) {
              if (this.field_y == 0) {
                L2: {
                  L3: {
                    this.h((byte) 32);
                    if (!param1) {
                      break L3;
                    } else {
                      this.a(true, 0);
                      if (!TombRacer.field_G) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  this.field_I = this.field_I - 1;
                  if (this.field_I > 0) {
                    break L2;
                  } else {
                    this.a(true, 0);
                    break L2;
                  }
                }
                if (this.field_C) {
                  this.field_t.field_g = null;
                  return;
                } else {
                  return;
                }
              } else {
                this.field_s = 0;
                this.field_B = false;
                this.field_J = this.field_J * 2;
                this.field_y = 0;
                this.field_C = false;
                return;
              }
            } else {
              this.field_s = 0;
              this.field_B = false;
              this.field_J = this.field_J * 2;
              this.field_y = 0;
              this.field_C = false;
              return;
            }
          } else {
            L4: {
              L5: {
                this.h((byte) 32);
                if (!param1) {
                  break L5;
                } else {
                  this.a(true, 0);
                  if (!TombRacer.field_G) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              this.field_I = this.field_I - 1;
              if (this.field_I > 0) {
                break L4;
              } else {
                this.a(true, 0);
                break L4;
              }
            }
            L6: {
              if (!this.field_C) {
                break L6;
              } else {
                this.field_t.field_g = null;
                break L6;
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, boolean param3) {
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int discarded$18 = 0;
        int discarded$19 = 0;
        int discarded$20 = 0;
        int discarded$21 = 0;
        int discarded$22 = 0;
        int discarded$23 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        up var10 = null;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var5 = 0;
          if (param3) {
            L1: {
              var6 = 0;
              var7 = this.field_u;
              if (0 <= param0) {
                break L1;
              } else {
                var6 = 1;
                this.field_u = this.field_u + param0;
                if (var9 != 0) {
                  break L1;
                } else {
                  L2: {
                    var8 = this.field_K;
                    if (var6 == 0) {
                      break L2;
                    } else {
                      if (!this.c(0, param0, 98)) {
                        break L2;
                      } else {
                        var5 = 1;
                        this.b(true, false);
                        this.field_s = -this.field_s;
                        this.field_u = var7;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    L4: {
                      var6 = 0;
                      if (-1 < (param2 ^ -1)) {
                        break L4;
                      } else {
                        if (0 < param2) {
                          this.field_K = this.field_K + param2;
                          var6 = 1;
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        } else {
                          L5: {
                            if (var6 == 0) {
                              break L5;
                            } else {
                              if (this.c(param2, 0, 111)) {
                                var5 = 1;
                                this.b(true, false);
                                this.field_y = -this.field_y;
                                this.field_K = var8;
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (param1 < -51) {
                              break L6;
                            } else {
                              var10 = (up) null;
                              this.a(81, (up) null);
                              break L6;
                            }
                          }
                          if (var5 == 0) {
                            L7: {
                              if (param3) {
                                break L7;
                              } else {
                                if (this.field_t.field_j != 0) {
                                  break L7;
                                } else {
                                  return;
                                }
                              }
                            }
                            L8: {
                              if (this.field_t.field_j != 3) {
                                break L8;
                              } else {
                                discarded$12 = this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                                break L8;
                              }
                            }
                            var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                            if (var6 > 0) {
                              this.b(true, true);
                              return;
                            } else {
                              return;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    var6 = 1;
                    this.field_K = this.field_K + param2;
                    break L3;
                  }
                  L9: {
                    if (var6 == 0) {
                      break L9;
                    } else {
                      if (this.c(param2, 0, 111)) {
                        var5 = 1;
                        this.b(true, false);
                        this.field_y = -this.field_y;
                        this.field_K = var8;
                        break L9;
                      } else {
                        L10: {
                          if (param1 < -51) {
                            break L10;
                          } else {
                            var10 = (up) null;
                            this.a(81, (up) null);
                            break L10;
                          }
                        }
                        if (var5 == 0) {
                          L11: {
                            if (param3) {
                              break L11;
                            } else {
                              if (this.field_t.field_j != 0) {
                                break L11;
                              } else {
                                return;
                              }
                            }
                          }
                          L12: {
                            if (this.field_t.field_j != 3) {
                              break L12;
                            } else {
                              discarded$13 = this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                              break L12;
                            }
                          }
                          var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                          if (var6 > 0) {
                            this.b(true, true);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  if (param1 < -51) {
                    if (var5 == 0) {
                      if (param3) {
                        if (this.field_t.field_j != 3) {
                          var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                          if (var6 > 0) {
                            this.b(true, true);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          discarded$14 = this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                          var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                          if (var6 > 0) {
                            this.b(true, true);
                            return;
                          } else {
                            return;
                          }
                        }
                      } else {
                        if (this.field_t.field_j != 0) {
                          L13: {
                            if (this.field_t.field_j != 3) {
                              break L13;
                            } else {
                              discarded$15 = this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                              break L13;
                            }
                          }
                          var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                          if (var6 > 0) {
                            this.b(true, true);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    } else {
                      return;
                    }
                  } else {
                    var10 = (up) null;
                    this.a(81, (up) null);
                    if (var5 == 0) {
                      L14: {
                        if (param3) {
                          break L14;
                        } else {
                          if (this.field_t.field_j != 0) {
                            break L14;
                          } else {
                            return;
                          }
                        }
                      }
                      L15: {
                        if (this.field_t.field_j != 3) {
                          break L15;
                        } else {
                          discarded$16 = this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                          break L15;
                        }
                      }
                      var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                      if (var6 > 0) {
                        this.b(true, true);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            L16: {
              if (-1 > (param0 ^ -1)) {
                var6 = 1;
                this.field_u = this.field_u + param0;
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              var8 = this.field_K;
              if (var6 == 0) {
                break L17;
              } else {
                if (!this.c(0, param0, 98)) {
                  break L17;
                } else {
                  var5 = 1;
                  this.b(true, false);
                  this.field_s = -this.field_s;
                  this.field_u = var7;
                  break L17;
                }
              }
            }
            L18: {
              L19: {
                var6 = 0;
                if (-1 < (param2 ^ -1)) {
                  break L19;
                } else {
                  if (0 < param2) {
                    this.field_K = this.field_K + param2;
                    var6 = 1;
                    if (var9 == 0) {
                      break L18;
                    } else {
                      break L19;
                    }
                  } else {
                    if (var6 != 0) {
                      L20: {
                        if (this.c(param2, 0, 111)) {
                          var5 = 1;
                          this.b(true, false);
                          this.field_y = -this.field_y;
                          this.field_K = var8;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      L21: {
                        if (param1 < -51) {
                          break L21;
                        } else {
                          var10 = (up) null;
                          this.a(81, (up) null);
                          break L21;
                        }
                      }
                      if (var5 == 0) {
                        L22: {
                          if (param3) {
                            break L22;
                          } else {
                            if (this.field_t.field_j != 0) {
                              break L22;
                            } else {
                              return;
                            }
                          }
                        }
                        L23: {
                          if (this.field_t.field_j != 3) {
                            break L23;
                          } else {
                            discarded$17 = this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                            break L23;
                          }
                        }
                        var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                        if (var6 > 0) {
                          this.b(true, true);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      L24: {
                        if (param1 < -51) {
                          break L24;
                        } else {
                          var10 = (up) null;
                          this.a(81, (up) null);
                          break L24;
                        }
                      }
                      if (var5 == 0) {
                        L25: {
                          if (param3) {
                            break L25;
                          } else {
                            if (this.field_t.field_j != 0) {
                              break L25;
                            } else {
                              return;
                            }
                          }
                        }
                        L26: {
                          if (this.field_t.field_j != 3) {
                            break L26;
                          } else {
                            discarded$18 = this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                            break L26;
                          }
                        }
                        var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                        if (var6 > 0) {
                          this.b(true, true);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
              }
              var6 = 1;
              this.field_K = this.field_K + param2;
              break L18;
            }
            if (var6 == 0) {
              break L0;
            } else {
              if (this.c(param2, 0, 111)) {
                var5 = 1;
                this.b(true, false);
                this.field_y = -this.field_y;
                this.field_K = var8;
                break L0;
              } else {
                L27: {
                  if (param1 < -51) {
                    break L27;
                  } else {
                    var10 = (up) null;
                    this.a(81, (up) null);
                    break L27;
                  }
                }
                if (var5 == 0) {
                  L28: {
                    if (param3) {
                      break L28;
                    } else {
                      if (this.field_t.field_j != 0) {
                        break L28;
                      } else {
                        return;
                      }
                    }
                  }
                  if (this.field_t.field_j != 3) {
                    var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                    if (var6 > 0) {
                      this.b(true, true);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    discarded$19 = this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                    var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                    if (var6 > 0) {
                      this.b(true, true);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            break L0;
          }
        }
        if (param1 < -51) {
          if (var5 == 0) {
            if (param3) {
              if (this.field_t.field_j != 3) {
                var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                if (var6 <= 0) {
                  return;
                } else {
                  this.b(true, true);
                  return;
                }
              } else {
                discarded$20 = this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                if (var6 > 0) {
                  this.b(true, true);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (this.field_t.field_j != 0) {
                if (this.field_t.field_j != 3) {
                  var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                  if (var6 > 0) {
                    this.b(true, true);
                    return;
                  } else {
                    return;
                  }
                } else {
                  discarded$21 = this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                  var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                  if (var6 > 0) {
                    this.b(true, true);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          var10 = (up) null;
          this.a(81, (up) null);
          if (var5 == 0) {
            if (param3) {
              if (this.field_t.field_j != 3) {
                var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                if (var6 <= 0) {
                  return;
                } else {
                  this.b(true, true);
                  return;
                }
              } else {
                discarded$22 = this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                if (var6 > 0) {
                  this.b(true, true);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (this.field_t.field_j != 0) {
                if (this.field_t.field_j != 3) {
                  var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                  if (var6 > 0) {
                    this.b(true, true);
                    return;
                  } else {
                    return;
                  }
                } else {
                  discarded$23 = this.field_z.a(-40, this.field_K, th.field_o, 2 * this.field_o, 2 * this.field_o, this.field_u);
                  var6 = this.field_z.a((ep) (this), -16164, this.field_t);
                  if (var6 > 0) {
                    this.b(true, true);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    private final void h(byte param0) {
        on discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param0 >= 0) {
          var3 = this.field_t.field_j;
          if (-5 != (var3 ^ -1)) {
            if (-6 != (var3 ^ -1)) {
              if ((var3 ^ -1) != -4) {
                if (-1 == (var3 ^ -1)) {
                  if (var4 != 0) {
                    this.field_z.b(false).a(this.field_K, (byte) -121, 4, this.field_G, 1, 0, 20, 0, this.field_u, this.field_o >> -702490446, this.field_o >> 132496145);
                    var2 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
                    this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2, 10, 262144, this.field_u, 16, 8);
                    return;
                  } else {
                    var2 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
                    this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2, 10, 262144, this.field_u, 16, 8);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (var4 == 0) {
                  this.field_z.b(false).a(this.field_K, (byte) -121, 4, this.field_G, 1, 0, 20, 0, this.field_u, this.field_o >> -702490446, this.field_o >> 132496145);
                  if (var4 != 0) {
                    var2 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
                    this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2, 10, 262144, this.field_u, 16, 8);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (-1 == (var3 ^ -1)) {
                    this.field_z.b(false).a(this.field_K, (byte) -121, 4, this.field_G, 1, 0, 20, 0, this.field_u, this.field_o >> -702490446, this.field_o >> 132496145);
                    var2 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
                    this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2, 10, 262144, this.field_u, 16, 8);
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (var4 != 0) {
                L0: {
                  if ((var3 ^ -1) != -4) {
                    break L0;
                  } else {
                    if (var4 == 0) {
                      this.field_z.b(false).a(this.field_K, (byte) -121, 4, this.field_G, 1, 0, 20, 0, this.field_u, this.field_o >> -702490446, this.field_o >> 132496145);
                      if (var4 == 0) {
                        return;
                      } else {
                        var2 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
                        this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2, 10, 262144, this.field_u, 16, 8);
                        return;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
                if (-1 == (var3 ^ -1)) {
                  if (var4 != 0) {
                    this.field_z.b(false).a(this.field_K, (byte) -121, 4, this.field_G, 1, 0, 20, 0, this.field_u, this.field_o >> -702490446, this.field_o >> 132496145);
                    var2 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
                    this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2, 10, 262144, this.field_u, 16, 8);
                    return;
                  } else {
                    var2 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
                    this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2, 10, 262144, this.field_u, 16, 8);
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
            return;
          }
        } else {
          discarded$1 = this.c(true);
          var3 = this.field_t.field_j;
          if (-5 != (var3 ^ -1)) {
            if (-6 == (var3 ^ -1)) {
              if (var4 == 0) {
                return;
              } else {
                L1: {
                  if ((var3 ^ -1) != -4) {
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (-1 != (var3 ^ -1)) {
                    break L2;
                  } else {
                    if (var4 == 0) {
                      var2 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
                      this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2, 10, 262144, this.field_u, 16, 8);
                      break L2;
                    } else {
                      this.field_z.b(false).a(this.field_K, (byte) -121, 4, this.field_G, 1, 0, 20, 0, this.field_u, this.field_o >> -702490446, this.field_o >> 132496145);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        var2 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
                        this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2, 10, 262144, this.field_u, 16, 8);
                        break L2;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              L3: {
                L4: {
                  L5: {
                    if ((var3 ^ -1) != -4) {
                      break L5;
                    } else {
                      if (var4 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (-1 != (var3 ^ -1)) {
                    break L3;
                  } else {
                    if (var4 == 0) {
                      var2 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
                      this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2, 10, 262144, this.field_u, 16, 8);
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                this.field_z.b(false).a(this.field_K, (byte) -121, 4, this.field_G, 1, 0, 20, 0, this.field_u, this.field_o >> -702490446, this.field_o >> 132496145);
                if (var4 == 0) {
                  break L3;
                } else {
                  var2 = qva.a((byte) -35, this.field_y, this.field_s) + 4096;
                  this.field_z.b(false).a(this.field_K, (byte) -83, 5, this.field_G, 3, var2, 10, 262144, this.field_u, 16, 8);
                  break L3;
                }
              }
              return;
            }
          } else {
            return;
          }
        }
    }

    private final int b(int param0, up param1) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        int stackIn_2_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            if (param0 >= 100) {
              L1: {
                if (-5 != (this.field_t.field_j ^ -1)) {
                  break L1;
                } else {
                  if (5 == param1.field_j) {
                    this.a(false, 0);
                    discarded$2 = this.field_z.b(30097, 1048576, 1, this.field_K, this.field_u);
                    stackOut_31_0 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (this.field_t.field_j != 3) {
                  break L2;
                } else {
                  L3: {
                    if (-5 == (param1.field_j ^ -1)) {
                      break L3;
                    } else {
                      if ((param1.field_j ^ -1) == -6) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    this.a(false, 0);
                    this.field_z.b(false).c(this.field_u, 93, this.field_y, this.field_G, this.field_s, this.field_K);
                    if (5 != param1.field_j) {
                      break L4;
                    } else {
                      discarded$3 = this.field_z.b(30097, 1048576, 0, this.field_K, this.field_u);
                      break L4;
                    }
                  }
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
              L5: {
                if (3 == this.field_t.field_j) {
                  break L5;
                } else {
                  if (3 != param1.field_j) {
                    break L5;
                  } else {
                    var3_int = 1 + param1.field_b / 2;
                    if (0 >= var3_int) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L6: {
                        L7: {
                          if ((this.field_t.field_j ^ -1) == -5) {
                            break L7;
                          } else {
                            if (this.field_t.field_j != 5) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var3_int = 0;
                        break L6;
                      }
                      if ((var3_int ^ -1) < -1) {
                        L8: {
                          if (!this.field_t.d(6734)) {
                            this.field_i = 4;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        this.field_t.a(29525, param1.b(-344));
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        return 0;
                      }
                    }
                  }
                }
              }
              stackOut_33_0 = 0;
              stackIn_34_0 = stackOut_33_0;
              decompiledRegionSelector0 = 5;
              break L0;
            } else {
              stackOut_1_0 = 115;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var3);
            stackOut_35_1 = new StringBuilder().append("ep.K(").append(param0).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L9;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_26_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_30_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_32_0;
                } else {
                  return stackIn_34_0;
                }
              }
            }
          }
        }
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        RuntimeException var5 = null;
        iq var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                var6 = (iq) null;
                this.a(63, (iq) null);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("ep.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public final int d(int param0) {
        if (param0 != 3) {
            this.field_F = true;
            return this.field_u;
        }
        return this.field_u;
    }

    final int f(boolean param0) {
        int discarded$0 = 0;
        if (!param0) {
            discarded$0 = this.a(42, (byte) 84);
            return this.field_H;
        }
        return this.field_H;
    }

    public final String toString() {
        return "Projectile (x=" + this.field_u + ", y=" + this.field_K + ", vx=" + this.field_s + ", vy=" + this.field_y + ", " + "angle=" + this.field_H + ", endSize=" + this.field_v + ")";
    }

    final void c(boolean param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (!param0) {
          L0: {
            this.field_D = 124;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((ep) (this)).field_B = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((ep) (this)).field_B = stackIn_4_1 != 0;
          return;
        }
    }

    public final boolean a(byte param0, boolean param1) {
        if (param0 != -55) {
            return false;
        }
        return false;
    }

    final void b(boolean param0, int param1) {
        this.field_C = param0 ? true : false;
        int var3 = 43 / ((param1 - 14) / 38);
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var5 = 0;
        if (param3 != 0) {
          L0: {
            this.field_w = -54;
            if (param1) {
              L1: {
                L2: {
                  if (0 > param0) {
                    break L2;
                  } else {
                    if (0 < param0) {
                      var5 = 1;
                      this.field_u = this.field_u + param0;
                      if (var8 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      L3: {
                        L4: {
                          if (0 <= param2) {
                            break L4;
                          } else {
                            this.field_K = this.field_K + param2;
                            var5 = 1;
                            if (var8 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        if (param2 <= 0) {
                          break L3;
                        } else {
                          this.field_K = this.field_K + param2;
                          var5 = 1;
                          break L3;
                        }
                      }
                      var6 = 0;
                      if (param1) {
                        L5: {
                          if (-4 == (this.field_t.field_j ^ -1)) {
                            discarded$6 = this.field_z.a(param3 + -31, this.field_K, th.field_o, 2 * this.field_o, this.field_o * 2, this.field_u);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          var7 = this.field_z.a((ep) (this), -16164, this.field_t);
                          if ((var7 ^ -1) < -1) {
                            var6 = 1;
                            this.b(true, true);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (var5 != 0) {
                            if (this.c(param2, param0, 122)) {
                              if (var6 == 0) {
                                this.b(true, true);
                                break L7;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          } else {
                            break L7;
                          }
                        }
                        return;
                      } else {
                        L8: {
                          if (-1 != (this.field_t.field_j ^ -1)) {
                            L9: {
                              if (-4 == (this.field_t.field_j ^ -1)) {
                                discarded$7 = this.field_z.a(param3 + -31, this.field_K, th.field_o, 2 * this.field_o, this.field_o * 2, this.field_u);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            var7 = this.field_z.a((ep) (this), -16164, this.field_t);
                            if ((var7 ^ -1) < -1) {
                              var6 = 1;
                              this.b(true, true);
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        L10: {
                          if (var5 != 0) {
                            if (this.c(param2, param0, 122)) {
                              if (var6 == 0) {
                                this.b(true, true);
                                break L10;
                              } else {
                                break L10;
                              }
                            } else {
                              break L10;
                            }
                          } else {
                            break L10;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                var5 = 1;
                this.field_u = this.field_u + param0;
                break L1;
              }
              L11: {
                if (0 <= param2) {
                  break L11;
                } else {
                  this.field_K = this.field_K + param2;
                  var5 = 1;
                  if (var8 == 0) {
                    break L0;
                  } else {
                    break L11;
                  }
                }
              }
              if (param2 <= 0) {
                break L0;
              } else {
                this.field_K = this.field_K + param2;
                var5 = 1;
                break L0;
              }
            } else {
              break L0;
            }
          }
          var6 = 0;
          if (!param1) {
            if (-1 == (this.field_t.field_j ^ -1)) {
              if (var5 != 0) {
                if (this.c(param2, param0, 122)) {
                  if (var6 != 0) {
                    return;
                  } else {
                    this.b(true, true);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L12: {
                if (-4 == (this.field_t.field_j ^ -1)) {
                  discarded$8 = this.field_z.a(param3 + -31, this.field_K, th.field_o, 2 * this.field_o, this.field_o * 2, this.field_u);
                  break L12;
                } else {
                  break L12;
                }
              }
              var7 = this.field_z.a((ep) (this), -16164, this.field_t);
              if ((var7 ^ -1) < -1) {
                var6 = 1;
                this.b(true, true);
                if (var5 != 0) {
                  if (this.c(param2, param0, 122)) {
                    if (var6 != 0) {
                      return;
                    } else {
                      this.b(true, true);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (var5 != 0) {
                  if (this.c(param2, param0, 122)) {
                    if (var6 != 0) {
                      return;
                    } else {
                      this.b(true, true);
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
            L13: {
              if (-4 == (this.field_t.field_j ^ -1)) {
                discarded$9 = this.field_z.a(param3 + -31, this.field_K, th.field_o, 2 * this.field_o, this.field_o * 2, this.field_u);
                break L13;
              } else {
                break L13;
              }
            }
            var7 = this.field_z.a((ep) (this), -16164, this.field_t);
            if ((var7 ^ -1) < -1) {
              var6 = 1;
              this.b(true, true);
              if (var5 != 0) {
                if (this.c(param2, param0, 122)) {
                  if (var6 != 0) {
                    return;
                  } else {
                    this.b(true, true);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (var5 != 0) {
                if (this.c(param2, param0, 122)) {
                  if (var6 != 0) {
                    return;
                  } else {
                    this.b(true, true);
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
          L14: {
            if (param1) {
              L15: {
                L16: {
                  if (0 > param0) {
                    break L16;
                  } else {
                    if (0 < param0) {
                      var5 = 1;
                      this.field_u = this.field_u + param0;
                      if (var8 == 0) {
                        break L15;
                      } else {
                        break L16;
                      }
                    } else {
                      L17: {
                        L18: {
                          if (0 <= param2) {
                            break L18;
                          } else {
                            this.field_K = this.field_K + param2;
                            var5 = 1;
                            if (var8 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (param2 <= 0) {
                          break L17;
                        } else {
                          this.field_K = this.field_K + param2;
                          var5 = 1;
                          break L17;
                        }
                      }
                      L19: {
                        L20: {
                          var6 = 0;
                          if (param1) {
                            break L20;
                          } else {
                            if (-1 != (this.field_t.field_j ^ -1)) {
                              break L20;
                            } else {
                              break L19;
                            }
                          }
                        }
                        L21: {
                          if (-4 == (this.field_t.field_j ^ -1)) {
                            discarded$10 = this.field_z.a(param3 + -31, this.field_K, th.field_o, 2 * this.field_o, this.field_o * 2, this.field_u);
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        var7 = this.field_z.a((ep) (this), -16164, this.field_t);
                        if ((var7 ^ -1) < -1) {
                          var6 = 1;
                          this.b(true, true);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L22: {
                        if (var5 != 0) {
                          if (this.c(param2, param0, 122)) {
                            if (var6 == 0) {
                              this.b(true, true);
                              break L22;
                            } else {
                              break L22;
                            }
                          } else {
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                      return;
                    }
                  }
                }
                var5 = 1;
                this.field_u = this.field_u + param0;
                break L15;
              }
              L23: {
                if (0 <= param2) {
                  break L23;
                } else {
                  this.field_K = this.field_K + param2;
                  var5 = 1;
                  if (var8 == 0) {
                    break L14;
                  } else {
                    break L23;
                  }
                }
              }
              if (param2 <= 0) {
                break L14;
              } else {
                this.field_K = this.field_K + param2;
                var5 = 1;
                break L14;
              }
            } else {
              break L14;
            }
          }
          L24: {
            var6 = 0;
            if (param1) {
              break L24;
            } else {
              if (-1 != (this.field_t.field_j ^ -1)) {
                break L24;
              } else {
                L25: {
                  if (var5 != 0) {
                    if (this.c(param2, param0, 122)) {
                      if (var6 == 0) {
                        this.b(true, true);
                        break L25;
                      } else {
                        break L25;
                      }
                    } else {
                      break L25;
                    }
                  } else {
                    break L25;
                  }
                }
                return;
              }
            }
          }
          L26: {
            if (-4 == (this.field_t.field_j ^ -1)) {
              discarded$11 = this.field_z.a(param3 + -31, this.field_K, th.field_o, 2 * this.field_o, this.field_o * 2, this.field_u);
              break L26;
            } else {
              break L26;
            }
          }
          var7 = this.field_z.a((ep) (this), -16164, this.field_t);
          if ((var7 ^ -1) < -1) {
            var6 = 1;
            this.b(true, true);
            if (var5 != 0) {
              if (this.c(param2, param0, 122)) {
                if (var6 != 0) {
                  return;
                } else {
                  this.b(true, true);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L27: {
              if (var5 != 0) {
                if (this.c(param2, param0, 122)) {
                  if (var6 == 0) {
                    this.b(true, true);
                    break L27;
                  } else {
                    break L27;
                  }
                } else {
                  break L27;
                }
              } else {
                break L27;
              }
            }
            return;
          }
        }
    }

    final c d(boolean param0) {
        if (!param0) {
            return (c) null;
        }
        return (c) ((Object) new ep());
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        int discarded$0 = 0;
        if (!param0) {
            discarded$0 = this.e((byte) -115);
            return 0;
        }
        return 0;
    }

    public final int b(int param0) {
        int var2 = -24 / ((param0 - 1) / 45);
        return 0;
    }

    final int l(int param0) {
        if (param0 != 5) {
            return 53;
        }
        return this.field_E;
    }

    public final int c(int param0) {
        if (param0 >= -11) {
            return 67;
        }
        return this.field_o;
    }

    public final int e(int param0) {
        if (param0 != 9648) {
            return -95;
        }
        return this.field_K;
    }

    private final boolean f(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 < -114) {
          if (!(this.field_t.field_g instanceof hca)) {
            if (this.field_t.field_c instanceof hca) {
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
          this.c(false, false);
          if (this.field_t.field_g instanceof hca) {
            return true;
          } else {
            L0: {
              if (!(this.field_t.field_c instanceof hca)) {
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

    private final void a(boolean param0, int param1) {
        if (param0) {
          if ((this.field_t.field_j ^ -1) == -5) {
            if (!this.field_z.b(param1 ^ 30097, 1048576, 0, this.field_K, this.field_u)) {
              this.field_F = true;
              this.field_z.field_u.a((ffa) (this), (byte) 123);
              if (param1 != 0) {
                this.field_m = 81;
                return;
              } else {
                return;
              }
            } else {
              this.h((byte) 100);
              this.field_F = true;
              this.field_z.field_u.a((ffa) (this), (byte) 123);
              if (param1 != 0) {
                this.field_m = 81;
                return;
              } else {
                return;
              }
            }
          } else {
            if ((this.field_t.field_j ^ -1) == -6) {
              this.field_F = true;
              this.field_z.field_u.a((ffa) (this), (byte) 123);
              if (param1 != 0) {
                this.field_m = 81;
                return;
              } else {
                return;
              }
            } else {
              this.field_F = true;
              this.field_z.field_u.a((ffa) (this), (byte) 123);
              if (param1 != 0) {
                this.field_m = 81;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          this.field_F = true;
          this.field_z.field_u.a((ffa) (this), (byte) 123);
          if (param1 != 0) {
            this.field_m = 81;
            return;
          } else {
            return;
          }
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return false;
        }
        return this.field_F;
    }

    public static void j(int param0) {
        if (param0 <= 95) {
          ep.j(-85);
          field_n = null;
          field_k = null;
          field_r = null;
          return;
        } else {
          field_n = null;
          field_k = null;
          field_r = null;
          return;
        }
    }

    final void b(int param0, int param1, byte param2) {
        this.field_s = param0;
        this.field_y = param1;
        int var4 = 118 / ((-51 - param2) / 40);
        this.field_H = qva.a((byte) -29, param1, param0);
    }

    final void b(int param0, boolean param1) {
        int discarded$0 = 0;
        this.field_p = param1 ? true : false;
        if (param0 != -1) {
            discarded$0 = this.b(false);
        }
    }

    public final void a(int param0, int param1, int param2) {
        int discarded$2 = 0;
        this.field_z.field_u.a((ffa) (this), (byte) 98);
        this.a(param1, param0, (byte) 114);
        this.g((byte) -99);
        this.field_t.field_g = null;
        if (param2 != 2) {
          discarded$2 = this.d(107);
          this.field_z.field_u.b((ffa) (this), param2 + 7071);
          return;
        } else {
          this.field_z.field_u.b((ffa) (this), param2 + 7071);
          return;
        }
    }

    final void a(int param0, la param1, int param2, int param3, int param4, int param5) {
        try {
            this.field_y = 0;
            this.field_E = param4;
            this.field_l = false;
            this.field_J = param0 * 2;
            this.field_H = 0;
            int var7_int = -121 / ((-17 - param3) / 49);
            this.field_p = false;
            this.field_B = false;
            this.field_v = 2 * param2;
            this.field_C = false;
            this.field_j = param5;
            this.field_w = 0;
            this.field_F = false;
            this.field_z = param1;
            this.field_i = -1;
            this.field_s = 0;
            this.field_x = 0;
            this.field_o = this.field_J;
            this.field_t = null;
            this.field_I = 0;
            this.field_q.b((byte) 93);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ep.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int b(boolean param0) {
        if (param0) {
            this.field_i = -106;
            return this.field_y;
        }
        return this.field_y;
    }

    final void a(int param0, up param1) {
        try {
            this.field_t = param1;
            if (param0 > -122) {
                this.field_u = -12;
            }
            this.field_I = 5;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ep.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param0 < 68) {
            this.field_s = -53;
            return false;
        }
        return false;
    }

    public final int b(byte param0) {
        int var2 = 40 % ((-23 - param0) / 53);
        return this.field_u;
    }

    final void a(boolean param0, boolean param1) {
        c discarded$0 = null;
        this.field_l = param1 ? true : false;
        if (!param0) {
            discarded$0 = this.d(true);
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param2 >= 92) {
          L0: {
            L1: {
              if (!this.field_C) {
                break L1;
              } else {
                var4 = 3;
                if (!TombRacer.field_G) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = 1;
            break L0;
          }
          if (this.field_p) {
            L2: {
              if (-1 == (this.field_z.a((ffa) (this), this.field_t.field_g, var4, this.field_J, param0 / 4, 12, this.field_J, this.field_u, 1, param1 / 4, this.field_K, 0, false) ^ -1)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            return this.field_z.a((ffa) (this), this.field_J, 2, var4, this.field_K, this.field_u, false, this.field_t.field_g, this.field_J);
          }
        } else {
          return true;
        }
    }

    final int i(int param0) {
        if (param0 != -1) {
            this.field_q = (on) null;
            return this.field_o;
        }
        return this.field_o;
    }

    final void a(uw param0, int param1) {
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 5465) {
                break L1;
              } else {
                discarded$2 = this.a((byte) 21, true);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_G >= 0) {
                  break L3;
                } else {
                  param0.a((byte) -128, 2, (fo) (this));
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              param0.a((byte) -116, 7, (fo) (this));
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3);
            stackOut_7_1 = new StringBuilder().append("ep.AA(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public final on c(boolean param0) {
        if (param0) {
            this.field_I = -9;
            return this.field_q;
        }
        return this.field_q;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            this.field_q = (on) null;
        }
    }

    public final boolean a(int param0) {
        int var2 = 61 % ((param0 - 6) / 46);
        return false;
    }

    final void b(int param0, int param1, int param2) {
        this.field_w = param1;
        if (param0 != 7) {
            return;
        }
        this.field_H = param2;
    }

    public final boolean a(int param0, gma param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param0 <= -77) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              this.field_v = 120;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ep.OD(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hr var8 = null;
        hr var10 = null;
        hr var12 = null;
        hr var13 = null;
        int stackIn_109_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          this.g((byte) -99);
          this.field_q.a(param0 + 87);
          if (param1) {
            if (this.f((byte) -118)) {
              L1: {
                var3 = 1;
                this.field_H = this.field_H + this.field_w;
                if (var3 != 0) {
                  this.field_x = this.field_x + 1;
                  if (this.field_x >= this.field_j) {
                    this.a(true, param0 + 1);
                    if (!this.field_F) {
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (!this.field_F) {
                if (!this.field_C) {
                  this.a(this.field_s, var3 != 0, this.field_y, param0 ^ -1);
                  if (!TombRacer.field_G) {
                    L2: {
                      if (this.field_F) {
                        break L2;
                      } else {
                        this.field_z.field_u.a((ffa) (this), -66);
                        this.field_z.field_u.b((ffa) (this), 7073);
                        break L2;
                      }
                    }
                    L3: {
                      L4: {
                        if (!this.field_B) {
                          break L4;
                        } else {
                          if (this.field_s != 0) {
                            break L4;
                          } else {
                            if (this.field_y == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      this.field_o = this.field_x * (-this.field_J + this.field_v) / this.field_j + this.field_J;
                      break L3;
                    }
                    L5: {
                      if (var3 == 0) {
                        break L5;
                      } else {
                        if ((this.field_i ^ -1) != 0) {
                          var10 = this.field_z.a(this.field_u, this.field_K, (byte) 100, this.field_G);
                          var5 = 131072;
                          var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                          var7 = uca.field_c.a(var5, param0 ^ -1) - var5 / 2;
                          var10.a(false, 24, this.field_i, 4, 10 + uca.field_c.a(10, 0));
                          var10.b(121, var7, var6);
                          var10.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (this.field_u < 0) {
                        this.field_F = true;
                        break L6;
                      } else {
                        if (-1 < (this.field_K ^ -1)) {
                          this.field_F = true;
                          break L6;
                        } else {
                          if (this.field_u >= this.field_z.m((byte) -86)) {
                            this.field_F = true;
                            break L6;
                          } else {
                            if (this.field_K < this.field_z.s(-121)) {
                              break L6;
                            } else {
                              this.field_F = true;
                              break L6;
                            }
                          }
                        }
                      }
                    }
                    L7: {
                      if (param0 == -1) {
                        break L7;
                      } else {
                        this.field_t = (up) null;
                        break L7;
                      }
                    }
                    return;
                  } else {
                    this.a(this.field_s, (byte) -127, this.field_y, var3 != 0);
                    L8: {
                      if (this.field_F) {
                        break L8;
                      } else {
                        this.field_z.field_u.a((ffa) (this), -66);
                        this.field_z.field_u.b((ffa) (this), 7073);
                        break L8;
                      }
                    }
                    L9: {
                      L10: {
                        if (!this.field_B) {
                          break L10;
                        } else {
                          if (this.field_s != 0) {
                            break L10;
                          } else {
                            if (this.field_y == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      this.field_o = this.field_x * (-this.field_J + this.field_v) / this.field_j + this.field_J;
                      break L9;
                    }
                    L11: {
                      if (var3 == 0) {
                        break L11;
                      } else {
                        if ((this.field_i ^ -1) != 0) {
                          var12 = this.field_z.a(this.field_u, this.field_K, (byte) 100, this.field_G);
                          var5 = 131072;
                          var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                          var7 = uca.field_c.a(var5, param0 ^ -1) - var5 / 2;
                          var12.a(false, 24, this.field_i, 4, 10 + uca.field_c.a(10, 0));
                          var12.b(121, var7, var6);
                          var12.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (this.field_u < 0) {
                        this.field_F = true;
                        break L12;
                      } else {
                        if (-1 < (this.field_K ^ -1)) {
                          this.field_F = true;
                          break L12;
                        } else {
                          if (this.field_u >= this.field_z.m((byte) -86)) {
                            this.field_F = true;
                            break L12;
                          } else {
                            if (this.field_K < this.field_z.s(-121)) {
                              break L12;
                            } else {
                              this.field_F = true;
                              break L12;
                            }
                          }
                        }
                      }
                    }
                    L13: {
                      if (param0 == -1) {
                        break L13;
                      } else {
                        this.field_t = (up) null;
                        break L13;
                      }
                    }
                    return;
                  }
                } else {
                  this.a(this.field_s, (byte) -127, this.field_y, var3 != 0);
                  L14: {
                    if (this.field_F) {
                      break L14;
                    } else {
                      this.field_z.field_u.a((ffa) (this), -66);
                      this.field_z.field_u.b((ffa) (this), 7073);
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      if (!this.field_B) {
                        break L16;
                      } else {
                        if (this.field_s != 0) {
                          break L16;
                        } else {
                          if (this.field_y == 0) {
                            break L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    this.field_o = this.field_x * (-this.field_J + this.field_v) / this.field_j + this.field_J;
                    break L15;
                  }
                  L17: {
                    if (var3 == 0) {
                      break L17;
                    } else {
                      if ((this.field_i ^ -1) != 0) {
                        var12 = this.field_z.a(this.field_u, this.field_K, (byte) 100, this.field_G);
                        var5 = 131072;
                        var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                        var7 = uca.field_c.a(var5, param0 ^ -1) - var5 / 2;
                        var12.a(false, 24, this.field_i, 4, 10 + uca.field_c.a(10, 0));
                        var12.b(121, var7, var6);
                        var12.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if (this.field_u < 0) {
                      this.field_F = true;
                      break L18;
                    } else {
                      if (-1 < (this.field_K ^ -1)) {
                        this.field_F = true;
                        break L18;
                      } else {
                        if (this.field_u >= this.field_z.m((byte) -86)) {
                          this.field_F = true;
                          break L18;
                        } else {
                          if (this.field_K < this.field_z.s(-121)) {
                            break L18;
                          } else {
                            this.field_F = true;
                            break L18;
                          }
                        }
                      }
                    }
                  }
                  L19: {
                    if (param0 == -1) {
                      break L19;
                    } else {
                      this.field_t = (up) null;
                      break L19;
                    }
                  }
                  return;
                }
              } else {
                L20: {
                  if (this.field_F) {
                    break L20;
                  } else {
                    this.field_z.field_u.a((ffa) (this), -66);
                    this.field_z.field_u.b((ffa) (this), 7073);
                    break L20;
                  }
                }
                L21: {
                  L22: {
                    if (!this.field_B) {
                      break L22;
                    } else {
                      if (this.field_s != 0) {
                        break L22;
                      } else {
                        if (this.field_y == 0) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                  this.field_o = this.field_x * (-this.field_J + this.field_v) / this.field_j + this.field_J;
                  break L21;
                }
                L23: {
                  if (var3 == 0) {
                    break L23;
                  } else {
                    if ((this.field_i ^ -1) != 0) {
                      var8 = this.field_z.a(this.field_u, this.field_K, (byte) 100, this.field_G);
                      var5 = 131072;
                      var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                      var7 = uca.field_c.a(var5, param0 ^ -1) - var5 / 2;
                      var8.a(false, 24, this.field_i, 4, 10 + uca.field_c.a(10, 0));
                      var8.b(121, var7, var6);
                      var8.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                }
                L24: {
                  if (this.field_u < 0) {
                    this.field_F = true;
                    break L24;
                  } else {
                    if (-1 < (this.field_K ^ -1)) {
                      this.field_F = true;
                      break L24;
                    } else {
                      if (this.field_u >= this.field_z.m((byte) -86)) {
                        this.field_F = true;
                        break L24;
                      } else {
                        if (this.field_K < this.field_z.s(-121)) {
                          break L24;
                        } else {
                          this.field_F = true;
                          break L24;
                        }
                      }
                    }
                  }
                }
                L25: {
                  if (param0 == -1) {
                    break L25;
                  } else {
                    this.field_t = (up) null;
                    break L25;
                  }
                }
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_109_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_109_0 = stackOut_1_0;
            break L0;
          }
        }
        L26: {
          var3 = stackIn_109_0;
          this.field_H = this.field_H + this.field_w;
          if (var3 != 0) {
            this.field_x = this.field_x + 1;
            if (this.field_x >= this.field_j) {
              this.a(true, param0 + 1);
              if (!this.field_F) {
                break L26;
              } else {
                return;
              }
            } else {
              break L26;
            }
          } else {
            break L26;
          }
        }
        L27: {
          if (this.field_F) {
            break L27;
          } else {
            if (this.field_C) {
              this.a(this.field_s, (byte) -127, this.field_y, var3 != 0);
              break L27;
            } else {
              this.a(this.field_s, var3 != 0, this.field_y, param0 ^ -1);
              if (!TombRacer.field_G) {
                break L27;
              } else {
                this.a(this.field_s, (byte) -127, this.field_y, var3 != 0);
                break L27;
              }
            }
          }
        }
        L28: {
          if (this.field_F) {
            break L28;
          } else {
            this.field_z.field_u.a((ffa) (this), -66);
            this.field_z.field_u.b((ffa) (this), 7073);
            break L28;
          }
        }
        L29: {
          L30: {
            if (!this.field_B) {
              break L30;
            } else {
              if (this.field_s != 0) {
                break L30;
              } else {
                if (this.field_y == 0) {
                  break L29;
                } else {
                  break L30;
                }
              }
            }
          }
          this.field_o = this.field_x * (-this.field_J + this.field_v) / this.field_j + this.field_J;
          break L29;
        }
        L31: {
          if (var3 == 0) {
            break L31;
          } else {
            if ((this.field_i ^ -1) != 0) {
              var13 = this.field_z.a(this.field_u, this.field_K, (byte) 100, this.field_G);
              var5 = 131072;
              var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
              var7 = uca.field_c.a(var5, param0 ^ -1) - var5 / 2;
              var13.a(false, 24, this.field_i, 4, 10 + uca.field_c.a(10, 0));
              var13.b(121, var7, var6);
              var13.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
              break L31;
            } else {
              L32: {
                if (this.field_u < 0) {
                  this.field_F = true;
                  break L32;
                } else {
                  if (-1 < (this.field_K ^ -1)) {
                    this.field_F = true;
                    break L32;
                  } else {
                    if (this.field_u >= this.field_z.m((byte) -86)) {
                      this.field_F = true;
                      break L32;
                    } else {
                      if (this.field_K < this.field_z.s(-121)) {
                        if (param0 != -1) {
                          this.field_t = (up) null;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L33: {
                          this.field_F = true;
                          if (param0 == -1) {
                            break L33;
                          } else {
                            this.field_t = (up) null;
                            break L33;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 != -1) {
                this.field_t = (up) null;
                return;
              } else {
                return;
              }
            }
          }
        }
        if (this.field_u < 0) {
          this.field_F = true;
          if (param0 != -1) {
            this.field_t = (up) null;
            return;
          } else {
            return;
          }
        } else {
          if (-1 < (this.field_K ^ -1)) {
            this.field_F = true;
            if (param0 != -1) {
              this.field_t = (up) null;
              return;
            } else {
              return;
            }
          } else {
            if (this.field_u >= this.field_z.m((byte) -86)) {
              this.field_F = true;
              if (param0 != -1) {
                this.field_t = (up) null;
                return;
              } else {
                return;
              }
            } else {
              if (this.field_K < this.field_z.s(-121)) {
                if (param0 == -1) {
                  return;
                } else {
                  this.field_t = (up) null;
                  return;
                }
              } else {
                this.field_F = true;
                if (param0 == -1) {
                  return;
                } else {
                  this.field_t = (up) null;
                  return;
                }
              }
            }
          }
        }
    }

    public final boolean a(gma param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_r = (jea) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ep.OA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
            this.field_q = (on) null;
            return this.field_K;
        }
        return this.field_K;
    }

    public final int a(up param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (this.field_l) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (io.a(param1, this.field_K, (byte) -90, param5, this.field_u, param4, this.field_o, this.field_o, param2)) {
                L1: {
                  if (param3 == 0) {
                    break L1;
                  } else {
                    this.field_m = -65;
                    break L1;
                  }
                }
                stackOut_9_0 = this.b(109, param0);
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var7);
            stackOut_11_1 = new StringBuilder().append("ep.WC(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public final int a(up param0, ep param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 < -97) {
                break L1;
              } else {
                this.field_B = false;
                break L1;
              }
            }
            stackOut_2_0 = this.a(param0, param1.field_o, param1.field_u, 0, param1.field_K, param1.field_o);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("ep.SD(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, iq param1) {
        boolean discarded$2 = false;
        RuntimeException runtimeException = null;
        ffa var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              dea.field_a.a(param1, false, (ep) (this));
              if (param0 >= 103) {
                break L1;
              } else {
                var4 = (ffa) null;
                discarded$2 = this.a(40, (gma) null, -76, 70, -19, (ffa) null, -19, 65);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ep.DB(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final int a(up param0, int param1, pc param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (!this.field_l) {
              if (-1 >= (eha.a(this.field_o, param1, this.field_K, this.field_o, param2, this.field_u, 2) ^ -1)) {
                stackOut_6_0 = this.b(115, param0);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("ep.ED(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final int a(int param0, byte param1) {
        boolean discarded$1 = false;
        param0 = fs.a((byte) 88, param0, this.field_u);
        param0 = fs.a((byte) 30, param0, this.field_K);
        if (param1 != -39) {
          discarded$1 = this.f((byte) 2);
          param0 = fs.a((byte) 32, param0, this.field_s);
          param0 = fs.a((byte) 120, param0, this.field_y);
          param0 = fs.a((byte) 58, param0, this.field_v);
          param0 = fs.a((byte) 85, param0, this.field_H);
          return param0;
        } else {
          param0 = fs.a((byte) 32, param0, this.field_s);
          param0 = fs.a((byte) 120, param0, this.field_y);
          param0 = fs.a((byte) 58, param0, this.field_v);
          param0 = fs.a((byte) 85, param0, this.field_H);
          return param0;
        }
    }

    public final int a(boolean param0) {
        up var3 = null;
        if (!param0) {
          var3 = (up) null;
          this.a(-80, (up) null);
          return 7 + 7 * this.field_D;
        } else {
          return 7 + 7 * this.field_D;
        }
    }

    final int e(boolean param0) {
        int discarded$0 = 0;
        if (param0) {
            discarded$0 = this.c((byte) 40);
            return this.field_j;
        }
        return this.field_j;
    }

    public final boolean a(int param0, gma param1, int param2, int param3, int param4, ffa param5, int param6, int param7) {
        RuntimeException var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 >= 55) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var9);
            stackOut_5_1 = new StringBuilder().append("ep.IC(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param6 + ',' + param7 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0 != 0;
        }
    }

    private final void g(byte param0) {
        if (param0 != -99) {
            this.field_y = 18;
        }
    }

    ep() {
        this.field_i = -1;
        this.field_q = new on();
        int fieldTemp$0 = sd.field_G;
        sd.field_G = sd.field_G + 1;
        this.field_D = fieldTemp$0;
    }

    static {
    }
}
