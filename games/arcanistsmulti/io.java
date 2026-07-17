/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class io extends sg {
    private int[] field_p;
    private gh field_v;
    private int field_E;
    static String field_C;
    private ha field_t;
    private int field_s;
    private ha field_o;
    private gh field_k;
    private int[] field_m;
    private boolean field_w;
    static String field_z;
    private int field_D;
    static vh field_n;
    private int field_r;
    private gh field_l;
    static String field_x;
    static String field_u;
    static boolean field_A;
    private ha field_y;
    private boolean field_q;

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = ArcanistsMulti.field_G ? 1 : 0;
          if (((io) this).field_r <= 0) {
            if (-1048577 <= ((io) this).field_r) {
              break L0;
            } else {
              if (null == ((io) this).field_t) {
                break L0;
              } else {
                ((io) this).field_l.a(param0);
                break L0;
              }
            }
          } else {
            if (-1048577 >= ((io) this).field_r) {
              break L0;
            } else {
              if (null == ((io) this).field_t) {
                break L0;
              } else {
                ((io) this).field_l.a(param0);
                break L0;
              }
            }
          }
        }
        L1: {
          if (0 >= ((io) this).field_E) {
            break L1;
          } else {
            if (null != ((io) this).field_y) {
              ((io) this).field_k.a(param0);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (((io) this).field_w) {
            L3: {
              if (0 >= ((io) this).field_D) {
                break L3;
              } else {
                if (!((io) this).field_v.e((byte) -8)) {
                  ((io) this).field_o = null;
                  ((io) this).field_D = -((io) this).field_D;
                  ((io) this).field_w = false;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            if (((io) this).field_D >= 0) {
              break L2;
            } else {
              if (!((io) this).field_l.e((byte) -8)) {
                ((io) this).field_t = null;
                ((io) this).field_D = -((io) this).field_D;
                ((io) this).field_w = false;
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
          if (((io) this).field_D != 0) {
            ((io) this).field_r = ((io) this).field_r + param0 * ((io) this).field_D;
            if (((io) this).field_r >= 1048576) {
              ((io) this).field_r = 1048576;
              if (((io) this).field_w) {
                break L4;
              } else {
                ((io) this).field_D = 0;
                if (!((io) this).field_q) {
                  L5: {
                    if (((io) this).field_t == null) {
                      break L5;
                    } else {
                      ((io) this).field_l.a((byte) -123);
                      break L5;
                    }
                  }
                  ((io) this).field_t = null;
                  break L4;
                } else {
                  break L4;
                }
              }
            } else {
              if (((io) this).field_r > 0) {
                break L4;
              } else {
                ((io) this).field_r = 0;
                if (((io) this).field_w) {
                  break L4;
                } else {
                  ((io) this).field_D = 0;
                  if (((io) this).field_q) {
                    break L4;
                  } else {
                    L6: {
                      if (((io) this).field_o != null) {
                        ((io) this).field_v.a((byte) -125);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    ((io) this).field_o = null;
                    break L4;
                  }
                }
              }
            }
          } else {
            break L4;
          }
        }
    }

    final synchronized void a(boolean param0, int param1, byte param2, int param3, int param4, ha param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_30_0 = 0;
        gh stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        gh stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        gh stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        gh stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        gh stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        gh stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        gh stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        gh stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        gh stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        gh stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        gh stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        gh stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((io) this).field_w) {
                break L1;
              } else {
                if (!param0) {
                  break L1;
                } else {
                  L2: {
                    if (((io) this).field_D > 0) {
                      L3: {
                        if (null == ((io) this).field_o) {
                          break L3;
                        } else {
                          ((io) this).field_v.a((byte) -106);
                          break L3;
                        }
                      }
                      ((io) this).field_o = param5;
                      if (param5 == null) {
                        break L2;
                      } else {
                        ((io) this).field_v.a((byte) -96, false, param5);
                        this.a(param3, (byte) -13, ((io) this).field_v, param1);
                        break L2;
                      }
                    } else {
                      L4: {
                        if (null == ((io) this).field_t) {
                          break L4;
                        } else {
                          ((io) this).field_l.a((byte) -106);
                          break L4;
                        }
                      }
                      ((io) this).field_t = param5;
                      if (param5 != null) {
                        ((io) this).field_l.a((byte) -96, false, param5);
                        this.a(param3, (byte) -13, ((io) this).field_l, param1);
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
              stackOut_14_0 = this;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (!param0) {
                stackOut_16_0 = this;
                stackOut_16_1 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L5;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L5;
              }
            }
            ((io) this).field_w = stackIn_17_1 != 0;
            if (((io) this).field_o != param5) {
              if (param5 == ((io) this).field_t) {
                ((io) this).field_D = -param4;
                this.a(param3, (byte) -13, ((io) this).field_l, param1);
                return;
              } else {
                L6: {
                  if (null == ((io) this).field_o) {
                    var7_int = 1;
                    break L6;
                  } else {
                    if (null != ((io) this).field_t) {
                      L7: {
                        if (((io) this).field_r >= 524288) {
                          stackOut_29_0 = 0;
                          stackIn_30_0 = stackOut_29_0;
                          break L7;
                        } else {
                          stackOut_28_0 = 1;
                          stackIn_30_0 = stackOut_28_0;
                          break L7;
                        }
                      }
                      var7_int = stackIn_30_0;
                      break L6;
                    } else {
                      var7_int = 0;
                      break L6;
                    }
                  }
                }
                if (param2 == -85) {
                  L8: {
                    if (var7_int != 0) {
                      L9: {
                        if (null == ((io) this).field_o) {
                          break L9;
                        } else {
                          ((io) this).field_v.a((byte) -124);
                          break L9;
                        }
                      }
                      L10: {
                        ((io) this).field_o = param5;
                        if (param5 == null) {
                          break L10;
                        } else {
                          L11: {
                            stackOut_47_0 = ((io) this).field_v;
                            stackOut_47_1 = -96;
                            stackIn_49_0 = stackOut_47_0;
                            stackIn_49_1 = stackOut_47_1;
                            stackIn_48_0 = stackOut_47_0;
                            stackIn_48_1 = stackOut_47_1;
                            if (param0) {
                              stackOut_49_0 = (gh) (Object) stackIn_49_0;
                              stackOut_49_1 = stackIn_49_1;
                              stackOut_49_2 = 0;
                              stackIn_50_0 = stackOut_49_0;
                              stackIn_50_1 = stackOut_49_1;
                              stackIn_50_2 = stackOut_49_2;
                              break L11;
                            } else {
                              stackOut_48_0 = (gh) (Object) stackIn_48_0;
                              stackOut_48_1 = stackIn_48_1;
                              stackOut_48_2 = 1;
                              stackIn_50_0 = stackOut_48_0;
                              stackIn_50_1 = stackOut_48_1;
                              stackIn_50_2 = stackOut_48_2;
                              break L11;
                            }
                          }
                          ((gh) (Object) stackIn_50_0).a((byte) stackIn_50_1, stackIn_50_2 != 0, param5);
                          this.a(param3, (byte) -13, ((io) this).field_v, param1);
                          break L10;
                        }
                      }
                      ((io) this).field_D = param4;
                      break L8;
                    } else {
                      L12: {
                        if (null != ((io) this).field_t) {
                          ((io) this).field_l.a((byte) -109);
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                      L13: {
                        ((io) this).field_t = param5;
                        if (param5 == null) {
                          break L13;
                        } else {
                          L14: {
                            stackOut_39_0 = ((io) this).field_l;
                            stackOut_39_1 = -96;
                            stackIn_41_0 = stackOut_39_0;
                            stackIn_41_1 = stackOut_39_1;
                            stackIn_40_0 = stackOut_39_0;
                            stackIn_40_1 = stackOut_39_1;
                            if (param0) {
                              stackOut_41_0 = (gh) (Object) stackIn_41_0;
                              stackOut_41_1 = stackIn_41_1;
                              stackOut_41_2 = 0;
                              stackIn_42_0 = stackOut_41_0;
                              stackIn_42_1 = stackOut_41_1;
                              stackIn_42_2 = stackOut_41_2;
                              break L14;
                            } else {
                              stackOut_40_0 = (gh) (Object) stackIn_40_0;
                              stackOut_40_1 = stackIn_40_1;
                              stackOut_40_2 = 1;
                              stackIn_42_0 = stackOut_40_0;
                              stackIn_42_1 = stackOut_40_1;
                              stackIn_42_2 = stackOut_40_2;
                              break L14;
                            }
                          }
                          ((gh) (Object) stackIn_42_0).a((byte) stackIn_42_1, stackIn_42_2 != 0, param5);
                          this.a(param3, (byte) -13, ((io) this).field_l, param1);
                          break L13;
                        }
                      }
                      ((io) this).field_D = -param4;
                      break L8;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } else {
              ((io) this).field_D = param4;
              this.a(param3, (byte) -13, ((io) this).field_v, param1);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var7;
            stackOut_53_1 = new StringBuilder().append("io.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param5 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L15;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L15;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 41);
        }
    }

    final synchronized void a(int param0, int param1) {
        if (param0 != 2) {
            return;
        }
        ((io) this).field_s = param1;
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
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
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
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (((io) this).field_s <= 0) {
              ((io) this).a(param2);
              return;
            } else {
              L1: {
                if (((io) this).field_w) {
                  L2: {
                    if (((io) this).field_D <= 0) {
                      break L2;
                    } else {
                      if (!((io) this).field_v.e((byte) -8)) {
                        ((io) this).field_D = -((io) this).field_D;
                        ((io) this).field_o = null;
                        ((io) this).field_w = false;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((io) this).field_D >= 0) {
                    break L1;
                  } else {
                    if (((io) this).field_l.e((byte) -8)) {
                      break L1;
                    } else {
                      ((io) this).field_D = -((io) this).field_D;
                      ((io) this).field_w = false;
                      ((io) this).field_t = null;
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                var4_int = ((io) this).field_s * (((io) this).field_r >> 12) / 256;
                var5 = ((io) this).field_s - var4_int;
                if (((io) this).field_D == 0) {
                  break L3;
                } else {
                  ((io) this).field_r = ((io) this).field_r + param2 * ((io) this).field_D;
                  if (((io) this).field_r >= 1048576) {
                    ((io) this).field_r = 1048576;
                    if (!((io) this).field_w) {
                      ((io) this).field_D = 0;
                      if (((io) this).field_q) {
                        break L3;
                      } else {
                        L4: {
                          if (((io) this).field_t == null) {
                            break L4;
                          } else {
                            ((io) this).field_l.a((byte) -122);
                            break L4;
                          }
                        }
                        ((io) this).field_t = null;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    if (((io) this).field_r > 0) {
                      break L3;
                    } else {
                      ((io) this).field_r = 0;
                      if (!((io) this).field_w) {
                        ((io) this).field_D = 0;
                        if (((io) this).field_q) {
                          break L3;
                        } else {
                          L5: {
                            if (null != ((io) this).field_o) {
                              ((io) this).field_v.a((byte) -107);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((io) this).field_o = null;
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
                if (lb.field_i) {
                  stackOut_32_0 = param2 << 1;
                  stackIn_33_0 = stackOut_32_0;
                  break L6;
                } else {
                  stackOut_31_0 = param2;
                  stackIn_33_0 = stackOut_31_0;
                  break L6;
                }
              }
              L7: {
                var6 = stackIn_33_0;
                if (((io) this).field_E < 256) {
                  L8: {
                    if (null != ((io) this).field_o) {
                      break L8;
                    } else {
                      if (((io) this).field_t == null) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if (var5 == 256) {
                      ((io) this).field_l.a(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (((io) this).field_p == null) {
                            break L10;
                          } else {
                            if (~((io) this).field_p.length > ~var6) {
                              break L10;
                            } else {
                              sf.a(((io) this).field_p, 0, var6);
                              sf.a(((io) this).field_m, 0, var6);
                              break L9;
                            }
                          }
                        }
                        ((io) this).field_p = new int[var6];
                        ((io) this).field_m = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((io) this).field_v.a(((io) this).field_p, 0, param2);
                        ((io) this).field_l.a(((io) this).field_m, 0, param2);
                        if (!lb.field_i) {
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
                          param0[var8 + var7] = param0[var8 + var7] + (((io) this).field_m[var8] * var5 + var4_int * ((io) this).field_p[var8] >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    ((io) this).field_v.a(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                if (null == ((io) this).field_y) {
                  break L13;
                } else {
                  if (((io) this).field_E == 0) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        if (((io) this).field_p == null) {
                          break L15;
                        } else {
                          if (((io) this).field_p.length >= var6) {
                            sf.a(((io) this).field_p, 0, var6);
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      ((io) this).field_m = new int[var6];
                      ((io) this).field_p = new int[var6];
                      break L14;
                    }
                    L16: {
                      ((io) this).field_k.a(((io) this).field_p, 0, param2);
                      if (lb.field_i) {
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
                    var8 = ((io) this).field_s * ((io) this).field_E / 256;
                    var9 = -var8 + ((io) this).field_s;
                    var10 = 0;
                    L17: while (true) {
                      if (var6 <= var10) {
                        break L13;
                      } else {
                        param0[var7 + var10] = ((io) this).field_p[var10] * var8 + param0[var7 - -var10] * var9 >> 8;
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
            stackOut_66_0 = (RuntimeException) var4;
            stackOut_66_1 = new StringBuilder().append("io.AA(");
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
          throw aa.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, byte param1, gh param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param2.b(-1, (byte) 69, param0);
            param2.b(param3, (byte) -118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("io.B(").append(param0).append(44).append(-13).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param3 + 41);
        }
    }

    final sg b() {
        return null;
    }

    final synchronized int c() {
        return 2;
    }

    public static void c(int param0) {
        field_z = null;
        field_C = null;
        field_u = null;
        field_n = null;
        field_x = null;
    }

    final sg a() {
        return null;
    }

    final static void a(int param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kc var9_ref_kc = null;
        int var10_int = 0;
        nl var10 = null;
        int var11_int = 0;
        nl var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        kc var15 = null;
        kc var16 = null;
        int var17 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        kc stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        kc stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        kc stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        kc stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        kc stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        kc stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_35_0 = 0;
        int stackOut_36_0 = 0;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              fh.field_g = de.field_e;
              ri.field_a = de.field_j;
              stackOut_1_0 = 16;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param1) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = oo.field_y;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = sm.field_a;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ej.a(stackIn_4_0, stackIn_4_1);
              tn.field_Ob.a(0, 0, -42 + hl.field_m.field_I, hl.field_m.field_x, 5);
              aj.field_d.a(bk.field_M.field_x, 0, 0, ga.field_r, (byte) -120);
              stackOut_4_0 = qc.field_d;
              stackOut_4_1 = bk.field_M.field_x;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (!fc.field_a) {
                stackOut_6_0 = (kc) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L2;
              } else {
                stackOut_5_0 = (kc) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = nn.field_p + 44;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                break L2;
              }
            }
            L3: {
              ((kc) (Object) stackIn_7_0).a(stackIn_7_1 - stackIn_7_2, 0, ga.field_r + 2, 18, (byte) -120);
              hf.field_q.a(nn.field_p + 42, -40 + (bk.field_M.field_x + -nn.field_p + -2), ga.field_r - -2, 18, (byte) -120);
              lf.field_b.a(ga.field_r - -22, nn.field_p, bk.field_M.field_x, false, 0, bk.field_M.field_I - (ga.field_r - -2) + -20, 2);
              var2_int = -29 / ((84 - param0) / 36);
              mo.field_o.a(hl.field_m.field_x, 0, -40 + hl.field_m.field_I, 40, (byte) -120);
              nl.field_Db.a(oh.field_h.field_x, 0, 0, 30, (byte) -120);
              mi.field_m.a(oh.field_h.field_x, 0, 30, -42 + oh.field_h.field_I - 30, (byte) -120);
              var3 = 3 + vf.field_l;
              if (ao.field_h.length < 2) {
                var3--;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1) {
                var3--;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var4 = ((var3 + 1) / 2 + (2 + (-5 + mi.field_m.field_I) - 15)) / (1 + var3) - 2;
              if (var4 <= 30) {
                break L5;
              } else {
                var4 = 30;
                break L5;
              }
            }
            L6: {
              var5 = -(var3 * (2 + var4)) + (mi.field_m.field_I + -10);
              if (var5 <= 40) {
                break L6;
              } else {
                var5 = 40;
                break L6;
              }
            }
            ib.field_s.a(-5 + mi.field_m.field_x - 5, 5, 5, var5, (byte) -120);
            var6 = var5 + 7;
            var7 = 0;
            L7: while (true) {
              if (~var7 <= ~(4 + vf.field_l)) {
                nl.field_Fb.a(360, -360 + de.field_e >> 1, 10, -14 + (-120 + (de.field_j - 10)), (byte) -120);
                hf.field_t.a(nl.field_Fb.field_x, 0, 0, 24, (byte) -120);
                gk.field_g.a(nl.field_Fb.field_x, 0, 24, -24 + nl.field_Fb.field_I, (byte) -120);
                gk.field_g.field_v = of.a(3, gk.field_g.field_I, 1, 1, 11579568, 8421504);
                mj.field_s.a(-10 + gk.field_g.field_x, 5, 5, -2 + (-34 + gk.field_g.field_I), (byte) -120);
                gj.field_d.a(80, (-80 + gk.field_g.field_x) / 2, gk.field_g.field_I - 29, 24, (byte) -120);
                ie.l((byte) 112);
                break L0;
              } else {
                L8: {
                  L9: {
                    if (var7 != 1) {
                      break L9;
                    } else {
                      if (ao.field_h.length < 2) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (var7 != 3) {
                      break L10;
                    } else {
                      if (le.field_q > 1) {
                        break L10;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L11: {
                    if (param1) {
                      break L11;
                    } else {
                      if (3 == var7) {
                        var16 = wd.field_g[var7];
                        wd.field_g[var7].field_I = 0;
                        var16.field_x = 0;
                        var9 = 0;
                        L12: while (true) {
                          if (~s.field_e[var7].length >= ~var9) {
                            break L8;
                          } else {
                            L13: {
                              if (s.field_e[var7][var9] == null) {
                                break L13;
                              } else {
                                var10 = s.field_e[var7][var9];
                                s.field_e[var7][var9].field_I = 0;
                                var10.field_x = 0;
                                break L13;
                              }
                            }
                            var9++;
                            continue L12;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L14: {
                    if (!param1) {
                      break L14;
                    } else {
                      if (0 == var7) {
                        var15 = wd.field_g[var7];
                        wd.field_g[var7].field_I = 0;
                        var15.field_x = 0;
                        var9 = 0;
                        L15: while (true) {
                          if (~s.field_e[var7].length >= ~var9) {
                            break L8;
                          } else {
                            L16: {
                              if (s.field_e[var7][var9] != null) {
                                var10 = s.field_e[var7][var9];
                                s.field_e[var7][var9].field_I = 0;
                                var10.field_x = 0;
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            var9++;
                            continue L15;
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                  }
                  L17: {
                    L18: {
                      if (!param1) {
                        break L18;
                      } else {
                        if (var7 < 4) {
                          break L18;
                        } else {
                          if (dh.field_Fb == null) {
                            break L18;
                          } else {
                            if (!dh.field_Fb[-4 + var7]) {
                              break L18;
                            } else {
                              stackOut_35_0 = 1;
                              stackIn_37_0 = stackOut_35_0;
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    stackOut_36_0 = 0;
                    stackIn_37_0 = stackOut_36_0;
                    break L17;
                  }
                  var8 = stackIn_37_0;
                  if (var8 != 0) {
                    var9_ref_kc = wd.field_g[var7];
                    wd.field_g[var7].field_I = 0;
                    var9_ref_kc.field_x = 0;
                    var17 = 0;
                    var10_int = var17;
                    L19: while (true) {
                      if (~s.field_e[var7].length >= ~var17) {
                        break L8;
                      } else {
                        L20: {
                          if (s.field_e[var7][var17] != null) {
                            var11 = s.field_e[var7][var17];
                            s.field_e[var7][var17].field_I = 0;
                            var11.field_x = 0;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        var17++;
                        continue L19;
                      }
                    }
                  } else {
                    L21: {
                      wd.field_g[var7].a(103, 5, var6, var4, (byte) -120);
                      var9 = 110;
                      if (param1) {
                        s.field_e[var7][0].a(2, 0, var4, 38, var9, var6, mm.field_p);
                        var9 += 40;
                        break L21;
                      } else {
                        if (s.field_e[var7][0] == null) {
                          break L21;
                        } else {
                          var10 = s.field_e[var7][0];
                          s.field_e[var7][0].field_I = 0;
                          var10.field_x = 0;
                          break L21;
                        }
                      }
                    }
                    var10_int = 2 + oh.field_h.field_x + -5 + -var9;
                    var11_int = -1 + s.field_e[var7].length;
                    var12 = 0;
                    L22: while (true) {
                      if (~var12 <= ~var11_int) {
                        var6 = var6 + (2 + var4);
                        break L8;
                      } else {
                        var13 = var10_int * var12 / var11_int;
                        s.field_e[var7][1 + var12].a(2, 0, var4, -var13 + (var12 + 1) * var10_int / var11_int + -2, var9 + var13, var6, mm.field_p);
                        var12++;
                        continue L22;
                      }
                    }
                  }
                }
                var7++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "io.G(" + param0 + 44 + param1 + 41);
        }
    }

    final static void a(java.awt.Color param0, String param1, boolean param2, int param3) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = on.field_c.getGraphics();
                  if (null == jb.field_m) {
                    jb.field_m = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param2) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, o.field_r, co.field_c);
                    break L3;
                  }
                }
                L4: {
                  if (param0 != null) {
                    break L4;
                  } else {
                    param0 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null == ik.field_e) {
                        ik.field_e = on.field_c.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = ik.field_e.getGraphics();
                    var10.setColor(param0);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, 3 * param3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(2 + param3 * 3, 2, -(param3 * 3) + 300, 30);
                    var10.setFont(jb.field_m);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param1, (-(param1.length() * 6) + 304) / 2, 22);
                    boolean discarded$1 = var9.drawImage(ik.field_e, o.field_r / 2 + -152, co.field_c / 2 - 18, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + o.field_r / 2;
                    var8 = -18 + co.field_c / 2;
                    var9.setColor(param0);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 - -2, param3 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 - -1, var8 - -1, 301, 31);
                    var9.fillRect(var7 + (2 - -(3 * param3)), 2 + var8, -(param3 * 3) + 300, 30);
                    var9.setFont(jb.field_m);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param1, var7 + (304 - param1.length() * 6) / 2, var8 - -22);
                    break L7;
                  }
                }
                L8: {
                  if (jh.field_a != null) {
                    var9.setFont(jb.field_m);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(jh.field_a, o.field_r / 2 + -(6 * jh.field_a.length() / 2), -26 + co.field_c / 2);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                on.field_c.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5_ref;
            stackOut_19_1 = new StringBuilder().append("io.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L10;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L10;
            }
          }
          L11: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L11;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L11;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param2 + 44 + param3 + 44 + -6885 + 41);
        }
    }

    private io() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
            ch.field_b = param0;
            if (!(eh.field_e != null)) {
                eh.field_e = new qb(640, 480);
                if (de.field_l.length != eh.field_e.field_A.length) {
                    var2_int = 0;
                    for (var3 = -eh.field_e.field_A.length; var3 < 0; var3++) {
                        eh.field_e.field_A[var2_int] = de.field_l[var2_int];
                        var2_int++;
                    }
                    eh.field_e.a();
                    de.d(2, 2, 0, 0, 640, 480);
                }
            }
            var2_int = -44 % ((-45 - param1) / 34);
            vf.field_g.a(true, 0, false, rl.a(me.field_I, an.field_g, -121));
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "io.H(" + param0 + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "You can change your character's appearance on the 'Character Creation' screen, accessed from the main menu. There are thousands of combinations!";
        field_u = "You just fell into the water! Normally, this would injure you, but this arena is more lenient. In a competitive match you should avoid falling into the water at all costs. Remember that, if you lose your position, you can press 'N' to centre the screen back on your Arcanist.";
        field_z = "Book of Stone";
        field_C = "Open";
    }
}
