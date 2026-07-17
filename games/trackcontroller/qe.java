/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends wh {
    private int field_t;
    private int[] field_s;
    private boolean field_q;
    private wb field_y;
    static ba field_C;
    private nb field_A;
    private nb field_w;
    private int field_m;
    private nb field_r;
    private int field_v;
    private int field_u;
    static int[] field_z;
    private wb field_o;
    private boolean field_D;
    private int[] field_B;
    static aa field_n;
    private wb field_x;
    static int field_p;

    private final void a(int param0, int param1, nb param2, int param3) {
        try {
            param2.a(param0, (byte) -116, -1);
            param2.a(0, param3);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "qe.G(" + param0 + 44 + -1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final wh b() {
        return null;
    }

    final synchronized int c() {
        return 2;
    }

    final synchronized void a(int param0, int param1) {
        ((qe) this).field_u = param0;
        if (param1 > -45) {
            Object var4 = null;
            ((qe) this).a((int[]) null, -45, 18);
        }
    }

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
        int stackIn_33_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        var11 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (((qe) this).field_u <= 0) {
              ((qe) this).d(param2);
              return;
            } else {
              L1: {
                if (((qe) this).field_q) {
                  L2: {
                    if (((qe) this).field_v <= 0) {
                      break L2;
                    } else {
                      if (!((qe) this).field_w.c((byte) -96)) {
                        ((qe) this).field_q = false;
                        ((qe) this).field_v = -((qe) this).field_v;
                        ((qe) this).field_x = null;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((qe) this).field_v >= 0) {
                    break L1;
                  } else {
                    if (!((qe) this).field_r.c((byte) -58)) {
                      ((qe) this).field_v = -((qe) this).field_v;
                      ((qe) this).field_q = false;
                      ((qe) this).field_y = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = ((qe) this).field_u * (((qe) this).field_m >> 12) / 256;
                var5 = -var4_int + ((qe) this).field_u;
                if (0 == ((qe) this).field_v) {
                  break L3;
                } else {
                  ((qe) this).field_m = ((qe) this).field_m + ((qe) this).field_v * param2;
                  if (((qe) this).field_m >= 1048576) {
                    ((qe) this).field_m = 1048576;
                    if (((qe) this).field_q) {
                      break L3;
                    } else {
                      ((qe) this).field_v = 0;
                      if (!((qe) this).field_D) {
                        L4: {
                          if (((qe) this).field_y == null) {
                            break L4;
                          } else {
                            ((qe) this).field_r.f(11795);
                            break L4;
                          }
                        }
                        ((qe) this).field_y = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    if (((qe) this).field_m > 0) {
                      break L3;
                    } else {
                      ((qe) this).field_m = 0;
                      if (!((qe) this).field_q) {
                        ((qe) this).field_v = 0;
                        if (((qe) this).field_D) {
                          break L3;
                        } else {
                          L5: {
                            if (null == ((qe) this).field_x) {
                              break L5;
                            } else {
                              ((qe) this).field_w.f(11795);
                              break L5;
                            }
                          }
                          ((qe) this).field_x = null;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L6: {
                if (!oa.field_k) {
                  stackOut_32_0 = param2;
                  stackIn_33_0 = stackOut_32_0;
                  break L6;
                } else {
                  stackOut_31_0 = param2 << 1;
                  stackIn_33_0 = stackOut_31_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (((qe) this).field_t >= 256) {
                  break L7;
                } else {
                  L8: {
                    if (null != ((qe) this).field_x) {
                      break L8;
                    } else {
                      if (((qe) this).field_y == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int == 256) {
                    ((qe) this).field_w.a(param0, param1, param2);
                    break L7;
                  } else {
                    if (var5 == 256) {
                      ((qe) this).field_r.a(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (((qe) this).field_B == null) {
                            break L10;
                          } else {
                            if (((qe) this).field_B.length < var6) {
                              break L10;
                            } else {
                              pd.a(((qe) this).field_B, 0, var6);
                              pd.a(((qe) this).field_s, 0, var6);
                              break L9;
                            }
                          }
                        }
                        ((qe) this).field_s = new int[var6];
                        ((qe) this).field_B = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((qe) this).field_w.a(((qe) this).field_B, 0, param2);
                        ((qe) this).field_r.a(((qe) this).field_s, 0, param2);
                        if (!oa.field_k) {
                          stackOut_45_0 = param1;
                          stackIn_46_0 = stackOut_45_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_44_0 = param1 << 1;
                          stackIn_46_0 = stackOut_44_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_46_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var6 <= var8) {
                          break L7;
                        } else {
                          param0[var7 - -var8] = param0[var7 - -var8] + (((qe) this).field_B[var8] * var4_int - -(((qe) this).field_s[var8] * var5) >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  }
                }
              }
              L13: {
                if (null == ((qe) this).field_o) {
                  break L13;
                } else {
                  if (0 == ((qe) this).field_t) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (((qe) this).field_B == null) {
                          break L15;
                        } else {
                          if (var6 > ((qe) this).field_B.length) {
                            break L15;
                          } else {
                            pd.a(((qe) this).field_B, 0, var6);
                            break L14;
                          }
                        }
                      }
                      ((qe) this).field_s = new int[var6];
                      ((qe) this).field_B = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((qe) this).field_A.a(((qe) this).field_B, 0, param2);
                      if (!oa.field_k) {
                        stackOut_59_0 = param1;
                        stackIn_60_0 = stackOut_59_0;
                        break L16;
                      } else {
                        param1 = param1 << 1;
                        stackOut_58_0 = param1 << 1;
                        stackIn_60_0 = stackOut_58_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_60_0;
                    var8 = ((qe) this).field_t * ((qe) this).field_u / 256;
                    var9 = ((qe) this).field_u + -var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var10 + var7] = var9 * param0[var10 + var7] + ((qe) this).field_B[var10] * var8 >> 8;
                        var10++;
                        continue L17;
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var4 = decompiledCaughtException;
            stackOut_64_0 = (RuntimeException) var4;
            stackOut_64_1 = new StringBuilder().append("qe.HA(");
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param0 == null) {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L18;
            } else {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L18;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_67_0, stackIn_67_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized void d(int param0) {
        int var3 = 0;
        L0: {
          var3 = TrackController.field_F ? 1 : 0;
          if (-1 <= ((qe) this).field_m) {
            break L0;
          } else {
            if (((qe) this).field_x != null) {
              ((qe) this).field_w.d(param0);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (-1048577 <= ((qe) this).field_m) {
            if (0 < ((qe) this).field_t) {
              if (((qe) this).field_o == null) {
                break L1;
              } else {
                ((qe) this).field_A.d(param0);
                break L1;
              }
            } else {
              if (0 >= ((qe) this).field_t) {
                break L1;
              } else {
                if (((qe) this).field_o == null) {
                  break L1;
                } else {
                  ((qe) this).field_A.d(param0);
                  break L1;
                }
              }
            }
          } else {
            if (0 < ((qe) this).field_t) {
              if (((qe) this).field_o == null) {
                break L1;
              } else {
                ((qe) this).field_A.d(param0);
                break L1;
              }
            } else {
              if (0 >= ((qe) this).field_t) {
                break L1;
              } else {
                if (((qe) this).field_o == null) {
                  break L1;
                } else {
                  ((qe) this).field_A.d(param0);
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (((qe) this).field_q) {
            L3: {
              if (0 >= ((qe) this).field_v) {
                break L3;
              } else {
                if (((qe) this).field_w.c((byte) -116)) {
                  break L3;
                } else {
                  ((qe) this).field_q = false;
                  ((qe) this).field_x = null;
                  ((qe) this).field_v = -((qe) this).field_v;
                  break L2;
                }
              }
            }
            if (((qe) this).field_v >= 0) {
              break L2;
            } else {
              if (!((qe) this).field_r.c((byte) -80)) {
                ((qe) this).field_v = -((qe) this).field_v;
                ((qe) this).field_y = null;
                ((qe) this).field_q = false;
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
          if (0 != ((qe) this).field_v) {
            ((qe) this).field_m = ((qe) this).field_m + param0 * ((qe) this).field_v;
            if (1048576 <= ((qe) this).field_m) {
              ((qe) this).field_m = 1048576;
              if (!((qe) this).field_q) {
                ((qe) this).field_v = 0;
                if (!((qe) this).field_D) {
                  L5: {
                    if (null == ((qe) this).field_y) {
                      break L5;
                    } else {
                      ((qe) this).field_r.f(11795);
                      break L5;
                    }
                  }
                  ((qe) this).field_y = null;
                  break L4;
                } else {
                  break L4;
                }
              } else {
                break L4;
              }
            } else {
              if (((qe) this).field_m <= 0) {
                ((qe) this).field_m = 0;
                if (((qe) this).field_q) {
                  break L4;
                } else {
                  ((qe) this).field_v = 0;
                  if (!((qe) this).field_D) {
                    L6: {
                      if (null != ((qe) this).field_x) {
                        ((qe) this).field_w.f(11795);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((qe) this).field_x = null;
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

    final static qj[] a(int param0, int param1, int param2, int param3) {
        if (param3 != 1) {
            qe.e(52);
        }
        return gl.b(param2, 1, param1, 104, param0);
    }

    public static void e(int param0) {
        field_C = null;
        field_z = null;
        if (param0 != 1048576) {
            return;
        }
        field_n = null;
    }

    final synchronized void a(boolean param0, int param1, boolean param2, int param3, wb param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_35_0 = 0;
        nb stackIn_44_0 = null;
        wb stackIn_44_1 = null;
        int stackIn_44_2 = 0;
        nb stackIn_45_0 = null;
        wb stackIn_45_1 = null;
        int stackIn_45_2 = 0;
        nb stackIn_46_0 = null;
        wb stackIn_46_1 = null;
        int stackIn_46_2 = 0;
        int stackIn_46_3 = 0;
        nb stackIn_53_0 = null;
        wb stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        nb stackIn_54_0 = null;
        wb stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        nb stackIn_55_0 = null;
        wb stackIn_55_1 = null;
        int stackIn_55_2 = 0;
        int stackIn_55_3 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        nb stackOut_52_0 = null;
        wb stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        nb stackOut_54_0 = null;
        wb stackOut_54_1 = null;
        int stackOut_54_2 = 0;
        int stackOut_54_3 = 0;
        nb stackOut_53_0 = null;
        wb stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        nb stackOut_43_0 = null;
        wb stackOut_43_1 = null;
        int stackOut_43_2 = 0;
        nb stackOut_45_0 = null;
        wb stackOut_45_1 = null;
        int stackOut_45_2 = 0;
        int stackOut_45_3 = 0;
        nb stackOut_44_0 = null;
        wb stackOut_44_1 = null;
        int stackOut_44_2 = 0;
        int stackOut_44_3 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var8 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((qe) this).field_q) {
                break L1;
              } else {
                if (param0) {
                  L2: {
                    if (0 < ((qe) this).field_v) {
                      L3: {
                        if (((qe) this).field_x != null) {
                          ((qe) this).field_w.f(11795);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((qe) this).field_x = param4;
                      if (param4 != null) {
                        ((qe) this).field_w.a(param4, 14526, false);
                        this.a(param5, -1, ((qe) this).field_w, param3);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (((qe) this).field_y != null) {
                          ((qe) this).field_r.f(11795);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      ((qe) this).field_y = param4;
                      if (param4 != null) {
                        ((qe) this).field_r.a(param4, 14526, false);
                        this.a(param5, -1, ((qe) this).field_r, param3);
                        break L2;
                      } else {
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
              stackOut_18_0 = this;
              stackIn_20_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (!param0) {
                stackOut_20_0 = this;
                stackOut_20_1 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L5;
              } else {
                stackOut_19_0 = this;
                stackOut_19_1 = 1;
                stackIn_21_0 = stackOut_19_0;
                stackIn_21_1 = stackOut_19_1;
                break L5;
              }
            }
            ((qe) this).field_q = stackIn_21_1 != 0;
            if (param4 == ((qe) this).field_x) {
              ((qe) this).field_v = param1;
              this.a(param5, -1, ((qe) this).field_w, param3);
              return;
            } else {
              if (param4 == ((qe) this).field_y) {
                ((qe) this).field_v = -param1;
                this.a(param5, -1, ((qe) this).field_r, param3);
                return;
              } else {
                L6: {
                  if (((qe) this).field_x != null) {
                    if (null != ((qe) this).field_y) {
                      L7: {
                        if (((qe) this).field_m >= 524288) {
                          stackOut_34_0 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          break L7;
                        } else {
                          stackOut_33_0 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          break L7;
                        }
                      }
                      var7_int = stackIn_35_0;
                      break L6;
                    } else {
                      var7_int = 0;
                      break L6;
                    }
                  } else {
                    var7_int = 1;
                    break L6;
                  }
                }
                L8: {
                  if (param2) {
                    break L8;
                  } else {
                    ((qe) this).field_m = -96;
                    break L8;
                  }
                }
                L9: {
                  if (var7_int == 0) {
                    L10: {
                      if (((qe) this).field_y == null) {
                        break L10;
                      } else {
                        ((qe) this).field_r.f(11795);
                        break L10;
                      }
                    }
                    L11: {
                      ((qe) this).field_y = param4;
                      if (param4 != null) {
                        L12: {
                          stackOut_52_0 = ((qe) this).field_r;
                          stackOut_52_1 = (wb) param4;
                          stackOut_52_2 = 14526;
                          stackIn_54_0 = stackOut_52_0;
                          stackIn_54_1 = stackOut_52_1;
                          stackIn_54_2 = stackOut_52_2;
                          stackIn_53_0 = stackOut_52_0;
                          stackIn_53_1 = stackOut_52_1;
                          stackIn_53_2 = stackOut_52_2;
                          if (param0) {
                            stackOut_54_0 = (nb) (Object) stackIn_54_0;
                            stackOut_54_1 = (wb) (Object) stackIn_54_1;
                            stackOut_54_2 = stackIn_54_2;
                            stackOut_54_3 = 0;
                            stackIn_55_0 = stackOut_54_0;
                            stackIn_55_1 = stackOut_54_1;
                            stackIn_55_2 = stackOut_54_2;
                            stackIn_55_3 = stackOut_54_3;
                            break L12;
                          } else {
                            stackOut_53_0 = (nb) (Object) stackIn_53_0;
                            stackOut_53_1 = (wb) (Object) stackIn_53_1;
                            stackOut_53_2 = stackIn_53_2;
                            stackOut_53_3 = 1;
                            stackIn_55_0 = stackOut_53_0;
                            stackIn_55_1 = stackOut_53_1;
                            stackIn_55_2 = stackOut_53_2;
                            stackIn_55_3 = stackOut_53_3;
                            break L12;
                          }
                        }
                        ((nb) (Object) stackIn_55_0).a(stackIn_55_1, stackIn_55_2, stackIn_55_3 != 0);
                        this.a(param5, -1, ((qe) this).field_r, param3);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    ((qe) this).field_v = -param1;
                    break L9;
                  } else {
                    L13: {
                      if (null == ((qe) this).field_x) {
                        break L13;
                      } else {
                        ((qe) this).field_w.f(11795);
                        break L13;
                      }
                    }
                    L14: {
                      ((qe) this).field_x = param4;
                      if (param4 != null) {
                        L15: {
                          stackOut_43_0 = ((qe) this).field_w;
                          stackOut_43_1 = (wb) param4;
                          stackOut_43_2 = 14526;
                          stackIn_45_0 = stackOut_43_0;
                          stackIn_45_1 = stackOut_43_1;
                          stackIn_45_2 = stackOut_43_2;
                          stackIn_44_0 = stackOut_43_0;
                          stackIn_44_1 = stackOut_43_1;
                          stackIn_44_2 = stackOut_43_2;
                          if (param0) {
                            stackOut_45_0 = (nb) (Object) stackIn_45_0;
                            stackOut_45_1 = (wb) (Object) stackIn_45_1;
                            stackOut_45_2 = stackIn_45_2;
                            stackOut_45_3 = 0;
                            stackIn_46_0 = stackOut_45_0;
                            stackIn_46_1 = stackOut_45_1;
                            stackIn_46_2 = stackOut_45_2;
                            stackIn_46_3 = stackOut_45_3;
                            break L15;
                          } else {
                            stackOut_44_0 = (nb) (Object) stackIn_44_0;
                            stackOut_44_1 = (wb) (Object) stackIn_44_1;
                            stackOut_44_2 = stackIn_44_2;
                            stackOut_44_3 = 1;
                            stackIn_46_0 = stackOut_44_0;
                            stackIn_46_1 = stackOut_44_1;
                            stackIn_46_2 = stackOut_44_2;
                            stackIn_46_3 = stackOut_44_3;
                            break L15;
                          }
                        }
                        ((nb) (Object) stackIn_46_0).a(stackIn_46_1, stackIn_46_2, stackIn_46_3 != 0);
                        this.a(param5, -1, ((qe) this).field_w, param3);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    ((qe) this).field_v = param1;
                    break L9;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) var7;
            stackOut_58_1 = new StringBuilder().append("qe.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param4 == null) {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L16;
            } else {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L16;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_61_0, stackIn_61_2 + 44 + param5 + 41);
        }
    }

    final wh a() {
        return null;
    }

    private qe() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new ba();
        field_n = new aa(7, 0, 1, 1);
    }
}
