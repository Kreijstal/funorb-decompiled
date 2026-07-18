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
        return ((ep) this).field_x;
    }

    final void a(int param0, int param1) {
        int var3 = -21 % ((20 - param1) / 42);
        ((ep) this).field_i = param0;
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            ((ep) this).field_z = null;
            return ((ep) this).field_G;
        }
        return ((ep) this).field_G;
    }

    public final int a(byte param0) {
        if (param0 != 55) {
            Object var3 = null;
            ((ep) this).a((uw) null, -69);
            return ((ep) this).field_o;
        }
        return ((ep) this).field_o;
    }

    final int k(int param0) {
        int var2 = -72 / ((param0 - -24) / 39);
        return ((ep) this).field_s;
    }

    public final boolean j(byte param0) {
        if (param0 >= -102) {
            field_n = null;
            return true;
        }
        return true;
    }

    private final void a(int param0, int param1, byte param2) {
        ((ep) this).field_u = param0;
        ((ep) this).field_K = param1;
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
              ((ep) this).field_u = param0.a(((ep) this).field_u, (byte) 71);
              ((ep) this).field_s = -((ep) this).field_s;
              ((ep) this).field_H = dfa.a(-((ep) this).field_H, 8192, 105);
              if (param1 < -16) {
                break L1;
              } else {
                ((ep) this).field_I = 44;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ep.MA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        ((ep) this).field_K = param2;
        ((ep) this).field_G = param3;
        ((ep) this).field_u = param0;
        if (param1 != -78) {
            boolean discarded$0 = ((ep) this).a(53);
        }
    }

    final boolean h(int param0) {
        if (param0 != 18407) {
            ((ep) this).a(false, true);
            return ((ep) this).field_F;
        }
        return ((ep) this).field_F;
    }

    private final void b(boolean param0, boolean param1) {
        ((ep) this).field_z.a(((ep) this).field_K, ((ep) this).field_u, ((ep) this).field_m, ((ep) this).field_G, (byte) 6);
        if (((ep) this).field_B) {
          if (((ep) this).field_s == 0) {
            if (((ep) this).field_y == 0) {
              this.h((byte) 32);
              if (!param1) {
                ((ep) this).field_I = ((ep) this).field_I - 1;
                if (((ep) this).field_I > 0) {
                  if (((ep) this).field_C) {
                    ((ep) this).field_t.field_g = null;
                    return;
                  } else {
                    return;
                  }
                } else {
                  this.a(true, 0);
                  if (((ep) this).field_C) {
                    ((ep) this).field_t.field_g = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                this.a(true, 0);
                if (((ep) this).field_C) {
                  ((ep) this).field_t.field_g = null;
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((ep) this).field_s = 0;
              ((ep) this).field_B = false;
              ((ep) this).field_J = ((ep) this).field_J * 2;
              ((ep) this).field_y = 0;
              ((ep) this).field_C = false;
              return;
            }
          } else {
            ((ep) this).field_s = 0;
            ((ep) this).field_B = false;
            ((ep) this).field_J = ((ep) this).field_J * 2;
            ((ep) this).field_y = 0;
            ((ep) this).field_C = false;
            return;
          }
        } else {
          this.h((byte) 32);
          if (!param1) {
            ((ep) this).field_I = ((ep) this).field_I - 1;
            if (((ep) this).field_I > 0) {
              if (((ep) this).field_C) {
                ((ep) this).field_t.field_g = null;
                return;
              } else {
                return;
              }
            } else {
              this.a(true, 0);
              if (((ep) this).field_C) {
                ((ep) this).field_t.field_g = null;
                return;
              } else {
                return;
              }
            }
          } else {
            L0: {
              this.a(true, 0);
              if (!((ep) this).field_C) {
                break L0;
              } else {
                ((ep) this).field_t.field_g = null;
                break L0;
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var5 = 0;
          if (param3) {
            L1: {
              var6 = 0;
              var7 = ((ep) this).field_u;
              if (0 <= param0) {
                if (param0 > 0) {
                  var6 = 1;
                  ((ep) this).field_u = ((ep) this).field_u + param0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var6 = 1;
                ((ep) this).field_u = ((ep) this).field_u + param0;
                break L1;
              }
            }
            L2: {
              var8 = ((ep) this).field_K;
              if (var6 == 0) {
                break L2;
              } else {
                if (!this.c(0, param0, 98)) {
                  break L2;
                } else {
                  var5 = 1;
                  this.b(true, false);
                  ((ep) this).field_s = -((ep) this).field_s;
                  ((ep) this).field_u = var7;
                  break L2;
                }
              }
            }
            var6 = 0;
            if (param2 < 0) {
              var6 = 1;
              ((ep) this).field_K = ((ep) this).field_K + param2;
              if (var6 != 0) {
                if (this.c(param2, 0, 111)) {
                  var5 = 1;
                  this.b(true, false);
                  ((ep) this).field_y = -((ep) this).field_y;
                  ((ep) this).field_K = var8;
                  break L0;
                } else {
                  if (var5 == 0) {
                    if (param3) {
                      if (((ep) this).field_t.field_j != 3) {
                        var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                        if (var6 > 0) {
                          this.b(true, true);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        int discarded$9 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                        var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                        if (var6 > 0) {
                          this.b(true, true);
                          return;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (((ep) this).field_t.field_j != 0) {
                        if (((ep) this).field_t.field_j != 3) {
                          var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                          if (var6 > 0) {
                            this.b(true, true);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          int discarded$10 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                          var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
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
              } else {
                if (var5 == 0) {
                  if (param3) {
                    if (((ep) this).field_t.field_j != 3) {
                      var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                      if (var6 > 0) {
                        this.b(true, true);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      int discarded$11 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                      var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                      if (var6 > 0) {
                        this.b(true, true);
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    if (((ep) this).field_t.field_j != 0) {
                      if (((ep) this).field_t.field_j != 3) {
                        var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                        if (var6 > 0) {
                          this.b(true, true);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        int discarded$12 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                        var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
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
            } else {
              if (0 < param2) {
                L3: {
                  ((ep) this).field_K = ((ep) this).field_K + param2;
                  var6 = 1;
                  if (var6 == 0) {
                    break L3;
                  } else {
                    if (this.c(param2, 0, 111)) {
                      var5 = 1;
                      this.b(true, false);
                      ((ep) this).field_y = -((ep) this).field_y;
                      ((ep) this).field_K = var8;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                if (var5 == 0) {
                  L4: {
                    if (param3) {
                      break L4;
                    } else {
                      if (((ep) this).field_t.field_j != 0) {
                        break L4;
                      } else {
                        return;
                      }
                    }
                  }
                  if (((ep) this).field_t.field_j != 3) {
                    var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                    if (var6 <= 0) {
                      return;
                    } else {
                      this.b(true, true);
                      return;
                    }
                  } else {
                    int discarded$13 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                    var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
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
              } else {
                if (var6 != 0) {
                  L5: {
                    if (this.c(param2, 0, 111)) {
                      var5 = 1;
                      this.b(true, false);
                      ((ep) this).field_y = -((ep) this).field_y;
                      ((ep) this).field_K = var8;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (var5 == 0) {
                    L6: {
                      if (param3) {
                        break L6;
                      } else {
                        if (((ep) this).field_t.field_j != 0) {
                          break L6;
                        } else {
                          return;
                        }
                      }
                    }
                    L7: {
                      if (((ep) this).field_t.field_j != 3) {
                        break L7;
                      } else {
                        int discarded$14 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                        break L7;
                      }
                    }
                    var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
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
                  if (var5 == 0) {
                    L8: {
                      if (param3) {
                        break L8;
                      } else {
                        if (((ep) this).field_t.field_j != 0) {
                          break L8;
                        } else {
                          return;
                        }
                      }
                    }
                    L9: {
                      if (((ep) this).field_t.field_j != 3) {
                        break L9;
                      } else {
                        int discarded$15 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                        break L9;
                      }
                    }
                    var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
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
          } else {
            break L0;
          }
        }
        if (var5 == 0) {
          if (param3) {
            if (((ep) this).field_t.field_j != 3) {
              var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
              if (var6 > 0) {
                this.b(true, true);
                return;
              } else {
                return;
              }
            } else {
              int discarded$16 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
              var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
              if (var6 > 0) {
                this.b(true, true);
                return;
              } else {
                return;
              }
            }
          } else {
            if (((ep) this).field_t.field_j != 0) {
              if (((ep) this).field_t.field_j != 3) {
                var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                if (var6 > 0) {
                  this.b(true, true);
                  return;
                } else {
                  return;
                }
              } else {
                int discarded$17 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
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

    private final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param0 >= 0) {
          L0: {
            var3 = ((ep) this).field_t.field_j;
            if (var3 == 4) {
              break L0;
            } else {
              if (var3 != 5) {
                if (var3 != 3) {
                  if (var3 != 0) {
                    break L0;
                  } else {
                    var2 = qva.a((byte) -35, ((ep) this).field_y, ((ep) this).field_s) + 4096;
                    ((ep) this).field_z.b(false).a(((ep) this).field_K, (byte) -83, 5, ((ep) this).field_G, 3, var2, 10, 262144, ((ep) this).field_u, 16, 8);
                    break L0;
                  }
                } else {
                  ((ep) this).field_z.b(false).a(((ep) this).field_K, (byte) -121, 4, ((ep) this).field_G, 1, 0, 20, 0, ((ep) this).field_u, ((ep) this).field_o >> 18, ((ep) this).field_o >> 17);
                  return;
                }
              } else {
                return;
              }
            }
          }
          return;
        } else {
          on discarded$1 = ((ep) this).c(true);
          var3 = ((ep) this).field_t.field_j;
          if (var3 != 4) {
            if (var3 != 5) {
              if (var3 != 3) {
                if (var3 == 0) {
                  var2 = qva.a((byte) -35, ((ep) this).field_y, ((ep) this).field_s) + 4096;
                  ((ep) this).field_z.b(false).a(((ep) this).field_K, (byte) -83, 5, ((ep) this).field_G, 3, var2, 10, 262144, ((ep) this).field_u, 16, 8);
                  return;
                } else {
                  return;
                }
              } else {
                ((ep) this).field_z.b(false).a(((ep) this).field_K, (byte) -121, 4, ((ep) this).field_G, 1, 0, 20, 0, ((ep) this).field_u, ((ep) this).field_o >> 18, ((ep) this).field_o >> 17);
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

    private final int b(int param0, up param1) {
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
                if (-5 != ((ep) this).field_t.field_j) {
                  break L1;
                } else {
                  if (5 == param1.field_j) {
                    this.a(false, 0);
                    boolean discarded$2 = ((ep) this).field_z.b(30097, 1048576, 1, ((ep) this).field_K, ((ep) this).field_u);
                    stackOut_31_0 = 0;
                    stackIn_32_0 = stackOut_31_0;
                    return stackIn_32_0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (((ep) this).field_t.field_j != 3) {
                  break L2;
                } else {
                  L3: {
                    if (-5 == param1.field_j) {
                      break L3;
                    } else {
                      if (param1.field_j == 5) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    this.a(false, 0);
                    ((ep) this).field_z.b(false).c(((ep) this).field_u, 93, ((ep) this).field_y, ((ep) this).field_G, ((ep) this).field_s, ((ep) this).field_K);
                    if (5 != param1.field_j) {
                      break L4;
                    } else {
                      boolean discarded$3 = ((ep) this).field_z.b(30097, 1048576, 0, ((ep) this).field_K, ((ep) this).field_u);
                      break L4;
                    }
                  }
                  stackOut_29_0 = 0;
                  stackIn_30_0 = stackOut_29_0;
                  return stackIn_30_0;
                }
              }
              L5: {
                if (3 == ((ep) this).field_t.field_j) {
                  break L5;
                } else {
                  if (3 != param1.field_j) {
                    break L5;
                  } else {
                    var3_int = 1 + param1.field_b / 2;
                    if (0 >= var3_int) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    } else {
                      L6: {
                        L7: {
                          if (((ep) this).field_t.field_j == 4) {
                            break L7;
                          } else {
                            if (((ep) this).field_t.field_j != 5) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var3_int = 0;
                        break L6;
                      }
                      if (var3_int > 0) {
                        L8: {
                          if (!((ep) this).field_t.d(6734)) {
                            ((ep) this).field_i = 4;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        ((ep) this).field_t.a(29525, param1.b(-344));
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        return stackIn_26_0;
                      } else {
                        return 0;
                      }
                    }
                  }
                }
              }
              stackOut_33_0 = 0;
              stackIn_34_0 = stackOut_33_0;
              break L0;
            } else {
              stackOut_1_0 = 115;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) var3;
            stackOut_35_1 = new StringBuilder().append("ep.K(").append(param0).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L9;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L9;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_38_0, stackIn_38_2 + ')');
        }
        return stackIn_34_0;
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        RuntimeException var5 = null;
        Object var6 = null;
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
                var6 = null;
                ((ep) this).a(63, (iq) null);
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
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("ep.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public final int d(int param0) {
        if (param0 != 3) {
            ((ep) this).field_F = true;
            return ((ep) this).field_u;
        }
        return ((ep) this).field_u;
    }

    final int f(boolean param0) {
        if (!param0) {
            int discarded$0 = ((ep) this).a(42, (byte) 84);
            return ((ep) this).field_H;
        }
        return ((ep) this).field_H;
    }

    public final String toString() {
        return "Projectile (x=" + ((ep) this).field_u + ", y=" + ((ep) this).field_K + ", vx=" + ((ep) this).field_s + ", vy=" + ((ep) this).field_y + ", " + "angle=" + ((ep) this).field_H + ", endSize=" + ((ep) this).field_v + ")";
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
            ((ep) this).field_D = 124;
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
          ((ep) this).field_B = stackIn_8_1 != 0;
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
          ((ep) this).field_B = stackIn_4_1 != 0;
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
        ((ep) this).field_C = param0 ? true : false;
        int var3 = 43 / ((param1 - 14) / 38);
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var5 = 0;
        if (param3 != 0) {
          L0: {
            ((ep) this).field_w = -54;
            if (param1) {
              L1: {
                if (0 > param0) {
                  var5 = 1;
                  ((ep) this).field_u = ((ep) this).field_u + param0;
                  break L1;
                } else {
                  if (0 < param0) {
                    var5 = 1;
                    ((ep) this).field_u = ((ep) this).field_u + param0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (0 <= param2) {
                if (param2 <= 0) {
                  break L0;
                } else {
                  ((ep) this).field_K = ((ep) this).field_K + param2;
                  var5 = 1;
                  break L0;
                }
              } else {
                ((ep) this).field_K = ((ep) this).field_K + param2;
                var5 = 1;
                var6 = 0;
                if (param1) {
                  L2: {
                    if (((ep) this).field_t.field_j == 3) {
                      int discarded$6 = ((ep) this).field_z.a(param3 + -31, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, ((ep) this).field_o * 2, ((ep) this).field_u);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var7 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                    if (var7 > 0) {
                      var6 = 1;
                      this.b(true, true);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 != 0) {
                      if (this.c(param2, param0, 122)) {
                        if (var6 == 0) {
                          this.b(true, true);
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  return;
                } else {
                  L5: {
                    if (-1 != ((ep) this).field_t.field_j) {
                      L6: {
                        if (-4 == ((ep) this).field_t.field_j) {
                          int discarded$7 = ((ep) this).field_z.a(param3 + -31, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, ((ep) this).field_o * 2, ((ep) this).field_u);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                      if (var7 > 0) {
                        var6 = 1;
                        this.b(true, true);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
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
                }
              }
            } else {
              break L0;
            }
          }
          var6 = 0;
          if (!param1) {
            if (-1 == ((ep) this).field_t.field_j) {
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
              L8: {
                if (-4 == ((ep) this).field_t.field_j) {
                  int discarded$8 = ((ep) this).field_z.a(param3 + -31, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, ((ep) this).field_o * 2, ((ep) this).field_u);
                  break L8;
                } else {
                  break L8;
                }
              }
              var7 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
              if (var7 > 0) {
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
            L9: {
              if (((ep) this).field_t.field_j == 3) {
                int discarded$9 = ((ep) this).field_z.a(param3 + -31, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, ((ep) this).field_o * 2, ((ep) this).field_u);
                break L9;
              } else {
                break L9;
              }
            }
            var7 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
            if (var7 > 0) {
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
          L10: {
            if (param1) {
              L11: {
                if (0 > param0) {
                  var5 = 1;
                  ((ep) this).field_u = ((ep) this).field_u + param0;
                  break L11;
                } else {
                  if (0 < param0) {
                    var5 = 1;
                    ((ep) this).field_u = ((ep) this).field_u + param0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              if (0 <= param2) {
                if (param2 <= 0) {
                  break L10;
                } else {
                  ((ep) this).field_K = ((ep) this).field_K + param2;
                  var5 = 1;
                  break L10;
                }
              } else {
                L12: {
                  L13: {
                    ((ep) this).field_K = ((ep) this).field_K + param2;
                    var5 = 1;
                    var6 = 0;
                    if (param1) {
                      break L13;
                    } else {
                      if (-1 != ((ep) this).field_t.field_j) {
                        break L13;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L14: {
                    if (-4 == ((ep) this).field_t.field_j) {
                      int discarded$10 = ((ep) this).field_z.a(param3 + -31, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, ((ep) this).field_o * 2, ((ep) this).field_u);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  var7 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                  if (var7 > 0) {
                    var6 = 1;
                    this.b(true, true);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (var5 != 0) {
                    if (this.c(param2, param0, 122)) {
                      if (var6 == 0) {
                        this.b(true, true);
                        break L15;
                      } else {
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  } else {
                    break L15;
                  }
                }
                return;
              }
            } else {
              break L10;
            }
          }
          L16: {
            var6 = 0;
            if (param1) {
              break L16;
            } else {
              if (((ep) this).field_t.field_j != 0) {
                break L16;
              } else {
                L17: {
                  if (var5 != 0) {
                    if (this.c(param2, param0, 122)) {
                      if (var6 == 0) {
                        this.b(true, true);
                        break L17;
                      } else {
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  } else {
                    break L17;
                  }
                }
                return;
              }
            }
          }
          L18: {
            if (((ep) this).field_t.field_j == 3) {
              int discarded$11 = ((ep) this).field_z.a(param3 + -31, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, ((ep) this).field_o * 2, ((ep) this).field_u);
              break L18;
            } else {
              break L18;
            }
          }
          var7 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
          if (var7 > 0) {
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
            L19: {
              if (var5 != 0) {
                if (this.c(param2, param0, 122)) {
                  if (var6 == 0) {
                    this.b(true, true);
                    break L19;
                  } else {
                    break L19;
                  }
                } else {
                  break L19;
                }
              } else {
                break L19;
              }
            }
            return;
          }
        }
    }

    final c d(boolean param0) {
        if (!param0) {
            return null;
        }
        return (c) (Object) new ep();
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (!param0) {
            int discarded$0 = ((ep) this).e((byte) -115);
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
        return ((ep) this).field_E;
    }

    public final int c(int param0) {
        if (param0 >= -11) {
            return 67;
        }
        return ((ep) this).field_o;
    }

    public final int e(int param0) {
        if (param0 != 9648) {
            return -95;
        }
        return ((ep) this).field_K;
    }

    private final boolean f(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 < -114) {
          if (!(((ep) this).field_t.field_g instanceof hca)) {
            if (((ep) this).field_t.field_c instanceof hca) {
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
          ((ep) this).c(false, false);
          if (((ep) this).field_t.field_g instanceof hca) {
            return true;
          } else {
            L0: {
              if (!(((ep) this).field_t.field_c instanceof hca)) {
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
          if (((ep) this).field_t.field_j == 4) {
            if (!((ep) this).field_z.b(param1 ^ 30097, 1048576, 0, ((ep) this).field_K, ((ep) this).field_u)) {
              ((ep) this).field_F = true;
              ((ep) this).field_z.field_u.a((ffa) this, (byte) 123);
              if (param1 != 0) {
                ((ep) this).field_m = 81;
                return;
              } else {
                return;
              }
            } else {
              this.h((byte) 100);
              ((ep) this).field_F = true;
              ((ep) this).field_z.field_u.a((ffa) this, (byte) 123);
              if (param1 != 0) {
                ((ep) this).field_m = 81;
                return;
              } else {
                return;
              }
            }
          } else {
            if (((ep) this).field_t.field_j == 5) {
              ((ep) this).field_F = true;
              ((ep) this).field_z.field_u.a((ffa) this, (byte) 123);
              if (param1 != 0) {
                ((ep) this).field_m = 81;
                return;
              } else {
                return;
              }
            } else {
              ((ep) this).field_F = true;
              ((ep) this).field_z.field_u.a((ffa) this, (byte) 123);
              if (param1 != 0) {
                ((ep) this).field_m = 81;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          ((ep) this).field_F = true;
          ((ep) this).field_z.field_u.a((ffa) this, (byte) 123);
          if (param1 != 0) {
            ((ep) this).field_m = 81;
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
        return ((ep) this).field_F;
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
        ((ep) this).field_s = param0;
        ((ep) this).field_y = param1;
        int var4 = 118 / ((-51 - param2) / 40);
        ((ep) this).field_H = qva.a((byte) -29, param1, param0);
    }

    final void b(int param0, boolean param1) {
        ((ep) this).field_p = param1 ? true : false;
        if (param0 != -1) {
            int discarded$0 = ((ep) this).b(false);
        }
    }

    public final void a(int param0, int param1, int param2) {
        ((ep) this).field_z.field_u.a((ffa) this, (byte) 98);
        this.a(param1, param0, (byte) 114);
        int discarded$4 = -99;
        this.g();
        ((ep) this).field_t.field_g = null;
        if (param2 != 2) {
          int discarded$5 = ((ep) this).d(107);
          ((ep) this).field_z.field_u.b((ffa) this, param2 + 7071);
          return;
        } else {
          ((ep) this).field_z.field_u.b((ffa) this, param2 + 7071);
          return;
        }
    }

    final void a(int param0, la param1, int param2, int param3, int param4, int param5) {
        try {
            ((ep) this).field_y = 0;
            ((ep) this).field_E = param4;
            ((ep) this).field_l = false;
            ((ep) this).field_J = param0 * 2;
            ((ep) this).field_H = 0;
            int var7_int = -121 / ((-17 - param3) / 49);
            ((ep) this).field_p = false;
            ((ep) this).field_B = false;
            ((ep) this).field_v = 2 * param2;
            ((ep) this).field_C = false;
            ((ep) this).field_j = param5;
            ((ep) this).field_w = 0;
            ((ep) this).field_F = false;
            ((ep) this).field_z = param1;
            ((ep) this).field_i = -1;
            ((ep) this).field_s = 0;
            ((ep) this).field_x = 0;
            ((ep) this).field_o = ((ep) this).field_J;
            ((ep) this).field_t = null;
            ((ep) this).field_I = 0;
            ((ep) this).field_q.b((byte) 93);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ep.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int b(boolean param0) {
        if (param0) {
            ((ep) this).field_i = -106;
            return ((ep) this).field_y;
        }
        return ((ep) this).field_y;
    }

    final void a(int param0, up param1) {
        try {
            ((ep) this).field_t = param1;
            if (param0 > -122) {
                ((ep) this).field_u = -12;
            }
            ((ep) this).field_I = 5;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "ep.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param0 < 68) {
            ((ep) this).field_s = -53;
            return false;
        }
        return false;
    }

    public final int b(byte param0) {
        int var2 = 40 % ((-23 - param0) / 53);
        return ((ep) this).field_u;
    }

    final void a(boolean param0, boolean param1) {
        ((ep) this).field_l = param1 ? true : false;
        if (!param0) {
            c discarded$0 = ((ep) this).d(true);
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param2 >= 92) {
          L0: {
            if (!((ep) this).field_C) {
              var4 = 1;
              break L0;
            } else {
              var4 = 3;
              break L0;
            }
          }
          if (((ep) this).field_p) {
            L1: {
              if (((ep) this).field_z.a((ffa) this, ((ep) this).field_t.field_g, var4, ((ep) this).field_J, param0 / 4, 12, ((ep) this).field_J, ((ep) this).field_u, 1, param1 / 4, ((ep) this).field_K, 0, false) == 0) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            return ((ep) this).field_z.a((ffa) this, ((ep) this).field_J, 2, var4, ((ep) this).field_K, ((ep) this).field_u, false, ((ep) this).field_t.field_g, ((ep) this).field_J);
          }
        } else {
          return true;
        }
    }

    final int i(int param0) {
        if (param0 != -1) {
            ((ep) this).field_q = null;
            return ((ep) this).field_o;
        }
        return ((ep) this).field_o;
    }

    final void a(uw param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 5465) {
                break L1;
              } else {
                boolean discarded$2 = ((ep) this).a((byte) 21, true);
                break L1;
              }
            }
            L2: {
              if (((ep) this).field_G >= 0) {
                param0.a((byte) -116, 7, (fo) this);
                break L2;
              } else {
                param0.a((byte) -128, 2, (fo) this);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ep.AA(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
    }

    public final on c(boolean param0) {
        if (param0) {
            ((ep) this).field_I = -9;
            return ((ep) this).field_q;
        }
        return ((ep) this).field_q;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            ((ep) this).field_q = null;
        }
    }

    public final boolean a(int param0) {
        int var2 = 61 % ((param0 - 6) / 46);
        return false;
    }

    final void b(int param0, int param1, int param2) {
        ((ep) this).field_w = param1;
        if (param0 != 7) {
            return;
        }
        ((ep) this).field_H = param2;
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
              ((ep) this).field_v = 120;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ep.OD(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
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
        int stackIn_81_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          int discarded$1 = -99;
          this.g();
          ((ep) this).field_q.a(param0 + 87);
          if (param1) {
            if (this.f((byte) -118)) {
              L1: {
                var3 = 1;
                ((ep) this).field_H = ((ep) this).field_H + ((ep) this).field_w;
                if (var3 != 0) {
                  ((ep) this).field_x = ((ep) this).field_x + 1;
                  if (((ep) this).field_x >= ((ep) this).field_j) {
                    this.a(true, param0 + 1);
                    if (!((ep) this).field_F) {
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
              if (!((ep) this).field_F) {
                L2: {
                  if (((ep) this).field_C) {
                    this.a(((ep) this).field_s, (byte) -127, ((ep) this).field_y, var3 != 0);
                    break L2;
                  } else {
                    this.a(((ep) this).field_s, var3 != 0, ((ep) this).field_y, ~param0);
                    break L2;
                  }
                }
                if (((ep) this).field_F) {
                  L3: {
                    L4: {
                      if (!((ep) this).field_B) {
                        break L4;
                      } else {
                        if (((ep) this).field_s != 0) {
                          break L4;
                        } else {
                          if (((ep) this).field_y == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    ((ep) this).field_o = ((ep) this).field_x * (-((ep) this).field_J + ((ep) this).field_v) / ((ep) this).field_j + ((ep) this).field_J;
                    break L3;
                  }
                  L5: {
                    if (var3 == 0) {
                      break L5;
                    } else {
                      if (((ep) this).field_i != -1) {
                        var10 = ((ep) this).field_z.a(((ep) this).field_u, ((ep) this).field_K, (byte) 100, ((ep) this).field_G);
                        var5 = 131072;
                        var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                        var7 = uca.field_c.a(var5, ~param0) - var5 / 2;
                        var10.a(false, 24, ((ep) this).field_i, 4, 10 + uca.field_c.a(10, 0));
                        var10.b(121, var7, var6);
                        var10.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (((ep) this).field_u < 0) {
                      ((ep) this).field_F = true;
                      break L6;
                    } else {
                      if (((ep) this).field_K < 0) {
                        ((ep) this).field_F = true;
                        break L6;
                      } else {
                        if (((ep) this).field_u >= ((ep) this).field_z.m((byte) -86)) {
                          ((ep) this).field_F = true;
                          break L6;
                        } else {
                          if (((ep) this).field_K < ((ep) this).field_z.s(-121)) {
                            break L6;
                          } else {
                            ((ep) this).field_F = true;
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
                      ((ep) this).field_t = null;
                      break L7;
                    }
                  }
                  return;
                } else {
                  L8: {
                    L9: {
                      ((ep) this).field_z.field_u.a((ffa) this, -66);
                      ((ep) this).field_z.field_u.b((ffa) this, 7073);
                      if (!((ep) this).field_B) {
                        break L9;
                      } else {
                        if (((ep) this).field_s != 0) {
                          break L9;
                        } else {
                          if (((ep) this).field_y == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    ((ep) this).field_o = ((ep) this).field_x * (-((ep) this).field_J + ((ep) this).field_v) / ((ep) this).field_j + ((ep) this).field_J;
                    break L8;
                  }
                  L10: {
                    if (var3 == 0) {
                      break L10;
                    } else {
                      if (((ep) this).field_i != -1) {
                        var12 = ((ep) this).field_z.a(((ep) this).field_u, ((ep) this).field_K, (byte) 100, ((ep) this).field_G);
                        var5 = 131072;
                        var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                        var7 = uca.field_c.a(var5, ~param0) - var5 / 2;
                        var12.a(false, 24, ((ep) this).field_i, 4, 10 + uca.field_c.a(10, 0));
                        var12.b(121, var7, var6);
                        var12.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (((ep) this).field_u < 0) {
                      ((ep) this).field_F = true;
                      break L11;
                    } else {
                      if (((ep) this).field_K < 0) {
                        ((ep) this).field_F = true;
                        break L11;
                      } else {
                        if (((ep) this).field_u >= ((ep) this).field_z.m((byte) -86)) {
                          ((ep) this).field_F = true;
                          break L11;
                        } else {
                          if (((ep) this).field_K < ((ep) this).field_z.s(-121)) {
                            break L11;
                          } else {
                            ((ep) this).field_F = true;
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    if (param0 == -1) {
                      break L12;
                    } else {
                      ((ep) this).field_t = null;
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  if (((ep) this).field_F) {
                    break L13;
                  } else {
                    ((ep) this).field_z.field_u.a((ffa) this, -66);
                    ((ep) this).field_z.field_u.b((ffa) this, 7073);
                    break L13;
                  }
                }
                L14: {
                  L15: {
                    if (!((ep) this).field_B) {
                      break L15;
                    } else {
                      if (((ep) this).field_s != 0) {
                        break L15;
                      } else {
                        if (((ep) this).field_y == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  ((ep) this).field_o = ((ep) this).field_x * (-((ep) this).field_J + ((ep) this).field_v) / ((ep) this).field_j + ((ep) this).field_J;
                  break L14;
                }
                L16: {
                  if (var3 == 0) {
                    break L16;
                  } else {
                    if (((ep) this).field_i != -1) {
                      var8 = ((ep) this).field_z.a(((ep) this).field_u, ((ep) this).field_K, (byte) 100, ((ep) this).field_G);
                      var5 = 131072;
                      var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                      var7 = uca.field_c.a(var5, ~param0) - var5 / 2;
                      var8.a(false, 24, ((ep) this).field_i, 4, 10 + uca.field_c.a(10, 0));
                      var8.b(121, var7, var6);
                      var8.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                }
                L17: {
                  if (((ep) this).field_u < 0) {
                    ((ep) this).field_F = true;
                    break L17;
                  } else {
                    if (((ep) this).field_K < 0) {
                      ((ep) this).field_F = true;
                      break L17;
                    } else {
                      if (((ep) this).field_u >= ((ep) this).field_z.m((byte) -86)) {
                        ((ep) this).field_F = true;
                        break L17;
                      } else {
                        if (((ep) this).field_K < ((ep) this).field_z.s(-121)) {
                          break L17;
                        } else {
                          ((ep) this).field_F = true;
                          break L17;
                        }
                      }
                    }
                  }
                }
                L18: {
                  if (param0 == -1) {
                    break L18;
                  } else {
                    ((ep) this).field_t = null;
                    break L18;
                  }
                }
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_81_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_81_0 = stackOut_1_0;
            break L0;
          }
        }
        L19: {
          var3 = stackIn_81_0;
          ((ep) this).field_H = ((ep) this).field_H + ((ep) this).field_w;
          if (var3 != 0) {
            ((ep) this).field_x = ((ep) this).field_x + 1;
            if (((ep) this).field_x >= ((ep) this).field_j) {
              this.a(true, param0 + 1);
              if (!((ep) this).field_F) {
                break L19;
              } else {
                return;
              }
            } else {
              break L19;
            }
          } else {
            break L19;
          }
        }
        L20: {
          if (((ep) this).field_F) {
            break L20;
          } else {
            if (((ep) this).field_C) {
              this.a(((ep) this).field_s, (byte) -127, ((ep) this).field_y, var3 != 0);
              break L20;
            } else {
              this.a(((ep) this).field_s, var3 != 0, ((ep) this).field_y, ~param0);
              break L20;
            }
          }
        }
        L21: {
          if (((ep) this).field_F) {
            break L21;
          } else {
            ((ep) this).field_z.field_u.a((ffa) this, -66);
            ((ep) this).field_z.field_u.b((ffa) this, 7073);
            break L21;
          }
        }
        L22: {
          L23: {
            if (!((ep) this).field_B) {
              break L23;
            } else {
              if (((ep) this).field_s != 0) {
                break L23;
              } else {
                if (((ep) this).field_y == 0) {
                  break L22;
                } else {
                  break L23;
                }
              }
            }
          }
          ((ep) this).field_o = ((ep) this).field_x * (-((ep) this).field_J + ((ep) this).field_v) / ((ep) this).field_j + ((ep) this).field_J;
          break L22;
        }
        L24: {
          if (var3 == 0) {
            break L24;
          } else {
            if (((ep) this).field_i != 0) {
              var13 = ((ep) this).field_z.a(((ep) this).field_u, ((ep) this).field_K, (byte) 100, ((ep) this).field_G);
              var5 = 131072;
              var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
              var7 = uca.field_c.a(var5, ~param0) - var5 / 2;
              var13.a(false, 24, ((ep) this).field_i, 4, 10 + uca.field_c.a(10, 0));
              var13.b(121, var7, var6);
              var13.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
              break L24;
            } else {
              L25: {
                if (((ep) this).field_u < 0) {
                  ((ep) this).field_F = true;
                  break L25;
                } else {
                  if (-1 > ((ep) this).field_K) {
                    ((ep) this).field_F = true;
                    break L25;
                  } else {
                    if (((ep) this).field_u >= ((ep) this).field_z.m((byte) -86)) {
                      ((ep) this).field_F = true;
                      break L25;
                    } else {
                      if (((ep) this).field_K < ((ep) this).field_z.s(-121)) {
                        if (param0 != -1) {
                          ((ep) this).field_t = null;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L26: {
                          ((ep) this).field_F = true;
                          if (param0 == -1) {
                            break L26;
                          } else {
                            ((ep) this).field_t = null;
                            break L26;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 != -1) {
                ((ep) this).field_t = null;
                return;
              } else {
                return;
              }
            }
          }
        }
        if (((ep) this).field_u < 0) {
          ((ep) this).field_F = true;
          if (param0 != -1) {
            ((ep) this).field_t = null;
            return;
          } else {
            return;
          }
        } else {
          if (((ep) this).field_K < 0) {
            ((ep) this).field_F = true;
            if (param0 != -1) {
              ((ep) this).field_t = null;
              return;
            } else {
              return;
            }
          } else {
            if (((ep) this).field_u >= ((ep) this).field_z.m((byte) -86)) {
              ((ep) this).field_F = true;
              if (param0 != -1) {
                ((ep) this).field_t = null;
                return;
              } else {
                return;
              }
            } else {
              if (((ep) this).field_K < ((ep) this).field_z.s(-121)) {
                if (param0 == -1) {
                  return;
                } else {
                  ((ep) this).field_t = null;
                  return;
                }
              } else {
                ((ep) this).field_F = true;
                if (param0 != -1) {
                  ((ep) this).field_t = null;
                  return;
                } else {
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
              field_r = null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ep.OA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
            ((ep) this).field_q = null;
            return ((ep) this).field_K;
        }
        return ((ep) this).field_K;
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
            if (((ep) this).field_l) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (io.a(param1, ((ep) this).field_K, (byte) -90, param5, ((ep) this).field_u, param4, ((ep) this).field_o, ((ep) this).field_o, param2)) {
                L1: {
                  if (param3 == 0) {
                    break L1;
                  } else {
                    ((ep) this).field_m = -65;
                    break L1;
                  }
                }
                stackOut_9_0 = this.b(109, param0);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var7;
            stackOut_11_1 = new StringBuilder().append("ep.WC(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_10_0;
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
                ((ep) this).field_B = false;
                break L1;
              }
            }
            stackOut_2_0 = ((ep) this).a(param0, param1.field_o, param1.field_u, 0, param1.field_K, param1.field_o);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ep.SD(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, iq param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              dea.field_a.a(param1, false, (ep) this);
              if (param0 >= 103) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = ((ep) this).a(40, (gma) null, -76, 70, -19, (ffa) null, -19, 65);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ep.DB(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            if (!((ep) this).field_l) {
              int discarded$15 = 2;
              if (eha.a(((ep) this).field_o, param1, ((ep) this).field_K, ((ep) this).field_o, param2, ((ep) this).field_u) >= 0) {
                stackOut_6_0 = this.b(115, param0);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ep.ED(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final int a(int param0, byte param1) {
        param0 = fs.a((byte) 88, param0, ((ep) this).field_u);
        param0 = fs.a((byte) 30, param0, ((ep) this).field_K);
        if (param1 != -39) {
          boolean discarded$1 = this.f((byte) 2);
          param0 = fs.a((byte) 32, param0, ((ep) this).field_s);
          param0 = fs.a((byte) 120, param0, ((ep) this).field_y);
          param0 = fs.a((byte) 58, param0, ((ep) this).field_v);
          param0 = fs.a((byte) 85, param0, ((ep) this).field_H);
          return param0;
        } else {
          param0 = fs.a((byte) 32, param0, ((ep) this).field_s);
          param0 = fs.a((byte) 120, param0, ((ep) this).field_y);
          param0 = fs.a((byte) 58, param0, ((ep) this).field_v);
          param0 = fs.a((byte) 85, param0, ((ep) this).field_H);
          return param0;
        }
    }

    public final int a(boolean param0) {
        Object var3 = null;
        if (!param0) {
          var3 = null;
          ((ep) this).a(-80, (up) null);
          return 7 + 7 * ((ep) this).field_D;
        } else {
          return 7 + 7 * ((ep) this).field_D;
        }
    }

    final int e(boolean param0) {
        if (param0) {
            int discarded$0 = ((ep) this).c((byte) 40);
            return ((ep) this).field_j;
        }
        return ((ep) this).field_j;
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
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var9 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var9;
            stackOut_5_1 = new StringBuilder().append("ep.IC(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param5 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param6 + ',' + param7 + ')');
        }
        return stackIn_4_0 != 0;
    }

    private final void g() {
    }

    ep() {
        ((ep) this).field_i = -1;
        ((ep) this).field_q = new on();
        int fieldTemp$0 = sd.field_G;
        sd.field_G = sd.field_G + 1;
        ((ep) this).field_D = fieldTemp$0;
    }

    static {
    }
}
