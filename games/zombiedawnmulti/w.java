/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w extends gq {
    private int field_s;
    private int[] field_r;
    private int[] field_w;
    private gd field_j;
    private int field_u;
    private ug field_p;
    static String field_n;
    private int field_k;
    private ug field_o;
    private boolean field_y;
    static fm field_A;
    private boolean field_l;
    private gd field_t;
    private ug field_x;
    private gd field_v;
    static ri field_z;
    static int field_m;
    private int field_q;

    private final void a(gd param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            param0.a(param2, param1, false);
            param0.a((byte) -116, param3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("w.H(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final synchronized void a(ug param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int stackIn_49_0 = 0;
        gd stackIn_60_0 = null;
        ug stackIn_60_1 = null;
        gd stackIn_62_0 = null;
        ug stackIn_62_1 = null;
        gd stackIn_63_0 = null;
        ug stackIn_63_1 = null;
        int stackIn_63_2 = 0;
        gd stackIn_74_0 = null;
        ug stackIn_74_1 = null;
        gd stackIn_76_0 = null;
        ug stackIn_76_1 = null;
        gd stackIn_77_0 = null;
        ug stackIn_77_1 = null;
        int stackIn_77_2 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        gd stackOut_59_0 = null;
        ug stackOut_59_1 = null;
        gd stackOut_62_0 = null;
        ug stackOut_62_1 = null;
        int stackOut_62_2 = 0;
        gd stackOut_60_0 = null;
        ug stackOut_60_1 = null;
        int stackOut_60_2 = 0;
        gd stackOut_73_0 = null;
        ug stackOut_73_1 = null;
        gd stackOut_76_0 = null;
        ug stackOut_76_1 = null;
        int stackOut_76_2 = 0;
        gd stackOut_74_0 = null;
        ug stackOut_74_1 = null;
        int stackOut_74_2 = 0;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        String stackOut_81_2 = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((w) this).field_y) {
                break L1;
              } else {
                if (!param2) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (0 >= ((w) this).field_q) {
                        break L3;
                      } else {
                        L4: {
                          if (null == ((w) this).field_p) {
                            break L4;
                          } else {
                            ((w) this).field_j.g(2);
                            break L4;
                          }
                        }
                        ((w) this).field_p = param0;
                        if (param0 == null) {
                          break L2;
                        } else {
                          ((w) this).field_j.a(param0, false, 8361407);
                          this.a(((w) this).field_j, -1, param3, param1);
                          if (var8 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L5: {
                      if (((w) this).field_o == null) {
                        break L5;
                      } else {
                        ((w) this).field_v.g(2);
                        break L5;
                      }
                    }
                    ((w) this).field_o = param0;
                    if (param0 != null) {
                      ((w) this).field_v.a(param0, false, 8361407);
                      this.a(((w) this).field_v, -1, param3, param1);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return;
                }
              }
            }
            ((w) this).field_y = param2;
            if (param5) {
              if (((w) this).field_p == param0) {
                ((w) this).field_q = param4;
                this.a(((w) this).field_j, -1, param3, param1);
                return;
              } else {
                if (param0 != ((w) this).field_o) {
                  L6: {
                    L7: {
                      if (((w) this).field_p != null) {
                        break L7;
                      } else {
                        var7_int = 1;
                        if (var8 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (((w) this).field_o != null) {
                        break L8;
                      } else {
                        var7_int = 0;
                        if (var8 == 0) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (524288 <= ((w) this).field_s) {
                        stackOut_48_0 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        break L9;
                      } else {
                        stackOut_46_0 = 1;
                        stackIn_49_0 = stackOut_46_0;
                        break L9;
                      }
                    }
                    var7_int = stackIn_49_0;
                    break L6;
                  }
                  L10: {
                    L11: {
                      if (var7_int == 0) {
                        break L11;
                      } else {
                        L12: {
                          if (((w) this).field_p == null) {
                            break L12;
                          } else {
                            ((w) this).field_j.g(2);
                            break L12;
                          }
                        }
                        L13: {
                          ((w) this).field_p = param0;
                          if (null != param0) {
                            L14: {
                              stackOut_59_0 = ((w) this).field_j;
                              stackOut_59_1 = (ug) param0;
                              stackIn_62_0 = stackOut_59_0;
                              stackIn_62_1 = stackOut_59_1;
                              stackIn_60_0 = stackOut_59_0;
                              stackIn_60_1 = stackOut_59_1;
                              if (param2) {
                                stackOut_62_0 = (gd) (Object) stackIn_62_0;
                                stackOut_62_1 = (ug) (Object) stackIn_62_1;
                                stackOut_62_2 = 0;
                                stackIn_63_0 = stackOut_62_0;
                                stackIn_63_1 = stackOut_62_1;
                                stackIn_63_2 = stackOut_62_2;
                                break L14;
                              } else {
                                stackOut_60_0 = (gd) (Object) stackIn_60_0;
                                stackOut_60_1 = (ug) (Object) stackIn_60_1;
                                stackOut_60_2 = 1;
                                stackIn_63_0 = stackOut_60_0;
                                stackIn_63_1 = stackOut_60_1;
                                stackIn_63_2 = stackOut_60_2;
                                break L14;
                              }
                            }
                            ((gd) (Object) stackIn_63_0).a(stackIn_63_1, stackIn_63_2 != 0, 8361407);
                            this.a(((w) this).field_j, -1, param3, param1);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        ((w) this).field_q = param4;
                        if (var8 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L15: {
                      if (null == ((w) this).field_o) {
                        break L15;
                      } else {
                        ((w) this).field_v.g(2);
                        break L15;
                      }
                    }
                    L16: {
                      ((w) this).field_o = param0;
                      if (null != param0) {
                        L17: {
                          stackOut_73_0 = ((w) this).field_v;
                          stackOut_73_1 = (ug) param0;
                          stackIn_76_0 = stackOut_73_0;
                          stackIn_76_1 = stackOut_73_1;
                          stackIn_74_0 = stackOut_73_0;
                          stackIn_74_1 = stackOut_73_1;
                          if (param2) {
                            stackOut_76_0 = (gd) (Object) stackIn_76_0;
                            stackOut_76_1 = (ug) (Object) stackIn_76_1;
                            stackOut_76_2 = 0;
                            stackIn_77_0 = stackOut_76_0;
                            stackIn_77_1 = stackOut_76_1;
                            stackIn_77_2 = stackOut_76_2;
                            break L17;
                          } else {
                            stackOut_74_0 = (gd) (Object) stackIn_74_0;
                            stackOut_74_1 = (ug) (Object) stackIn_74_1;
                            stackOut_74_2 = 1;
                            stackIn_77_0 = stackOut_74_0;
                            stackIn_77_1 = stackOut_74_1;
                            stackIn_77_2 = stackOut_74_2;
                            break L17;
                          }
                        }
                        ((gd) (Object) stackIn_77_0).a(stackIn_77_1, stackIn_77_2 != 0, 8361407);
                        this.a(((w) this).field_v, -1, param3, param1);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    ((w) this).field_q = -param4;
                    break L10;
                  }
                  break L0;
                } else {
                  ((w) this).field_q = -param4;
                  this.a(((w) this).field_v, -1, param3, param1);
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var7 = decompiledCaughtException;
            stackOut_80_0 = (RuntimeException) var7;
            stackOut_80_1 = new StringBuilder().append("w.C(");
            stackIn_83_0 = stackOut_80_0;
            stackIn_83_1 = stackOut_80_1;
            stackIn_81_0 = stackOut_80_0;
            stackIn_81_1 = stackOut_80_1;
            if (param0 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L18;
            } else {
              stackOut_81_0 = (RuntimeException) (Object) stackIn_81_0;
              stackOut_81_1 = (StringBuilder) (Object) stackIn_81_1;
              stackOut_81_2 = "{...}";
              stackIn_84_0 = stackOut_81_0;
              stackIn_84_1 = stackOut_81_1;
              stackIn_84_2 = stackOut_81_2;
              break L18;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final gq d() {
        RuntimeException var1 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "w.RA()");
        }
        return (gq) (Object) stackIn_1_0;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        try {
            int var4_int = 94 % ((param3 - -10) / 35);
            ia.a(param0, param1, param2, 0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "w.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (pk.field_b == null) {
                break L1;
              } else {
                if (!pk.field_b.a(false)) {
                  break L1;
                } else {
                  q.b(124);
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            if (param3 == 18663) {
              L2: {
                if (bk.field_i == null) {
                  break L2;
                } else {
                  if (!bk.field_i.k(param3 ^ 18562)) {
                    break L2;
                  } else {
                    bk.field_i = null;
                    q.b(46);
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  }
                }
              }
              if (vc.a(param3 ^ 5010853)) {
                stackOut_18_0 = 1;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              } else {
                if (!sd.a(param2, (byte) 122, param0, param1)) {
                  stackOut_23_0 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_22_0 = stackOut_21_0;
                  return stackIn_22_0 != 0;
                }
              }
            } else {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var4, "w.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_24_0 != 0;
    }

    final synchronized void a(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((w) this).field_s <= 0) {
                break L1;
              } else {
                if (null != ((w) this).field_p) {
                  ((w) this).field_j.a(param0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (((w) this).field_s >= 1048576) {
                break L2;
              } else {
                if (((w) this).field_o == null) {
                  break L2;
                } else {
                  ((w) this).field_v.a(param0);
                  break L2;
                }
              }
            }
            L3: {
              if (0 >= ((w) this).field_u) {
                break L3;
              } else {
                if (((w) this).field_x != null) {
                  ((w) this).field_t.a(param0);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (!((w) this).field_y) {
                break L4;
              } else {
                L5: {
                  if (((w) this).field_q <= 0) {
                    break L5;
                  } else {
                    if (((w) this).field_j.c(-106)) {
                      break L5;
                    } else {
                      ((w) this).field_p = null;
                      ((w) this).field_q = -((w) this).field_q;
                      ((w) this).field_y = false;
                      if (var3 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                if (((w) this).field_q >= 0) {
                  break L4;
                } else {
                  if (!((w) this).field_v.c(-61)) {
                    ((w) this).field_o = null;
                    ((w) this).field_q = -((w) this).field_q;
                    ((w) this).field_y = false;
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
            }
            L6: {
              if (((w) this).field_q != 0) {
                L7: {
                  ((w) this).field_s = ((w) this).field_s + param0 * ((w) this).field_q;
                  if (((w) this).field_s >= 1048576) {
                    break L7;
                  } else {
                    if (0 >= ((w) this).field_s) {
                      ((w) this).field_s = 0;
                      if (!((w) this).field_y) {
                        ((w) this).field_q = 0;
                        if (!((w) this).field_l) {
                          L8: {
                            if (((w) this).field_p == null) {
                              break L8;
                            } else {
                              ((w) this).field_j.g(2);
                              break L8;
                            }
                          }
                          ((w) this).field_p = null;
                          if (var3 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                }
                ((w) this).field_s = 1048576;
                if (!((w) this).field_y) {
                  ((w) this).field_q = 0;
                  if (((w) this).field_l) {
                    break L6;
                  } else {
                    L9: {
                      if (null != ((w) this).field_o) {
                        ((w) this).field_v.g(2);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    ((w) this).field_o = null;
                    break L6;
                  }
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "w.B(" + param0 + ')');
        }
    }

    final synchronized void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 18813) {
                break L1;
              } else {
                int discarded$2 = ((w) this).a();
                break L1;
              }
            }
            ((w) this).field_k = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "w.D(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int a() {
        RuntimeException var1 = null;
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        try {
          L0: {
            stackOut_0_0 = 2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "w.VA()");
        }
        return stackIn_1_0;
    }

    final static void c(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~uf.field_g >= ~var1_int) {
                    break L3;
                  } else {
                    uk.field_M[var1_int] = null;
                    var1_int++;
                    if (var2 != 0) {
                      break L2;
                    } else {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                uf.field_g = param0;
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) (Object) runtimeException, "w.I(" + param0 + ')');
        }
    }

    final gq b() {
        RuntimeException var1 = null;
        Object stackIn_1_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_0_0 = null;
        try {
          L0: {
            stackOut_0_0 = null;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "w.G()");
        }
        return (gq) (Object) stackIn_1_0;
    }

    public static void a(byte param0) {
        if (param0 >= -81) {
            return;
        }
        try {
            field_z = null;
            field_n = null;
            field_A = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "w.E(" + param0 + ')');
        }
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
        int stackIn_59_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_116_0 = 0;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        String stackIn_127_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_114_0 = 0;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (((w) this).field_k > 0) {
              L1: {
                if (((w) this).field_y) {
                  L2: {
                    if (0 >= ((w) this).field_q) {
                      break L2;
                    } else {
                      if (((w) this).field_j.c(-54)) {
                        break L2;
                      } else {
                        ((w) this).field_p = null;
                        ((w) this).field_y = false;
                        ((w) this).field_q = -((w) this).field_q;
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  if (((w) this).field_q >= 0) {
                    break L1;
                  } else {
                    if (!((w) this).field_v.c(-103)) {
                      ((w) this).field_o = null;
                      ((w) this).field_q = -((w) this).field_q;
                      ((w) this).field_y = false;
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
                var4_int = (((w) this).field_s >> 292573932) * ((w) this).field_k / 256;
                var5 = -var4_int + ((w) this).field_k;
                if (((w) this).field_q != 0) {
                  L4: {
                    ((w) this).field_s = ((w) this).field_s + ((w) this).field_q * param2;
                    if (((w) this).field_s >= 1048576) {
                      break L4;
                    } else {
                      if (0 < ((w) this).field_s) {
                        break L3;
                      } else {
                        ((w) this).field_s = 0;
                        if (((w) this).field_y) {
                          break L3;
                        } else {
                          ((w) this).field_q = 0;
                          if (((w) this).field_l) {
                            break L3;
                          } else {
                            L5: {
                              if (null != ((w) this).field_p) {
                                ((w) this).field_j.g(2);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            ((w) this).field_p = null;
                            if (var11 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                  }
                  ((w) this).field_s = 1048576;
                  if (((w) this).field_y) {
                    break L3;
                  } else {
                    ((w) this).field_q = 0;
                    if (!((w) this).field_l) {
                      L6: {
                        if (null == ((w) this).field_o) {
                          break L6;
                        } else {
                          ((w) this).field_v.g(2);
                          break L6;
                        }
                      }
                      ((w) this).field_o = null;
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
                if (gp.field_j) {
                  stackOut_58_0 = param2 << -1305592351;
                  stackIn_59_0 = stackOut_58_0;
                  break L7;
                } else {
                  stackOut_56_0 = param2;
                  stackIn_59_0 = stackOut_56_0;
                  break L7;
                }
              }
              L8: {
                var6 = stackIn_59_0;
                if (((w) this).field_u < 256) {
                  L9: {
                    if (null != ((w) this).field_p) {
                      break L9;
                    } else {
                      if (((w) this).field_o == null) {
                        break L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (var4_int == 256) {
                      break L10;
                    } else {
                      L11: {
                        if (256 == var5) {
                          break L11;
                        } else {
                          L12: {
                            L13: {
                              if (((w) this).field_w == null) {
                                break L13;
                              } else {
                                if (((w) this).field_w.length < var6) {
                                  break L13;
                                } else {
                                  d.a(((w) this).field_w, 0, var6);
                                  d.a(((w) this).field_r, 0, var6);
                                  if (var11 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                            ((w) this).field_w = new int[var6];
                            ((w) this).field_r = new int[var6];
                            break L12;
                          }
                          L14: {
                            ((w) this).field_j.b(((w) this).field_w, 0, param2);
                            ((w) this).field_v.b(((w) this).field_r, 0, param2);
                            if (!gp.field_j) {
                              stackOut_85_0 = param1;
                              stackIn_86_0 = stackOut_85_0;
                              break L14;
                            } else {
                              param1 = param1 << 1;
                              stackOut_84_0 = param1 << 1;
                              stackIn_86_0 = stackOut_84_0;
                              break L14;
                            }
                          }
                          var7 = stackIn_86_0;
                          var8 = 0;
                          L15: while (true) {
                            L16: {
                              if (var6 <= var8) {
                                break L16;
                              } else {
                                param0[var7 + var8] = param0[var7 + var8] + (((w) this).field_r[var8] * var5 + var4_int * ((w) this).field_w[var8] >> 468994792);
                                var8++;
                                if (var11 != 0) {
                                  break L8;
                                } else {
                                  if (var11 == 0) {
                                    continue L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            if (var11 == 0) {
                              break L8;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      ((w) this).field_v.b(param0, param1, param2);
                      if (var11 == 0) {
                        break L8;
                      } else {
                        break L10;
                      }
                    }
                  }
                  ((w) this).field_j.b(param0, param1, param2);
                  break L8;
                } else {
                  break L8;
                }
              }
              L17: {
                L18: {
                  if (((w) this).field_x == null) {
                    break L18;
                  } else {
                    if (((w) this).field_u != 0) {
                      L19: {
                        L20: {
                          L21: {
                            if (null == ((w) this).field_w) {
                              break L21;
                            } else {
                              if (((w) this).field_w.length >= var6) {
                                break L20;
                              } else {
                                break L21;
                              }
                            }
                          }
                          ((w) this).field_r = new int[var6];
                          ((w) this).field_w = new int[var6];
                          if (var11 == 0) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                        d.a(((w) this).field_w, 0, var6);
                        break L19;
                      }
                      L22: {
                        ((w) this).field_t.b(((w) this).field_w, 0, param2);
                        if (!gp.field_j) {
                          stackOut_115_0 = param1;
                          stackIn_116_0 = stackOut_115_0;
                          break L22;
                        } else {
                          param1 = param1 << 1;
                          stackOut_114_0 = param1 << 1;
                          stackIn_116_0 = stackOut_114_0;
                          break L22;
                        }
                      }
                      var7 = stackIn_116_0;
                      var8 = ((w) this).field_u * ((w) this).field_k / 256;
                      var9 = -var8 + ((w) this).field_k;
                      var10 = 0;
                      L23: while (true) {
                        if (var6 <= var10) {
                          break L18;
                        } else {
                          param0[var10 + var7] = var8 * ((w) this).field_w[var10] + param0[var10 + var7] * var9 >> 1756589480;
                          var10++;
                          if (var11 != 0) {
                            break L17;
                          } else {
                            if (var11 == 0) {
                              continue L23;
                            } else {
                              break L18;
                            }
                          }
                        }
                      }
                    } else {
                      break L18;
                    }
                  }
                }
                break L17;
              }
              break L0;
            } else {
              ((w) this).a(param2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var4 = decompiledCaughtException;
            stackOut_123_0 = (RuntimeException) var4;
            stackOut_123_1 = new StringBuilder().append("w.F(");
            stackIn_126_0 = stackOut_123_0;
            stackIn_126_1 = stackOut_123_1;
            stackIn_124_0 = stackOut_123_0;
            stackIn_124_1 = stackOut_123_1;
            if (param0 == null) {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "null";
              stackIn_127_0 = stackOut_126_0;
              stackIn_127_1 = stackOut_126_1;
              stackIn_127_2 = stackOut_126_2;
              break L24;
            } else {
              stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
              stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
              stackOut_124_2 = "{...}";
              stackIn_127_0 = stackOut_124_0;
              stackIn_127_1 = stackOut_124_1;
              stackIn_127_2 = stackOut_124_2;
              break L24;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_127_0, stackIn_127_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private w() throws Throwable {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new Error();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "w.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Ready";
    }
}
