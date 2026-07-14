/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lba extends fi {
    private int field_l;
    private int field_s;
    private int field_o;
    static int field_p;
    private int field_m;
    private int field_k;
    private int field_i;
    private byte[] field_n;
    private int field_q;
    static ina field_r;
    private int field_j;

    final void a(int param0, byte param1, int param2) {
        int var5 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        L0: {
          var5 = TombRacer.field_G ? 1 : 0;
          if (param1 < -37) {
            break L0;
          } else {
            lba.d(-7);
            break L0;
          }
        }
        if (0 != param2) {
          L1: {
            ((lba) this).field_l = ((lba) this).field_q * ((lba) this).field_o >> 1713718860;
            stackOut_7_0 = this;
            stackOut_7_1 = ((lba) this).field_j;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if ((param0 ^ -1) > -1) {
              stackOut_9_0 = this;
              stackOut_9_1 = stackIn_9_1;
              stackOut_9_2 = -param0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = this;
              stackOut_8_1 = stackIn_8_1;
              stackOut_8_2 = param0;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          ((lba) this).field_q = stackIn_10_1 + -stackIn_10_2;
          if (((lba) this).field_l >= 0) {
            if (4096 >= ((lba) this).field_l) {
              ((lba) this).field_q = ((lba) this).field_q * ((lba) this).field_q >> -1831798100;
              ((lba) this).field_q = ((lba) this).field_l * ((lba) this).field_q >> 940271724;
              ((lba) this).field_m = ((lba) this).field_m + (((lba) this).field_s * ((lba) this).field_q >> -37721428);
              ((lba) this).field_s = ((lba) this).field_k * ((lba) this).field_s >> -1831605204;
              return;
            } else {
              ((lba) this).field_l = 4096;
              ((lba) this).field_q = ((lba) this).field_q * ((lba) this).field_q >> -1831798100;
              ((lba) this).field_q = ((lba) this).field_l * ((lba) this).field_q >> 940271724;
              ((lba) this).field_m = ((lba) this).field_m + (((lba) this).field_s * ((lba) this).field_q >> -37721428);
              ((lba) this).field_s = ((lba) this).field_k * ((lba) this).field_s >> -1831605204;
              return;
            }
          } else {
            ((lba) this).field_l = 0;
            ((lba) this).field_q = ((lba) this).field_q * ((lba) this).field_q >> -1831798100;
            ((lba) this).field_q = ((lba) this).field_l * ((lba) this).field_q >> 940271724;
            ((lba) this).field_m = ((lba) this).field_m + (((lba) this).field_s * ((lba) this).field_q >> -37721428);
            ((lba) this).field_s = ((lba) this).field_k * ((lba) this).field_s >> -1831605204;
            return;
          }
        } else {
          L2: {
            stackOut_3_0 = this;
            stackOut_3_1 = ((lba) this).field_j;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (-1 < (param0 ^ -1)) {
              stackOut_5_0 = this;
              stackOut_5_1 = stackIn_5_1;
              stackOut_5_2 = -param0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = this;
              stackOut_4_1 = stackIn_4_1;
              stackOut_4_2 = param0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          ((lba) this).field_q = stackIn_6_1 + -stackIn_6_2;
          ((lba) this).field_q = ((lba) this).field_q * ((lba) this).field_q >> -18676436;
          ((lba) this).field_l = 4096;
          ((lba) this).field_m = ((lba) this).field_q;
          return;
        }
    }

    final static void a(int param0, int param1, cn param2, boolean param3, iu[][] param4, int[] param5, String[][] param6, cn param7, int[] param8, String[] param9, hja[] param10, String[][] param11, String[] param12, iu[][] param13, cn param14, int param15, int param16, byte[] param17, byte[] param18) {
        Object var20 = null;
        bba.a(param12, param9, param3, param0, param17, (String[]) null, 95, param15, param13, param5, param6, param7, param18, param2, param14, param4, param8, param16, param10, param11);
    }

    final static void a(boolean param0, int param1, int param2, byte param3, int param4, int param5, String param6, int param7) {
        if (param3 != 53) {
          field_p = -69;
          if (0 != sua.field_K.field_y) {
            if (!fua.field_g) {
              if (!ok.field_s) {
                ni.field_c = true;
                if (ni.field_c) {
                  av.a(param4, 20, param7, -5327, param6, param5, param2, param2, param1);
                  wi.field_s.c(-73, param0);
                  if (param0) {
                    if (lra.field_d.field_y == 0) {
                      if (0 == qpa.field_b.field_y) {
                        return;
                      } else {
                        ufa.a(true);
                        ni.field_c = false;
                        return;
                      }
                    } else {
                      ni.field_c = false;
                      if (0 == qpa.field_b.field_y) {
                        return;
                      } else {
                        ufa.a(true);
                        ni.field_c = false;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ola.e((byte) 112);
                if (ni.field_c) {
                  av.a(param4, 20, param7, -5327, param6, param5, param2, param2, param1);
                  wi.field_s.c(-73, param0);
                  if (param0) {
                    if (lra.field_d.field_y == 0) {
                      if (0 == qpa.field_b.field_y) {
                        return;
                      } else {
                        ufa.a(true);
                        ni.field_c = false;
                        return;
                      }
                    } else {
                      ni.field_c = false;
                      if (0 == qpa.field_b.field_y) {
                        return;
                      } else {
                        ufa.a(true);
                        ni.field_c = false;
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (ni.field_c) {
                av.a(param4, 20, param7, -5327, param6, param5, param2, param2, param1);
                wi.field_s.c(-73, param0);
                if (param0) {
                  if (lra.field_d.field_y == 0) {
                    if (0 == qpa.field_b.field_y) {
                      return;
                    } else {
                      ufa.a(true);
                      ni.field_c = false;
                      return;
                    }
                  } else {
                    ni.field_c = false;
                    if (0 == qpa.field_b.field_y) {
                      return;
                    } else {
                      ufa.a(true);
                      ni.field_c = false;
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (ni.field_c) {
              av.a(param4, 20, param7, -5327, param6, param5, param2, param2, param1);
              wi.field_s.c(-73, param0);
              if (param0) {
                if (lra.field_d.field_y == 0) {
                  if (0 == qpa.field_b.field_y) {
                    return;
                  } else {
                    ufa.a(true);
                    ni.field_c = false;
                    return;
                  }
                } else {
                  ni.field_c = false;
                  if (0 == qpa.field_b.field_y) {
                    return;
                  } else {
                    ufa.a(true);
                    ni.field_c = false;
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (0 != sua.field_K.field_y) {
            if (!fua.field_g) {
              if (!ok.field_s) {
                L0: {
                  ni.field_c = true;
                  if (ni.field_c) {
                    av.a(param4, 20, param7, -5327, param6, param5, param2, param2, param1);
                    wi.field_s.c(-73, param0);
                    if (param0) {
                      if (lra.field_d.field_y == 0) {
                        L1: {
                          if (0 == qpa.field_b.field_y) {
                            break L1;
                          } else {
                            ufa.a(true);
                            ni.field_c = false;
                            break L1;
                          }
                        }
                        return;
                      } else {
                        L2: {
                          ni.field_c = false;
                          if (0 == qpa.field_b.field_y) {
                            break L2;
                          } else {
                            ufa.a(true);
                            ni.field_c = false;
                            break L2;
                          }
                        }
                        return;
                      }
                    } else {
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
                return;
              } else {
                L3: {
                  ola.e((byte) 112);
                  if (ni.field_c) {
                    av.a(param4, 20, param7, -5327, param6, param5, param2, param2, param1);
                    wi.field_s.c(-73, param0);
                    if (param0) {
                      L4: {
                        if (lra.field_d.field_y == 0) {
                          break L4;
                        } else {
                          ni.field_c = false;
                          break L4;
                        }
                      }
                      if (0 == qpa.field_b.field_y) {
                        break L3;
                      } else {
                        ufa.a(true);
                        ni.field_c = false;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                return;
              }
            } else {
              if (ni.field_c) {
                av.a(param4, 20, param7, -5327, param6, param5, param2, param2, param1);
                wi.field_s.c(-73, param0);
                if (param0) {
                  if (lra.field_d.field_y == 0) {
                    if (0 != qpa.field_b.field_y) {
                      ufa.a(true);
                      ni.field_c = false;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L5: {
                      ni.field_c = false;
                      if (0 == qpa.field_b.field_y) {
                        break L5;
                      } else {
                        ufa.a(true);
                        ni.field_c = false;
                        break L5;
                      }
                    }
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
            if (ni.field_c) {
              av.a(param4, 20, param7, -5327, param6, param5, param2, param2, param1);
              wi.field_s.c(-73, param0);
              if (param0) {
                if (lra.field_d.field_y == 0) {
                  if (0 != qpa.field_b.field_y) {
                    ufa.a(true);
                    ni.field_c = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  ni.field_c = false;
                  if (0 != qpa.field_b.field_y) {
                    ufa.a(true);
                    ni.field_c = false;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void a(byte param0) {
        Object var3 = null;
        if (param0 != 50) {
          var3 = null;
          loa discarded$2 = lba.a((byte) 11, (qea) null, 6);
          ((lba) this).field_m = 0;
          ((lba) this).field_i = 0;
          return;
        } else {
          ((lba) this).field_m = 0;
          ((lba) this).field_i = 0;
          return;
        }
    }

    final static loa a(byte param0, qea param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param0 == 27) {
          var3 = param2;
          if (-1 != (var3 ^ -1)) {
            if (var3 != 1) {
              if (2 != var3) {
                if ((var3 ^ -1) != -4) {
                  throw new IllegalStateException("Unrecognised maze gen type: " + param2);
                } else {
                  return (loa) (Object) new tna(param1);
                }
              } else {
                return (loa) (Object) new rja(param1);
              }
            } else {
              return (loa) (Object) new jra(param1);
            }
          } else {
            return (loa) (Object) new fva(param1);
          }
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_r = null;
        if (param0 != 1713718860) {
            lba.d(-50);
        }
    }

    void a(boolean param0, byte param1, int param2) {
        ((lba) this).field_n[param2] = (byte)param1;
        if (param0) {
            ((lba) this).field_l = 34;
        }
    }

    final void c(int param0) {
        ((lba) this).field_s = ((lba) this).field_k;
        if (param0 == 32164) {
          ((lba) this).field_m = ((lba) this).field_m >> 4;
          if ((((lba) this).field_m ^ -1) <= -1) {
            if (255 < ((lba) this).field_m) {
              ((lba) this).field_m = 255;
              ((lba) this).field_i = ((lba) this).field_i + 1;
              ((lba) this).a(false, (byte)((lba) this).field_m, ((lba) this).field_i);
              ((lba) this).field_m = 0;
              return;
            } else {
              ((lba) this).field_i = ((lba) this).field_i + 1;
              ((lba) this).a(false, (byte)((lba) this).field_m, ((lba) this).field_i);
              ((lba) this).field_m = 0;
              return;
            }
          } else {
            ((lba) this).field_m = 0;
            ((lba) this).field_i = ((lba) this).field_i + 1;
            ((lba) this).a(false, (byte)((lba) this).field_m, ((lba) this).field_i);
            ((lba) this).field_m = 0;
            return;
          }
        } else {
          ((lba) this).field_s = -4;
          ((lba) this).field_m = ((lba) this).field_m >> 4;
          if ((((lba) this).field_m ^ -1) <= -1) {
            if (255 >= ((lba) this).field_m) {
              ((lba) this).field_i = ((lba) this).field_i + 1;
              ((lba) this).a(false, (byte)((lba) this).field_m, ((lba) this).field_i);
              ((lba) this).field_m = 0;
              return;
            } else {
              ((lba) this).field_m = 255;
              ((lba) this).field_i = ((lba) this).field_i + 1;
              ((lba) this).a(false, (byte)((lba) this).field_m, ((lba) this).field_i);
              ((lba) this).field_m = 0;
              return;
            }
          } else {
            ((lba) this).field_m = 0;
            ((lba) this).field_i = ((lba) this).field_i + 1;
            ((lba) this).a(false, (byte)((lba) this).field_m, ((lba) this).field_i);
            ((lba) this).field_m = 0;
            return;
          }
        }
    }

    lba(int param0, int param1, int param2, int param3, int param4, float param5, float param6, float param7) {
        super(param0, param1, param2, param3, param4);
        ((lba) this).field_j = (int)(param6 * 4096.0f);
        ((lba) this).field_o = (int)(param7 * 4096.0f);
        ((lba) this).field_k = (int)(4096.0 * Math.pow(0.5, (double)(-param5)));
        ((lba) this).field_s = (int)(4096.0 * Math.pow(0.5, (double)(-param5)));
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
    }
}
