/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq extends tda {
    private int field_q;
    private kia field_v;
    private jp field_r;
    private int field_t;
    private jp field_s;
    private boolean field_n;
    private int field_l;
    private boolean field_p;
    private kia field_m;
    private int[] field_j;
    private kia field_u;
    private int field_w;
    private int[] field_k;
    private jp field_o;

    final synchronized void a(kia param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_33_0 = 0;
        jp stackIn_41_0 = null;
        kia stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        jp stackIn_42_0 = null;
        kia stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        jp stackIn_43_0 = null;
        kia stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        int stackIn_43_3 = 0;
        jp stackIn_49_0 = null;
        kia stackIn_49_1 = null;
        int stackIn_49_2 = 0;
        jp stackIn_50_0 = null;
        kia stackIn_50_1 = null;
        int stackIn_50_2 = 0;
        jp stackIn_51_0 = null;
        kia stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        int stackIn_51_3 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_18_0 = null;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        jp stackOut_48_0 = null;
        kia stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        jp stackOut_50_0 = null;
        kia stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int stackOut_50_3 = 0;
        jp stackOut_49_0 = null;
        kia stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        int stackOut_49_3 = 0;
        jp stackOut_40_0 = null;
        kia stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        jp stackOut_42_0 = null;
        kia stackOut_42_1 = null;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        jp stackOut_41_0 = null;
        kia stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        int stackOut_41_3 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            if (param5) {
              L1: {
                if (!((hq) this).field_p) {
                  break L1;
                } else {
                  if (!param1) {
                    break L1;
                  } else {
                    L2: {
                      if (0 >= ((hq) this).field_w) {
                        L3: {
                          if (null != ((hq) this).field_m) {
                            ((hq) this).field_o.b(true);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        ((hq) this).field_m = param0;
                        if (param0 == null) {
                          break L2;
                        } else {
                          ((hq) this).field_o.a(param0, (byte) -115, false);
                          this.a(param3, param2, ((hq) this).field_o, -49);
                          break L2;
                        }
                      } else {
                        L4: {
                          if (null != ((hq) this).field_u) {
                            ((hq) this).field_s.b(true);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        ((hq) this).field_u = param0;
                        if (param0 != null) {
                          ((hq) this).field_s.a(param0, (byte) -113, false);
                          this.a(param3, param2, ((hq) this).field_s, -72);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    return;
                  }
                }
              }
              L5: {
                stackOut_18_0 = this;
                stackIn_20_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (!param1) {
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
              ((hq) this).field_p = stackIn_21_1 != 0;
              if (param0 != ((hq) this).field_u) {
                if (((hq) this).field_m != param0) {
                  L6: {
                    if (((hq) this).field_u != null) {
                      if (((hq) this).field_m == null) {
                        var7_int = 0;
                        break L6;
                      } else {
                        L7: {
                          if (((hq) this).field_t >= 524288) {
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            break L7;
                          } else {
                            stackOut_31_0 = 1;
                            stackIn_33_0 = stackOut_31_0;
                            break L7;
                          }
                        }
                        var7_int = stackIn_33_0;
                        break L6;
                      }
                    } else {
                      var7_int = 1;
                      break L6;
                    }
                  }
                  L8: {
                    if (var7_int == 0) {
                      L9: {
                        if (null == ((hq) this).field_m) {
                          break L9;
                        } else {
                          ((hq) this).field_o.b(true);
                          break L9;
                        }
                      }
                      L10: {
                        ((hq) this).field_m = param0;
                        if (param0 == null) {
                          break L10;
                        } else {
                          L11: {
                            stackOut_48_0 = ((hq) this).field_o;
                            stackOut_48_1 = (kia) param0;
                            stackOut_48_2 = -111;
                            stackIn_50_0 = stackOut_48_0;
                            stackIn_50_1 = stackOut_48_1;
                            stackIn_50_2 = stackOut_48_2;
                            stackIn_49_0 = stackOut_48_0;
                            stackIn_49_1 = stackOut_48_1;
                            stackIn_49_2 = stackOut_48_2;
                            if (param1) {
                              stackOut_50_0 = (jp) (Object) stackIn_50_0;
                              stackOut_50_1 = (kia) (Object) stackIn_50_1;
                              stackOut_50_2 = stackIn_50_2;
                              stackOut_50_3 = 0;
                              stackIn_51_0 = stackOut_50_0;
                              stackIn_51_1 = stackOut_50_1;
                              stackIn_51_2 = stackOut_50_2;
                              stackIn_51_3 = stackOut_50_3;
                              break L11;
                            } else {
                              stackOut_49_0 = (jp) (Object) stackIn_49_0;
                              stackOut_49_1 = (kia) (Object) stackIn_49_1;
                              stackOut_49_2 = stackIn_49_2;
                              stackOut_49_3 = 1;
                              stackIn_51_0 = stackOut_49_0;
                              stackIn_51_1 = stackOut_49_1;
                              stackIn_51_2 = stackOut_49_2;
                              stackIn_51_3 = stackOut_49_3;
                              break L11;
                            }
                          }
                          ((jp) (Object) stackIn_51_0).a(stackIn_51_1, (byte) stackIn_51_2, stackIn_51_3 != 0);
                          this.a(param3, param2, ((hq) this).field_o, -53);
                          break L10;
                        }
                      }
                      ((hq) this).field_w = -param4;
                      break L8;
                    } else {
                      L12: {
                        if (null == ((hq) this).field_u) {
                          break L12;
                        } else {
                          ((hq) this).field_s.b(true);
                          break L12;
                        }
                      }
                      L13: {
                        ((hq) this).field_u = param0;
                        if (param0 != null) {
                          L14: {
                            stackOut_40_0 = ((hq) this).field_s;
                            stackOut_40_1 = (kia) param0;
                            stackOut_40_2 = -115;
                            stackIn_42_0 = stackOut_40_0;
                            stackIn_42_1 = stackOut_40_1;
                            stackIn_42_2 = stackOut_40_2;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            stackIn_41_2 = stackOut_40_2;
                            if (param1) {
                              stackOut_42_0 = (jp) (Object) stackIn_42_0;
                              stackOut_42_1 = (kia) (Object) stackIn_42_1;
                              stackOut_42_2 = stackIn_42_2;
                              stackOut_42_3 = 0;
                              stackIn_43_0 = stackOut_42_0;
                              stackIn_43_1 = stackOut_42_1;
                              stackIn_43_2 = stackOut_42_2;
                              stackIn_43_3 = stackOut_42_3;
                              break L14;
                            } else {
                              stackOut_41_0 = (jp) (Object) stackIn_41_0;
                              stackOut_41_1 = (kia) (Object) stackIn_41_1;
                              stackOut_41_2 = stackIn_41_2;
                              stackOut_41_3 = 1;
                              stackIn_43_0 = stackOut_41_0;
                              stackIn_43_1 = stackOut_41_1;
                              stackIn_43_2 = stackOut_41_2;
                              stackIn_43_3 = stackOut_41_3;
                              break L14;
                            }
                          }
                          ((jp) (Object) stackIn_43_0).a(stackIn_43_1, (byte) stackIn_43_2, stackIn_43_3 != 0);
                          this.a(param3, param2, ((hq) this).field_s, -83);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      ((hq) this).field_w = param4;
                      break L8;
                    }
                  }
                  break L0;
                } else {
                  ((hq) this).field_w = -param4;
                  this.a(param3, param2, ((hq) this).field_o, -91);
                  return;
                }
              } else {
                ((hq) this).field_w = param4;
                this.a(param3, param2, ((hq) this).field_s, -75);
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var7;
            stackOut_54_1 = new StringBuilder().append("hq.H(");
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param0 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L15;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L15;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if (((hq) this).field_t <= 0) {
            break L0;
          } else {
            if (((hq) this).field_u == null) {
              break L0;
            } else {
              ((hq) this).field_s.a(param0);
              break L0;
            }
          }
        }
        L1: {
          if (((hq) this).field_t >= 1048576) {
            break L1;
          } else {
            if (null == ((hq) this).field_m) {
              break L1;
            } else {
              ((hq) this).field_o.a(param0);
              break L1;
            }
          }
        }
        L2: {
          if (((hq) this).field_l <= 0) {
            break L2;
          } else {
            if (((hq) this).field_v == null) {
              break L2;
            } else {
              ((hq) this).field_r.a(param0);
              break L2;
            }
          }
        }
        L3: {
          if (!((hq) this).field_p) {
            break L3;
          } else {
            L4: {
              if (((hq) this).field_w <= 0) {
                break L4;
              } else {
                if (((hq) this).field_s.c(28607)) {
                  break L4;
                } else {
                  ((hq) this).field_u = null;
                  ((hq) this).field_p = false;
                  ((hq) this).field_w = -((hq) this).field_w;
                  break L3;
                }
              }
            }
            if (0 <= ((hq) this).field_w) {
              break L3;
            } else {
              if (!((hq) this).field_o.c(28607)) {
                ((hq) this).field_m = null;
                ((hq) this).field_w = -((hq) this).field_w;
                ((hq) this).field_p = false;
                break L3;
              } else {
                break L3;
              }
            }
          }
        }
        L5: {
          if (((hq) this).field_w == 0) {
            break L5;
          } else {
            ((hq) this).field_t = ((hq) this).field_t + param0 * ((hq) this).field_w;
            if (((hq) this).field_t >= 1048576) {
              ((hq) this).field_t = 1048576;
              if (!((hq) this).field_p) {
                ((hq) this).field_w = 0;
                if (!((hq) this).field_n) {
                  L6: {
                    if (((hq) this).field_m != null) {
                      ((hq) this).field_o.b(true);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ((hq) this).field_m = null;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            } else {
              if (((hq) this).field_t <= 0) {
                ((hq) this).field_t = 0;
                if (!((hq) this).field_p) {
                  ((hq) this).field_w = 0;
                  if (((hq) this).field_n) {
                    break L5;
                  } else {
                    L7: {
                      if (null == ((hq) this).field_u) {
                        break L7;
                      } else {
                        ((hq) this).field_s.b(true);
                        break L7;
                      }
                    }
                    ((hq) this).field_u = null;
                    break L5;
                  }
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
          }
        }
    }

    final tda b() {
        return null;
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
        int stackIn_34_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            if (((hq) this).field_q <= 0) {
              ((hq) this).a(param2);
              return;
            } else {
              L1: {
                if (((hq) this).field_p) {
                  L2: {
                    if (((hq) this).field_w <= 0) {
                      break L2;
                    } else {
                      if (!((hq) this).field_s.c(28607)) {
                        ((hq) this).field_u = null;
                        ((hq) this).field_w = -((hq) this).field_w;
                        ((hq) this).field_p = false;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((hq) this).field_w >= 0) {
                    break L1;
                  } else {
                    if (((hq) this).field_o.c(28607)) {
                      break L1;
                    } else {
                      ((hq) this).field_w = -((hq) this).field_w;
                      ((hq) this).field_m = null;
                      ((hq) this).field_p = false;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = ((hq) this).field_q * (((hq) this).field_t >> 12) / 256;
                var5 = -var4_int + ((hq) this).field_q;
                if (0 == ((hq) this).field_w) {
                  break L3;
                } else {
                  ((hq) this).field_t = ((hq) this).field_t + ((hq) this).field_w * param2;
                  if (((hq) this).field_t >= 1048576) {
                    ((hq) this).field_t = 1048576;
                    if (!((hq) this).field_p) {
                      ((hq) this).field_w = 0;
                      if (!((hq) this).field_n) {
                        L4: {
                          if (((hq) this).field_m == null) {
                            break L4;
                          } else {
                            ((hq) this).field_o.b(true);
                            break L4;
                          }
                        }
                        ((hq) this).field_m = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    if (((hq) this).field_t > 0) {
                      break L3;
                    } else {
                      ((hq) this).field_t = 0;
                      if (((hq) this).field_p) {
                        break L3;
                      } else {
                        ((hq) this).field_w = 0;
                        if (!((hq) this).field_n) {
                          L5: {
                            if (((hq) this).field_u != null) {
                              ((hq) this).field_s.b(true);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((hq) this).field_u = null;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              L6: {
                if (!pb.field_q) {
                  stackOut_33_0 = param2;
                  stackIn_34_0 = stackOut_33_0;
                  break L6;
                } else {
                  stackOut_32_0 = param2 << 1;
                  stackIn_34_0 = stackOut_32_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_34_0;
                if (((hq) this).field_l >= 256) {
                  break L7;
                } else {
                  L8: {
                    if (((hq) this).field_u != null) {
                      break L8;
                    } else {
                      if (null != ((hq) this).field_m) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (256 != var4_int) {
                    if (var5 == 256) {
                      ((hq) this).field_o.a(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (((hq) this).field_j == null) {
                            break L10;
                          } else {
                            if (((hq) this).field_j.length < var6) {
                              break L10;
                            } else {
                              bl.a(((hq) this).field_j, 0, var6);
                              bl.a(((hq) this).field_k, 0, var6);
                              break L9;
                            }
                          }
                        }
                        ((hq) this).field_k = new int[var6];
                        ((hq) this).field_j = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((hq) this).field_s.a(((hq) this).field_j, 0, param2);
                        ((hq) this).field_o.a(((hq) this).field_k, 0, param2);
                        if (!pb.field_q) {
                          stackOut_47_0 = param1;
                          stackIn_48_0 = stackOut_47_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_46_0 = param1 << 1;
                          stackIn_48_0 = stackOut_46_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_48_0;
                      var8 = 0;
                      L12: while (true) {
                        if (var8 >= var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (var4_int * ((hq) this).field_j[var8] + var5 * ((hq) this).field_k[var8] >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    ((hq) this).field_s.a(param0, param1, param2);
                    break L7;
                  }
                }
              }
              L13: {
                if (((hq) this).field_v == null) {
                  break L13;
                } else {
                  if (((hq) this).field_l != 0) {
                    L14: {
                      L15: {
                        if (((hq) this).field_j == null) {
                          break L15;
                        } else {
                          if (((hq) this).field_j.length < var6) {
                            break L15;
                          } else {
                            bl.a(((hq) this).field_j, 0, var6);
                            break L14;
                          }
                        }
                      }
                      ((hq) this).field_k = new int[var6];
                      ((hq) this).field_j = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((hq) this).field_r.a(((hq) this).field_j, 0, param2);
                      if (pb.field_q) {
                        param1 = param1 << 1;
                        stackOut_61_0 = param1 << 1;
                        stackIn_62_0 = stackOut_61_0;
                        break L16;
                      } else {
                        stackOut_60_0 = param1;
                        stackIn_62_0 = stackOut_60_0;
                        break L16;
                      }
                    }
                    var7 = stackIn_62_0;
                    var8 = ((hq) this).field_l * ((hq) this).field_q / 256;
                    var9 = ((hq) this).field_q + -var8;
                    var10 = 0;
                    L17: while (true) {
                      if (var10 >= var6) {
                        break L13;
                      } else {
                        param0[var7 - -var10] = ((hq) this).field_j[var10] * var8 + var9 * param0[var7 + var10] >> 8;
                        var10++;
                        continue L17;
                      }
                    }
                  } else {
                    break L13;
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
            stackOut_66_0 = (RuntimeException) var4;
            stackOut_66_1 = new StringBuilder().append("hq.C(");
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param0 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L18;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L18;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized int d() {
        return 2;
    }

    final tda a() {
        return null;
    }

    final synchronized void a(int param0, boolean param1) {
        if (!param1) {
            Object var4 = null;
            ((hq) this).a((int[]) null, 70, 31);
        }
        ((hq) this).field_q = param0;
    }

    private final void a(int param0, int param1, jp param2, int param3) {
        try {
            if (param3 > 0) {
                int discarded$0 = ((hq) this).d();
            }
            param2.a(-1, param0, (byte) -107);
            param2.c(224, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "hq.J(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    private hq() throws Throwable {
        throw new Error();
    }

    static {
    }
}
