/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends kd {
    private int[] field_u;
    private cg field_D;
    private int field_s;
    private vk field_w;
    private int field_I;
    private int field_t;
    private boolean field_A;
    static tg[] field_y;
    private vk field_z;
    static String field_r;
    private int[] field_C;
    private boolean field_G;
    private cg field_v;
    private cg field_E;
    private int field_F;
    private vk field_p;
    private static ko field_q;
    static vh field_x;
    static String[] field_H;
    static int[] field_B;

    final static void c(int param0) {
        if (param0 != 946) {
            return;
        }
        pj.field_H = new ko();
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_34_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_68_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        var11 = Pool.field_O;
        if ((((rq) this).field_F ^ -1) >= -1) {
          ((rq) this).a(param2);
          return;
        } else {
          L0: {
            if (((rq) this).field_G) {
              L1: {
                L2: {
                  if (0 >= ((rq) this).field_s) {
                    break L2;
                  } else {
                    if (!((rq) this).field_z.d(-11414)) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (((rq) this).field_s >= 0) {
                  break L0;
                } else {
                  if (!((rq) this).field_w.d(-11414)) {
                    ((rq) this).field_E = null;
                    ((rq) this).field_s = -((rq) this).field_s;
                    ((rq) this).field_G = false;
                    if (var11 == 0) {
                      break L0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              ((rq) this).field_s = -((rq) this).field_s;
              ((rq) this).field_D = null;
              ((rq) this).field_G = false;
              break L0;
            } else {
              break L0;
            }
          }
          L3: {
            var4 = ((rq) this).field_F * (((rq) this).field_t >> 1725067180) / 256;
            var5 = -var4 + ((rq) this).field_F;
            if (0 != ((rq) this).field_s) {
              L4: {
                ((rq) this).field_t = ((rq) this).field_t + param2 * ((rq) this).field_s;
                if ((((rq) this).field_t ^ -1) <= -1048577) {
                  break L4;
                } else {
                  if (0 < ((rq) this).field_t) {
                    break L3;
                  } else {
                    ((rq) this).field_t = 0;
                    if (!((rq) this).field_G) {
                      ((rq) this).field_s = 0;
                      if (((rq) this).field_A) {
                        break L3;
                      } else {
                        L5: {
                          if (((rq) this).field_D != null) {
                            ((rq) this).field_z.e(-1);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((rq) this).field_D = null;
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
              ((rq) this).field_t = 1048576;
              if (((rq) this).field_G) {
                break L3;
              } else {
                ((rq) this).field_s = 0;
                if (!((rq) this).field_A) {
                  L6: {
                    if (((rq) this).field_E != null) {
                      ((rq) this).field_w.e(-1);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((rq) this).field_E = null;
                  break L3;
                } else {
                  break L3;
                }
              }
            } else {
              break L3;
            }
          }
          L7: {
            if (bp.field_r) {
              stackOut_33_0 = param2 << 1182626785;
              stackIn_34_0 = stackOut_33_0;
              break L7;
            } else {
              stackOut_32_0 = param2;
              stackIn_34_0 = stackOut_32_0;
              break L7;
            }
          }
          L8: {
            var6 = stackIn_34_0;
            if (((rq) this).field_I >= 256) {
              break L8;
            } else {
              L9: {
                if (null != ((rq) this).field_D) {
                  break L9;
                } else {
                  if (null == ((rq) this).field_E) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (256 != var4) {
                  break L10;
                } else {
                  ((rq) this).field_z.a(param0, param1, param2);
                  if (var11 == 0) {
                    break L8;
                  } else {
                    break L10;
                  }
                }
              }
              L11: {
                if ((var5 ^ -1) == -257) {
                  break L11;
                } else {
                  L12: {
                    if (null == ((rq) this).field_u) {
                      break L12;
                    } else {
                      if (((rq) this).field_u.length < var6) {
                        break L12;
                      } else {
                        qn.a(((rq) this).field_u, 0, var6);
                        qn.a(((rq) this).field_C, 0, var6);
                        break L12;
                      }
                    }
                  }
                  ((rq) this).field_C = new int[var6];
                  ((rq) this).field_u = new int[var6];
                  L13: {
                    ((rq) this).field_z.a(((rq) this).field_u, 0, param2);
                    ((rq) this).field_w.a(((rq) this).field_C, 0, param2);
                    if (!bp.field_r) {
                      stackOut_48_0 = param1;
                      stackIn_49_0 = stackOut_48_0;
                      break L13;
                    } else {
                      param1 = param1 << 1;
                      stackOut_47_0 = param1 << 1;
                      stackIn_49_0 = stackOut_47_0;
                      break L13;
                    }
                  }
                  var7 = stackIn_49_0;
                  var8 = 0;
                  L14: while (true) {
                    if (var6 <= var8) {
                      if (var11 == 0) {
                        break L8;
                      } else {
                        break L11;
                      }
                    } else {
                      param0[var8 + var7] = param0[var8 + var7] + (((rq) this).field_C[var8] * var5 + var4 * ((rq) this).field_u[var8] >> -623326776);
                      var8++;
                      if (var11 != 0) {
                        break L8;
                      } else {
                        continue L14;
                      }
                    }
                  }
                }
              }
              ((rq) this).field_w.a(param0, param1, param2);
              break L8;
            }
          }
          L15: {
            if (null == ((rq) this).field_v) {
              break L15;
            } else {
              if (0 != ((rq) this).field_I) {
                L16: {
                  L17: {
                    L18: {
                      if (null == ((rq) this).field_u) {
                        break L18;
                      } else {
                        if (var6 <= ((rq) this).field_u.length) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    ((rq) this).field_u = new int[var6];
                    ((rq) this).field_C = new int[var6];
                    if (var11 == 0) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                  qn.a(((rq) this).field_u, 0, var6);
                  break L16;
                }
                L19: {
                  ((rq) this).field_p.a(((rq) this).field_u, 0, param2);
                  if (!bp.field_r) {
                    stackOut_67_0 = param1;
                    stackIn_68_0 = stackOut_67_0;
                    break L19;
                  } else {
                    param1 = param1 << 1;
                    stackOut_66_0 = param1 << 1;
                    stackIn_68_0 = stackOut_66_0;
                    break L19;
                  }
                }
                var7 = stackIn_68_0;
                var8 = ((rq) this).field_I * ((rq) this).field_F / 256;
                var9 = ((rq) this).field_F + -var8;
                var10 = 0;
                L20: while (true) {
                  if (var10 >= var6) {
                    break L15;
                  } else {
                    param0[var10 + var7] = var9 * param0[var10 + var7] - -(var8 * ((rq) this).field_u[var10]) >> -1937225080;
                    var10++;
                    if (var11 != 0) {
                      break L15;
                    } else {
                      continue L20;
                    }
                  }
                }
              } else {
                break L15;
              }
            }
          }
          return;
        }
    }

    final static kf a(int param0, nb param1) {
        kf var2 = new kf(param1, (ma) (Object) param1);
        if (param0 < 93) {
            return null;
        }
        mp.field_R.b((byte) -108, (ma) (Object) var2);
        wm.field_Xb.b((kd) (Object) param1);
        return var2;
    }

    final static void a(int param0, int param1) {
        uf var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        uf stackIn_8_0 = null;
        StringBuilder stackIn_14_0 = null;
        StringBuilder stackIn_15_0 = null;
        StringBuilder stackIn_16_0 = null;
        String stackIn_16_1 = null;
        uf stackOut_7_0 = null;
        uf stackOut_6_0 = null;
        StringBuilder stackOut_13_0 = null;
        StringBuilder stackOut_15_0 = null;
        String stackOut_15_1 = null;
        StringBuilder stackOut_14_0 = null;
        String stackOut_14_1 = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            rq.c(-63);
            break L0;
          }
        }
        L1: {
          if (ok.field_pb.length <= param1) {
            break L1;
          } else {
            if (0L != (1L << param1 & pd.field_i)) {
              L2: {
                if (null == ba.field_ub) {
                  stackOut_7_0 = am.field_e;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = ba.field_ub;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              var2 = stackIn_8_0;
              if (var2 == null) {
                break L1;
              } else {
                L3: {
                  var3 = new String(new char[4]);
                  var4 = param1 / 10;
                  if (0 == (2 & var4)) {
                    break L3;
                  } else {
                    var3 = var3 + "Ctrl ";
                    break L3;
                  }
                }
                L4: {
                  if ((1 & var4) == 0) {
                    break L4;
                  } else {
                    var3 = var3 + "Shift ";
                    break L4;
                  }
                }
                L5: {
                  stackOut_13_0 = new StringBuilder().append(var3);
                  stackIn_15_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if ((param1 % 10 ^ -1) > -10) {
                    stackOut_15_0 = (StringBuilder) (Object) stackIn_15_0;
                    stackOut_15_1 = Integer.toString(param1 % 10 + 1);
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L5;
                  } else {
                    stackOut_14_0 = (StringBuilder) (Object) stackIn_14_0;
                    stackOut_14_1 = "0";
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_16_1 = stackOut_14_1;
                    break L5;
                  }
                }
                var5 = stackIn_16_1;
                var3 = stackIn_16_1;
                ij discarded$2 = gj.a(true, 0, var5 + ": " + ok.field_pb[param1][0], ok.field_pb[param1][1]);
                break L1;
              }
            } else {
              break L1;
            }
          }
        }
    }

    public static void c(byte param0) {
        field_x = null;
        field_H = null;
        field_q = null;
        field_y = null;
        field_r = null;
        if (param0 < 42) {
            return;
        }
        field_B = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          wg.field_Nb[jh.field_c] = param1;
          ep.field_H[jh.field_c] = jh.field_c;
          kb.field_g[jh.field_c] = param3;
          if (q.field_a >= param3) {
            break L0;
          } else {
            jl.field_c = param3;
            break L0;
          }
        }
        L1: {
          if (gr.field_z > param3) {
            rn.field_d = param3;
            break L1;
          } else {
            break L1;
          }
        }
        ob.field_y[jh.field_c] = param4;
        om.field_s[jh.field_c] = param5;
        gd.field_d[jh.field_c] = param0;
        if (param2) {
          L2: {
            var6 = param5 + (param4 + param0);
            if (var6 != 0) {
              var7 = 1000 * param4 / var6;
              ah.field_c[jh.field_c] = var7;
              if (var7 >= rn.field_d) {
                break L2;
              } else {
                rn.field_d = var7;
                break L2;
              }
            } else {
              var7 = 0;
              ah.field_c[jh.field_c] = var7;
              if (var7 >= rn.field_d) {
                break L2;
              } else {
                rn.field_d = var7;
                break L2;
              }
            }
          }
          L3: {
            if (var7 > jl.field_c) {
              jl.field_c = var7;
              break L3;
            } else {
              break L3;
            }
          }
          jh.field_c = jh.field_c + 1;
          return;
        } else {
          return;
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = Pool.field_O;
          if (((rq) this).field_t > 0) {
            if (null != ((rq) this).field_D) {
              ((rq) this).field_z.a(param0);
              if (-1048577 < (((rq) this).field_t ^ -1)) {
                if (null != ((rq) this).field_E) {
                  ((rq) this).field_w.a(param0);
                  if ((((rq) this).field_I ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (null == ((rq) this).field_v) {
                      break L0;
                    } else {
                      ((rq) this).field_p.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if ((((rq) this).field_I ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (null == ((rq) this).field_v) {
                      break L0;
                    } else {
                      ((rq) this).field_p.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if ((((rq) this).field_I ^ -1) >= -1) {
                  break L0;
                } else {
                  if (null == ((rq) this).field_v) {
                    break L0;
                  } else {
                    ((rq) this).field_p.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (-1048577 > ((rq) this).field_t) {
                if (null != ((rq) this).field_E) {
                  ((rq) this).field_w.a(param0);
                  if ((((rq) this).field_I ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (null == ((rq) this).field_v) {
                      break L0;
                    } else {
                      ((rq) this).field_p.a(param0);
                      ((rq) this).field_w.a(param0);
                      if ((((rq) this).field_I ^ -1) >= -1) {
                        break L0;
                      } else {
                        if (null == ((rq) this).field_v) {
                          break L0;
                        } else {
                          ((rq) this).field_p.a(param0);
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  if ((((rq) this).field_I ^ -1) >= -1) {
                    break L0;
                  } else {
                    if (null == ((rq) this).field_v) {
                      break L0;
                    } else {
                      ((rq) this).field_p.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if ((((rq) this).field_I ^ -1) >= -1) {
                  break L0;
                } else {
                  if (null == ((rq) this).field_v) {
                    break L0;
                  } else {
                    ((rq) this).field_p.a(param0);
                    break L0;
                  }
                }
              }
            }
          } else {
            if (-1048577 < ((rq) this).field_t) {
              if (null != ((rq) this).field_E) {
                ((rq) this).field_w.a(param0);
                if ((((rq) this).field_I ^ -1) >= -1) {
                  break L0;
                } else {
                  if (null == ((rq) this).field_v) {
                    break L0;
                  } else {
                    ((rq) this).field_p.a(param0);
                    break L0;
                  }
                }
              } else {
                if ((((rq) this).field_I ^ -1) >= -1) {
                  break L0;
                } else {
                  if (null == ((rq) this).field_v) {
                    break L0;
                  } else {
                    ((rq) this).field_p.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if ((((rq) this).field_I ^ -1) >= -1) {
                break L0;
              } else {
                if (null == ((rq) this).field_v) {
                  break L0;
                } else {
                  ((rq) this).field_p.a(param0);
                  break L0;
                }
              }
            }
          }
        }
        L1: {
          if (((rq) this).field_G) {
            L2: {
              L3: {
                if (((rq) this).field_s <= 0) {
                  break L3;
                } else {
                  if (!((rq) this).field_z.d(-11414)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (-1 >= (((rq) this).field_s ^ -1)) {
                break L1;
              } else {
                if (!((rq) this).field_w.d(-11414)) {
                  ((rq) this).field_E = null;
                  ((rq) this).field_s = -((rq) this).field_s;
                  ((rq) this).field_G = false;
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  break L1;
                }
              }
            }
            ((rq) this).field_G = false;
            ((rq) this).field_s = -((rq) this).field_s;
            ((rq) this).field_D = null;
            break L1;
          } else {
            break L1;
          }
        }
        L4: {
          if (-1 != ((rq) this).field_s) {
            L5: {
              ((rq) this).field_t = ((rq) this).field_t + param0 * ((rq) this).field_s;
              if (-1048577 > ((rq) this).field_t) {
                break L5;
              } else {
                ((rq) this).field_t = 1048576;
                if (((rq) this).field_G) {
                  break L4;
                } else {
                  ((rq) this).field_s = 0;
                  if (!((rq) this).field_A) {
                    L6: {
                      if (null == ((rq) this).field_E) {
                        break L6;
                      } else {
                        ((rq) this).field_w.e(-1);
                        break L6;
                      }
                    }
                    ((rq) this).field_E = null;
                    if (var3 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  } else {
                    break L4;
                  }
                }
              }
            }
            if (((rq) this).field_t > 0) {
              break L4;
            } else {
              ((rq) this).field_t = 0;
              if (!((rq) this).field_G) {
                ((rq) this).field_s = 0;
                if (!((rq) this).field_A) {
                  L7: {
                    if (((rq) this).field_D == null) {
                      break L7;
                    } else {
                      ((rq) this).field_z.e(-1);
                      break L7;
                    }
                  }
                  ((rq) this).field_D = null;
                  break L4;
                } else {
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
    }

    final static boolean a(int param0, int param1, boolean param2, double param3, int param4, double[] param5, int[] param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        int stackIn_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          var8 = param4 + -320;
          var9 = param1 - 240;
          var10 = -param3 * (double)((float)param6[6] * 0.0000152587890625f * (float)var9) / 512.0 + ((double)(0.0000152587890625f * (float)param6[9]) * -param3 + (double)((float)var8 * ((float)param6[3] * 0.0000152587890625f)) * -param3 / 512.0);
          var12 = (double)(0.0000152587890625f * (float)param6[10]) * -param3 + (double)((float)var8 * ((float)param6[4] * 0.0000152587890625f)) * -param3 / 512.0 + (double)((float)var9 * ((float)param6[7] * 0.0000152587890625f)) * -param3 / 512.0;
          var14 = -param3 * (double)((float)param6[8] * 0.0000152587890625f * (float)var9) / 512.0 + ((double)(0.0000152587890625f * (float)param6[11]) * -param3 + (double)((float)var8 * (0.0000152587890625f * (float)param6[5])) * -param3 / 512.0);
          var16 = Math.sqrt(var10 * var10 + var12 * var12 + var14 * var14);
          var14 = var14 / var16;
          var12 = var12 / var16;
          var10 = var10 / var16;
          var18 = (double)(-param6[2] + param0) / var14;
          if (!param2) {
            break L0;
          } else {
            rq.a((byte) -106, -122);
            break L0;
          }
        }
        L1: {
          param5[0] = ((double)param6[0] + var10 * var18) / 8.0;
          param5[1] = ((double)param6[1] + var12 * var18) / 8.0;
          if (0.0 <= var14) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        return stackIn_5_0 != 0;
    }

    final static void a(byte param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        fr var5 = null;
        byte[] var5_array = null;
        int var6 = 0;
        fr var6_ref_fr = null;
        int var7 = 0;
        byte[] var8 = null;
        fr var9 = null;
        L0: {
          var7 = Pool.field_O;
          if (ld.field_c != 0) {
            L1: {
              var2 = rl.a((byte) -94);
              var4 = ld.field_c;
              if (u.field_b != 0.0) {
                var4 = (int)((double)var4 + lc.field_P.nextGaussian() * u.field_b);
                if (-1 >= (var4 ^ -1)) {
                  break L1;
                } else {
                  var4 = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (0 >= ej.field_j.field_v) {
                break L2;
              } else {
                var8 = new byte[ej.field_j.field_v];
                var5_array = var8;
                var6 = 0;
                L3: while (true) {
                  L4: {
                    if (var6 >= var8.length) {
                      break L4;
                    } else {
                      var8[var6] = ej.field_j.field_t[var6];
                      var6++;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (var7 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var6_ref_fr = new fr((long)var4 + var2, ej.field_j.field_v, var8);
                  field_q.b((byte) 90, (ma) (Object) var6_ref_fr);
                  ej.field_j.field_v = 0;
                  break L2;
                }
              }
            }
            L5: {
              var9 = (fr) (Object) field_q.c((byte) -73);
              var5 = var9;
              if (var5 == null) {
                break L5;
              } else {
                if ((var5.field_p ^ -1L) > (var2 ^ -1L)) {
                  var5.a((byte) -117);
                  var6 = 0;
                  L6: while (true) {
                    if (var6 >= var5.field_r) {
                      ej.field_j.field_v = var5.field_r;
                      break L5;
                    } else {
                      ej.field_j.field_t[var6] = var9.field_l[var6];
                      var6++;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        if (var7 == 0) {
                          continue L6;
                        } else {
                          ej.field_j.field_v = var5.field_r;
                          if (param0 < -16) {
                            break L0;
                          } else {
                            rq.a((byte) -17, -81);
                            break L0;
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (param0 < -16) {
                    break L0;
                  } else {
                    rq.a((byte) -17, -81);
                    break L0;
                  }
                }
              }
            }
            if (param0 < -16) {
              break L0;
            } else {
              rq.a((byte) -17, -81);
              break L0;
            }
          } else {
            if (param0 < -16) {
              break L0;
            } else {
              rq.a((byte) -17, -81);
              break L0;
            }
          }
        }
        de.a(param1, 0);
    }

    final kd a() {
        return null;
    }

    final synchronized void b(int param0, int param1) {
        ((rq) this).field_F = param0;
        if (param1 != 11557) {
            field_H = null;
        }
    }

    final synchronized int d() {
        return 2;
    }

    final kd b() {
        return null;
    }

    private rq() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_y = new tg[255];
        field_r = "This is your RuneScape clan if you have one.";
        for (var0 = 0; var0 < field_y.length; var0++) {
            field_y[var0] = new tg();
        }
        field_B = new int[]{20, 21, 49, 6, 8};
    }
}
