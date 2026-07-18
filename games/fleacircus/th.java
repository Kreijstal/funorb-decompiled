/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends sh {
    static volatile int field_s;
    static String[] field_m;
    private ei field_o;
    private boolean field_B;
    private int field_u;
    private ei field_C;
    private wk field_y;
    private wk field_F;
    static int field_n;
    private ei field_t;
    private int field_E;
    static int field_D;
    private int field_A;
    private int field_x;
    private int[] field_p;
    private wk field_r;
    static mf field_z;
    private int[] field_q;
    static dd[] field_v;
    private boolean field_w;

    private final void a(byte param0, int param1, int param2, ei param3) {
        param3.a(param2, true, -1);
        if (param0 < 16) {
            return;
        }
        try {
            param3.a((byte) -49, param1);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "th.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void a(wk param0, int param1, int param2, boolean param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_33_0 = 0;
        ei stackIn_41_0 = null;
        ei stackIn_42_0 = null;
        ei stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        ei stackIn_50_0 = null;
        ei stackIn_51_0 = null;
        ei stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        ei stackOut_49_0 = null;
        ei stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        ei stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        ei stackOut_40_0 = null;
        ei stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        ei stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        var8 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((th) this).field_B) {
                break L1;
              } else {
                if (param3) {
                  L2: {
                    if (((th) this).field_u > 0) {
                      L3: {
                        if (((th) this).field_F != null) {
                          ((th) this).field_C.e(-398);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      ((th) this).field_F = param0;
                      if (param0 != null) {
                        ((th) this).field_C.a(false, param2 + 524395, param0);
                        this.a((byte) 87, param1, param5, ((th) this).field_C);
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      L4: {
                        if (((th) this).field_r == null) {
                          break L4;
                        } else {
                          ((th) this).field_o.e(-398);
                          break L4;
                        }
                      }
                      ((th) this).field_r = param0;
                      if (param0 == null) {
                        break L2;
                      } else {
                        ((th) this).field_o.a(false, 64, param0);
                        this.a((byte) 64, param1, param5, ((th) this).field_o);
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
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param3) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L5;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L5;
              }
            }
            ((th) this).field_B = stackIn_19_1 != 0;
            if (param0 != ((th) this).field_F) {
              if (param0 != ((th) this).field_r) {
                L6: {
                  if (param2 == -524289) {
                    break L6;
                  } else {
                    ((th) this).field_r = null;
                    break L6;
                  }
                }
                L7: {
                  if (null != ((th) this).field_F) {
                    if (((th) this).field_r == null) {
                      var7_int = 0;
                      break L7;
                    } else {
                      L8: {
                        if (((th) this).field_E >= 524288) {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          break L8;
                        } else {
                          stackOut_31_0 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          break L8;
                        }
                      }
                      var7_int = stackIn_33_0;
                      break L7;
                    }
                  } else {
                    var7_int = 1;
                    break L7;
                  }
                }
                L9: {
                  if (var7_int != 0) {
                    L10: {
                      if (((th) this).field_F != null) {
                        ((th) this).field_C.e(-398);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      ((th) this).field_F = param0;
                      if (param0 == null) {
                        break L11;
                      } else {
                        L12: {
                          stackOut_49_0 = ((th) this).field_C;
                          stackIn_51_0 = stackOut_49_0;
                          stackIn_50_0 = stackOut_49_0;
                          if (param3) {
                            stackOut_51_0 = (ei) (Object) stackIn_51_0;
                            stackOut_51_1 = 0;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            break L12;
                          } else {
                            stackOut_50_0 = (ei) (Object) stackIn_50_0;
                            stackOut_50_1 = 1;
                            stackIn_52_0 = stackOut_50_0;
                            stackIn_52_1 = stackOut_50_1;
                            break L12;
                          }
                        }
                        ((ei) (Object) stackIn_52_0).a(stackIn_52_1 != 0, 101, param0);
                        this.a((byte) 79, param1, param5, ((th) this).field_C);
                        break L11;
                      }
                    }
                    ((th) this).field_u = param4;
                    break L9;
                  } else {
                    L13: {
                      if (((th) this).field_r != null) {
                        ((th) this).field_o.e(-398);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      ((th) this).field_r = param0;
                      if (param0 == null) {
                        break L14;
                      } else {
                        L15: {
                          stackOut_40_0 = ((th) this).field_o;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_41_0 = stackOut_40_0;
                          if (param3) {
                            stackOut_42_0 = (ei) (Object) stackIn_42_0;
                            stackOut_42_1 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            stackIn_43_1 = stackOut_42_1;
                            break L15;
                          } else {
                            stackOut_41_0 = (ei) (Object) stackIn_41_0;
                            stackOut_41_1 = 1;
                            stackIn_43_0 = stackOut_41_0;
                            stackIn_43_1 = stackOut_41_1;
                            break L15;
                          }
                        }
                        ((ei) (Object) stackIn_43_0).a(stackIn_43_1 != 0, param2 + 524353, param0);
                        this.a((byte) 104, param1, param5, ((th) this).field_o);
                        break L14;
                      }
                    }
                    ((th) this).field_u = -param4;
                    break L9;
                  }
                }
                break L0;
              } else {
                ((th) this).field_u = -param4;
                this.a((byte) 57, param1, param5, ((th) this).field_o);
                return;
              }
            } else {
              ((th) this).field_u = param4;
              this.a((byte) 72, param1, param5, ((th) this).field_C);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var7 = decompiledCaughtException;
            stackOut_55_0 = (RuntimeException) var7;
            stackOut_55_1 = new StringBuilder().append("th.F(");
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param0 == null) {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L16;
            } else {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L16;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_58_0, stackIn_58_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void b(boolean param0) {
        field_z = null;
        field_v = null;
        field_m = null;
    }

    final synchronized int a() {
        return 2;
    }

    final sh d() {
        return null;
    }

    final void b(int[] param0, int param1, int param2) {
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
        int stackIn_49_0 = 0;
        int stackIn_63_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
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
        var11 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            if (0 < ((th) this).field_x) {
              L1: {
                if (!((th) this).field_B) {
                  break L1;
                } else {
                  L2: {
                    if (((th) this).field_u <= 0) {
                      break L2;
                    } else {
                      if (!((th) this).field_C.d(31499)) {
                        ((th) this).field_F = null;
                        ((th) this).field_B = false;
                        ((th) this).field_u = -((th) this).field_u;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (0 <= ((th) this).field_u) {
                    break L1;
                  } else {
                    if (!((th) this).field_o.d(31499)) {
                      ((th) this).field_B = false;
                      ((th) this).field_u = -((th) this).field_u;
                      ((th) this).field_r = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L3: {
                var4_int = ((th) this).field_x * (((th) this).field_E >> 12) / 256;
                var5 = ((th) this).field_x - var4_int;
                if (0 != ((th) this).field_u) {
                  ((th) this).field_E = ((th) this).field_E + param2 * ((th) this).field_u;
                  if (((th) this).field_E < 1048576) {
                    if (0 >= ((th) this).field_E) {
                      ((th) this).field_E = 0;
                      if (!((th) this).field_B) {
                        ((th) this).field_u = 0;
                        if (((th) this).field_w) {
                          break L3;
                        } else {
                          L4: {
                            if (((th) this).field_F != null) {
                              ((th) this).field_C.e(-398);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          ((th) this).field_F = null;
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    ((th) this).field_E = 1048576;
                    if (((th) this).field_B) {
                      break L3;
                    } else {
                      ((th) this).field_u = 0;
                      if (((th) this).field_w) {
                        break L3;
                      } else {
                        L5: {
                          if (((th) this).field_r == null) {
                            break L5;
                          } else {
                            ((th) this).field_o.e(-398);
                            break L5;
                          }
                        }
                        ((th) this).field_r = null;
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L6: {
                if (la.field_h) {
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
                if (((th) this).field_A < 256) {
                  L8: {
                    if (((th) this).field_F != null) {
                      break L8;
                    } else {
                      if (((th) this).field_r != null) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var4_int != 256) {
                    if (var5 == 256) {
                      ((th) this).field_o.b(param0, param1, param2);
                      break L7;
                    } else {
                      L9: {
                        L10: {
                          if (((th) this).field_q == null) {
                            break L10;
                          } else {
                            if (~var6 >= ~((th) this).field_q.length) {
                              dm.a(((th) this).field_q, 0, var6);
                              dm.a(((th) this).field_p, 0, var6);
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        ((th) this).field_p = new int[var6];
                        ((th) this).field_q = new int[var6];
                        break L9;
                      }
                      L11: {
                        ((th) this).field_C.b(((th) this).field_q, 0, param2);
                        ((th) this).field_o.b(((th) this).field_p, 0, param2);
                        if (!la.field_h) {
                          stackOut_48_0 = param1;
                          stackIn_49_0 = stackOut_48_0;
                          break L11;
                        } else {
                          param1 = param1 << 1;
                          stackOut_47_0 = param1 << 1;
                          stackIn_49_0 = stackOut_47_0;
                          break L11;
                        }
                      }
                      var7 = stackIn_49_0;
                      var8 = 0;
                      L12: while (true) {
                        if (~var8 <= ~var6) {
                          break L7;
                        } else {
                          param0[var8 + var7] = param0[var8 + var7] + (var4_int * ((th) this).field_q[var8] + ((th) this).field_p[var8] * var5 >> 8);
                          var8++;
                          continue L12;
                        }
                      }
                    }
                  } else {
                    ((th) this).field_C.b(param0, param1, param2);
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L13: {
                L14: {
                  if (((th) this).field_y == null) {
                    break L14;
                  } else {
                    if (((th) this).field_A != 0) {
                      L15: {
                        L16: {
                          if (null == ((th) this).field_q) {
                            break L16;
                          } else {
                            if (((th) this).field_q.length < var6) {
                              break L16;
                            } else {
                              dm.a(((th) this).field_q, 0, var6);
                              break L15;
                            }
                          }
                        }
                        ((th) this).field_q = new int[var6];
                        ((th) this).field_p = new int[var6];
                        break L15;
                      }
                      L17: {
                        ((th) this).field_t.b(((th) this).field_q, 0, param2);
                        if (la.field_h) {
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
                      var8 = ((th) this).field_A * ((th) this).field_x / 256;
                      var9 = -var8 + ((th) this).field_x;
                      var10 = 0;
                      L18: while (true) {
                        if (~var6 >= ~var10) {
                          break L14;
                        } else {
                          param0[var7 - -var10] = param0[var10 + var7] * var9 - -(((th) this).field_q[var10] * var8) >> 8;
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
            } else {
              ((th) this).a(param2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var4 = decompiledCaughtException;
            stackOut_67_0 = (RuntimeException) var4;
            stackOut_67_1 = new StringBuilder().append("th.G(");
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
          throw pf.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void a(int param0, byte param1) {
        ((th) this).field_x = param0;
        if (param1 <= 2) {
            ((th) this).field_E = -91;
        }
    }

    final sh c() {
        return null;
    }

    final synchronized void a(int param0) {
        int var3 = 0;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          if (((th) this).field_E > 0) {
            if (((th) this).field_F == null) {
              if (-1048577 > ((th) this).field_E) {
                if (((th) this).field_r != null) {
                  ((th) this).field_o.a(param0);
                  if (0 >= ((th) this).field_A) {
                    break L0;
                  } else {
                    if (null == ((th) this).field_y) {
                      break L0;
                    } else {
                      ((th) this).field_t.a(param0);
                      break L0;
                    }
                  }
                } else {
                  if (0 >= ((th) this).field_A) {
                    break L0;
                  } else {
                    if (null == ((th) this).field_y) {
                      break L0;
                    } else {
                      ((th) this).field_t.a(param0);
                      break L0;
                    }
                  }
                }
              } else {
                if (0 >= ((th) this).field_A) {
                  break L0;
                } else {
                  if (null == ((th) this).field_y) {
                    break L0;
                  } else {
                    ((th) this).field_t.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (0 >= ((th) this).field_A) {
                break L0;
              } else {
                if (null == ((th) this).field_y) {
                  break L0;
                } else {
                  ((th) this).field_t.a(param0);
                  break L0;
                }
              }
            }
          } else {
            if (-1048577 < ((th) this).field_E) {
              if (((th) this).field_r != null) {
                ((th) this).field_o.a(param0);
                if (0 >= ((th) this).field_A) {
                  break L0;
                } else {
                  if (null == ((th) this).field_y) {
                    break L0;
                  } else {
                    ((th) this).field_t.a(param0);
                    break L0;
                  }
                }
              } else {
                if (0 >= ((th) this).field_A) {
                  break L0;
                } else {
                  if (null == ((th) this).field_y) {
                    break L0;
                  } else {
                    ((th) this).field_t.a(param0);
                    break L0;
                  }
                }
              }
            } else {
              if (0 >= ((th) this).field_A) {
                break L0;
              } else {
                if (null != ((th) this).field_y) {
                  ((th) this).field_t.a(param0);
                  break L0;
                } else {
                  if (0 >= ((th) this).field_A) {
                    break L0;
                  } else {
                    if (null == ((th) this).field_y) {
                      break L0;
                    } else {
                      ((th) this).field_t.a(param0);
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        L1: {
          if (!((th) this).field_B) {
            break L1;
          } else {
            L2: {
              if (((th) this).field_u <= 0) {
                break L2;
              } else {
                if (((th) this).field_C.d(31499)) {
                  break L2;
                } else {
                  ((th) this).field_u = -((th) this).field_u;
                  ((th) this).field_F = null;
                  ((th) this).field_B = false;
                  break L1;
                }
              }
            }
            if (((th) this).field_u >= 0) {
              break L1;
            } else {
              if (!((th) this).field_o.d(31499)) {
                ((th) this).field_B = false;
                ((th) this).field_r = null;
                ((th) this).field_u = -((th) this).field_u;
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L3: {
          if (((th) this).field_u == 0) {
            break L3;
          } else {
            ((th) this).field_E = ((th) this).field_E + param0 * ((th) this).field_u;
            if (1048576 <= ((th) this).field_E) {
              ((th) this).field_E = 1048576;
              if (!((th) this).field_B) {
                ((th) this).field_u = 0;
                if (((th) this).field_w) {
                  break L3;
                } else {
                  L4: {
                    if (null == ((th) this).field_r) {
                      break L4;
                    } else {
                      ((th) this).field_o.e(-398);
                      break L4;
                    }
                  }
                  ((th) this).field_r = null;
                  break L3;
                }
              } else {
                break L3;
              }
            } else {
              if (((th) this).field_E <= 0) {
                ((th) this).field_E = 0;
                if (!((th) this).field_B) {
                  ((th) this).field_u = 0;
                  if (((th) this).field_w) {
                    break L3;
                  } else {
                    L5: {
                      if (((th) this).field_F != null) {
                        ((th) this).field_C.e(-398);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((th) this).field_F = null;
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
          }
        }
    }

    private th() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_s = 0;
        field_n = 0;
        field_D = 256;
        field_v = new dd[50];
    }
}
