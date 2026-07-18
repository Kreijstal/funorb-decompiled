/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lg {
    private int field_k;
    private int field_p;
    private int field_l;
    static int field_s;
    private int field_h;
    int field_t;
    private int field_n;
    private wa field_g;
    private int field_b;
    private int field_q;
    static long field_u;
    private float field_d;
    private int field_e;
    int field_i;
    private int field_m;
    static sf[] field_v;
    boolean field_c;
    private int field_a;
    private int field_f;
    static String field_j;
    private int field_r;
    private int field_o;

    final void b(boolean param0) {
        if (!param0) {
          ((lg) this).field_p = -74;
          ((lg) this).field_g.a(((lg) this).field_q, -8, ((lg) this).field_e);
          return;
        } else {
          ((lg) this).field_g.a(((lg) this).field_q, -8, ((lg) this).field_e);
          return;
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
        var2 = 23 % ((param0 - -78) / 43);
        if (lo.field_l >= ((lg) this).field_m) {
          if (be.field_j <= 0) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void b(int param0, int param1, int param2) {
        if (param2 != -1) {
          boolean discarded$2 = ((lg) this).c(-74);
          ((lg) this).field_p = param1;
          ((lg) this).field_o = param0;
          return;
        } else {
          ((lg) this).field_p = param1;
          ((lg) this).field_o = param0;
          return;
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        qh var5_ref_qh = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        kd var8 = null;
        kd var9 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = ZombieDawn.field_J;
        try {
          L0: {
            var3 = 8 / ((param1 - 36) / 46);
            var2_int = 0;
            L1: while (true) {
              if (param0 <= var2_int) {
                break L0;
              } else {
                L2: {
                  if (sh.field_e != 0) {
                    var9 = dj.field_e.a(60, (byte) 125, 930, 140, 960);
                    var5 = 20 + hp.field_A.a(true) + -so.c(40);
                    var6 = hp.field_A.f(237239984) - so.c(60);
                    var9.a(dj.field_e.field_H.a(true, var9.a(true), var6, var5, var9.f(237239984)), true);
                    break L2;
                  } else {
                    var8 = dj.field_e.a(20, (byte) 120, 70, 354, 890);
                    var5_ref_qh = new qh();
                    var5_ref_qh.a(0, (le) (Object) new kk(var8.a(true), 450));
                    var5_ref_qh.a(0, (le) (Object) new kk(384, 206));
                    var8.a(var5_ref_qh, true);
                    break L2;
                  }
                }
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "lg.A(" + param0 + ',' + param1 + ')');
        }
    }

    lg(wa param0) {
        this(640, 480, 1280, 1024, 640, 480, 122, 16, param0);
    }

    public static void a(byte param0) {
        field_v = null;
        field_j = null;
    }

    final boolean b(int param0) {
        if (param0 == 0) {
          if (be.field_j > 0) {
            if (lo.field_l >= ((lg) this).field_m) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((lg) this).b(true);
          if (be.field_j > 0) {
            if (lo.field_l >= ((lg) this).field_m) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        var2 = ((lg) this).field_p;
        var3 = ((lg) this).field_o;
        if (((lg) this).c(-127)) {
          L0: {
            if (var2 > ((lg) this).field_a) {
              var2 = ((lg) this).field_a;
              break L0;
            } else {
              if (((lg) this).field_k > var2) {
                var2 = ((lg) this).field_k;
                break L0;
              } else {
                L1: {
                  if (((lg) this).field_h >= var3) {
                    if (var3 < ((lg) this).field_b) {
                      var3 = ((lg) this).field_b;
                      break L1;
                    } else {
                      L2: {
                        if (((lg) this).field_d > 0.0f) {
                          var4 = (int)(((lg) this).field_d * (float)var3 + 0.5f);
                          if (var2 < var4) {
                            var3 = (int)((float)var2 / ((lg) this).field_d);
                            break L2;
                          } else {
                            if (var4 >= var2) {
                              break L2;
                            } else {
                              var2 = var4;
                              break L2;
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                      L3: {
                        if (te.field_eb != var2) {
                          ((lg) this).field_g.a(var2, 14, var3);
                          break L3;
                        } else {
                          if (kj.field_c != var3) {
                            ((lg) this).field_g.a(var2, 14, var3);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (~((lg) this).field_p < param0) {
                          rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      return;
                    }
                  } else {
                    var3 = ((lg) this).field_h;
                    break L1;
                  }
                }
                if (((lg) this).field_d > 0.0f) {
                  L5: {
                    var4 = (int)(((lg) this).field_d * (float)var3 + 0.5f);
                    if (var2 < var4) {
                      var3 = (int)((float)var2 / ((lg) this).field_d);
                      break L5;
                    } else {
                      if (var4 >= var2) {
                        break L5;
                      } else {
                        L6: {
                          var2 = var4;
                          if (te.field_eb != var2) {
                            ((lg) this).field_g.a(var2, 14, var3);
                            break L6;
                          } else {
                            if (kj.field_c != var3) {
                              ((lg) this).field_g.a(var2, 14, var3);
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (~((lg) this).field_p < param0) {
                            rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (te.field_eb == var2) {
                    if (kj.field_c == var3) {
                      L8: {
                        if (~((lg) this).field_p < param0) {
                          rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      return;
                    } else {
                      L9: {
                        ((lg) this).field_g.a(var2, 14, var3);
                        if (~((lg) this).field_p < param0) {
                          rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      return;
                    }
                  } else {
                    L10: {
                      ((lg) this).field_g.a(var2, 14, var3);
                      if (~((lg) this).field_p < param0) {
                        rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return;
                  }
                } else {
                  L11: {
                    if (te.field_eb != var2) {
                      ((lg) this).field_g.a(var2, 14, var3);
                      break L11;
                    } else {
                      if (kj.field_c != var3) {
                        ((lg) this).field_g.a(var2, 14, var3);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if (~((lg) this).field_p < param0) {
                      rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                }
              }
            }
          }
          L13: {
            if (((lg) this).field_h >= var3) {
              if (var3 < ((lg) this).field_b) {
                var3 = ((lg) this).field_b;
                break L13;
              } else {
                if (((lg) this).field_d > 0.0f) {
                  var4 = (int)(((lg) this).field_d * (float)var3 + 0.5f);
                  if (var2 >= var4) {
                    if (var4 >= var2) {
                      L14: {
                        if (te.field_eb != var2) {
                          ((lg) this).field_g.a(var2, 14, var3);
                          break L14;
                        } else {
                          if (kj.field_c != var3) {
                            ((lg) this).field_g.a(var2, 14, var3);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if (~((lg) this).field_p < param0) {
                          rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      return;
                    } else {
                      var2 = var4;
                      L16: {
                        if (te.field_eb != var2) {
                          ((lg) this).field_g.a(var2, 14, var3);
                          break L16;
                        } else {
                          if (kj.field_c != var3) {
                            ((lg) this).field_g.a(var2, 14, var3);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        if (~((lg) this).field_p < param0) {
                          rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      return;
                    }
                  } else {
                    L18: {
                      var3 = (int)((float)var2 / ((lg) this).field_d);
                      if (te.field_eb != var2) {
                        ((lg) this).field_g.a(var2, 14, var3);
                        break L18;
                      } else {
                        if (kj.field_c != var3) {
                          ((lg) this).field_g.a(var2, 14, var3);
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                    }
                    L19: {
                      if (~((lg) this).field_p < param0) {
                        rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    return;
                  }
                } else {
                  L20: {
                    if (te.field_eb != var2) {
                      ((lg) this).field_g.a(var2, 14, var3);
                      break L20;
                    } else {
                      if (kj.field_c != var3) {
                        ((lg) this).field_g.a(var2, 14, var3);
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    if (~((lg) this).field_p < param0) {
                      rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  return;
                }
              }
            } else {
              var3 = ((lg) this).field_h;
              break L13;
            }
          }
          if (((lg) this).field_d > 0.0f) {
            L22: {
              var4 = (int)(((lg) this).field_d * (float)var3 + 0.5f);
              if (var2 < var4) {
                var3 = (int)((float)var2 / ((lg) this).field_d);
                break L22;
              } else {
                if (var4 >= var2) {
                  break L22;
                } else {
                  var2 = var4;
                  if (te.field_eb == var2) {
                    if (kj.field_c == var3) {
                      L23: {
                        if (~((lg) this).field_p < param0) {
                          rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                          break L23;
                        } else {
                          break L23;
                        }
                      }
                      return;
                    } else {
                      L24: {
                        ((lg) this).field_g.a(var2, 14, var3);
                        if (~((lg) this).field_p < param0) {
                          rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                          break L24;
                        } else {
                          break L24;
                        }
                      }
                      return;
                    }
                  } else {
                    L25: {
                      ((lg) this).field_g.a(var2, 14, var3);
                      if (~((lg) this).field_p < param0) {
                        rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (te.field_eb == var2) {
              if (kj.field_c != var3) {
                L26: {
                  ((lg) this).field_g.a(var2, 14, var3);
                  if (~((lg) this).field_p < param0) {
                    rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                return;
              } else {
                L27: {
                  if (~((lg) this).field_p < param0) {
                    rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                return;
              }
            } else {
              L28: {
                ((lg) this).field_g.a(var2, 14, var3);
                if (~((lg) this).field_p < param0) {
                  rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                  break L28;
                } else {
                  break L28;
                }
              }
              return;
            }
          } else {
            if (te.field_eb == var2) {
              if (kj.field_c == var3) {
                L29: {
                  if (~((lg) this).field_p < param0) {
                    rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                return;
              } else {
                L30: {
                  ((lg) this).field_g.a(var2, 14, var3);
                  if (~((lg) this).field_p < param0) {
                    rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                return;
              }
            } else {
              L31: {
                ((lg) this).field_g.a(var2, 14, var3);
                if (~((lg) this).field_p < param0) {
                  rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
                  break L31;
                } else {
                  break L31;
                }
              }
              return;
            }
          }
        } else {
          ((lg) this).field_c = false;
          return;
        }
    }

    final void d(int param0) {
        if (null == cn.field_b) {
          L0: {
            if (be.field_j <= 0) {
              ((lg) this).field_c = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (((lg) this).field_c) {
            int fieldTemp$1 = ((lg) this).field_n - 1;
            ((lg) this).field_n = ((lg) this).field_n - 1;
            if (0 < fieldTemp$1) {
              return;
            } else {
              ((lg) this).field_n = ((lg) this).field_l;
              if (lo.field_l < ((lg) this).field_m) {
                ((lg) this).field_c = false;
                return;
              } else {
                L1: {
                  this.a(-1);
                  if (param0 > 13) {
                    break L1;
                  } else {
                    ((lg) this).field_k = -32;
                    break L1;
                  }
                }
                return;
              }
            }
          } else {
            if (te.field_eb >= ((lg) this).field_p) {
              if (((lg) this).field_p > 0) {
                rg.field_I = 0;
                if (((lg) this).field_f == te.field_eb) {
                  if (kj.field_c != ((lg) this).field_r) {
                    ((lg) this).field_g.a(((lg) this).field_f, -125, ((lg) this).field_r);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((lg) this).field_g.a(((lg) this).field_f, -125, ((lg) this).field_r);
                  return;
                }
              } else {
                if (((lg) this).field_f == te.field_eb) {
                  if (kj.field_c == ((lg) this).field_r) {
                    return;
                  } else {
                    ((lg) this).field_g.a(((lg) this).field_f, -125, ((lg) this).field_r);
                    return;
                  }
                } else {
                  ((lg) this).field_g.a(((lg) this).field_f, -125, ((lg) this).field_r);
                  return;
                }
              }
            } else {
              rg.field_I = (-te.field_eb + ((lg) this).field_p) / 2;
              if (((lg) this).field_f != te.field_eb) {
                ((lg) this).field_g.a(((lg) this).field_f, -125, ((lg) this).field_r);
                return;
              } else {
                if (kj.field_c == ((lg) this).field_r) {
                  return;
                } else {
                  ((lg) this).field_g.a(((lg) this).field_f, -125, ((lg) this).field_r);
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((lg) this).field_t = param1;
        if (param2 < 123) {
            this.a(-55);
            ((lg) this).field_i = param0;
            return;
        }
        ((lg) this).field_i = param0;
    }

    final boolean c(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        var4 = -71 / ((-63 - param2) / 60);
        if (((lg) this).field_k <= param1) {
          if (((lg) this).field_a >= param1) {
            if (param0 >= ((lg) this).field_b) {
              if (((lg) this).field_h >= param0) {
                if (0.0f != ((lg) this).field_d) {
                  if (Math.round((float)param0 * ((lg) this).field_d) == param1) {
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

    final la a(boolean param0) {
        la var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        ec stackIn_2_2 = null;
        int stackIn_2_3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        ec stackIn_3_2 = null;
        int stackIn_3_3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        ec stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        ec stackOut_1_2 = null;
        int stackOut_1_3 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        ec stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        ec stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        ((lg) this).field_e = kj.field_c;
        ((lg) this).field_q = te.field_eb;
        if (!param0) {
          return null;
        } else {
          L0: {
            ((lg) this).field_g.a(((lg) this).field_t, 64, ((lg) this).field_i);
            rl.field_f = false;
            stackOut_1_0 = ((lg) this).field_i;
            stackOut_1_1 = ((lg) this).field_t;
            stackOut_1_2 = vh.field_a;
            stackOut_1_3 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            stackIn_2_2 = stackOut_1_2;
            stackIn_2_3 = stackOut_1_3;
            if (param0) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = (ec) (Object) stackIn_3_2;
              stackOut_3_3 = stackIn_3_3;
              stackOut_3_4 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              stackIn_4_4 = stackOut_3_4;
              break L0;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = (ec) (Object) stackIn_2_2;
              stackOut_2_3 = stackIn_2_3;
              stackOut_2_4 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              stackIn_4_4 = stackOut_2_4;
              break L0;
            }
          }
          L1: {
            var2 = nf.a(stackIn_4_0, stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, 0);
            if (var2 == null) {
              ((lg) this).b(true);
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        }
    }

    private lg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, wa param8) {
        try {
            ((lg) this).field_g = param8;
            ((lg) this).field_a = param2;
            ((lg) this).field_m = param6;
            ((lg) this).field_d = 0.0f;
            ((lg) this).field_c = false;
            ((lg) this).field_h = param3;
            ((lg) this).field_f = param4;
            ((lg) this).field_l = param7;
            ((lg) this).field_i = 480;
            ((lg) this).field_k = param0;
            ((lg) this).field_r = param5;
            ((lg) this).field_t = 640;
            ((lg) this).field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "lg.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 20;
        field_j = "Account created successfully!";
    }
}
