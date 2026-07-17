/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bha extends wda {
    private int field_t;
    static String field_q;
    static String field_x;
    private boolean field_w;
    static String field_o;
    private int field_v;
    static int field_z;
    private int field_u;
    private int field_A;
    static jpa field_C;
    static String field_y;
    private boolean field_r;
    static String field_B;
    private ir field_s;
    private int field_E;
    private int field_p;
    private boolean field_D;

    final void b(byte param0) {
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
        hca var14 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        var14 = ((bha) this).field_n.H(-119);
        if (var14.u(-25561)) {
          return;
        } else {
          L0: {
            var3 = -103 / ((-69 - param0) / 42);
            ((bha) this).field_s.field_f = var14.d(3);
            ((bha) this).field_s.field_d = var14.e(9648);
            ((bha) this).field_n.a(((bha) this).field_s, 117);
            var4 = ((bha) this).field_s.field_f - ((bha) this).field_n.s(25745);
            var5 = ((bha) this).field_s.field_d - ((bha) this).field_n.e(false);
            var6 = (var5 >> 16) * (var5 >> 16) + (var4 >> 16) * (var4 >> 16);
            if (!((bha) this).field_D) {
              break L0;
            } else {
              if (((bha) this).field_r) {
                break L0;
              } else {
                if (((bha) this).field_D) {
                  var7 = (((bha) this).field_v >> 16) * (((bha) this).field_v >> 16);
                  if (var7 < var6) {
                    ((bha) this).field_D = false;
                    return;
                  } else {
                    L1: {
                      if (var4 != 0) {
                        break L1;
                      } else {
                        if (0 == var5) {
                          var5 = 1;
                          break L1;
                        } else {
                          L2: {
                            if (((bha) this).field_r) {
                              var8 = ((bha) this).field_E;
                              break L2;
                            } else {
                              var8 = dfa.a(qva.a((byte) -13, -var5, -var4) + ((bha) this).field_p, 8192, 78);
                              break L2;
                            }
                          }
                          L3: {
                            var9 = hua.a((byte) 95, var8 >> 2);
                            var10 = bua.a(0, var8 >> 2);
                            var11 = doa.a(2, ((bha) this).field_A, var9);
                            var12 = doa.a(2, ((bha) this).field_A, var10);
                            ((bha) this).field_n.a((byte) -110, var11, var12);
                            if (((bha) this).field_w) {
                              ((bha) this).field_n.c(false, -((bha) this).field_n.q((byte) -80) + var8);
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                          return;
                        }
                      }
                    }
                    L4: {
                      if (((bha) this).field_r) {
                        var8 = ((bha) this).field_E;
                        break L4;
                      } else {
                        var8 = dfa.a(qva.a((byte) -13, -var5, -var4) + ((bha) this).field_p, 8192, 78);
                        break L4;
                      }
                    }
                    var9 = hua.a((byte) 95, var8 >> 2);
                    var10 = bua.a(0, var8 >> 2);
                    var11 = doa.a(2, ((bha) this).field_A, var9);
                    var12 = doa.a(2, ((bha) this).field_A, var10);
                    ((bha) this).field_n.a((byte) -110, var11, var12);
                    if (!((bha) this).field_w) {
                      return;
                    } else {
                      ((bha) this).field_n.c(false, -((bha) this).field_n.q((byte) -80) + var8);
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          }
          L5: {
            var7 = (((bha) this).field_t >> 16) * (((bha) this).field_t >> 16);
            if (var7 > var6) {
              if (!((bha) this).field_D) {
                if (0 < ((bha) this).field_u) {
                  L6: {
                    ((bha) this).field_p = ((bha) this).field_n.y(1751085328).a(((bha) this).field_u, 0) - ((bha) this).field_u / 2;
                    ((bha) this).field_D = true;
                    if (!((bha) this).field_r) {
                      break L6;
                    } else {
                      ((bha) this).field_E = dfa.a(qva.a((byte) -61, -var5, -var4) + ((bha) this).field_p, 8192, 87);
                      break L6;
                    }
                  }
                  if (((bha) this).field_D) {
                    var7 = (((bha) this).field_v >> 16) * (((bha) this).field_v >> 16);
                    if (var7 < var6) {
                      ((bha) this).field_D = false;
                      return;
                    } else {
                      L7: {
                        if (var4 != 0) {
                          break L7;
                        } else {
                          if (0 == var5) {
                            var5 = 1;
                            break L7;
                          } else {
                            L8: {
                              if (((bha) this).field_r) {
                                var8 = ((bha) this).field_E;
                                break L8;
                              } else {
                                var8 = dfa.a(qva.a((byte) -13, -var5, -var4) + ((bha) this).field_p, 8192, 78);
                                break L8;
                              }
                            }
                            L9: {
                              var9 = hua.a((byte) 95, var8 >> 2);
                              var10 = bua.a(0, var8 >> 2);
                              var11 = doa.a(2, ((bha) this).field_A, var9);
                              var12 = doa.a(2, ((bha) this).field_A, var10);
                              ((bha) this).field_n.a((byte) -110, var11, var12);
                              if (((bha) this).field_w) {
                                ((bha) this).field_n.c(false, -((bha) this).field_n.q((byte) -80) + var8);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            return;
                          }
                        }
                      }
                      L10: {
                        if (((bha) this).field_r) {
                          var8 = ((bha) this).field_E;
                          break L10;
                        } else {
                          var8 = dfa.a(qva.a((byte) -13, -var5, -var4) + ((bha) this).field_p, 8192, 78);
                          break L10;
                        }
                      }
                      var9 = hua.a((byte) 95, var8 >> 2);
                      var10 = bua.a(0, var8 >> 2);
                      var11 = doa.a(2, ((bha) this).field_A, var9);
                      var12 = doa.a(2, ((bha) this).field_A, var10);
                      ((bha) this).field_n.a((byte) -110, var11, var12);
                      if (!((bha) this).field_w) {
                        return;
                      } else {
                        ((bha) this).field_n.c(false, -((bha) this).field_n.q((byte) -80) + var8);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  ((bha) this).field_p = 0;
                  ((bha) this).field_D = true;
                  if (((bha) this).field_r) {
                    L11: {
                      ((bha) this).field_E = dfa.a(qva.a((byte) -61, -var5, -var4) + ((bha) this).field_p, 8192, 87);
                      if (((bha) this).field_D) {
                        var7 = (((bha) this).field_v >> 16) * (((bha) this).field_v >> 16);
                        if (var7 < var6) {
                          ((bha) this).field_D = false;
                          return;
                        } else {
                          L12: {
                            if (var4 != 0) {
                              break L12;
                            } else {
                              if (0 == var5) {
                                var5 = 1;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                          L13: {
                            if (((bha) this).field_r) {
                              var8 = ((bha) this).field_E;
                              break L13;
                            } else {
                              var8 = dfa.a(qva.a((byte) -13, -var5, -var4) + ((bha) this).field_p, 8192, 78);
                              break L13;
                            }
                          }
                          var9 = hua.a((byte) 95, var8 >> 2);
                          var10 = bua.a(0, var8 >> 2);
                          var11 = doa.a(2, ((bha) this).field_A, var9);
                          var12 = doa.a(2, ((bha) this).field_A, var10);
                          ((bha) this).field_n.a((byte) -110, var11, var12);
                          if (((bha) this).field_w) {
                            ((bha) this).field_n.c(false, -((bha) this).field_n.q((byte) -80) + var8);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                    return;
                  } else {
                    L14: {
                      if (((bha) this).field_D) {
                        var7 = (((bha) this).field_v >> 16) * (((bha) this).field_v >> 16);
                        if (var7 < var6) {
                          ((bha) this).field_D = false;
                          return;
                        } else {
                          L15: {
                            if (var4 != 0) {
                              break L15;
                            } else {
                              if (0 == var5) {
                                var5 = 1;
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                          }
                          L16: {
                            if (((bha) this).field_r) {
                              var8 = ((bha) this).field_E;
                              break L16;
                            } else {
                              var8 = dfa.a(qva.a((byte) -13, -var5, -var4) + ((bha) this).field_p, 8192, 78);
                              break L16;
                            }
                          }
                          var9 = hua.a((byte) 95, var8 >> 2);
                          var10 = bua.a(0, var8 >> 2);
                          var11 = doa.a(2, ((bha) this).field_A, var9);
                          var12 = doa.a(2, ((bha) this).field_A, var10);
                          ((bha) this).field_n.a((byte) -110, var11, var12);
                          if (((bha) this).field_w) {
                            ((bha) this).field_n.c(false, -((bha) this).field_n.q((byte) -80) + var8);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      } else {
                        break L14;
                      }
                    }
                    return;
                  }
                }
              } else {
                ((bha) this).field_D = true;
                if (!((bha) this).field_r) {
                  break L5;
                } else {
                  ((bha) this).field_E = dfa.a(qva.a((byte) -61, -var5, -var4) + ((bha) this).field_p, 8192, 87);
                  if (((bha) this).field_D) {
                    var7 = (((bha) this).field_v >> 16) * (((bha) this).field_v >> 16);
                    if (var7 < var6) {
                      ((bha) this).field_D = false;
                      return;
                    } else {
                      L17: {
                        if (var4 != 0) {
                          break L17;
                        } else {
                          if (0 == var5) {
                            var5 = 1;
                            break L17;
                          } else {
                            L18: {
                              if (((bha) this).field_r) {
                                var8 = ((bha) this).field_E;
                                break L18;
                              } else {
                                var8 = dfa.a(qva.a((byte) -13, -var5, -var4) + ((bha) this).field_p, 8192, 78);
                                break L18;
                              }
                            }
                            L19: {
                              var9 = hua.a((byte) 95, var8 >> 2);
                              var10 = bua.a(0, var8 >> 2);
                              var11 = doa.a(2, ((bha) this).field_A, var9);
                              var12 = doa.a(2, ((bha) this).field_A, var10);
                              ((bha) this).field_n.a((byte) -110, var11, var12);
                              if (((bha) this).field_w) {
                                ((bha) this).field_n.c(false, -((bha) this).field_n.q((byte) -80) + var8);
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            return;
                          }
                        }
                      }
                      L20: {
                        if (((bha) this).field_r) {
                          var8 = ((bha) this).field_E;
                          break L20;
                        } else {
                          var8 = dfa.a(qva.a((byte) -13, -var5, -var4) + ((bha) this).field_p, 8192, 78);
                          break L20;
                        }
                      }
                      var9 = hua.a((byte) 95, var8 >> 2);
                      var10 = bua.a(0, var8 >> 2);
                      var11 = doa.a(2, ((bha) this).field_A, var9);
                      var12 = doa.a(2, ((bha) this).field_A, var10);
                      ((bha) this).field_n.a((byte) -110, var11, var12);
                      if (!((bha) this).field_w) {
                        return;
                      } else {
                        ((bha) this).field_n.c(false, -((bha) this).field_n.q((byte) -80) + var8);
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              break L5;
            }
          }
          if (((bha) this).field_D) {
            var7 = (((bha) this).field_v >> 16) * (((bha) this).field_v >> 16);
            if (var7 < var6) {
              ((bha) this).field_D = false;
              return;
            } else {
              L21: {
                if (var4 != 0) {
                  break L21;
                } else {
                  if (0 == var5) {
                    var5 = 1;
                    break L21;
                  } else {
                    L22: {
                      if (((bha) this).field_r) {
                        var8 = ((bha) this).field_E;
                        break L22;
                      } else {
                        var8 = dfa.a(qva.a((byte) -13, -var5, -var4) + ((bha) this).field_p, 8192, 78);
                        break L22;
                      }
                    }
                    L23: {
                      var9 = hua.a((byte) 95, var8 >> 2);
                      var10 = bua.a(0, var8 >> 2);
                      var11 = doa.a(2, ((bha) this).field_A, var9);
                      var12 = doa.a(2, ((bha) this).field_A, var10);
                      ((bha) this).field_n.a((byte) -110, var11, var12);
                      if (((bha) this).field_w) {
                        ((bha) this).field_n.c(false, -((bha) this).field_n.q((byte) -80) + var8);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    return;
                  }
                }
              }
              L24: {
                if (((bha) this).field_r) {
                  var8 = ((bha) this).field_E;
                  break L24;
                } else {
                  var8 = dfa.a(qva.a((byte) -13, -var5, -var4) + ((bha) this).field_p, 8192, 78);
                  break L24;
                }
              }
              var9 = hua.a((byte) 95, var8 >> 2);
              var10 = bua.a(0, var8 >> 2);
              var11 = doa.a(2, ((bha) this).field_A, var9);
              var12 = doa.a(2, ((bha) this).field_A, var10);
              ((bha) this).field_n.a((byte) -110, var11, var12);
              if (!((bha) this).field_w) {
                return;
              } else {
                ((bha) this).field_n.c(false, -((bha) this).field_n.q((byte) -80) + var8);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    bha(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        ((bha) this).field_u = 1024;
        ((bha) this).field_s = new ir();
        try {
          L0: {
            L1: {
              ((bha) this).field_t = param1.b((byte) 44, 10) << 16;
              if (7 < param0.field_E) {
                L2: {
                  ((bha) this).field_v = param1.b((byte) 44, 10) << 16;
                  ((bha) this).field_A = ((bha) this).a(param1.b((byte) 44, 8), false);
                  stackOut_3_0 = this;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (param1.b((byte) 44, 1) == 1) {
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L2;
                  } else {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L2;
                  }
                }
                L3: {
                  ((bha) this).field_r = stackIn_6_1 != 0;
                  ((bha) this).field_u = oo.a(8, 8192, 0, param1.b((byte) 44, 8));
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (param1.b((byte) 44, 1) != 1) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L3;
                  } else {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L3;
                  }
                }
                ((bha) this).field_w = stackIn_9_1 != 0;
                break L1;
              } else {
                ((bha) this).field_v = ((bha) this).field_t;
                ((bha) this).field_A = param1.b((byte) 44, 4) << 16;
                ((bha) this).field_w = false;
                ((bha) this).field_r = false;
                ((bha) this).field_u = 0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("bha.<init>(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 41);
        }
    }

    public static void e(int param0) {
        field_y = null;
        field_q = null;
        field_C = null;
        if (param0 != 8561) {
          int discarded$2 = bha.f(-55);
          field_B = null;
          field_o = null;
          field_x = null;
          return;
        } else {
          field_B = null;
          field_o = null;
          field_x = null;
          return;
        }
    }

    final void a(int param0, fsa param1) {
        if (param0 < 35) {
            return;
        }
        try {
            super.a(96, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "bha.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final int a(int param0, int param1) {
        param1 = upa.a(((bha) this).field_D, param1, (byte) -41);
        param1 = fs.a((byte) 37, param1, ((bha) this).field_p);
        if (param0 != 0) {
          ((bha) this).b((byte) -46);
          return param1;
        } else {
          return param1;
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            field_o = null;
        }
    }

    final static int f(int param0) {
        if (param0 != 1) {
            bha.e((byte) 123);
            return 1;
        }
        return 1;
    }

    final int c(int param0) {
        if (param0 != 1) {
            return 58;
        }
        return 3;
    }

    final void a(kh param0, byte param1) {
        RuntimeException var3 = null;
        kh stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        kh stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        kh stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        kh stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        kh stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        kh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        kh stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        kh stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        kh stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        kh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        kh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, (byte) -108);
              param0.a((byte) -34, ((bha) this).field_t >> 16, 10);
              param0.a((byte) -128, ((bha) this).field_v >> 16, 10);
              param0.a((byte) -128, ((bha) this).b(0, ((bha) this).field_A), 8);
              stackOut_0_0 = (kh) param0;
              stackOut_0_1 = 111;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (!((bha) this).field_r) {
                stackOut_2_0 = (kh) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = (kh) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            L2: {
              ((kh) (Object) stackIn_3_0).a((byte) stackIn_3_1, stackIn_3_2, 1);
              param0.a((byte) -128, cn.a((byte) -104, ((bha) this).field_u, 8192, 8), 8);
              stackOut_3_0 = (kh) param0;
              stackOut_3_1 = -128;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              if (((bha) this).field_w) {
                stackOut_5_0 = (kh) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = 1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                break L2;
              } else {
                stackOut_4_0 = (kh) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 0;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                break L2;
              }
            }
            L3: {
              ((kh) (Object) stackIn_6_0).a((byte) stackIn_6_1, stackIn_6_2, 1);
              if (param1 < -78) {
                break L3;
              } else {
                ((bha) this).field_w = true;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("bha.R(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
    }

    final static void e(byte param0) {
        kra.field_a = new lqa(3, 4, true, true, true, true, true, true, true, false, true);
        nj.field_t = new lqa(3, 1, true, false, false, true, true, true, true, false, true);
        if (param0 != -33) {
          field_B = null;
          paa.field_z = new lqa(1, 4, true, true, true, true, true, true, true, false, true);
          vea.field_c = new lqa(1, 1, true, false, false, true, true, true, true, false, true);
          laa.field_x = new lqa(0, 1, true, false, false, false, false, false, false, true, false);
          daa.field_d = new lqa(0, 1, false, false, false, false, false, false, false, true, false);
          rc.field_a = new ei[]{(ei) (Object) kra.field_a, (ei) (Object) paa.field_z, (ei) (Object) nj.field_t, (ei) (Object) vea.field_c, (ei) (Object) laa.field_x, (ei) (Object) daa.field_d};
          return;
        } else {
          paa.field_z = new lqa(1, 4, true, true, true, true, true, true, true, false, true);
          vea.field_c = new lqa(1, 1, true, false, false, true, true, true, true, false, true);
          laa.field_x = new lqa(0, 1, true, false, false, false, false, false, false, true, false);
          daa.field_d = new lqa(0, 1, false, false, false, false, false, false, false, true, false);
          rc.field_a = new ei[]{(ei) (Object) kra.field_a, (ei) (Object) paa.field_z, (ei) (Object) nj.field_t, (ei) (Object) vea.field_c, (ei) (Object) laa.field_x, (ei) (Object) daa.field_d};
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Idols x2";
        field_q = "This entry doesn't match";
        field_y = "You can spectate this game";
        field_o = "Please remove <%0> from your friend list first.";
        field_B = "Click";
    }
}
