/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dc {
    int field_w;
    int field_k;
    private int field_C;
    int field_f;
    boolean field_z;
    fs[] field_v;
    private int[] field_N;
    l field_g;
    int[] field_m;
    int field_e;
    private int field_M;
    private int[] field_u;
    String[] field_I;
    int field_y;
    private int[] field_B;
    static pf field_E;
    private int[] field_j;
    private int field_b;
    int field_O;
    int field_J;
    me field_x;
    vr field_o;
    private int field_n;
    el field_p;
    private int[][] field_t;
    pf field_i;
    pf field_A;
    int field_r;
    int[] field_D;
    private int[] field_d;
    static bi field_F;
    private int[] field_K;
    private int field_G;
    private Random field_L;
    static int[] field_c;
    pf field_q;
    static int[] field_s;
    private int[] field_h;
    static np field_l;
    private int[] field_H;
    static String field_a;

    private final void a(boolean param0, k param1, int param2) {
        RuntimeException var4 = null;
        qa var4_ref = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        sd var8 = null;
        lo var8_ref = null;
        int var9 = 0;
        fs var10 = null;
        int var11 = 0;
        sd var11_ref_sd = null;
        int var12 = 0;
        int var13 = 0;
        fs[] var14 = null;
        fs var15 = null;
        fs[] var16 = null;
        fs var17 = null;
        fs[] var18 = null;
        int[] var19 = null;
        lo var20 = null;
        int[] var21 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_ref = (qa) ((Object) this.field_q.d(0));
            L1: while (true) {
              if (var4_ref == null) {
                var14 = this.field_v;
                var6 = 0;
                L2: while (true) {
                  if (var14.length <= var6) {
                    L3: {
                      if (param0) {
                        break L3;
                      } else {
                        field_s = (int[]) null;
                        break L3;
                      }
                    }
                    L4: {
                      if (param1 != null) {
                        var4_ref = (qa) ((Object) this.field_q.d(0));
                        L5: while (true) {
                          if (var4_ref == null) {
                            var16 = this.field_v;
                            var6 = 0;
                            L6: while (true) {
                              if (var16.length <= var6) {
                                if (!this.field_o.field_h) {
                                  break L4;
                                } else {
                                  if (this.field_x instanceof qg) {
                                    break L4;
                                  } else {
                                    var21 = new int[4];
                                    var19 = var21;
                                    var5 = var19;
                                    var18 = this.field_v;
                                    var9 = 0;
                                    L7: while (true) {
                                      if (var18.length <= var9) {
                                        break L4;
                                      } else {
                                        L8: {
                                          var10 = var18[var9];
                                          if ((1 << var10.field_x & this.field_w) == 0) {
                                            var7 = 0;
                                            var11 = 0;
                                            L9: while (true) {
                                              if ((var11 ^ -1) <= -5) {
                                                L10: {
                                                  var6 = 0;
                                                  if (this.field_o.field_i) {
                                                    var20 = var10.field_m;
                                                    var12 = 0;
                                                    L11: while (true) {
                                                      if (var12 >= 4) {
                                                        break L10;
                                                      } else {
                                                        L12: {
                                                          var5[var12] = var20.field_u[var12];
                                                          if (var21[var12] <= var7) {
                                                            break L12;
                                                          } else {
                                                            var7 = var21[var12];
                                                            break L12;
                                                          }
                                                        }
                                                        var5[var12] = var5[var12] + 1;
                                                        var6 = var6 + var21[var12];
                                                        var12++;
                                                        continue L11;
                                                      }
                                                    }
                                                  } else {
                                                    var11_ref_sd = (sd) ((Object) var10.field_i.d(0));
                                                    L13: while (true) {
                                                      if (var11_ref_sd == null) {
                                                        var12 = 0;
                                                        L14: while (true) {
                                                          if (-5 >= (var12 ^ -1)) {
                                                            break L10;
                                                          } else {
                                                            var5[var12] = var5[var12] + 1;
                                                            var6 = var6 + var21[var12];
                                                            var12++;
                                                            continue L14;
                                                          }
                                                        }
                                                      } else {
                                                        var12 = 0;
                                                        L15: while (true) {
                                                          if ((var12 ^ -1) <= -5) {
                                                            var11_ref_sd = (sd) ((Object) var10.field_i.a((byte) -71));
                                                            continue L13;
                                                          } else {
                                                            L16: {
                                                              var5[var12] = var5[var12] + var11_ref_sd.field_u[var12];
                                                              if (var21[var12] > var7) {
                                                                var7 = var21[var12];
                                                                break L16;
                                                              } else {
                                                                break L16;
                                                              }
                                                            }
                                                            var12++;
                                                            continue L15;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                this.field_L.setSeed((long)(1 + var10.field_x ^ param2));
                                                var11 = qf.a((byte) 81, var6, this.field_L);
                                                var12 = 0;
                                                L17: while (true) {
                                                  if (4 <= var12) {
                                                    break L8;
                                                  } else {
                                                    if (var21[var12] <= var11) {
                                                      var11 = var11 - var21[var12];
                                                      var12++;
                                                      continue L17;
                                                    } else {
                                                      if ((var10.field_u[var12] ^ -1) > -6) {
                                                        var10.field_u[var12] = var10.field_u[var12] + 1;
                                                        break L8;
                                                      } else {
                                                        if (var10.field_q != null) {
                                                          var10.field_q.field_d = var10.field_q.field_d + 1;
                                                          break L8;
                                                        } else {
                                                          break L8;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var21[var11] = 0;
                                                var11++;
                                                continue L9;
                                              }
                                            }
                                          } else {
                                            break L8;
                                          }
                                        }
                                        var9++;
                                        continue L7;
                                      }
                                    }
                                  }
                                }
                              } else {
                                L18: {
                                  var17 = var16[var6];
                                  if (this.field_o.field_i) {
                                    if ((var17.field_m.field_x ^ -1) >= -1) {
                                      break L18;
                                    } else {
                                      param1.a(var17.field_m.field_x, var17.field_m.field_q, -4900);
                                      break L18;
                                    }
                                  } else {
                                    var8 = (sd) ((Object) var17.field_i.d(0));
                                    L19: while (true) {
                                      if (var8 == null) {
                                        break L18;
                                      } else {
                                        L20: {
                                          if ((var8.field_x ^ -1) >= -1) {
                                            break L20;
                                          } else {
                                            param1.a(var8.field_x, var8.field_q, -4900);
                                            break L20;
                                          }
                                        }
                                        var8 = (sd) ((Object) var17.field_i.a((byte) -71));
                                        continue L19;
                                      }
                                    }
                                  }
                                }
                                var6++;
                                continue L6;
                              }
                            }
                          } else {
                            param1.a(var4_ref.field_v, var4_ref.field_u, -4900);
                            var4_ref = (qa) ((Object) this.field_q.a((byte) -71));
                            continue L5;
                          }
                        }
                      } else {
                        if (!this.field_o.field_h) {
                          break L4;
                        } else {
                          if (this.field_x instanceof qg) {
                            break L4;
                          } else {
                            var21 = new int[4];
                            var19 = var21;
                            var5 = var19;
                            var18 = this.field_v;
                            var9 = 0;
                            if (var18.length <= var9) {
                              break L4;
                            } else {
                              var10 = var18[var9];
                              if ((1 << var10.field_x & this.field_w) == 0) {
                                var7 = 0;
                                var11 = 0;
                                L21: while (true) {
                                  if ((var11 ^ -1) <= -5) {
                                    L22: while (true) {
                                      L23: {
                                        var6 = 0;
                                        if (this.field_o.field_i) {
                                          var20 = var10.field_m;
                                          var12 = 0;
                                          L24: while (true) {
                                            if (var12 >= 4) {
                                              break L23;
                                            } else {
                                              L25: {
                                                var5[var12] = var20.field_u[var12];
                                                if (var21[var12] <= var7) {
                                                  break L25;
                                                } else {
                                                  var7 = var21[var12];
                                                  break L25;
                                                }
                                              }
                                              var5[var12] = var5[var12] + 1;
                                              var6 = var6 + var21[var12];
                                              var12++;
                                              continue L24;
                                            }
                                          }
                                        } else {
                                          var11_ref_sd = (sd) ((Object) var10.field_i.d(0));
                                          L26: while (true) {
                                            if (var11_ref_sd == null) {
                                              var12 = 0;
                                              L27: while (true) {
                                                if (-5 >= (var12 ^ -1)) {
                                                  break L23;
                                                } else {
                                                  var5[var12] = var5[var12] + 1;
                                                  var6 = var6 + var21[var12];
                                                  var12++;
                                                  continue L27;
                                                }
                                              }
                                            } else {
                                              var12 = 0;
                                              L28: while (true) {
                                                if ((var12 ^ -1) <= -5) {
                                                  var11_ref_sd = (sd) ((Object) var10.field_i.a((byte) -71));
                                                  continue L26;
                                                } else {
                                                  L29: {
                                                    var5[var12] = var5[var12] + var11_ref_sd.field_u[var12];
                                                    if (var21[var12] > var7) {
                                                      var7 = var21[var12];
                                                      break L29;
                                                    } else {
                                                      break L29;
                                                    }
                                                  }
                                                  var12++;
                                                  continue L28;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      this.field_L.setSeed((long)(1 + var10.field_x ^ param2));
                                      var11 = qf.a((byte) 81, var6, this.field_L);
                                      var12 = 0;
                                      L30: while (true) {
                                        L31: {
                                          if (4 <= var12) {
                                            break L31;
                                          } else {
                                            if (var21[var12] <= var11) {
                                              var11 = var11 - var21[var12];
                                              var12++;
                                              continue L30;
                                            } else {
                                              if ((var10.field_u[var12] ^ -1) > -6) {
                                                var10.field_u[var12] = var10.field_u[var12] + 1;
                                                break L31;
                                              } else {
                                                if (var10.field_q != null) {
                                                  var10.field_q.field_d = var10.field_q.field_d + 1;
                                                  break L31;
                                                } else {
                                                  break L31;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        L32: while (true) {
                                          var9++;
                                          if (var18.length <= var9) {
                                            break L4;
                                          } else {
                                            var10 = var18[var9];
                                            if ((1 << var10.field_x & this.field_w) == 0) {
                                              var7 = 0;
                                              var11 = 0;
                                              L33: while (true) {
                                                if ((var11 ^ -1) <= -5) {
                                                  continue L22;
                                                } else {
                                                  var21[var11] = 0;
                                                  var11++;
                                                  continue L33;
                                                }
                                              }
                                            } else {
                                              continue L32;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var21[var11] = 0;
                                    var11++;
                                    continue L21;
                                  }
                                }
                              } else {
                                L34: while (true) {
                                  var9++;
                                  if (var18.length <= var9) {
                                    break L4;
                                  } else {
                                    var10 = var18[var9];
                                    if ((1 << var10.field_x & this.field_w) == 0) {
                                      var7 = 0;
                                      var11 = 0;
                                      L35: while (true) {
                                        if ((var11 ^ -1) <= -5) {
                                          L36: {
                                            var6 = 0;
                                            if (this.field_o.field_i) {
                                              var20 = var10.field_m;
                                              var12 = 0;
                                              L37: while (true) {
                                                if (var12 >= 4) {
                                                  break L36;
                                                } else {
                                                  L38: {
                                                    var5[var12] = var20.field_u[var12];
                                                    if (var21[var12] <= var7) {
                                                      break L38;
                                                    } else {
                                                      var7 = var21[var12];
                                                      break L38;
                                                    }
                                                  }
                                                  var5[var12] = var5[var12] + 1;
                                                  var6 = var6 + var21[var12];
                                                  var12++;
                                                  continue L37;
                                                }
                                              }
                                            } else {
                                              var11_ref_sd = (sd) ((Object) var10.field_i.d(0));
                                              L39: while (true) {
                                                if (var11_ref_sd == null) {
                                                  var12 = 0;
                                                  L40: while (true) {
                                                    if (-5 >= (var12 ^ -1)) {
                                                      break L36;
                                                    } else {
                                                      var5[var12] = var5[var12] + 1;
                                                      var6 = var6 + var21[var12];
                                                      var12++;
                                                      continue L40;
                                                    }
                                                  }
                                                } else {
                                                  var12 = 0;
                                                  L41: while (true) {
                                                    if ((var12 ^ -1) <= -5) {
                                                      var11_ref_sd = (sd) ((Object) var10.field_i.a((byte) -71));
                                                      continue L39;
                                                    } else {
                                                      L42: {
                                                        var5[var12] = var5[var12] + var11_ref_sd.field_u[var12];
                                                        if (var21[var12] > var7) {
                                                          var7 = var21[var12];
                                                          break L42;
                                                        } else {
                                                          break L42;
                                                        }
                                                      }
                                                      var12++;
                                                      continue L41;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          this.field_L.setSeed((long)(1 + var10.field_x ^ param2));
                                          var11 = qf.a((byte) 81, var6, this.field_L);
                                          var12 = 0;
                                          L43: while (true) {
                                            if (4 <= var12) {
                                              continue L34;
                                            } else {
                                              if (var21[var12] <= var11) {
                                                var11 = var11 - var21[var12];
                                                var12++;
                                                continue L43;
                                              } else {
                                                if ((var10.field_u[var12] ^ -1) > -6) {
                                                  var10.field_u[var12] = var10.field_u[var12] + 1;
                                                  continue L34;
                                                } else {
                                                  if (var10.field_q != null) {
                                                    var10.field_q.field_d = var10.field_q.field_d + 1;
                                                    continue L34;
                                                  } else {
                                                    continue L34;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var21[var11] = 0;
                                          var11++;
                                          continue L35;
                                        }
                                      }
                                    } else {
                                      continue L34;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    L44: {
                      var15 = var14[var6];
                      if (!this.field_o.field_i) {
                        var8 = (sd) ((Object) var15.field_i.d(0));
                        L45: while (true) {
                          if (var8 == null) {
                            break L44;
                          } else {
                            L46: {
                              if (0 < var8.field_x) {
                                var8.field_q.field_x = var8.field_q.field_x + var8.field_x;
                                break L46;
                              } else {
                                break L46;
                              }
                            }
                            var8 = (sd) ((Object) var15.field_i.a((byte) -71));
                            continue L45;
                          }
                        }
                      } else {
                        var8_ref = var15.field_m;
                        if (((sd) ((Object) var8_ref)).field_x > 0) {
                          ((sd) ((Object) var8_ref)).field_q.field_x = ((sd) ((Object) var8_ref)).field_q.field_x + ((sd) ((Object) var8_ref)).field_x;
                          break L44;
                        } else {
                          break L44;
                        }
                      }
                    }
                    var6++;
                    continue L2;
                  }
                }
              } else {
                L47: {
                  if (this.field_o.field_i) {
                    var4_ref.field_u.field_y.field_m.field_x = var4_ref.field_u.field_y.field_m.field_x - var4_ref.field_v;
                    break L47;
                  } else {
                    var4_ref.field_u.field_R.field_x = var4_ref.field_u.field_R.field_x - var4_ref.field_v;
                    break L47;
                  }
                }
                var4_ref.field_u.field_x = var4_ref.field_u.field_x + var4_ref.field_v;
                var4_ref = (qa) ((Object) this.field_q.a((byte) -71));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L48: {
            var4 = decompiledCaughtException;
            stackOut_83_0 = (RuntimeException) (var4);
            stackOut_83_1 = new StringBuilder().append("dc.IA(").append(param0).append(',');
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param1 == null) {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L48;
            } else {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L48;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ',' + param2 + ')');
        }
    }

    final static void d(int param0) {
        try {
            Exception var1 = null;
            java.lang.reflect.Method var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object[] var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 == 22943) {
                    break L1;
                  } else {
                    field_a = (String) null;
                    break L1;
                  }
                }
                L2: {
                  var1_ref = Runtime.class.getMethod("maxMemory", new Class[]{});
                  if (var1_ref == null) {
                    break L2;
                  } else {
                    try {
                      L3: {
                        var2_ref = Runtime.getRuntime();
                        var4 = (Object[]) null;
                        var3 = (Long) (var1_ref.invoke((Object) (var2_ref), (Object[]) null));
                        re.field_a = 1 + (int)(var3.longValue() / 1048576L);
                        break L3;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L4: {
                        var2 = decompiledCaughtException;
                        break L4;
                      }
                    }
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var1 = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, boolean param2) {
        if (param2) {
            this.field_f = 124;
        }
        this.field_G = param1;
        this.field_n = param0;
    }

    private final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            this.field_g = (l) null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= this.field_C) {
            return;
          } else {
            if (this.field_H[var2] != 0) {
              var2++;
              continue L1;
            } else {
              this.c(var2, -40);
              continue L1;
            }
          }
        }
    }

    final boolean a(ln param0, ln param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param2 == -1) {
              L1: {
                L2: {
                  if (this.field_o.field_b == 0) {
                    break L2;
                  } else {
                    if (this.field_o.field_b < this.field_g.field_h[param0.field_p][param1.field_p]) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L1;
              }
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
          L3: {
            var4 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var4);
            stackOut_9_1 = new StringBuilder().append("dc.T(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_8_0 != 0;
        }
    }

    private final void c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 <= -15) {
            break L0;
          } else {
            this.b((byte) -59);
            break L0;
          }
        }
        var3 = this.field_K[param0];
        this.field_C = this.field_C - 1;
        this.field_K[param0] = this.field_K[this.field_C];
        this.field_t[param0] = this.field_t[this.field_C];
        this.field_H[param0] = this.field_H[this.field_C];
        var4 = 0;
        L1: while (true) {
          if (var4 >= this.field_C) {
            return;
          } else {
            var5 = 0;
            L2: while (true) {
              if (var5 >= this.field_H[var4]) {
                var4++;
                continue L1;
              } else {
                if (var3 == this.field_t[var4][var5]) {
                  this.field_H[var4] = this.field_H[var4] - 1;
                  this.field_t[var4][var5] = this.field_t[var4][this.field_H[var4]];
                  var5++;
                  continue L2;
                } else {
                  var5++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final void c(int param0) {
        fs[] var2 = null;
        int var3 = 0;
        fs var4 = null;
        sd var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = this.field_v;
        var3 = param0;
        L0: while (true) {
          if (var2.length <= var3) {
            return;
          } else {
            var4 = var2[var3];
            if (this.field_o.field_i) {
              vf.a(127, var4.field_m);
              var3++;
              continue L0;
            } else {
              var5 = (sd) ((Object) var4.field_i.d(0));
              L1: while (true) {
                if (var5 != null) {
                  vf.a(127, var5);
                  var5 = (sd) ((Object) var4.field_i.a((byte) -71));
                  continue L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    public static void e(byte param0) {
        field_F = null;
        int var1 = -53 % ((70 - param0) / 38);
        field_l = null;
        field_a = null;
        field_c = null;
        field_E = null;
        field_s = null;
    }

    final void b(int param0) {
        int var2_int = 0;
        ln[] var2 = null;
        fs var3_ref_fs = null;
        int var3 = 0;
        sd var4 = null;
        int var5 = 0;
        ln[] var6 = null;
        ln var7 = null;
        ln var8 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 <= -2) {
          var2_int = 0;
          L0: while (true) {
            if (this.field_r <= var2_int) {
              var6 = this.field_g.field_e;
              var2 = var6;
              var3 = 0;
              L1: while (true) {
                if (var3 >= var6.length) {
                  this.field_m = nf.a(this.field_D, 3718);
                  return;
                } else {
                  var7 = var6[var3];
                  var8 = var7;
                  if (var8.field_y != null) {
                    this.field_D[var7.field_y.field_x] = this.field_D[var7.field_y.field_x] + var7.field_x;
                    var3++;
                    continue L1;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              var3_ref_fs = this.field_v[var2_int];
              this.field_D[var2_int] = 0;
              if (!this.field_o.field_i) {
                var4 = (sd) ((Object) var3_ref_fs.field_i.d(0));
                L2: while (true) {
                  if (var4 != null) {
                    this.field_D[var2_int] = this.field_D[var2_int] + var4.field_r;
                    var4 = (sd) ((Object) var3_ref_fs.field_i.a((byte) -71));
                    continue L2;
                  } else {
                    var2_int++;
                    continue L0;
                  }
                }
              } else {
                this.field_D[var2_int] = var3_ref_fs.field_m.field_r;
                var2_int++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final void a(ob param0, fs param1, boolean param2) throws jn, kr {
        RuntimeException var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
              this.field_g = uk.a(this.field_M, (dc) (this), param0, this.field_A, this.field_v, param1, (byte) -7, this.field_o);
              if (!param2) {
                break L1;
              } else {
                this.field_L = (Random) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var4);
            stackOut_3_1 = new StringBuilder().append("dc.KA(");
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
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == 15) {
            break L0;
          } else {
            this.field_h = (int[]) null;
            break L0;
          }
        }
        L1: while (true) {
          if (1 >= this.field_C) {
            return;
          } else {
            var2 = 0;
            var3 = this.field_L.nextInt();
            var4 = 1;
            L2: while (true) {
              if (var4 >= this.field_C) {
                L3: {
                  var2 = this.field_K[var2];
                  this.field_u[var2] = this.field_u[var2] - 1;
                  if (0 != this.field_u[var2] - 1) {
                    break L3;
                  } else {
                    this.c(this.a((byte) 94, var2), -119);
                    break L3;
                  }
                }
                if ((this.field_u[var2] ^ -1) <= -1) {
                  continue L1;
                } else {
                  throw new RuntimeException();
                }
              } else {
                var5 = this.field_L.nextInt();
                if (var5 > var3) {
                  var3 = var5;
                  var2 = var4;
                  var4++;
                  continue L2;
                } else {
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, boolean[][] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.field_t = new int[1 + this.field_r][this.field_r];
            var3_int = 0;
            L1: while (true) {
              if (this.field_C <= var3_int) {
                var3_int = 0;
                L2: while (true) {
                  if (var3_int >= this.field_C) {
                    if (param0 == -114) {
                      this.a(false);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  } else {
                    var4 = this.field_K[var3_int];
                    var5 = var3_int + 1;
                    L3: while (true) {
                      if (var5 >= this.field_C) {
                        var3_int++;
                        continue L2;
                      } else {
                        L4: {
                          L5: {
                            var6 = this.field_K[var5];
                            if (var4 == this.field_r) {
                              break L5;
                            } else {
                              if (var6 == this.field_r) {
                                break L5;
                              } else {
                                if (param1[var4][var6]) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          this.field_H[var3_int] = this.field_H[var3_int] + 1;
                          this.field_t[var3_int][this.field_H[var3_int]] = var6;
                          this.field_H[var5] = this.field_H[var5] + 1;
                          this.field_t[var5][this.field_H[var5]] = var4;
                          break L4;
                        }
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                this.field_H[var3_int] = 0;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("dc.GB(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1) {
        this.field_z = true;
        this.field_k = param0;
        if (param1 != 3) {
            this.c(-66);
        }
    }

    final void a(int param0, int param1, k param2, se param3) {
        boolean[] array$1 = null;
        RuntimeException var5 = null;
        boolean[][] var5_array = null;
        int var6_int = 0;
        Object var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        ln[] var10_ref_ln__ = null;
        int var10 = 0;
        int var11 = 0;
        ln var12_ref_ln = null;
        int var12 = 0;
        int var13 = 0;
        ln[] var14 = null;
        ln var15 = null;
        boolean[][] var16 = null;
        ln[] var17 = null;
        boolean[][] var18 = null;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var18 = new boolean[this.field_r][];
              var16 = var18;
              var5_array = var16;
              if (this.field_o.field_j) {
                var6_int = 0;
                L2: while (true) {
                  if (var6_int >= this.field_r) {
                    break L1;
                  } else {
                    var5_array[var6_int] = this.field_v[var6_int].field_h;
                    var6_int++;
                    continue L2;
                  }
                }
              } else {
                var6_int = 0;
                L3: while (true) {
                  if (this.field_r <= var6_int) {
                    break L1;
                  } else {
                    array$1 = new boolean[this.field_r];
                    var5_array[var6_int] = array$1;
                    var6_int++;
                    continue L3;
                  }
                }
              }
            }
            L4: {
              this.a(true, param2, param0);
              if (param3 == null) {
                break L4;
              } else {
                var6_int = 0;
                L5: while (true) {
                  if (this.field_r <= var6_int) {
                    var14 = this.field_g.field_e;
                    var7 = 0;
                    L6: while (true) {
                      if (var7 >= var14.length) {
                        break L4;
                      } else {
                        L7: {
                          var15 = var14[var7];
                          if (var15.field_y != null) {
                            param3.field_l[var15.field_y.field_x] = param3.field_l[var15.field_y.field_x] + var15.field_x;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var7++;
                        continue L6;
                      }
                    }
                  } else {
                    param3.field_l[var6_int] = 0;
                    param3.field_b[var6_int] = 0;
                    param3.field_f[var6_int] = 0;
                    param3.field_h[var6_int] = 0;
                    var6_int++;
                    continue L5;
                  }
                }
              }
            }
            L8: {
              this.a(param2, 82, param3);
              this.a(param1 + 12268, param2, var18, param3, param0);
              this.a(param2, param0, 14389);
              this.a(param3, param0, 7377, param2);
              this.a(param1, param2);
              this.e(0);
              this.a(param2, 0);
              this.h(param1 ^ -6);
              if (param3 != null) {
                var6_int = 0;
                L9: while (true) {
                  if (var6_int >= this.field_r) {
                    var6 = null;
                    var7 = 1;
                    var8 = null;
                    var9 = 1;
                    var10_ref_ln__ = this.field_g.field_e;
                    var11 = 0;
                    L10: while (true) {
                      if (var10_ref_ln__.length <= var11) {
                        L11: {
                          if (var7 == 0) {
                            break L11;
                          } else {
                            if (4 <= this.field_r) {
                              param3.field_j[((fs) (var6)).field_x][21] = true;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (var9 == 0) {
                            break L12;
                          } else {
                            if ((this.field_r ^ -1) > -5) {
                              break L12;
                            } else {
                              if (!(this.field_x instanceof hp)) {
                                break L12;
                              } else {
                                param3.field_j[((fs) (var8)).field_x][19] = true;
                                break L12;
                              }
                            }
                          }
                        }
                        var10 = 0;
                        L13: while (true) {
                          if (var10 >= this.field_v.length) {
                            break L8;
                          } else {
                            var11 = 1;
                            var12 = 0;
                            L14: while (true) {
                              L15: {
                                if (-5 >= (var12 ^ -1)) {
                                  break L15;
                                } else {
                                  if (!param3.field_d[var10][var12]) {
                                    var11 = 0;
                                    break L15;
                                  } else {
                                    var12++;
                                    continue L14;
                                  }
                                }
                              }
                              L16: {
                                if (var11 == 0) {
                                  break L16;
                                } else {
                                  param3.field_j[var10][24] = true;
                                  break L16;
                                }
                              }
                              var10++;
                              continue L13;
                            }
                          }
                        }
                      } else {
                        L17: {
                          var12_ref_ln = var10_ref_ln__[var11];
                          if (-3 != (var12_ref_ln.field_L ^ -1)) {
                            break L17;
                          } else {
                            L18: {
                              if (var9 != 0) {
                                stackOut_33_0 = 0;
                                stackIn_34_0 = stackOut_33_0;
                                break L18;
                              } else {
                                stackOut_32_0 = 1;
                                stackIn_34_0 = stackOut_32_0;
                                break L18;
                              }
                            }
                            if (stackIn_34_0 == 1) {
                              break L17;
                            } else {
                              if (var12_ref_ln.field_y != null) {
                                if (var8 == null) {
                                  var8 = var12_ref_ln.field_y;
                                  break L17;
                                } else {
                                  if (var12_ref_ln.field_y != var8) {
                                    var9 = 0;
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                              } else {
                                var9 = 0;
                                break L17;
                              }
                            }
                          }
                        }
                        if (var12_ref_ln.field_L == 3) {
                          if (var7 != 0) {
                            L19: {
                              if (null == var12_ref_ln.field_y) {
                                var7 = 0;
                                break L19;
                              } else {
                                if (var6 != null) {
                                  if (var6 != var12_ref_ln.field_y) {
                                    var7 = 0;
                                    break L19;
                                  } else {
                                    break L19;
                                  }
                                } else {
                                  var6 = var12_ref_ln.field_y;
                                  break L19;
                                }
                              }
                            }
                            var11++;
                            continue L10;
                          } else {
                            var11++;
                            continue L10;
                          }
                        } else {
                          var11++;
                          continue L10;
                        }
                      }
                    }
                  } else {
                    L20: {
                      if (-2 < (param3.field_f[var6_int] ^ -1)) {
                        break L20;
                      } else {
                        break L20;
                      }
                    }
                    L21: {
                      if (param3.field_h[var6_int] == 4) {
                        param3.field_j[var6_int][22] = true;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    var6_int++;
                    continue L9;
                  }
                }
              } else {
                break L8;
              }
            }
            var17 = this.field_g.field_e;
            var7 = 0;
            L22: while (true) {
              if (var17.length <= var7) {
                this.b(-60);
                this.field_O = this.field_O + 1;
                this.field_g.b((byte) 80);
                break L0;
              } else {
                var8 = var17[var7];
                ((ln) (var8)).field_Q = 0;
                ((ln) (var8)).field_C = 0;
                var7++;
                continue L22;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var5 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) (var5);
            stackOut_78_1 = new StringBuilder().append("dc.E(").append(param0).append(',').append(param1).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param2 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L23;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L23;
            }
          }
          L24: {
            stackOut_81_0 = (RuntimeException) ((Object) stackIn_81_0);
            stackOut_81_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',');
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param3 == null) {
              stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
              stackOut_83_1 = (StringBuilder) ((Object) stackIn_83_1);
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L24;
            } else {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L24;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_84_0), stackIn_84_2 + ')');
        }
    }

    private final void a(k param0, int param1, se param2) {
        RuntimeException var4 = null;
        qm var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 40) {
                break L1;
              } else {
                this.b((byte) 111);
                break L1;
              }
            }
            if (!this.field_o.field_h) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4_ref = (qm) ((Object) this.field_i.d(0));
              L2: while (true) {
                if (var4_ref == null) {
                  var4_ref = (qm) ((Object) this.field_i.d(0));
                  L3: while (true) {
                    if (var4_ref == null) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L4: {
                        if (var4_ref.field_o == 2) {
                          if (var4_ref.field_q.field_y == var4_ref.field_p) {
                            break L4;
                          } else {
                            L5: {
                              if (null == var4_ref.field_q.field_y) {
                                break L5;
                              } else {
                                if (var4_ref.field_p.field_h[var4_ref.field_q.field_y.field_x]) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              var4_ref.field_p.field_u[2] = 0;
                              var5 = this.b((byte) 95, var4_ref.field_q);
                              if (param0 == null) {
                                break L6;
                              } else {
                                param0.a(var5, var4_ref.field_q, var4_ref.field_p, -81);
                                break L6;
                              }
                            }
                            if (param2 != null) {
                              param2.field_b[var4_ref.field_p.field_x] = param2.field_b[var4_ref.field_p.field_x] + var5;
                              param2.field_h[var4_ref.field_p.field_x] = param2.field_h[var4_ref.field_p.field_x] + 1;
                              if (-1 <= (this.field_O ^ -1)) {
                                break L4;
                              } else {
                                L7: {
                                  if (-3 == (ab.field_c[this.field_G] ^ -1)) {
                                    break L7;
                                  } else {
                                    if (lr.field_b[this.field_n] != 2) {
                                      break L4;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                param2.field_d[var4_ref.field_p.field_x][2] = true;
                                break L4;
                              }
                            } else {
                              break L4;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      L8: {
                        if (var4_ref.field_o != 2) {
                          var4_ref.field_p.field_u[var4_ref.field_o] = 0;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      var4_ref = (qm) ((Object) this.field_i.a((byte) -71));
                      continue L3;
                    }
                  }
                } else {
                  if (0 == var4_ref.field_o) {
                    L9: {
                      this.a(var4_ref.field_q, true);
                      if (param0 != null) {
                        param0.a(0, var4_ref.field_q, var4_ref.field_p);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param2 == null) {
                        break L10;
                      } else {
                        param2.field_h[var4_ref.field_p.field_x] = param2.field_h[var4_ref.field_p.field_x] + 1;
                        if ((this.field_O ^ -1) >= -1) {
                          break L10;
                        } else {
                          L11: {
                            if (0 == ab.field_c[this.field_G]) {
                              break L11;
                            } else {
                              if (lr.field_b[this.field_n] == 0) {
                                break L11;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param2.field_d[var4_ref.field_p.field_x][0] = true;
                          break L10;
                        }
                      }
                    }
                    var4_ref = (qm) ((Object) this.field_i.a((byte) -71));
                    continue L2;
                  } else {
                    var4_ref = (qm) ((Object) this.field_i.a((byte) -71));
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var4);
            stackOut_42_1 = new StringBuilder().append("dc.HB(");
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param0 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L12;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L12;
            }
          }
          L13: {
            stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
            stackOut_45_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(',').append(param1).append(',');
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param2 == null) {
              stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
              stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L13;
            } else {
              stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackOut_46_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L13;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_48_0), stackIn_48_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, l param1) {
        RuntimeException var3 = null;
        qa var3_ref = null;
        mg var4 = null;
        qm var5 = null;
        cs var6 = null;
        int var7 = 0;
        se var8 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.field_g = param1;
            var3_ref = (qa) ((Object) this.field_q.d(0));
            L1: while (true) {
              if (var3_ref == null) {
                L2: {
                  if (param0 > 55) {
                    break L2;
                  } else {
                    var8 = (se) null;
                    this.a(-110, -110, (k) null, (se) null);
                    break L2;
                  }
                }
                var4 = (mg) ((Object) this.field_p.a(true));
                L3: while (true) {
                  if (var4 == null) {
                    var5 = (qm) ((Object) this.field_i.d(0));
                    L4: while (true) {
                      if (var5 == null) {
                        var6 = (cs) ((Object) this.field_A.d(0));
                        L5: while (true) {
                          if (var6 == null) {
                            break L0;
                          } else {
                            var6.field_n = this.field_g.field_e[var6.field_n.field_p];
                            var6.field_k = this.field_g.field_e[var6.field_k.field_p];
                            var6 = (cs) ((Object) this.field_A.a((byte) -71));
                            continue L5;
                          }
                        }
                      } else {
                        L6: {
                          var5.field_q = this.field_g.field_e[var5.field_q.field_p];
                          if (var5.field_r == null) {
                            break L6;
                          } else {
                            var5.field_r = this.field_g.field_e[var5.field_r.field_p];
                            break L6;
                          }
                        }
                        var5 = (qm) ((Object) this.field_i.a((byte) -71));
                        continue L4;
                      }
                    }
                  } else {
                    var4.field_y = this.field_g.field_e[var4.field_y.field_p];
                    var4.field_B = this.field_g.field_e[var4.field_B.field_p];
                    var4.field_B.field_s.a(var4, 32);
                    var4.field_y.field_T.a((byte) -113, var4);
                    var4 = (mg) ((Object) this.field_p.a((byte) -68));
                    continue L3;
                  }
                }
              } else {
                var3_ref.field_u = this.field_g.field_e[var3_ref.field_u.field_p];
                var3_ref = (qa) ((Object) this.field_q.a((byte) -71));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("dc.G(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
    }

    private final void h(int param0) {
        fs[] var3 = null;
        fs[] var2 = null;
        if (param0 != -5) {
            this.field_t = (int[][]) null;
        }
        if (!this.field_x.a((dc) (this), (byte) 121)) {
        } else {
            var3 = this.field_x.a((byte) -23);
            var2 = var3;
            if (!(var2 != null)) {
                throw new RuntimeException("VictoryChecker claims someone has won, but winners array is null.");
            }
            if ((var3.length ^ -1) != -2) {
                this.a(-1, param0 + 8);
            } else {
                this.a(var2[0].field_x, param0 + 8);
            }
        }
    }

    private final void a(ln param0, eg param1, int param2) {
        mg var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        se var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == -30724) {
                break L1;
              } else {
                var9 = (se) null;
                this.a(-115, 106, (k) null, (se) null);
                break L1;
              }
            }
            var4 = (mg) ((Object) param0.field_s.c(-127));
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                L3: {
                  if (var4.field_G == param0.field_y) {
                    break L3;
                  } else {
                    L4: {
                      var5 = this.field_h[var4.field_G.field_x];
                      var6 = this.field_u[var4.field_G.field_x];
                      var7 = var6 * var4.field_z / var5;
                      if (0 == var7) {
                        break L4;
                      } else {
                        if (param1 == null) {
                          break L4;
                        } else {
                          param1.a(var7, 0, var4, 0);
                          break L4;
                        }
                      }
                    }
                    var4.field_y.field_C = var4.field_y.field_C + var7;
                    break L3;
                  }
                }
                var4 = (mg) ((Object) param0.field_s.b(32));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4_ref);
            stackOut_12_1 = new StringBuilder().append("dc.SA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    final static gl[] a(qb param0, byte param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        gl[] var4 = null;
        int var5 = 0;
        gl var6 = null;
        int var7 = 0;
        pb var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        gl[] stackIn_3_0 = null;
        gl[] stackIn_10_0 = null;
        gl[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        gl[] stackOut_9_0 = null;
        gl[] stackOut_16_0 = null;
        gl[] stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0.a(false)) {
              var8 = param0.a(12);
              L1: while (true) {
                if (0 != var8.field_d) {
                  if (-3 == (var8.field_d ^ -1)) {
                    stackOut_9_0 = new gl[]{};
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      var10 = (int[]) (var8.field_e);
                      var9 = var10;
                      var3 = var9;
                      var4 = new gl[var10.length >> -15069310];
                      if (param1 == -57) {
                        break L2;
                      } else {
                        field_a = (String) null;
                        break L2;
                      }
                    }
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        stackOut_16_0 = (gl[]) (var4);
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new gl();
                        var4[var5] = var6;
                        var6.field_g = var3[var5 << -1256726494];
                        var6.field_c = var3[1 + (var5 << 1441498786)];
                        var6.field_d = var3[(var5 << -345979870) - -2];
                        var6.field_f = var3[(var5 << -551306014) - -3];
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  jb.a((byte) -100, 10L);
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = new gl[]{};
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var2);
            stackOut_18_1 = new StringBuilder().append("dc.AA(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L4;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    private final void a(int param0, ln param1) {
        try {
            if (param0 != -21031) {
                this.field_n = 59;
            }
            this.a((byte) 98, param1);
            param1.field_y = null;
            param1.field_N = 0;
            param1.field_x = 0;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "dc.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(byte param0) {
        if (param0 >= -3) {
            return (String) null;
        }
        if (!(0 < this.field_O)) {
            return ek.field_H;
        }
        return re.a(tq.field_i, 4371, new String[]{re.a(eg.field_x[this.field_G], 4371, new String[]{ur.field_Bb[this.field_n]})});
    }

    final static void a(int param0) {
        tk.field_z = pr.a(14274);
        vj.field_C = 0;
        if (param0 != -5883) {
            dc.e((byte) 95);
        }
    }

    private final void a(int param0, k param1, boolean[][] param2, se param3, int param4) {
        ln[] var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        ln[] var10 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var10 = this.field_g.field_e;
            var6 = var10;
            var7 = 0;
            L1: while (true) {
              if (var10.length <= var7) {
                L2: {
                  if (param0 == 12269) {
                    break L2;
                  } else {
                    this.field_k = -29;
                    break L2;
                  }
                }
                break L0;
              } else {
                var8 = var10[var7];
                this.a(param4, var8, param3, param1, param2, (byte) 77);
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6_ref);
            stackOut_7_1 = new StringBuilder().append("dc.AB(").append(param0).append(',');
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
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
    }

    private final void a(fs param0, ln param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        ln[] var4_array = null;
        int var5 = 0;
        ln var6 = null;
        int var7 = 0;
        ln[] var8 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1.field_y == param0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param1.field_y = param0;
                if (param0 == param1.field_t) {
                  break L1;
                } else {
                  if (param1.field_G[0] < 0) {
                    break L1;
                  } else {
                    var4_int = 0;
                    L2: while (true) {
                      if (var4_int >= 4) {
                        break L1;
                      } else {
                        param0.field_u[var4_int] = param0.field_u[var4_int] + param1.field_G[var4_int];
                        if (5 < param0.field_u[var4_int] + param1.field_G[var4_int]) {
                          L3: {
                            if (null == param0.field_q) {
                              break L3;
                            } else {
                              param0.field_q.field_d = param0.field_q.field_d + (param0.field_u[var4_int] + -5);
                              break L3;
                            }
                          }
                          param0.field_u[var4_int] = 5;
                          var4_int++;
                          continue L2;
                        } else {
                          var4_int++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
              L4: {
                if (null != param1.field_R) {
                  this.a((byte) 122, param1);
                  break L4;
                } else {
                  break L4;
                }
              }
              this.b(param2, param1);
              this.a(param1, false, (byte) 117);
              var8 = param1.field_D;
              var4_array = var8;
              var5 = 0;
              L5: while (true) {
                if (var8.length <= var5) {
                  L6: {
                    param1.field_y.field_m.a(-21771, param1);
                    if (null != param1.field_y.field_m.field_q) {
                      break L6;
                    } else {
                      param1.field_y.field_m.field_q = param1;
                      break L6;
                    }
                  }
                  sh.a(param1.field_y.field_m, -5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var6 = var8[var5];
                  this.a(var6, false, (byte) 119);
                  var5++;
                  continue L5;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var4);
            stackOut_23_1 = new StringBuilder().append("dc.VA(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean[][] b(int param0, int param1) {
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        boolean[][] var3 = new boolean[this.field_r][this.field_r];
        int var4 = -2 + this.field_r;
        if (param1 != 0) {
            return (boolean[][]) null;
        }
        while (0 <= var4) {
            for (var5 = this.field_r + -1; var5 > var4; var5--) {
                this.field_v[var4].field_h[var5] = we.a(param0, 1) != 0 ? true : false;
                param0 = param0 >> 1;
            }
            var4--;
        }
        return var3;
    }

    private final void a(int param0, eg param1, ln param2) {
        RuntimeException var4 = null;
        mg var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var9 = (ln) null;
                this.a((ln) null, 79, (ln) null);
                break L1;
              }
            }
            var4_ref = (mg) ((Object) param2.field_s.c(-128));
            L2: while (true) {
              if (var4_ref == null) {
                break L0;
              } else {
                L3: {
                  var5 = this.field_h[var4_ref.field_G.field_x];
                  var6 = this.field_B[var4_ref.field_G.field_x];
                  var7 = var6 * var4_ref.field_z / var5;
                  if (param2.field_y != var4_ref.field_G) {
                    break L3;
                  } else {
                    var7 = var4_ref.field_z * (-param2.field_x + var6) / var5;
                    break L3;
                  }
                }
                L4: {
                  if (-1 == (var7 ^ -1)) {
                    break L4;
                  } else {
                    if (param1 == null) {
                      break L4;
                    } else {
                      param1.a(var7, 0, var4_ref, 0);
                      break L4;
                    }
                  }
                }
                var4_ref.field_y.field_C = var4_ref.field_y.field_C + var7;
                var4_ref = (mg) ((Object) param2.field_s.b(32));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("dc.S(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
    }

    private final boolean a(byte param0, k param1, ln param2) {
        RuntimeException var4 = null;
        mg var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        k stackIn_17_0 = null;
        ln stackIn_17_1 = null;
        fs stackIn_17_2 = null;
        int stackIn_17_3 = 0;
        k stackIn_18_0 = null;
        ln stackIn_18_1 = null;
        fs stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        k stackIn_19_0 = null;
        ln stackIn_19_1 = null;
        fs stackIn_19_2 = null;
        int stackIn_19_3 = 0;
        int stackIn_19_4 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        k stackOut_16_0 = null;
        ln stackOut_16_1 = null;
        fs stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        k stackOut_18_0 = null;
        ln stackOut_18_1 = null;
        fs stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        int stackOut_18_4 = 0;
        k stackOut_17_0 = null;
        ln stackOut_17_1 = null;
        fs stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        int stackOut_17_4 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = -118 % ((-37 - param0) / 36);
            var7 = 0;
            L1: while (true) {
              if (this.field_r <= var7) {
                L2: {
                  var6 = 0;
                  if (null != param2.field_y) {
                    this.field_h[param2.field_y.field_x] = param2.field_x;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4_ref = (mg) ((Object) param2.field_s.c(-128));
                L3: while (true) {
                  if (var4_ref == null) {
                    L4: {
                      if (param1 == null) {
                        break L4;
                      } else {
                        var4_ref = (mg) ((Object) param2.field_s.c(-127));
                        L5: while (true) {
                          if (var4_ref == null) {
                            break L4;
                          } else {
                            L6: {
                              stackOut_16_0 = (k) (param1);
                              stackOut_16_1 = var4_ref.field_B;
                              stackOut_16_2 = var4_ref.field_G;
                              stackOut_16_3 = -62;
                              stackIn_18_0 = stackOut_16_0;
                              stackIn_18_1 = stackOut_16_1;
                              stackIn_18_2 = stackOut_16_2;
                              stackIn_18_3 = stackOut_16_3;
                              stackIn_17_0 = stackOut_16_0;
                              stackIn_17_1 = stackOut_16_1;
                              stackIn_17_2 = stackOut_16_2;
                              stackIn_17_3 = stackOut_16_3;
                              if (var4_ref.field_G == var4_ref.field_B.field_y) {
                                stackOut_18_0 = (k) ((Object) stackIn_18_0);
                                stackOut_18_1 = (ln) ((Object) stackIn_18_1);
                                stackOut_18_2 = (fs) ((Object) stackIn_18_2);
                                stackOut_18_3 = stackIn_18_3;
                                stackOut_18_4 = 0;
                                stackIn_19_0 = stackOut_18_0;
                                stackIn_19_1 = stackOut_18_1;
                                stackIn_19_2 = stackOut_18_2;
                                stackIn_19_3 = stackOut_18_3;
                                stackIn_19_4 = stackOut_18_4;
                                break L6;
                              } else {
                                stackOut_17_0 = (k) ((Object) stackIn_17_0);
                                stackOut_17_1 = (ln) ((Object) stackIn_17_1);
                                stackOut_17_2 = (fs) ((Object) stackIn_17_2);
                                stackOut_17_3 = stackIn_17_3;
                                stackOut_17_4 = 1;
                                stackIn_19_0 = stackOut_17_0;
                                stackIn_19_1 = stackOut_17_1;
                                stackIn_19_2 = stackOut_17_2;
                                stackIn_19_3 = stackOut_17_3;
                                stackIn_19_4 = stackOut_17_4;
                                break L6;
                              }
                            }
                            ((k) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2, (byte) stackIn_19_3, stackIn_19_4 != 0, var4_ref.field_z, var4_ref.field_y);
                            var4_ref = (mg) ((Object) param2.field_s.b(32));
                            continue L5;
                          }
                        }
                      }
                    }
                    var4_ref = (mg) ((Object) param2.field_T.d(0));
                    L7: while (true) {
                      if (var4_ref == null) {
                        stackOut_25_0 = var6;
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      } else {
                        L8: {
                          if (var4_ref.field_G == null) {
                            break L8;
                          } else {
                            this.field_h[var4_ref.field_G.field_x] = this.field_h[var4_ref.field_G.field_x] - var4_ref.field_z;
                            break L8;
                          }
                        }
                        var4_ref = (mg) ((Object) param2.field_T.a((byte) -71));
                        continue L7;
                      }
                    }
                  } else {
                    L9: {
                      if (var4_ref.field_G == null) {
                        break L9;
                      } else {
                        this.field_h[var4_ref.field_G.field_x] = this.field_h[var4_ref.field_G.field_x] + var4_ref.field_z;
                        if (param2.field_y == var4_ref.field_G) {
                          break L9;
                        } else {
                          var6 = 1;
                          break L9;
                        }
                      }
                    }
                    var4_ref = (mg) ((Object) param2.field_s.b(32));
                    continue L3;
                  }
                }
              } else {
                this.field_h[var7] = 0;
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var4);
            stackOut_27_1 = new StringBuilder().append("dc.RA(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L10;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L10;
            }
          }
          L11: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L11;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L11;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    final void a(int param0, byte param1, ob param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        fs var6_ref_fs = null;
        int var6 = 0;
        ln var8 = null;
        int var9 = 0;
        ln var10 = null;
        mg var11 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.g(-7954);
              if (param1 <= -121) {
                break L1;
              } else {
                this.field_g = (l) null;
                break L1;
              }
            }
            L2: while (true) {
              if (-1 <= (param0 ^ -1)) {
                break L0;
              } else {
                var4_int = param2.j(-70);
                param0--;
                if ((var4_int ^ -1) != -256) {
                  if (var4_int < 251) {
                    if (var4_int >= 192) {
                      var5 = -191 + var4_int;
                      param0 = param0 - 3 * var5;
                      var6 = 0;
                      L3: while (true) {
                        if (var5 <= var6) {
                          continue L2;
                        } else {
                          this.field_q.a((byte) -113, qj.a((byte) -85, (dc) (this), param2));
                          var6++;
                          continue L3;
                        }
                      }
                    } else {
                      var5 = 1 + var4_int;
                      var6 = 0;
                      L4: while (true) {
                        if (var6 >= var5) {
                          param0 = param0 - var5 * 4;
                          continue L2;
                        } else {
                          var11 = qq.a((dc) (this), 65, param2);
                          this.field_p.a((byte) 48, var11);
                          var11.field_y.field_T.a((byte) -113, var11);
                          var11.field_B.field_s.a(var11, 32);
                          var6++;
                          continue L4;
                        }
                      }
                    }
                  } else {
                    var5 = var4_int - 251;
                    var6_ref_fs = ur.a((dc) (this), 78, param2);
                    var10 = mg.a((dc) (this), param2, 20);
                    if ((var5 ^ -1) != -4) {
                      param0 -= 2;
                      this.field_i.a((byte) -113, new qm(var5, var6_ref_fs, var10));
                      continue L2;
                    } else {
                      var8 = mg.a((dc) (this), param2, 20);
                      this.field_i.a((byte) -113, new qm(var5, var6_ref_fs, var10, var8));
                      param0 -= 3;
                      continue L2;
                    }
                  }
                } else {
                  throw new RuntimeException();
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("dc.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    private final void a(ln param0, byte param1, Random param2) {
        int var4_int = 0;
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (0 < param0.field_L) {
            return;
        }
        try {
            if (param1 <= 100) {
                fs var6 = (fs) null;
                this.a((ob) null, (byte) -70, (fs) null);
            }
            for (var4_int = 0; var4_int < 4; var4_int++) {
                param0.field_G[var4_int] = 1;
            }
            dupTemp$0 = qf.a((byte) 109, 4, param2);
            param0.field_G[dupTemp$0] = param0.field_G[dupTemp$0] + 1;
            dupTemp$1 = qf.a((byte) 38, 4, param2);
            param0.field_G[dupTemp$1] = param0.field_G[dupTemp$1] + 1;
            param0.field_L = 1;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "dc.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, ln param1, se param2, k param3, boolean[][] param4, byte param5) {
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        fs[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        Object var12_ref = null;
        int var12 = 0;
        mg var12_ref_mg = null;
        int var13 = 0;
        int[] var14 = null;
        fs var15 = null;
        fs[] var16 = null;
        int[] var18 = null;
        int[] var20 = null;
        int[] var22 = null;
        int stackIn_16_0 = 0;
        fs[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        fs[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        fs[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        fs stackIn_56_2 = null;
        int stackIn_71_0 = 0;
        int stackIn_98_0 = 0;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        RuntimeException stackIn_139_0 = null;
        StringBuilder stackIn_139_1 = null;
        RuntimeException stackIn_140_0 = null;
        StringBuilder stackIn_140_1 = null;
        String stackIn_140_2 = null;
        RuntimeException stackIn_141_0 = null;
        StringBuilder stackIn_141_1 = null;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        RuntimeException stackIn_143_0 = null;
        StringBuilder stackIn_143_1 = null;
        String stackIn_143_2 = null;
        RuntimeException stackIn_144_0 = null;
        StringBuilder stackIn_144_1 = null;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        String stackIn_146_2 = null;
        RuntimeException stackIn_147_0 = null;
        StringBuilder stackIn_147_1 = null;
        RuntimeException stackIn_148_0 = null;
        StringBuilder stackIn_148_1 = null;
        RuntimeException stackIn_149_0 = null;
        StringBuilder stackIn_149_1 = null;
        String stackIn_149_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        fs[] stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        fs[] stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_55_2 = null;
        fs[] stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        fs stackOut_54_2 = null;
        int stackOut_96_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_66_0 = 0;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        RuntimeException stackOut_139_0 = null;
        StringBuilder stackOut_139_1 = null;
        String stackOut_139_2 = null;
        RuntimeException stackOut_138_0 = null;
        StringBuilder stackOut_138_1 = null;
        String stackOut_138_2 = null;
        RuntimeException stackOut_140_0 = null;
        StringBuilder stackOut_140_1 = null;
        RuntimeException stackOut_142_0 = null;
        StringBuilder stackOut_142_1 = null;
        String stackOut_142_2 = null;
        RuntimeException stackOut_141_0 = null;
        StringBuilder stackOut_141_1 = null;
        String stackOut_141_2 = null;
        RuntimeException stackOut_143_0 = null;
        StringBuilder stackOut_143_1 = null;
        RuntimeException stackOut_145_0 = null;
        StringBuilder stackOut_145_1 = null;
        String stackOut_145_2 = null;
        RuntimeException stackOut_144_0 = null;
        StringBuilder stackOut_144_1 = null;
        String stackOut_144_2 = null;
        RuntimeException stackOut_146_0 = null;
        StringBuilder stackOut_146_1 = null;
        RuntimeException stackOut_148_0 = null;
        StringBuilder stackOut_148_1 = null;
        String stackOut_148_2 = null;
        RuntimeException stackOut_147_0 = null;
        StringBuilder stackOut_147_1 = null;
        String stackOut_147_2 = null;
        var12_ref = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.a((byte) 38, param3, param1)) {
              L1: {
                if (param1.field_y != null) {
                  param1.field_x = this.field_h[param1.field_y.field_x];
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_L.setSeed((long)(param1.field_p ^ param0));
              this.field_C = 0;
              var8 = 0;
              L2: while (true) {
                if (this.field_r <= var8) {
                  L3: {
                    if (param1.field_y == null) {
                      stackOut_15_0 = this.field_r;
                      stackIn_16_0 = stackOut_15_0;
                      break L3;
                    } else {
                      stackOut_14_0 = param1.field_y.field_x;
                      stackIn_16_0 = stackOut_14_0;
                      break L3;
                    }
                  }
                  L4: {
                    var8 = stackIn_16_0;
                    if (param2 == null) {
                      break L4;
                    } else {
                      if (null == param1.field_y) {
                        break L4;
                      } else {
                        var9_int = 0;
                        L5: while (true) {
                          if (this.field_r <= var9_int) {
                            break L4;
                          } else {
                            L6: {
                              if (var9_int != var8) {
                                var10_int = this.field_h[var9_int];
                                if (var10_int == 0) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (param2.field_j[var9_int][0]) {
                                      break L7;
                                    } else {
                                      if ((var10_int ^ -1) > -51) {
                                        break L7;
                                      } else {
                                        if (95 * param2.field_l[var9_int] > 100 * var10_int) {
                                          break L7;
                                        } else {
                                          param2.field_j[var9_int][0] = true;
                                          break L7;
                                        }
                                      }
                                    }
                                  }
                                  L8: {
                                    if (param2.field_j[var9_int][1]) {
                                      break L8;
                                    } else {
                                      if (var10_int < 50) {
                                        break L8;
                                      } else {
                                        if (var10_int < param1.field_x * 10) {
                                          break L8;
                                        } else {
                                          param2.field_j[var9_int][1] = true;
                                          break L8;
                                        }
                                      }
                                    }
                                  }
                                  if (!param2.field_j[var9_int][9]) {
                                    if (null == param1.field_y) {
                                      break L6;
                                    } else {
                                      if (!param4[var9_int][var8]) {
                                        var11 = 0;
                                        L9: while (true) {
                                          if (this.field_C <= var11) {
                                            break L6;
                                          } else {
                                            L10: {
                                              var12 = this.field_K[var11];
                                              if (var9_int == var12) {
                                                break L10;
                                              } else {
                                                if (!param4[var9_int][var12]) {
                                                  break L10;
                                                } else {
                                                  if (param4[var8][var12]) {
                                                    break L10;
                                                  } else {
                                                    param2.field_j[var9_int][9] = true;
                                                    break L10;
                                                  }
                                                }
                                              }
                                            }
                                            var11++;
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        break L6;
                                      }
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            }
                            var9_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                  L11: {
                    if (param1.field_y == null) {
                      this.field_u[this.field_r] = param1.field_x;
                      if (0 < param1.field_x) {
                        fieldTemp$3 = this.field_C;
                        this.field_C = this.field_C + 1;
                        this.field_K[fieldTemp$3] = this.field_r;
                        break L11;
                      } else {
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    var9 = null;
                    if (param3 != null) {
                      var16 = new fs[this.field_C];
                      var10 = var16;
                      var11 = 0;
                      L13: while (true) {
                        if (var11 >= this.field_C) {
                          var9 = param3.a(this.field_u, param1, 0, var16);
                          break L12;
                        } else {
                          L14: {
                            var12 = this.field_K[var11];
                            stackOut_53_0 = (fs[]) (var10);
                            stackOut_53_1 = var11;
                            stackIn_55_0 = stackOut_53_0;
                            stackIn_55_1 = stackOut_53_1;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            if (this.field_r <= var12) {
                              stackOut_55_0 = (fs[]) ((Object) stackIn_55_0);
                              stackOut_55_1 = stackIn_55_1;
                              stackOut_55_2 = null;
                              stackIn_56_0 = stackOut_55_0;
                              stackIn_56_1 = stackOut_55_1;
                              stackIn_56_2 = (fs) ((Object) stackOut_55_2);
                              break L14;
                            } else {
                              stackOut_54_0 = (fs[]) ((Object) stackIn_54_0);
                              stackOut_54_1 = stackIn_54_1;
                              stackOut_54_2 = this.field_v[var12];
                              stackIn_56_0 = stackOut_54_0;
                              stackIn_56_1 = stackOut_54_1;
                              stackIn_56_2 = stackOut_54_2;
                              break L14;
                            }
                          }
                          stackIn_56_0[stackIn_56_1] = stackIn_56_2;
                          var11++;
                          continue L13;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                  L15: {
                    if (param1.field_u) {
                      this.field_u[var8] = this.field_u[var8] * 2;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    this.a((byte) -114, param4);
                    var20 = this.d((byte) 20);
                    var18 = var20;
                    var14 = var18;
                    var22 = var14;
                    if (var9 == null) {
                      break L16;
                    } else {
                      ((eg) (var9)).a((byte) 74, var22);
                      break L16;
                    }
                  }
                  L17: {
                    L18: {
                      L19: {
                        if (param2 != null) {
                          var11 = 0;
                          L20: while (true) {
                            if (this.field_r <= var11) {
                              L21: {
                                if (!param1.field_u) {
                                  break L21;
                                } else {
                                  L22: {
                                    var11 = this.field_u[var8] / 2;
                                    if (param1.field_y != null) {
                                      if (this.field_u[var8] > 0) {
                                        stackOut_96_0 = 1;
                                        stackIn_98_0 = stackOut_96_0;
                                        break L22;
                                      } else {
                                        stackOut_95_0 = 0;
                                        stackIn_98_0 = stackOut_95_0;
                                        break L22;
                                      }
                                    } else {
                                      stackOut_93_0 = 0;
                                      stackIn_98_0 = stackOut_93_0;
                                      break L22;
                                    }
                                  }
                                  L23: {
                                    var12 = stackIn_98_0;
                                    if (var12 > var11) {
                                      var11 = var12;
                                      break L23;
                                    } else {
                                      break L23;
                                    }
                                  }
                                  this.field_u[var8] = var11;
                                  break L21;
                                }
                              }
                              this.a((byte) -124, param1, (eg) (var9));
                              if (-1 > (this.field_u[var8] ^ -1)) {
                                L24: {
                                  param1.field_x = this.field_u[var8];
                                  this.a(param1, (eg) (var9), -30724);
                                  if (var9 == null) {
                                    break L24;
                                  } else {
                                    ((eg) (var9)).field_m = param1.field_R;
                                    ((eg) (var9)).field_i = param1.field_y;
                                    ((eg) (var9)).field_l = param1.field_x;
                                    break L24;
                                  }
                                }
                                if (param2 == null) {
                                  break L17;
                                } else {
                                  if (null == param1.field_y) {
                                    break L17;
                                  } else {
                                    if (!param2.field_j[var8][3]) {
                                      var11 = 0;
                                      var12_ref_mg = (mg) ((Object) param1.field_s.c(-127));
                                      L25: while (true) {
                                        if (var12_ref_mg == null) {
                                          break L18;
                                        } else {
                                          L26: {
                                            if (param1.field_y == var12_ref_mg.field_G) {
                                              break L26;
                                            } else {
                                              var11++;
                                              break L26;
                                            }
                                          }
                                          var12_ref_mg = (mg) ((Object) param1.field_s.b(32));
                                          continue L25;
                                        }
                                      }
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                              } else {
                                break L19;
                              }
                            } else {
                              param2.field_b[var11] = param2.field_b[var11] + var20[var11];
                              var11++;
                              continue L20;
                            }
                          }
                        } else {
                          L27: {
                            if (!param1.field_u) {
                              break L27;
                            } else {
                              L28: {
                                var11 = this.field_u[var8] / 2;
                                if (param1.field_y != null) {
                                  if (this.field_u[var8] > 0) {
                                    stackOut_69_0 = 1;
                                    stackIn_71_0 = stackOut_69_0;
                                    break L28;
                                  } else {
                                    stackOut_68_0 = 0;
                                    stackIn_71_0 = stackOut_68_0;
                                    break L28;
                                  }
                                } else {
                                  stackOut_66_0 = 0;
                                  stackIn_71_0 = stackOut_66_0;
                                  break L28;
                                }
                              }
                              L29: {
                                var12 = stackIn_71_0;
                                if (var12 > var11) {
                                  var11 = var12;
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              this.field_u[var8] = var11;
                              break L27;
                            }
                          }
                          this.a((byte) -124, param1, (eg) (var9));
                          if (-1 > (this.field_u[var8] ^ -1)) {
                            L30: {
                              param1.field_x = this.field_u[var8];
                              this.a(param1, (eg) (var9), -30724);
                              if (var9 == null) {
                                break L30;
                              } else {
                                ((eg) (var9)).field_m = param1.field_R;
                                ((eg) (var9)).field_i = param1.field_y;
                                ((eg) (var9)).field_l = param1.field_x;
                                break L30;
                              }
                            }
                            if (param2 == null) {
                              break L17;
                            } else {
                              if (null == param1.field_y) {
                                break L17;
                              } else {
                                if (!param2.field_j[var8][3]) {
                                  var11 = 0;
                                  var12_ref_mg = (mg) ((Object) param1.field_s.c(-127));
                                  L31: while (true) {
                                    if (var12_ref_mg == null) {
                                      break L18;
                                    } else {
                                      L32: {
                                        if (param1.field_y == var12_ref_mg.field_G) {
                                          break L32;
                                        } else {
                                          var11++;
                                          break L32;
                                        }
                                      }
                                      var12_ref_mg = (mg) ((Object) param1.field_s.b(32));
                                      continue L31;
                                    }
                                  }
                                } else {
                                  break L17;
                                }
                              }
                            }
                          } else {
                            break L19;
                          }
                        }
                      }
                      var11 = 0;
                      L33: while (true) {
                        if (var11 >= this.field_r + 1) {
                          this.field_C = 0;
                          var11 = 0;
                          L34: while (true) {
                            if (this.field_r <= var11) {
                              L35: {
                                if (param5 > 15) {
                                  break L35;
                                } else {
                                  this.a((byte) -65, (boolean[][]) null);
                                  break L35;
                                }
                              }
                              if (-1 != (this.field_C ^ -1)) {
                                L36: {
                                  this.b((byte) 15);
                                  var11 = this.field_K[0];
                                  var15 = this.field_v[var11];
                                  this.a(var15, param1, 0);
                                  param1.field_x = this.field_u[var11];
                                  if (var9 == null) {
                                    break L36;
                                  } else {
                                    ((eg) (var9)).field_i = var15;
                                    ((eg) (var9)).field_l = param1.field_x;
                                    ((eg) (var9)).field_m = param1.field_R;
                                    break L36;
                                  }
                                }
                                L37: {
                                  if (param2 == null) {
                                    break L37;
                                  } else {
                                    param2.field_f[var11] = param2.field_f[var11] + 1;
                                    break L37;
                                  }
                                }
                                this.a(0, (eg) (var9), param1);
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                this.a(-21031, param1);
                                decompiledRegionSelector0 = 2;
                                break L0;
                              }
                            } else {
                              L38: {
                                var12 = this.field_B[var11];
                                this.field_u[var11] = var12;
                                if (-1 == (var12 ^ -1)) {
                                  break L38;
                                } else {
                                  fieldTemp$4 = this.field_C;
                                  this.field_C = this.field_C + 1;
                                  this.field_K[fieldTemp$4] = var11;
                                  break L38;
                                }
                              }
                              var11++;
                              continue L34;
                            }
                          }
                        } else {
                          this.field_B[var11] = this.field_u[var11];
                          var11++;
                          continue L33;
                        }
                      }
                    }
                    if (-4 < (var11 ^ -1)) {
                      break L17;
                    } else {
                      param2.field_j[var8][3] = true;
                      break L17;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L39: {
                    var9_int = this.field_h[var8];
                    this.field_u[var8] = var9_int;
                    if (-1 > (var9_int ^ -1)) {
                      fieldTemp$5 = this.field_C;
                      this.field_C = this.field_C + 1;
                      this.field_K[fieldTemp$5] = var8;
                      break L39;
                    } else {
                      break L39;
                    }
                  }
                  var8++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L40: {
            var7 = decompiledCaughtException;
            stackOut_137_0 = (RuntimeException) (var7);
            stackOut_137_1 = new StringBuilder().append("dc.FB(").append(param0).append(',');
            stackIn_139_0 = stackOut_137_0;
            stackIn_139_1 = stackOut_137_1;
            stackIn_138_0 = stackOut_137_0;
            stackIn_138_1 = stackOut_137_1;
            if (param1 == null) {
              stackOut_139_0 = (RuntimeException) ((Object) stackIn_139_0);
              stackOut_139_1 = (StringBuilder) ((Object) stackIn_139_1);
              stackOut_139_2 = "null";
              stackIn_140_0 = stackOut_139_0;
              stackIn_140_1 = stackOut_139_1;
              stackIn_140_2 = stackOut_139_2;
              break L40;
            } else {
              stackOut_138_0 = (RuntimeException) ((Object) stackIn_138_0);
              stackOut_138_1 = (StringBuilder) ((Object) stackIn_138_1);
              stackOut_138_2 = "{...}";
              stackIn_140_0 = stackOut_138_0;
              stackIn_140_1 = stackOut_138_1;
              stackIn_140_2 = stackOut_138_2;
              break L40;
            }
          }
          L41: {
            stackOut_140_0 = (RuntimeException) ((Object) stackIn_140_0);
            stackOut_140_1 = ((StringBuilder) (Object) stackIn_140_1).append(stackIn_140_2).append(',');
            stackIn_142_0 = stackOut_140_0;
            stackIn_142_1 = stackOut_140_1;
            stackIn_141_0 = stackOut_140_0;
            stackIn_141_1 = stackOut_140_1;
            if (param2 == null) {
              stackOut_142_0 = (RuntimeException) ((Object) stackIn_142_0);
              stackOut_142_1 = (StringBuilder) ((Object) stackIn_142_1);
              stackOut_142_2 = "null";
              stackIn_143_0 = stackOut_142_0;
              stackIn_143_1 = stackOut_142_1;
              stackIn_143_2 = stackOut_142_2;
              break L41;
            } else {
              stackOut_141_0 = (RuntimeException) ((Object) stackIn_141_0);
              stackOut_141_1 = (StringBuilder) ((Object) stackIn_141_1);
              stackOut_141_2 = "{...}";
              stackIn_143_0 = stackOut_141_0;
              stackIn_143_1 = stackOut_141_1;
              stackIn_143_2 = stackOut_141_2;
              break L41;
            }
          }
          L42: {
            stackOut_143_0 = (RuntimeException) ((Object) stackIn_143_0);
            stackOut_143_1 = ((StringBuilder) (Object) stackIn_143_1).append(stackIn_143_2).append(',');
            stackIn_145_0 = stackOut_143_0;
            stackIn_145_1 = stackOut_143_1;
            stackIn_144_0 = stackOut_143_0;
            stackIn_144_1 = stackOut_143_1;
            if (param3 == null) {
              stackOut_145_0 = (RuntimeException) ((Object) stackIn_145_0);
              stackOut_145_1 = (StringBuilder) ((Object) stackIn_145_1);
              stackOut_145_2 = "null";
              stackIn_146_0 = stackOut_145_0;
              stackIn_146_1 = stackOut_145_1;
              stackIn_146_2 = stackOut_145_2;
              break L42;
            } else {
              stackOut_144_0 = (RuntimeException) ((Object) stackIn_144_0);
              stackOut_144_1 = (StringBuilder) ((Object) stackIn_144_1);
              stackOut_144_2 = "{...}";
              stackIn_146_0 = stackOut_144_0;
              stackIn_146_1 = stackOut_144_1;
              stackIn_146_2 = stackOut_144_2;
              break L42;
            }
          }
          L43: {
            stackOut_146_0 = (RuntimeException) ((Object) stackIn_146_0);
            stackOut_146_1 = ((StringBuilder) (Object) stackIn_146_1).append(stackIn_146_2).append(',');
            stackIn_148_0 = stackOut_146_0;
            stackIn_148_1 = stackOut_146_1;
            stackIn_147_0 = stackOut_146_0;
            stackIn_147_1 = stackOut_146_1;
            if (param4 == null) {
              stackOut_148_0 = (RuntimeException) ((Object) stackIn_148_0);
              stackOut_148_1 = (StringBuilder) ((Object) stackIn_148_1);
              stackOut_148_2 = "null";
              stackIn_149_0 = stackOut_148_0;
              stackIn_149_1 = stackOut_148_1;
              stackIn_149_2 = stackOut_148_2;
              break L43;
            } else {
              stackOut_147_0 = (RuntimeException) ((Object) stackIn_147_0);
              stackOut_147_1 = (StringBuilder) ((Object) stackIn_147_1);
              stackOut_147_2 = "{...}";
              stackIn_149_0 = stackOut_147_0;
              stackIn_149_1 = stackOut_147_1;
              stackIn_149_2 = stackOut_147_2;
              break L43;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_149_0), stackIn_149_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final void g(int param0) {
        ln var4 = null;
        fs var4_ref = null;
        fs var5 = null;
        int var3 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_q = new pf();
        this.field_p = new el();
        this.field_i = new pf();
        ln[] var7 = this.field_g.field_e;
        ln[] var2 = var7;
        for (var3 = 0; var7.length > var3; var3++) {
            var4 = var7[var3];
            var4.field_T.a(0);
            var4.field_s.b((byte) 117);
        }
        if (param0 != -7954) {
            field_E = (pf) null;
        }
        fs[] var8 = this.field_v;
        fs[] var2_array = var8;
        int var9 = 0;
        var3 = var9;
        while (var9 < var8.length) {
            var4_ref = var8[var9];
            var5 = var4_ref;
            var4_ref.field_w = 0;
            var5.field_A = 0;
            var9++;
        }
    }

    private final void a(se param0, int param1, int param2, k param3) {
        RuntimeException var5 = null;
        qm var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (this.field_o.field_h) {
              L1: {
                if (param2 == 7377) {
                  break L1;
                } else {
                  field_E = (pf) null;
                  break L1;
                }
              }
              var5_ref = (qm) ((Object) this.field_i.d(0));
              L2: while (true) {
                if (var5_ref == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var6 = var5_ref.field_o;
                    if (-4 == (var6 ^ -1)) {
                      L4: {
                        this.a(var5_ref.field_r, 4, var5_ref.field_q);
                        if (param3 == null) {
                          break L4;
                        } else {
                          param3.a(param2 + -7500, var5_ref.field_q, var5_ref.field_r, var5_ref.field_p);
                          break L4;
                        }
                      }
                      if (param0 != null) {
                        param0.field_h[var5_ref.field_p.field_x] = param0.field_h[var5_ref.field_p.field_x] + 1;
                        if (-1 <= (this.field_O ^ -1)) {
                          break L3;
                        } else {
                          L5: {
                            if ((ab.field_c[this.field_G] ^ -1) == -4) {
                              break L5;
                            } else {
                              if ((lr.field_b[this.field_n] ^ -1) != -4) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                          param0.field_d[var5_ref.field_p.field_x][3] = true;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      if (var6 != 1) {
                        break L3;
                      } else {
                        L6: {
                          this.field_L.setSeed((long)(var5_ref.field_q.field_p ^ param1));
                          this.a(var5_ref.field_q, (byte) 112, this.field_L);
                          if (param3 == null) {
                            break L6;
                          } else {
                            param3.a(var5_ref.field_p, var5_ref.field_q, (byte) 120);
                            break L6;
                          }
                        }
                        if (param0 != null) {
                          param0.field_h[var5_ref.field_p.field_x] = param0.field_h[var5_ref.field_p.field_x] + 1;
                          if (0 >= this.field_O) {
                            break L3;
                          } else {
                            L7: {
                              if (-2 == (ab.field_c[this.field_G] ^ -1)) {
                                break L7;
                              } else {
                                if (lr.field_b[this.field_n] == 1) {
                                  break L7;
                                } else {
                                  break L3;
                                }
                              }
                            }
                            param0.field_d[var5_ref.field_p.field_x][1] = true;
                            break L3;
                          }
                        } else {
                          var5_ref = (qm) ((Object) this.field_i.a((byte) -71));
                          continue L2;
                        }
                      }
                    }
                  }
                  var5_ref = (qm) ((Object) this.field_i.a((byte) -71));
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var5);
            stackOut_30_1 = new StringBuilder().append("dc.GA(");
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L8;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L8;
            }
          }
          L9: {
            stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param3 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(ln param0, int param1, ln param2) {
        RuntimeException var4 = null;
        ln var4_ref = null;
        sd var4_ref2 = null;
        sd var5 = null;
        ln var6 = null;
        sd var6_ref = null;
        int var7 = 0;
        sd var8 = null;
        sd var9 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param2.b(param0, (byte) 10)) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0.field_p >= param2.field_p) {
                  break L1;
                } else {
                  var4_ref = param2;
                  param2 = param0;
                  param0 = var4_ref;
                  break L1;
                }
              }
              L2: {
                this.field_A.a((byte) -113, new cs(param2, param0, param1));
                param2.a((byte) -127, param0);
                param0.a((byte) -81, param2);
                param2.e((byte) -122);
                param0.e((byte) -110);
                if (param2.field_y != param0.field_y) {
                  break L2;
                } else {
                  if (param2.field_R != param0.field_R) {
                    L3: {
                      var9 = param2.field_R;
                      var4_ref2 = var9;
                      var8 = param0.field_R;
                      var5 = var8;
                      if (var8.field_r <= var9.field_r) {
                        break L3;
                      } else {
                        var6_ref = var9;
                        var4_ref2 = var8;
                        var5 = var6_ref;
                        break L3;
                      }
                    }
                    var6 = var5.j(18229);
                    L4: while (true) {
                      if (var6 == null) {
                        var5.b((byte) -118);
                        sh.a(var4_ref2, -5);
                        break L2;
                      } else {
                        var6.field_R = var4_ref2;
                        var4_ref2.a(-21771, var6);
                        var6 = var5.h(param1 ^ -23414);
                        continue L4;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              this.a(param2, false, (byte) 125);
              this.a(param0, false, (byte) 114);
              this.field_g.a(param1 ^ 26249);
              this.field_g.b((byte) 80);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var4);
            stackOut_17_1 = new StringBuilder().append("dc.PA(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, ln param1) {
        RuntimeException var3 = null;
        int var4_int = 0;
        ln[] var4 = null;
        ln var5_ref_ln = null;
        int var5 = 0;
        ln var6 = null;
        sd var7 = null;
        ln var8 = null;
        int var9 = 0;
        ln[] var10 = null;
        sd var11 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var10 = param1.field_D;
            var4_int = param0;
            L1: while (true) {
              L2: {
                if (var10.length <= var4_int) {
                  break L2;
                } else {
                  var5_ref_ln = var10[var4_int];
                  var8 = var5_ref_ln;
                  var8 = var5_ref_ln;
                  if (param1.field_y != var5_ref_ln.field_y) {
                    var4_int++;
                    continue L1;
                  } else {
                    param1.field_R = var5_ref_ln.field_R;
                    param1.field_R.a(-21771, param1);
                    break L2;
                  }
                }
              }
              if (param1.field_R == null) {
                param1.field_R = new sd(param1.field_y, param1);
                param1.field_R.a(param0 + -21771, param1);
                param1.field_y.field_i.a((byte) -113, param1.field_R);
                sh.a(param1.field_R, -5);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var11 = param1.field_R;
                var4 = param1.field_D;
                var5 = 0;
                L3: while (true) {
                  if (var4.length <= var5) {
                    sh.a(param1.field_R, -5);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var6 = var4[var5];
                    var8 = var6;
                    var8 = var6;
                    var7 = var6.field_R;
                    if (param1.field_y == var6.field_y) {
                      L4: {
                        if (var11 != var7) {
                          var8 = var7.j(param0 ^ 18229);
                          L5: while (true) {
                            if (var8 == null) {
                              var7.b((byte) -118);
                              break L4;
                            } else {
                              var8.field_R = param1.field_R;
                              var11.a(param0 ^ -21771, var8);
                              var8 = var7.h(-23410);
                              continue L5;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      var5++;
                      continue L3;
                    } else {
                      var5++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var3);
            stackOut_23_1 = new StringBuilder().append("dc.W(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          var14 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = eg.field_x.length;
          var3 = ur.field_Bb.length;
          var4 = var2 * var3 / 2;
          var5 = var2 / 2;
          var6 = var3 / 2;
          if (null == this.field_d) {
            this.field_N = new int[var5];
            this.field_j = new int[var6];
            this.field_b = 0;
            this.field_d = new int[var4];
            break L0;
          } else {
            break L0;
          }
        }
        if (0 == this.field_O) {
          return;
        } else {
          L1: {
            if (this.field_b >= var4) {
              stackOut_8_0 = var4;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            } else {
              stackOut_7_0 = this.field_b;
              stackIn_9_0 = stackOut_7_0;
              break L1;
            }
          }
          L2: {
            var10 = stackIn_9_0;
            if (var5 > this.field_b) {
              stackOut_11_0 = this.field_b;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            } else {
              stackOut_10_0 = var5;
              stackIn_12_0 = stackOut_10_0;
              break L2;
            }
          }
          L3: {
            var11 = stackIn_12_0;
            if (this.field_b < var6) {
              stackOut_14_0 = this.field_b;
              stackIn_15_0 = stackOut_14_0;
              break L3;
            } else {
              stackOut_13_0 = var6;
              stackIn_15_0 = stackOut_13_0;
              break L3;
            }
          }
          var12 = stackIn_15_0;
          L4: while (true) {
            var7 = vc.a((byte) -39, var2);
            var13 = 0;
            L5: while (true) {
              if (var11 <= var13) {
                L6: while (true) {
                  var8 = vc.a((byte) -39, var3);
                  var13 = 0;
                  L7: while (true) {
                    if (var12 <= var13) {
                      var9 = var3 * var7 + var8;
                      var13 = 0;
                      L8: while (true) {
                        if (var13 >= var10) {
                          this.field_N[this.field_b % var5] = var7;
                          this.field_j[this.field_b % var6] = var8;
                          this.field_d[this.field_b % var4] = var9;
                          this.field_n = var8;
                          var13 = -30 % ((18 - param0) / 42);
                          this.field_b = this.field_b + 1;
                          this.field_G = var7;
                          return;
                        } else {
                          if (this.field_d[var13] == var9) {
                            continue L4;
                          } else {
                            var13++;
                            continue L8;
                          }
                        }
                      }
                    } else {
                      if (this.field_j[var13] == var8) {
                        continue L6;
                      } else {
                        var13++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                if (this.field_N[var13] == var7) {
                  continue L4;
                } else {
                  var13++;
                  continue L5;
                }
              }
            }
          }
        }
    }

    final void a(pf param0, int param1, pf param2, pf param3) {
        mg var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            param3.a((byte) -90, this.field_i);
            param2.a((byte) -90, this.field_q);
            var5 = (mg) ((Object) param0.d(param1));
            while (var5 != null) {
                this.field_p.a((byte) 36, var5);
                var5.field_y.field_T.a((byte) -113, var5);
                var5.field_B.field_s.a(var5, 32);
                var5 = (mg) ((Object) param0.a((byte) -71));
            }
            param3.a(0);
            param2.a(0);
            param0.a(0);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "dc.EA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(ln param0, boolean param1, byte param2) {
        RuntimeException runtimeException = null;
        eg var5 = null;
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
              kd.a(this.field_o, param1, param0, (byte) -2);
              if (param2 > 113) {
                break L1;
              } else {
                var5 = (eg) null;
                this.a((ln) null, (eg) null, 39);
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
            stackOut_3_1 = new StringBuilder().append("dc.M(");
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
          throw r.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(ob param0, byte param1, fs param2) {
        if (param1 <= 49) {
            return;
        }
        try {
            m.a((byte) -80, this.field_v, param0, this.field_n, this.field_A, this.field_G, this.field_x, param2, this.field_g, false);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "dc.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final int[] d(byte param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = new int[this.field_r];
        var2 = var9;
        L0: while (true) {
          if (1 >= this.field_C) {
            L1: {
              if (param0 == 20) {
                break L1;
              } else {
                this.field_H = (int[]) null;
                break L1;
              }
            }
            return var9;
          } else {
            var3 = 0;
            var4 = this.field_L.nextInt();
            var5_int = 1;
            L2: while (true) {
              if (var5_int >= this.field_C) {
                var5 = this.field_t[var3];
                var6 = this.field_H[var3];
                if (var6 == 0) {
                  throw new RuntimeException();
                } else {
                  L3: {
                    var7 = var5[qf.a((byte) 11, this.field_H[var3], this.field_L)];
                    if (this.field_r <= this.field_K[var3]) {
                      break L3;
                    } else {
                      var9[this.field_K[var3]] = var9[this.field_K[var3]] + 1;
                      break L3;
                    }
                  }
                  L4: {
                    this.field_u[var7] = this.field_u[var7] - 1;
                    if (0 == this.field_u[var7] - 1) {
                      this.c(this.a((byte) 98, var7), -32);
                      this.a(false);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (this.field_u[var7] < 0) {
                    throw new RuntimeException();
                  } else {
                    continue L0;
                  }
                }
              } else {
                var6 = this.field_L.nextInt();
                if (var6 > var4) {
                  var4 = var6;
                  var3 = var5_int;
                  var5_int++;
                  continue L2;
                } else {
                  var5_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    private final void a(ln param0, boolean param1) {
        try {
            param0.field_u = param1 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "dc.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final int a(byte param0, int param1) {
        int var3 = 0;
        boolean discarded$0 = false;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        for (var3 = 0; this.field_C > var3; var3++) {
            if (!(this.field_K[var3] != param1)) {
                return var3;
            }
        }
        if (param0 <= 57) {
            pf var5 = (pf) null;
            discarded$0 = this.a((pf) null, (fs) null, -20, (pf) null, (pf) null);
        }
        throw new RuntimeException();
    }

    final void a(int param0, fs param1) {
        RuntimeException var3 = null;
        fs[] var3_array = null;
        int var4_int = 0;
        String[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        boolean[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        fs[] var11 = null;
        fs var12 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var11 = this.field_v;
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= var11.length) {
                param1.field_f = new int[this.field_r + 1];
                param1.field_h = new boolean[this.field_r - -1];
                vf.a(126, param1.field_m);
                sh.a(param1.field_m, param0);
                var3_array = new fs[this.field_r + 1];
                var4 = new String[this.field_r + 1];
                var10 = new int[1 + this.field_r];
                var5 = var10;
                var6 = 0;
                L2: while (true) {
                  if (this.field_v.length <= var6) {
                    var3_array[var6] = param1;
                    var4[var6] = param1.field_t;
                    this.field_D = var5;
                    this.field_r = this.field_r + 1;
                    this.field_v = var3_array;
                    this.field_I = var4;
                    this.field_B = new int[1 + this.field_r];
                    this.field_u = new int[1 + this.field_r];
                    this.field_H = new int[this.field_r + 1];
                    this.field_K = new int[1 + this.field_r];
                    this.field_h = new int[this.field_r];
                    break L0;
                  } else {
                    var3_array[var6] = this.field_v[var6];
                    var4[var6] = this.field_I[var6];
                    var10[var6] = this.field_D[var6];
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var12 = var11[var4_int];
                var6_ref_int__ = new int[this.field_v.length + 1];
                var7 = new boolean[this.field_v.length + 1];
                var8 = 0;
                L3: while (true) {
                  if (var8 >= var12.field_h.length) {
                    var12.field_h = var7;
                    var12.field_f = var6_ref_int__;
                    var4_int++;
                    continue L1;
                  } else {
                    var6_ref_int__[var8] = var12.field_f[var8];
                    var7[var8] = var12.field_h[var8];
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("dc.U(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    private final void a(int param0, k param1) {
        int fieldTemp$1 = 0;
        RuntimeException var3 = null;
        fs[] var3_array = null;
        cs var3_ref = null;
        int var4_int = 0;
        sd var4 = null;
        fs var5 = null;
        int var6 = 0;
        int var7 = 0;
        fs[] var8 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_o.field_j) {
                break L1;
              } else {
                var8 = this.field_v;
                var3_array = var8;
                var4_int = 0;
                L2: while (true) {
                  if (var8.length <= var4_int) {
                    break L1;
                  } else {
                    var5 = var8[var4_int];
                    var6 = 0;
                    L3: while (true) {
                      if (this.field_r <= var6) {
                        var4_int++;
                        continue L2;
                      } else {
                        if ((var5.field_f[var6] ^ -1) < -1) {
                          L4: {
                            var5.field_f[var6] = var5.field_f[var6] - 1;
                            if (-1 == (var5.field_f[var6] - 1 ^ -1)) {
                              var5.field_h[var6] = false;
                              if (param1 != null) {
                                if (var5.field_x < var6) {
                                  param1.a(255, var5, this.field_v[var6]);
                                  break L4;
                                } else {
                                  break L4;
                                }
                              } else {
                                var6++;
                                continue L3;
                              }
                            } else {
                              break L4;
                            }
                          }
                          var6++;
                          continue L3;
                        } else {
                          var6++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            }
            L5: {
              if (this.field_o.field_h) {
                var3_ref = (cs) ((Object) this.field_A.d(0));
                L6: while (true) {
                  if (var3_ref == null) {
                    break L5;
                  } else {
                    L7: {
                      fieldTemp$1 = var3_ref.field_m - 1;
                      var3_ref.field_m = var3_ref.field_m - 1;
                      if (0 < fieldTemp$1) {
                        break L7;
                      } else {
                        L8: {
                          var3_ref.field_n.a(var3_ref.field_k, (byte) -124);
                          var3_ref.field_n.e((byte) -98);
                          var3_ref.field_k.e((byte) -100);
                          var4 = var3_ref.field_n.field_R;
                          if (var4 == null) {
                            break L8;
                          } else {
                            if (var4 == var3_ref.field_k.field_R) {
                              this.a(80, var4);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                        }
                        this.a(var3_ref.field_n, false, (byte) 123);
                        this.a(var3_ref.field_k, false, (byte) 118);
                        this.field_g.a(26253);
                        this.field_g.b((byte) 80);
                        var3_ref.b((byte) -101);
                        break L7;
                      }
                    }
                    var3_ref = (cs) ((Object) this.field_A.a((byte) -71));
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
            L9: {
              if (param0 == 1) {
                break L9;
              } else {
                this.b(40);
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var3);
            stackOut_31_1 = new StringBuilder().append("dc.UA(").append(param0).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
    }

    final void a(fs param0, byte param1) {
        ln[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        ln[] var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -90) {
                break L1;
              } else {
                this.c((byte) 63);
                break L1;
              }
            }
            var7 = this.field_g.field_e;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                L3: {
                  param0.field_i.a(0);
                  if (param0.field_m == null) {
                    break L3;
                  } else {
                    param0.field_m.k(0);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var5 = var7[var4];
                  if (var5.field_y == param0) {
                    var5.field_R = null;
                    var5.field_y = null;
                    var5.b((byte) -71);
                    var5.a(16);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("dc.JA(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    private final int b(byte param0, ln param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        mg var4 = null;
        int var5 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 88) {
                break L1;
              } else {
                this.field_e = 2;
                break L1;
              }
            }
            L2: {
              L3: {
                if (!param1.field_u) {
                  break L3;
                } else {
                  if (this.field_o.field_f) {
                    var3_int = 0;
                    param1.field_u = false;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var3_int = 1 + param1.field_x >> -75851359;
              param1.field_x = param1.field_x - var3_int;
              break L2;
            }
            var4 = (mg) ((Object) param1.field_T.d(0));
            L4: while (true) {
              if (var4 == null) {
                stackOut_11_0 = var3_int;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                var4.b((byte) -113);
                var4.a(16);
                var4.d(true);
                var4 = (mg) ((Object) param1.field_T.a((byte) -71));
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("dc.BB(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0;
    }

    final void e(int param0) {
        fs[] var2 = null;
        int var3 = 0;
        fs var4 = null;
        sd var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = this.field_v;
        var3 = param0;
        L0: while (true) {
          if (var3 >= var2.length) {
            return;
          } else {
            var4 = var2[var3];
            if (this.field_o.field_i) {
              vf.a(param0 ^ 125, var4.field_m);
              sh.a(var4.field_m, -5);
              var3++;
              continue L0;
            } else {
              var5 = (sd) ((Object) var4.field_i.d(0));
              L1: while (true) {
                if (var5 != null) {
                  vf.a(param0 ^ 127, var5);
                  sh.a(var5, param0 + -5);
                  var5 = (sd) ((Object) var4.field_i.a((byte) -71));
                  continue L1;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    final int f(int param0) {
        int var2 = 0;
        cs var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        fs var10 = null;
        ln var11 = null;
        int var12 = 0;
        fs[] var13 = null;
        fs var14 = null;
        ln[] var15 = null;
        ln var16 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 305494461;
        var2 = var2 ^ this.field_f << 1585299467;
        var2 = var2 ^ this.field_w * 5 << 1286628775;
        var2 = var2 ^ this.field_y * 13 << -1524253453;
        if (param0 == -28824) {
          var13 = this.field_v;
          var4 = 0;
          L0: while (true) {
            if (var13.length <= var4) {
              var15 = this.field_g.field_e;
              var4 = 0;
              L1: while (true) {
                if (var15.length <= var4) {
                  var3 = (cs) ((Object) this.field_A.d(0));
                  L2: while (true) {
                    if (var3 == null) {
                      var2 = var2 ^ 47 * this.field_G;
                      var2 = var2 ^ 61 * this.field_n;
                      return var2;
                    } else {
                      var4 = (var3.field_k.field_p - -17) * (13 + var3.field_n.field_p) ^ var3.field_m * 31;
                      var2 = var2 + 23 * var4;
                      var3 = (cs) ((Object) this.field_A.a((byte) -71));
                      continue L2;
                    }
                  }
                } else {
                  L3: {
                    var11 = var15[var4];
                    var16 = var11;
                    var6 = 1 + var16.field_p;
                    if (var16.field_u) {
                      stackOut_12_0 = 79;
                      stackIn_13_0 = stackOut_12_0;
                      break L3;
                    } else {
                      stackOut_11_0 = 0;
                      stackIn_13_0 = stackOut_11_0;
                      break L3;
                    }
                  }
                  var7 = stackIn_13_0;
                  var8 = 0;
                  L4: while (true) {
                    if (var16.field_D.length <= var8) {
                      var12 = 0;
                      var8 = var12;
                      L5: while (true) {
                        if (4 <= var12) {
                          var7 = var7 + 37 * var16.field_x;
                          var2 = var2 + 17 * (var6 * var7);
                          var4++;
                          continue L1;
                        } else {
                          var7 = var7 + var16.field_G[var12] * (13 << var12 * 3);
                          var12++;
                          continue L5;
                        }
                      }
                    } else {
                      var7 = var7 + 23 * (var8 + 1) * var11.field_D[var8].field_p;
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            } else {
              var10 = var13[var4];
              var14 = var10;
              var2 = var2 + (var10.field_u[0] << var14.field_x);
              var2 = var2 + (var10.field_u[1] << var14.field_x + 3);
              var2 = var2 + (var10.field_u[2] << var14.field_x + 7);
              var2 = var2 + (var10.field_u[3] << var14.field_x + 19);
              var6 = 0;
              L6: while (true) {
                if (var6 >= this.field_v.length) {
                  var4++;
                  continue L0;
                } else {
                  var2 = var2 + (var10.field_f[var6] << (var6 * 5 + 7 * var14.field_x) % 11);
                  var6++;
                  continue L6;
                }
              }
            }
          }
        } else {
          return 22;
        }
    }

    final boolean a(pf param0, fs param1, int param2, pf param3, pf param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int[] var7 = null;
        int var8_int = 0;
        qa var8 = null;
        int var9 = 0;
        qm var10 = null;
        int var11_int = 0;
        mg var11 = null;
        int var12 = 0;
        Object var12_ref = null;
        int var13 = 0;
        ln[] var13_ref_ln__ = null;
        int var14 = 0;
        ln var15 = null;
        int var16 = 0;
        Object var17 = null;
        sd var18 = null;
        int stackIn_33_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        RuntimeException stackIn_107_0 = null;
        StringBuilder stackIn_107_1 = null;
        RuntimeException stackIn_108_0 = null;
        StringBuilder stackIn_108_1 = null;
        RuntimeException stackIn_109_0 = null;
        StringBuilder stackIn_109_1 = null;
        String stackIn_109_2 = null;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        RuntimeException stackIn_111_0 = null;
        StringBuilder stackIn_111_1 = null;
        RuntimeException stackIn_112_0 = null;
        StringBuilder stackIn_112_1 = null;
        String stackIn_112_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_106_0 = null;
        StringBuilder stackOut_106_1 = null;
        RuntimeException stackOut_108_0 = null;
        StringBuilder stackOut_108_1 = null;
        String stackOut_108_2 = null;
        RuntimeException stackOut_107_0 = null;
        StringBuilder stackOut_107_1 = null;
        String stackOut_107_2 = null;
        RuntimeException stackOut_109_0 = null;
        StringBuilder stackOut_109_1 = null;
        RuntimeException stackOut_111_0 = null;
        StringBuilder stackOut_111_1 = null;
        String stackOut_111_2 = null;
        RuntimeException stackOut_110_0 = null;
        StringBuilder stackOut_110_1 = null;
        String stackOut_110_2 = null;
        var17 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var6_int = this.field_g.field_e.length;
            var7 = new int[var6_int];
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= var6_int) {
                var8 = (qa) ((Object) param3.d(0));
                L2: while (true) {
                  if (var8 == null) {
                    var9 = 0;
                    var10 = (qm) ((Object) param4.d(0));
                    L3: while (true) {
                      if (var10 == null) {
                        var8 = (qa) ((Object) param3.d(param2 ^ param2));
                        L4: while (true) {
                          if (var8 == null) {
                            L5: {
                              if (this.field_o.field_i) {
                                vf.a(122, param1.field_m);
                                sh.a(param1.field_m, -5);
                                break L5;
                              } else {
                                var18 = (sd) ((Object) param1.field_i.d(0));
                                L6: while (true) {
                                  if (var18 == null) {
                                    break L5;
                                  } else {
                                    vf.a(120, var18);
                                    sh.a(var18, -5);
                                    var18 = (sd) ((Object) param1.field_i.a((byte) -71));
                                    continue L6;
                                  }
                                }
                              }
                            }
                            var11 = (mg) ((Object) param0.d(0));
                            L7: while (true) {
                              if (var11 == null) {
                                L8: {
                                  if (var9 != 0) {
                                    stackOut_98_0 = 0;
                                    stackIn_99_0 = stackOut_98_0;
                                    break L8;
                                  } else {
                                    stackOut_97_0 = 1;
                                    stackIn_99_0 = stackOut_97_0;
                                    break L8;
                                  }
                                }
                                break L0;
                              } else {
                                L9: {
                                  L10: {
                                    var12 = 1;
                                    if (var11.field_y == null) {
                                      break L10;
                                    } else {
                                      if (var11.field_B == null) {
                                        break L10;
                                      } else {
                                        if (var11.field_y.field_y == param1) {
                                          L11: {
                                            var7[var11.field_y.field_p] = var7[var11.field_y.field_p] - var11.field_z;
                                            if (!this.field_o.field_e) {
                                              stackOut_81_0 = var11.field_y.field_N;
                                              stackIn_82_0 = stackOut_81_0;
                                              break L11;
                                            } else {
                                              stackOut_80_0 = 0;
                                              stackIn_82_0 = stackOut_80_0;
                                              break L11;
                                            }
                                          }
                                          var13 = stackIn_82_0;
                                          if (0 < var11.field_z) {
                                            if (var13 > var7[var11.field_y.field_p]) {
                                              var12 = 0;
                                              break L9;
                                            } else {
                                              if (var11.field_y.field_R == var11.field_B.field_R) {
                                                if (this.a(var11.field_y, var11.field_B, -1)) {
                                                  break L9;
                                                } else {
                                                  var12 = 0;
                                                  break L9;
                                                }
                                              } else {
                                                if (!var11.field_y.b(var11.field_B, (byte) 10)) {
                                                  var12 = 0;
                                                  break L9;
                                                } else {
                                                  break L9;
                                                }
                                              }
                                            }
                                          } else {
                                            var12 = 0;
                                            break L9;
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                  }
                                  var12 = 0;
                                  break L9;
                                }
                                L12: {
                                  if (var12 == 0) {
                                    var11.b((byte) -103);
                                    var9 = 1;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                var11 = (mg) ((Object) param0.a((byte) -71));
                                continue L7;
                              }
                            }
                          } else {
                            L13: {
                              L14: {
                                var11_int = 1;
                                if (null == var8.field_u) {
                                  break L14;
                                } else {
                                  if (var8.field_u.field_y == param1) {
                                    L15: {
                                      if (!this.field_o.field_i) {
                                        var12_ref = var8.field_u.field_R;
                                        break L15;
                                      } else {
                                        var12_ref = var8.field_u.field_y.field_m;
                                        break L15;
                                      }
                                    }
                                    ((sd) (var12_ref)).field_x = ((sd) (var12_ref)).field_x - var8.field_v;
                                    if (((sd) (var12_ref)).field_x < 0) {
                                      var11_int = 0;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  } else {
                                    break L14;
                                  }
                                }
                              }
                              var11_int = 0;
                              break L13;
                            }
                            L16: {
                              if (var11_int != 0) {
                                break L16;
                              } else {
                                var8.b((byte) -93);
                                var9 = 1;
                                break L16;
                              }
                            }
                            var8 = (qa) ((Object) param3.a((byte) -71));
                            continue L4;
                          }
                        }
                      } else {
                        L17: {
                          var11_int = 1;
                          if (this.field_o.field_h) {
                            if (var10.field_p != param1) {
                              var11_int = 0;
                              break L17;
                            } else {
                              if (null == var10.field_q) {
                                var11_int = 0;
                                break L17;
                              } else {
                                if ((param1.field_u[var10.field_o] ^ -1) > -6) {
                                  var11_int = 0;
                                  break L17;
                                } else {
                                  var12 = 0;
                                  var13 = var10.field_o;
                                  if (0 == var13) {
                                    if (var10.field_q.field_y == param1) {
                                      break L17;
                                    } else {
                                      var11_int = 0;
                                      break L17;
                                    }
                                  } else {
                                    if (var13 != 1) {
                                      if ((var13 ^ -1) == -3) {
                                        L18: {
                                          if (param1 != var10.field_q.field_y) {
                                            stackOut_32_0 = 0;
                                            stackIn_33_0 = stackOut_32_0;
                                            break L18;
                                          } else {
                                            stackOut_31_0 = 1;
                                            stackIn_33_0 = stackOut_31_0;
                                            break L18;
                                          }
                                        }
                                        var12 = stackIn_33_0;
                                        var13_ref_ln__ = var10.field_q.field_D;
                                        var14 = 0;
                                        L19: while (true) {
                                          if (var13_ref_ln__.length <= var14) {
                                            if (var12 != 0) {
                                              break L17;
                                            } else {
                                              var11_int = 0;
                                              break L17;
                                            }
                                          } else {
                                            var15 = var13_ref_ln__[var14];
                                            if (var15.field_y == param1) {
                                              var12 = 1;
                                              var14++;
                                              continue L19;
                                            } else {
                                              var14++;
                                              continue L19;
                                            }
                                          }
                                        }
                                      } else {
                                        if (var13 == 3) {
                                          if (null == var10.field_r) {
                                            var11_int = 0;
                                            break L17;
                                          } else {
                                            if (var10.field_q.field_y != param1) {
                                              var11_int = 0;
                                              break L17;
                                            } else {
                                              if (var10.field_q != var10.field_r) {
                                                break L17;
                                              } else {
                                                var11_int = 0;
                                                break L17;
                                              }
                                            }
                                          }
                                        } else {
                                          break L17;
                                        }
                                      }
                                    } else {
                                      L20: {
                                        if (var10.field_q.field_y != param1) {
                                          var11_int = 0;
                                          break L20;
                                        } else {
                                          break L20;
                                        }
                                      }
                                      if (-1 != (var10.field_q.field_L ^ -1)) {
                                        var11_int = 0;
                                        break L17;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var11_int = 0;
                            break L17;
                          }
                        }
                        L21: {
                          if (var11_int == 0) {
                            var9 = 1;
                            var10.b((byte) -71);
                            break L21;
                          } else {
                            break L21;
                          }
                        }
                        var10 = (qm) ((Object) param4.a((byte) -71));
                        continue L3;
                      }
                    }
                  } else {
                    L22: {
                      if (null == var8.field_u) {
                        break L22;
                      } else {
                        var7[var8.field_u.field_p] = var7[var8.field_u.field_p] + var8.field_v;
                        break L22;
                      }
                    }
                    var8 = (qa) ((Object) param3.a((byte) -71));
                    continue L2;
                  }
                }
              } else {
                var7[var8_int] = this.field_g.field_e[var8_int].field_x;
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_100_0 = (RuntimeException) (var6);
            stackOut_100_1 = new StringBuilder().append("dc.H(");
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param0 == null) {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L23;
            } else {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L23;
            }
          }
          L24: {
            stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
            stackOut_103_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_103_2).append(',');
            stackIn_105_0 = stackOut_103_0;
            stackIn_105_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param1 == null) {
              stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackOut_105_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackOut_105_2 = "null";
              stackIn_106_0 = stackOut_105_0;
              stackIn_106_1 = stackOut_105_1;
              stackIn_106_2 = stackOut_105_2;
              break L24;
            } else {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "{...}";
              stackIn_106_0 = stackOut_104_0;
              stackIn_106_1 = stackOut_104_1;
              stackIn_106_2 = stackOut_104_2;
              break L24;
            }
          }
          L25: {
            stackOut_106_0 = (RuntimeException) ((Object) stackIn_106_0);
            stackOut_106_1 = ((StringBuilder) (Object) stackIn_106_1).append(stackIn_106_2).append(',').append(param2).append(',');
            stackIn_108_0 = stackOut_106_0;
            stackIn_108_1 = stackOut_106_1;
            stackIn_107_0 = stackOut_106_0;
            stackIn_107_1 = stackOut_106_1;
            if (param3 == null) {
              stackOut_108_0 = (RuntimeException) ((Object) stackIn_108_0);
              stackOut_108_1 = (StringBuilder) ((Object) stackIn_108_1);
              stackOut_108_2 = "null";
              stackIn_109_0 = stackOut_108_0;
              stackIn_109_1 = stackOut_108_1;
              stackIn_109_2 = stackOut_108_2;
              break L25;
            } else {
              stackOut_107_0 = (RuntimeException) ((Object) stackIn_107_0);
              stackOut_107_1 = (StringBuilder) ((Object) stackIn_107_1);
              stackOut_107_2 = "{...}";
              stackIn_109_0 = stackOut_107_0;
              stackIn_109_1 = stackOut_107_1;
              stackIn_109_2 = stackOut_107_2;
              break L25;
            }
          }
          L26: {
            stackOut_109_0 = (RuntimeException) ((Object) stackIn_109_0);
            stackOut_109_1 = ((StringBuilder) (Object) stackIn_109_1).append(stackIn_109_2).append(',');
            stackIn_111_0 = stackOut_109_0;
            stackIn_111_1 = stackOut_109_1;
            stackIn_110_0 = stackOut_109_0;
            stackIn_110_1 = stackOut_109_1;
            if (param4 == null) {
              stackOut_111_0 = (RuntimeException) ((Object) stackIn_111_0);
              stackOut_111_1 = (StringBuilder) ((Object) stackIn_111_1);
              stackOut_111_2 = "null";
              stackIn_112_0 = stackOut_111_0;
              stackIn_112_1 = stackOut_111_1;
              stackIn_112_2 = stackOut_111_2;
              break L26;
            } else {
              stackOut_110_0 = (RuntimeException) ((Object) stackIn_110_0);
              stackOut_110_1 = (StringBuilder) ((Object) stackIn_110_1);
              stackOut_110_2 = "{...}";
              stackIn_112_0 = stackOut_110_0;
              stackIn_112_1 = stackOut_110_1;
              stackIn_112_2 = stackOut_110_2;
              break L26;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_112_0), stackIn_112_2 + ')');
        }
        return stackIn_99_0 != 0;
    }

    private final void a(k param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param1;
            L1: while (true) {
              if (this.field_r <= var3_int) {
                break L0;
              } else {
                L2: {
                  if ((this.field_w & 1 << var3_int) != 0) {
                    break L2;
                  } else {
                    if (!this.field_v[var3_int].field_i.g(param1 + -98)) {
                      break L2;
                    } else {
                      this.field_w = this.field_w | 1 << var3_int;
                      if (param0 == null) {
                        break L2;
                      } else {
                        param0.a(this.field_v[var3_int], false);
                        break L2;
                      }
                    }
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("dc.Q(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, sd param1) {
        ln dupTemp$1 = null;
        RuntimeException var3 = null;
        pf var4 = null;
        ln var5 = null;
        ln[] var6 = null;
        ln var6_ref = null;
        int var7_int = 0;
        sd var7 = null;
        int var9 = 0;
        ln var10 = null;
        int var11 = 0;
        ln[] var12 = null;
        ln[] var13 = null;
        pf var14 = null;
        ln var15 = null;
        ln var16 = null;
        ln var17 = null;
        ln var18 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var14 = new pf();
            var4 = new pf();
            var4.a((byte) -113, param1.field_q);
            param1.field_q.field_R = null;
            if (param0 > 45) {
              L1: while (true) {
                if (var4.g(-105)) {
                  var5 = (ln) ((Object) var14.d(0));
                  L2: while (true) {
                    if (var5 == null) {
                      L3: {
                        if (!param1.e(27650)) {
                          L4: while (true) {
                            dupTemp$1 = param1.i(-40);
                            var17 = dupTemp$1;
                            var6_ref = var17;
                            if (dupTemp$1 == null) {
                              break L3;
                            } else {
                              if (var17.field_R != param1) {
                                continue L4;
                              } else {
                                var7 = new sd(param1.field_o, var17);
                                var4.a((byte) -113, var17);
                                var6_ref.field_R = var7;
                                L5: while (true) {
                                  if (var4.g(121)) {
                                    sh.a(var7, -5);
                                    param1.field_o.field_i.a((byte) -113, var7);
                                    continue L4;
                                  } else {
                                    var18 = (ln) ((Object) var4.h(73));
                                    var7.a(-21771, var18);
                                    if (var18.field_D != null) {
                                      var13 = var18.field_D;
                                      var9 = 0;
                                      L6: while (true) {
                                        if (var13.length <= var9) {
                                          continue L5;
                                        } else {
                                          L7: {
                                            var10 = var13[var9];
                                            var6_ref = var10;
                                            var6_ref = var10;
                                            if (var10.field_R == param1) {
                                              var10.field_R = var7;
                                              var4.a((byte) -113, var10);
                                              break L7;
                                            } else {
                                              break L7;
                                            }
                                          }
                                          var9++;
                                          continue L6;
                                        }
                                      }
                                    } else {
                                      continue L5;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      param1.a(var14, -9332);
                      var6_ref = param1.field_o.field_m.j(18229);
                      L8: while (true) {
                        if (var6_ref == null) {
                          sh.a(param1.field_o.field_m, -5);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L9: {
                            if (var6_ref.field_y != param1.field_o) {
                              var6_ref.a(16);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var6_ref = param1.field_o.field_m.h(-23410);
                          continue L8;
                        }
                      }
                    } else {
                      var5.field_R = param1;
                      var5 = (ln) ((Object) var14.a((byte) -71));
                      continue L2;
                    }
                  }
                } else {
                  var15 = (ln) ((Object) var4.h(118));
                  var14.a((byte) -113, var15);
                  if (var15.field_D != null) {
                    var12 = var15.field_D;
                    var6 = var12;
                    var7_int = 0;
                    L10: while (true) {
                      if (var7_int >= var12.length) {
                        continue L1;
                      } else {
                        L11: {
                          var16 = var12[var7_int];
                          var18 = var16;
                          var18 = var16;
                          if (var16.field_R == param1) {
                            var16.field_R = null;
                            var4.a((byte) -113, var16);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var7_int++;
                        continue L10;
                      }
                    }
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) (var3);
            stackOut_38_1 = new StringBuilder().append("dc.R(").append(param0).append(',');
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param1 == null) {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L12;
            } else {
              stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L12;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, ln param1) {
        sd var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (param0 > 57) {
              var3 = param1.field_R;
              if (var3 != null) {
                L1: {
                  param1.field_R = null;
                  param1.b((byte) -111);
                  param1.a(16);
                  if (param1 == var3.field_o.field_m.field_q) {
                    var3.field_o.field_m.field_q = var3.field_o.field_m.j(18229);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var3.field_q == param1) {
                    if (var3.e(27650)) {
                      var3.b((byte) -81);
                      break L2;
                    } else {
                      var3.field_q = var3.j(18229);
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var3.e(27650)) {
                    break L3;
                  } else {
                    this.a(72, var3);
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("dc.N(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
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

    private final void a(k param0, int param1, int param2) {
        ln dupTemp$4 = null;
        int incrementValue$5 = 0;
        ln dupTemp$6 = null;
        int incrementValue$7 = 0;
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ln[] var6 = null;
        int var7 = 0;
        ln var8_ref_ln = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        ln[] var17 = null;
        ln[] var18 = null;
        ln var19 = null;
        ln[] var20 = null;
        ln var21 = null;
        ln[] var22 = null;
        ln var23 = null;
        ln[] var24 = null;
        ln var25 = null;
        ln[] var26 = null;
        ln var27 = null;
        int[] var31 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        var15 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = this.field_g.field_e.length;
                if (ec.field_r == null) {
                  break L2;
                } else {
                  if (ec.field_r.length < var4_int) {
                    break L2;
                  } else {
                    var5 = 0;
                    L3: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        ec.field_r[var5] = false;
                        var5++;
                        continue L3;
                      }
                    }
                  }
                }
              }
              ec.field_r = new boolean[var4_int];
              break L1;
            }
            L4: while (true) {
              var5 = 0;
              var17 = this.field_g.field_e;
              var7 = 0;
              L5: while (true) {
                if (var7 >= var17.length) {
                  L6: {
                    if (var5 == 0) {
                      break L6;
                    } else {
                      if (!this.field_o.field_k) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var6 = new ln[16];
                  var7 = 16;
                  var20 = this.field_g.field_e;
                  var10 = 0;
                  L7: while (true) {
                    if (var20.length <= var10) {
                      var24 = this.field_g.field_e;
                      var10 = 0;
                      L8: while (true) {
                        if (var24.length <= var10) {
                          L9: {
                            if (param2 == 14389) {
                              break L9;
                            } else {
                              this.field_u = (int[]) null;
                              break L9;
                            }
                          }
                          var9 = 0;
                          L10: while (true) {
                            if (var4_int <= var9) {
                              break L0;
                            } else {
                              ec.field_r[var9] = false;
                              var9++;
                              continue L10;
                            }
                          }
                        } else {
                          L11: {
                            var25 = var24[var10];
                            if (var25.field_D.length <= var7) {
                              break L11;
                            } else {
                              var6 = new ln[var25.field_D.length];
                              var7 = var25.field_D.length;
                              break L11;
                            }
                          }
                          L12: {
                            if (var25.field_y == null) {
                              break L12;
                            } else {
                              if (ec.field_r[var25.field_p]) {
                                var8 = 0;
                                var26 = var25.field_D;
                                var13 = 0;
                                L13: while (true) {
                                  if (var13 >= var26.length) {
                                    L14: {
                                      if (0 == var8) {
                                        if (param0 == null) {
                                          break L14;
                                        } else {
                                          param0.a(var25.field_x, var25, true);
                                          break L14;
                                        }
                                      } else {
                                        this.field_L.setSeed((long)(param1 ^ var25.field_p));
                                        if (param0 != null) {
                                          var16 = new int[var8];
                                          var31 = var16;
                                          var13 = 0;
                                          L15: while (true) {
                                            if (var25.field_x <= var13) {
                                              param0.a(var25, param2 + -14316, var31, var6);
                                              break L14;
                                            } else {
                                              var14 = qf.a((byte) 115, var8, this.field_L);
                                              var16[var14] = var16[var14] + 1;
                                              var6[var14].field_x = var6[var14].field_x + 1;
                                              var13++;
                                              continue L15;
                                            }
                                          }
                                        } else {
                                          var12 = 0;
                                          L16: while (true) {
                                            if (var12 >= var25.field_x) {
                                              break L14;
                                            } else {
                                              dupTemp$4 = var6[qf.a((byte) 27, var8, this.field_L)];
                                              dupTemp$4.field_x = dupTemp$4.field_x + 1;
                                              var12++;
                                              continue L16;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    this.a(-21031, var25);
                                    if (var25.field_R != null) {
                                      throw new RuntimeException();
                                    } else {
                                      break L12;
                                    }
                                  } else {
                                    var27 = var26[var13];
                                    if (var25.field_y == var27.field_y) {
                                      L17: {
                                        if (!ec.field_r[var27.field_p]) {
                                          incrementValue$5 = var8;
                                          var8++;
                                          var6[incrementValue$5] = var27;
                                          break L17;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      var13++;
                                      continue L13;
                                    } else {
                                      var13++;
                                      continue L13;
                                    }
                                  }
                                }
                              } else {
                                break L12;
                              }
                            }
                          }
                          var10++;
                          continue L8;
                        }
                      }
                    } else {
                      L18: {
                        var21 = var20[var10];
                        var25 = var21;
                        var25 = var21;
                        if (-1 > (var21.field_Q ^ -1)) {
                          var8 = 0;
                          var22 = var21.field_D;
                          var13 = 0;
                          L19: while (true) {
                            if (var13 >= var22.length) {
                              if (-1 == (var8 ^ -1)) {
                                break L18;
                              } else {
                                this.field_L.setSeed((long)(param1 ^ var21.field_p));
                                var12 = 0;
                                L20: while (true) {
                                  if (var12 >= var21.field_Q) {
                                    break L18;
                                  } else {
                                    dupTemp$6 = var6[qf.a((byte) 78, var8, this.field_L)];
                                    dupTemp$6.field_x = dupTemp$6.field_x + 1;
                                    var12++;
                                    continue L20;
                                  }
                                }
                              }
                            } else {
                              var23 = var22[var13];
                              var25 = var23;
                              var25 = var23;
                              if (var23.field_y == var21.field_t) {
                                L21: {
                                  if (!ec.field_r[var23.field_p]) {
                                    incrementValue$7 = var8;
                                    var8++;
                                    var6[incrementValue$7] = var23;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                var13++;
                                continue L19;
                              } else {
                                var13++;
                                continue L19;
                              }
                            }
                          }
                        } else {
                          break L18;
                        }
                      }
                      L22: {
                        if (0 >= var21.field_C) {
                          break L22;
                        } else {
                          if (var21.field_t != var21.field_y) {
                            break L22;
                          } else {
                            if (!ec.field_r[var21.field_p]) {
                              var21.field_x = var21.field_x + var21.field_C;
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      L23: {
                        if (null == var21.field_y) {
                          break L23;
                        } else {
                          var21.field_t = var21.field_y;
                          break L23;
                        }
                      }
                      var10++;
                      continue L7;
                    }
                  }
                } else {
                  L24: {
                    var8_ref_ln = var17[var7];
                    var19 = var8_ref_ln;
                    var25 = var19;
                    var19 = var8_ref_ln;
                    if (var8_ref_ln.field_y == null) {
                      break L24;
                    } else {
                      if (!ec.field_r[var8_ref_ln.field_p]) {
                        if (var8_ref_ln.field_N <= var8_ref_ln.field_x) {
                          break L24;
                        } else {
                          ec.field_r[var8_ref_ln.field_p] = true;
                          var5 = 1;
                          var18 = var8_ref_ln.field_D;
                          var10 = 0;
                          L25: while (true) {
                            if (var18.length <= var10) {
                              break L24;
                            } else {
                              L26: {
                                var19 = var18[var10];
                                var25 = var19;
                                var25 = var19;
                                if (var8_ref_ln.field_y != var19.field_y) {
                                  break L26;
                                } else {
                                  if (ec.field_r[var19.field_p]) {
                                    break L26;
                                  } else {
                                    this.a(var19, true, (byte) 125);
                                    break L26;
                                  }
                                }
                              }
                              var10++;
                              continue L25;
                            }
                          }
                        }
                      } else {
                        break L24;
                      }
                    }
                  }
                  var7++;
                  continue L5;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var4 = decompiledCaughtException;
            stackOut_83_0 = (RuntimeException) (var4);
            stackOut_83_1 = new StringBuilder().append("dc.HA(");
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param0 == null) {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L27;
            } else {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L27;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void d(int param0, int param1) {
        this.field_O = param1;
        if (param0 != -9778) {
            this.field_r = -91;
        }
    }

    dc(int param0, vr param1, int param2, String[] param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        this.field_n = 0;
        this.field_G = 0;
        try {
          L0: {
            this.field_J = param0;
            this.field_o = param1;
            this.field_M = param2;
            this.field_r = param3.length;
            this.field_v = new fs[this.field_r];
            this.field_k = -1;
            this.field_D = new int[this.field_r];
            this.field_I = param3;
            var5_int = 0;
            L1: while (true) {
              if ((this.field_r ^ -1) >= (var5_int ^ -1)) {
                L2: {
                  var5_int = this.field_M;
                  if (0 == var5_int) {
                    this.field_x = (me) ((Object) new jj(this.field_v));
                    break L2;
                  } else {
                    if (1 == var5_int) {
                      this.field_x = (me) ((Object) new ui(this.field_v));
                      break L2;
                    } else {
                      if (var5_int == 2) {
                        this.field_x = (me) ((Object) new nh(this.field_v));
                        break L2;
                      } else {
                        if (-4 == (var5_int ^ -1)) {
                          this.field_x = (me) ((Object) new hp(this.field_v));
                          break L2;
                        } else {
                          if (0 == (var5_int ^ -1)) {
                            this.field_x = (me) ((Object) new qg(this.field_v));
                            break L2;
                          } else {
                            throw new RuntimeException("No VictoryChecker known for gametype " + this.field_M);
                          }
                        }
                      }
                    }
                  }
                }
                this.field_p = new el();
                this.field_q = new pf();
                this.field_i = new pf();
                this.field_B = new int[this.field_r + 1];
                this.field_H = new int[this.field_r - -1];
                this.field_h = new int[this.field_r];
                this.field_K = new int[1 + this.field_r];
                this.field_u = new int[1 + this.field_r];
                this.field_A = new pf();
                this.field_L = (Random) ((Object) new ea());
                break L0;
              } else {
                this.field_v[var5_int] = new fs(var5_int, this.field_I[var5_int], or.field_b[var5_int], df.field_k[var5_int], ho.field_e[var5_int]);
                this.field_v[var5_int].field_f = new int[this.field_r];
                this.field_v[var5_int].field_h = new boolean[this.field_r];
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var5);
            stackOut_18_1 = new StringBuilder().append("dc.<init>(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          L4: {
            stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
    }

    private final void a(byte param0, ln param1, eg param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        mg var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ln var11 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != param1.field_y) {
                var4_int = this.field_h[param1.field_y.field_x];
                var5 = this.field_u[param1.field_y.field_x];
                var6 = var4_int - var5;
                if (var5 > 0) {
                  L2: {
                    var7 = var6 / 2;
                    if (param2 == null) {
                      break L2;
                    } else {
                      param2.a(var6, var4_int, var7, 124);
                      break L2;
                    }
                  }
                  param1.field_C = param1.field_C + var7;
                  break L1;
                } else {
                  L3: {
                    if (param2 != null) {
                      param2.a(var4_int, 14775, var6);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  param1.field_Q = var4_int / 2;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L4: {
              var4_ref = (mg) ((Object) param1.field_s.c(-128));
              if (param0 <= -122) {
                break L4;
              } else {
                var11 = (ln) null;
                this.a((ln) null, -35, (ln) null);
                break L4;
              }
            }
            L5: while (true) {
              if (var4_ref == null) {
                break L0;
              } else {
                L6: {
                  if (var4_ref.field_G != param1.field_y) {
                    L7: {
                      var5 = this.field_h[var4_ref.field_G.field_x];
                      var6 = this.field_u[var4_ref.field_G.field_x];
                      var7 = -var6 + var5;
                      var8 = var4_ref.field_z * var7 / var5;
                      var9 = var8 / 2;
                      var8 = var8 - var9;
                      if (param2 != null) {
                        param2.a(var9, 0, var4_ref, var8);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var4_ref.field_y.field_C = var4_ref.field_y.field_C + var9;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var4_ref = (mg) ((Object) param1.field_s.b(32));
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("dc.OA(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
    }

    static {
        field_E = new pf();
        field_s = new int[8192];
        field_a = "This game has started.";
        field_l = new np(1);
    }
}
