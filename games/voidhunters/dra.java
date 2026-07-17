/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dra extends f {
    private kka field_o;
    hbb field_n;
    private int field_u;
    static phb[] field_v;
    private boolean field_q;
    private int field_s;
    private hbb field_j;
    private kka field_m;
    private int[] field_r;
    private kka field_w;
    private int field_h;
    private int[] field_p;
    hbb field_k;
    private boolean field_i;
    private hbb field_l;
    private int field_t;

    final void a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_34_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        var11 = VoidHunters.field_G;
        try {
          L0: {
            if (((dra) this).field_h <= 0) {
              ((dra) this).a(param2);
              return;
            } else {
              L1: {
                if (!((dra) this).field_q) {
                  break L1;
                } else {
                  L2: {
                    if (((dra) this).field_t <= 0) {
                      break L2;
                    } else {
                      if (!((dra) this).field_k.c(-93)) {
                        ((dra) this).field_o = null;
                        ((dra) this).field_q = false;
                        ((dra) this).field_t = -((dra) this).field_t;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((dra) this).field_t >= 0) {
                    break L1;
                  } else {
                    if (((dra) this).field_j.c(-123)) {
                      break L1;
                    } else {
                      ((dra) this).field_q = false;
                      ((dra) this).field_m = null;
                      ((dra) this).field_t = -((dra) this).field_t;
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = ((dra) this).field_h * (((dra) this).field_s >> 12) / 256;
                var5 = ((dra) this).field_h - var4_int;
                if (((dra) this).field_t != 0) {
                  ((dra) this).field_s = ((dra) this).field_s + param2 * ((dra) this).field_t;
                  if (((dra) this).field_s < 1048576) {
                    if (((dra) this).field_s > 0) {
                      break L3;
                    } else {
                      ((dra) this).field_s = 0;
                      if (((dra) this).field_q) {
                        break L3;
                      } else {
                        ((dra) this).field_t = 0;
                        if (!((dra) this).field_i) {
                          L4: {
                            if (null == ((dra) this).field_o) {
                              break L4;
                            } else {
                              ((dra) this).field_k.a(true);
                              break L4;
                            }
                          }
                          ((dra) this).field_o = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  } else {
                    ((dra) this).field_s = 1048576;
                    if (!((dra) this).field_q) {
                      ((dra) this).field_t = 0;
                      if (!((dra) this).field_i) {
                        L5: {
                          if (null != ((dra) this).field_m) {
                            ((dra) this).field_j.a(true);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        ((dra) this).field_m = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (vka.field_r) {
                  stackOut_33_0 = param2 << 1;
                  stackIn_34_0 = stackOut_33_0;
                  break L6;
                } else {
                  stackOut_32_0 = param2;
                  stackIn_34_0 = stackOut_32_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_34_0;
                if (((dra) this).field_u >= 256) {
                  break L7;
                } else {
                  L8: {
                    if (((dra) this).field_o != null) {
                      break L8;
                    } else {
                      if (((dra) this).field_m == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int == 256) {
                    ((dra) this).field_k.a(param0, param1, param2);
                    break L7;
                  } else {
                    if (var5 == 256) {
                      ((dra) this).field_j.a(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (((dra) this).field_r == null) {
                            break L10;
                          } else {
                            if (var6 <= ((dra) this).field_r.length) {
                              cua.a(((dra) this).field_r, 0, var6);
                              cua.a(((dra) this).field_p, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((dra) this).field_p = new int[var6];
                        ((dra) this).field_r = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((dra) this).field_k.a(((dra) this).field_r, 0, param2);
                        ((dra) this).field_j.a(((dra) this).field_p, 0, param2);
                        if (vka.field_r) {
                          param1 = param1 << 1;
                          stackOut_47_0 = param1 << 1;
                          stackIn_48_0 = stackOut_47_0;
                          break L11;
                        } else {
                          stackOut_46_0 = param1;
                          stackIn_48_0 = stackOut_46_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_48_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 + var8] = param0[var7 + var8] + (var5 * ((dra) this).field_p[var8] + ((dra) this).field_r[var8] * var4_int >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  }
                }
              }
              L13: {
                L14: {
                  if (((dra) this).field_w == null) {
                    break L14;
                  } else {
                    if (0 != ((dra) this).field_u) {
                      L15: {
                        L16: {
                          if (null == ((dra) this).field_r) {
                            break L16;
                          } else {
                            if (~((dra) this).field_r.length > ~var6) {
                              break L16;
                            } else {
                              cua.a(((dra) this).field_r, 0, var6);
                              break L15;
                            }
                          }
                        }
                        ((dra) this).field_p = new int[var6];
                        ((dra) this).field_r = new int[var6];
                        break L15;
                      }
                      L17: {
                        ((dra) this).field_l.a(((dra) this).field_r, 0, param2);
                        if (vka.field_r) {
                          param1 = param1 << 1;
                          stackOut_62_0 = param1 << 1;
                          stackIn_63_0 = stackOut_62_0;
                          break L17;
                        } else {
                          stackOut_61_0 = param1;
                          stackIn_63_0 = stackOut_61_0;
                          break L17;
                        }
                      }
                      var7 = stackIn_63_0;
                      var8 = ((dra) this).field_h * ((dra) this).field_u / 256;
                      var9 = -var8 + ((dra) this).field_h;
                      var10 = 0;
                      L18: while (true) {
                        if (~var6 >= ~var10) {
                          break L14;
                        } else {
                          param0[var10 + var7] = var8 * ((dra) this).field_r[var10] + param0[var10 + var7] * var9 >> 8;
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      break L13;
                    }
                  }
                }
                break L13;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var4;
            stackOut_67_1 = new StringBuilder().append("dra.E(");
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param0 == null) {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L19;
            } else {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L19;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = VoidHunters.field_G;
          if (((dra) this).field_s <= 0) {
            if (((dra) this).field_s < 1048576) {
              if (null == ((dra) this).field_m) {
                break L0;
              } else {
                ((dra) this).field_j.a(param0);
                break L0;
              }
            } else {
              if (((dra) this).field_s >= 1048576) {
                break L0;
              } else {
                if (null == ((dra) this).field_m) {
                  break L0;
                } else {
                  ((dra) this).field_j.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (((dra) this).field_s >= 1048576) {
              break L0;
            } else {
              if (null == ((dra) this).field_m) {
                break L0;
              } else {
                ((dra) this).field_j.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= ((dra) this).field_u) {
            break L1;
          } else {
            if (null != ((dra) this).field_w) {
              ((dra) this).field_l.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((dra) this).field_q) {
            L3: {
              if (((dra) this).field_t <= 0) {
                break L3;
              } else {
                if (!((dra) this).field_k.c(-110)) {
                  ((dra) this).field_o = null;
                  ((dra) this).field_q = false;
                  ((dra) this).field_t = -((dra) this).field_t;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (0 <= ((dra) this).field_t) {
              break L2;
            } else {
              if (!((dra) this).field_j.c(-102)) {
                ((dra) this).field_q = false;
                ((dra) this).field_t = -((dra) this).field_t;
                ((dra) this).field_m = null;
                break L2;
              } else {
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L4: {
          if (((dra) this).field_t != 0) {
            ((dra) this).field_s = ((dra) this).field_s + param0 * ((dra) this).field_t;
            if (1048576 <= ((dra) this).field_s) {
              ((dra) this).field_s = 1048576;
              if (((dra) this).field_q) {
                break L4;
              } else {
                ((dra) this).field_t = 0;
                if (((dra) this).field_i) {
                  break L4;
                } else {
                  L5: {
                    if (null != ((dra) this).field_m) {
                      ((dra) this).field_j.a(true);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  ((dra) this).field_m = null;
                  break L4;
                }
              }
            } else {
              if (((dra) this).field_s <= 0) {
                ((dra) this).field_s = 0;
                if (((dra) this).field_q) {
                  break L4;
                } else {
                  ((dra) this).field_t = 0;
                  if (!((dra) this).field_i) {
                    L6: {
                      if (((dra) this).field_o == null) {
                        break L6;
                      } else {
                        ((dra) this).field_k.a(true);
                        break L6;
                      }
                    }
                    ((dra) this).field_o = null;
                    break L4;
                  } else {
                    break L4;
                  }
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

    private final void a(hbb param0, int param1, int param2, int param3) {
        try {
            if (param2 >= -112) {
                ((dra) this).field_k = null;
            }
            ((dra) this).field_n = param0;
            param0.b(param1, (byte) 18, -1);
            param0.a((byte) 30, param3);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "dra.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void a(byte param0, int param1) {
        if (param0 <= 67) {
            return;
        }
        lla.field_b = 3;
        lla.field_e = lla.field_b / 2;
    }

    final synchronized void a(int param0, kka param1, int param2, int param3) {
        try {
            int var5_int = -83 % ((-81 - param0) / 45);
            ((dra) this).a(256, param2, false, param1, -123, param3);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "dra.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    final f c() {
        return null;
    }

    final synchronized void b(byte param0, int param1) {
        ((dra) this).field_h = param1;
        if (param0 != -108) {
            dra.c(72);
        }
    }

    final synchronized int d() {
        return 2;
    }

    private final void a(int param0, hbb param1, hbb param2) {
        try {
            ((dra) this).field_k = param1;
            ((dra) this).field_j = param2;
            int var4_int = 88 % ((73 - param0) / 51);
            ((dra) this).field_s = 1048576;
            ((dra) this).field_n = ((dra) this).field_k;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "dra.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final f a() {
        return null;
    }

    final synchronized void a(int param0, int param1, boolean param2, kka param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_29_0 = 0;
        hbb stackIn_38_0 = null;
        hbb stackIn_39_0 = null;
        hbb stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        hbb stackIn_47_0 = null;
        hbb stackIn_48_0 = null;
        hbb stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        hbb stackOut_46_0 = null;
        hbb stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        hbb stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        hbb stackOut_37_0 = null;
        hbb stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        hbb stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (!((dra) this).field_q) {
                break L1;
              } else {
                if (param2) {
                  L2: {
                    if (((dra) this).field_t > 0) {
                      L3: {
                        if (null == ((dra) this).field_o) {
                          break L3;
                        } else {
                          ((dra) this).field_k.a(true);
                          break L3;
                        }
                      }
                      ((dra) this).field_o = param3;
                      if (param3 != null) {
                        ((dra) this).field_k.a(false, param3, -1);
                        this.a(((dra) this).field_k, param0, -125, param5);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null == ((dra) this).field_m) {
                          break L4;
                        } else {
                          ((dra) this).field_j.a(true);
                          break L4;
                        }
                      }
                      ((dra) this).field_m = param3;
                      if (param3 == null) {
                        break L2;
                      } else {
                        ((dra) this).field_j.a(false, param3, -1);
                        this.a(((dra) this).field_j, param0, -118, param5);
                        break L2;
                      }
                    }
                  }
                  return;
                } else {
                  break L1;
                }
              }
            }
            L5: {
              stackOut_15_0 = this;
              stackIn_17_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (!param2) {
                stackOut_17_0 = this;
                stackOut_17_1 = 0;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                break L5;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                break L5;
              }
            }
            ((dra) this).field_q = stackIn_18_1 != 0;
            var7_int = -19 / ((param4 - -81) / 32);
            if (((dra) this).field_o != param3) {
              if (param3 != ((dra) this).field_m) {
                L6: {
                  if (null == ((dra) this).field_o) {
                    var8 = 1;
                    break L6;
                  } else {
                    if (((dra) this).field_m == null) {
                      var8 = 0;
                      break L6;
                    } else {
                      L7: {
                        if (524288 <= ((dra) this).field_s) {
                          stackOut_28_0 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          break L7;
                        } else {
                          stackOut_27_0 = 1;
                          stackIn_29_0 = stackOut_27_0;
                          break L7;
                        }
                      }
                      var8 = stackIn_29_0;
                      break L6;
                    }
                  }
                }
                L8: {
                  if (var8 != 0) {
                    L9: {
                      if (null == ((dra) this).field_o) {
                        break L9;
                      } else {
                        ((dra) this).field_k.a(true);
                        break L9;
                      }
                    }
                    L10: {
                      ((dra) this).field_o = param3;
                      if (param3 != null) {
                        L11: {
                          stackOut_46_0 = ((dra) this).field_k;
                          stackIn_48_0 = stackOut_46_0;
                          stackIn_47_0 = stackOut_46_0;
                          if (param2) {
                            stackOut_48_0 = (hbb) (Object) stackIn_48_0;
                            stackOut_48_1 = 0;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            break L11;
                          } else {
                            stackOut_47_0 = (hbb) (Object) stackIn_47_0;
                            stackOut_47_1 = 1;
                            stackIn_49_0 = stackOut_47_0;
                            stackIn_49_1 = stackOut_47_1;
                            break L11;
                          }
                        }
                        ((hbb) (Object) stackIn_49_0).a(stackIn_49_1 != 0, param3, -1);
                        this.a(((dra) this).field_k, param0, -122, param5);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    ((dra) this).field_t = param1;
                    break L8;
                  } else {
                    L12: {
                      if (null != ((dra) this).field_m) {
                        ((dra) this).field_j.a(true);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      ((dra) this).field_m = param3;
                      if (param3 == null) {
                        break L13;
                      } else {
                        L14: {
                          stackOut_37_0 = ((dra) this).field_j;
                          stackIn_39_0 = stackOut_37_0;
                          stackIn_38_0 = stackOut_37_0;
                          if (param2) {
                            stackOut_39_0 = (hbb) (Object) stackIn_39_0;
                            stackOut_39_1 = 0;
                            stackIn_40_0 = stackOut_39_0;
                            stackIn_40_1 = stackOut_39_1;
                            break L14;
                          } else {
                            stackOut_38_0 = (hbb) (Object) stackIn_38_0;
                            stackOut_38_1 = 1;
                            stackIn_40_0 = stackOut_38_0;
                            stackIn_40_1 = stackOut_38_1;
                            break L14;
                          }
                        }
                        ((hbb) (Object) stackIn_40_0).a(stackIn_40_1 != 0, param3, -1);
                        this.a(((dra) this).field_j, param0, -117, param5);
                        break L13;
                      }
                    }
                    ((dra) this).field_t = -param1;
                    break L8;
                  }
                }
                break L0;
              } else {
                ((dra) this).field_t = -param1;
                this.a(((dra) this).field_j, param0, -128, param5);
                return;
              }
            } else {
              ((dra) this).field_t = param1;
              this.a(((dra) this).field_k, param0, -116, param5);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var7;
            stackOut_52_1 = new StringBuilder().append("dra.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param3 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L15;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L15;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 44 + param4 + 44 + param5 + 41);
        }
    }

    public static void c(int param0) {
        field_v = null;
        if (param0 <= 37) {
            field_v = null;
        }
    }

    dra(hbb param0, hbb param1, hbb param2) {
        ((dra) this).field_u = 0;
        ((dra) this).field_h = 256;
        ((dra) this).field_i = false;
        try {
            this.a(-93, param0, param1);
            ((dra) this).field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "dra.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
