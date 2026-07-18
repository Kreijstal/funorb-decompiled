/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo extends hk {
    private ll field_g;
    private byte[] field_z;
    static boolean field_s;
    private ke field_t;
    private byte[] field_f;
    private sk field_r;
    static String field_h;
    private sk field_k;
    static wf field_A;
    static je field_C;
    private int field_i;
    private th field_u;
    private int field_B;
    private dj field_m;
    private int field_j;
    static ah field_e;
    static float field_y;
    private t field_q;
    private je field_v;
    private boolean field_l;
    private je field_w;
    private int field_o;
    private boolean field_p;
    private long field_x;
    private boolean field_n;

    final void b(byte param0) {
        RuntimeException var2 = null;
        mc var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TetraLink.field_J;
        try {
          L0: {
            if (((bo) this).field_v == null) {
              return;
            } else {
              if (null != ((bo) this).a(0)) {
                var2_ref = ((bo) this).field_w.c(false);
                var3 = 77 / ((param0 - 66) / 36);
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var2_ref == null) {
                        break L3;
                      } else {
                        var4 = (int)var2_ref.field_c;
                        if (var5 != 0) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              L6: {
                                if (var4 < 0) {
                                  break L6;
                                } else {
                                  if (~((bo) this).field_q.field_i >= ~var4) {
                                    break L6;
                                  } else {
                                    if (((bo) this).field_q.field_m[var4] == 0) {
                                      break L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              var2_ref.b(false);
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              if (0 != ((bo) this).field_f[var4]) {
                                break L7;
                              } else {
                                ll discarded$2 = this.a(1, var4, 121);
                                break L7;
                              }
                            }
                            L8: {
                              if (-1 == ((bo) this).field_f[var4]) {
                                ll discarded$3 = this.a(2, var4, 120);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            if (1 != ((bo) this).field_f[var4]) {
                              break L4;
                            } else {
                              var2_ref.b(false);
                              break L4;
                            }
                          }
                          var2_ref = ((bo) this).field_w.a((byte) -70);
                          if (var5 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    break L2;
                  }
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "bo.K(" + param0 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ((bo) this).field_r) {
              return;
            } else {
              L1: {
                ((bo) this).field_p = true;
                if (param0 == 5127) {
                  break L1;
                } else {
                  field_C = null;
                  break L1;
                }
              }
              L2: {
                if (((bo) this).field_v != null) {
                  break L2;
                } else {
                  ((bo) this).field_v = new je();
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "bo.J(" + param0 + ')');
        }
    }

    final static void c(int param0, int param1) {
        try {
            fh.field_a = param0;
            uf.field_c = new int[param1];
            n.field_L = new fj[param0 * 15];
            pl.field_d = 0;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "bo.L(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(int param0, int param1) {
        ll var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                t discarded$2 = ((bo) this).a(-82);
                break L1;
              }
            }
            var3 = (ll) (Object) ((bo) this).field_m.a((long)param0, (byte) -43);
            if (var3 == null) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = var3.a(false);
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3_ref, "bo.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    public static void c(int param0) {
        field_C = null;
        field_h = null;
        if (param0 != -251) {
            return;
        }
        try {
            field_A = null;
            field_e = null;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "bo.N(" + param0 + ')');
        }
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        ll var2_ref = null;
        mc var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        byte stackIn_57_0 = 0;
        int stackIn_57_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_93_0 = 0;
        int stackIn_93_1 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_9_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_21_0 = 0;
        byte stackOut_56_0 = 0;
        int stackOut_56_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_92_0 = 0;
        int stackOut_92_1 = 0;
        var5 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              L2: {
                if (((bo) this).field_v != null) {
                  if (null != ((bo) this).a(0)) {
                    L3: {
                      if (!((bo) this).field_l) {
                        break L3;
                      } else {
                        var2_int = 1;
                        var3 = ((bo) this).field_v.c(false);
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (null == var3) {
                                break L6;
                              } else {
                                var4 = (int)var3.field_c;
                                stackOut_9_0 = ((bo) this).field_f[var4];
                                stackIn_22_0 = stackOut_9_0;
                                stackIn_10_0 = stackOut_9_0;
                                if (var5 != 0) {
                                  L7: while (true) {
                                    if (stackIn_22_0 >= ((bo) this).field_q.field_m.length) {
                                      break L5;
                                    } else {
                                      stackOut_23_0 = -1;
                                      stackOut_23_1 = ~((bo) this).field_q.field_m[((bo) this).field_o];
                                      stackIn_93_0 = stackOut_23_0;
                                      stackIn_93_1 = stackOut_23_1;
                                      stackIn_24_0 = stackOut_23_0;
                                      stackIn_24_1 = stackOut_23_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_24_0 = stackIn_24_0;
                                        stackOut_24_1 = stackIn_24_1;
                                        stackIn_26_0 = stackOut_24_0;
                                        stackIn_26_1 = stackOut_24_1;
                                        L8: {
                                          L9: {
                                            if (stackIn_26_0 == stackIn_26_1) {
                                              ((bo) this).field_o = ((bo) this).field_o + 1;
                                              if (var5 == 0) {
                                                break L8;
                                              } else {
                                                break L9;
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                          L10: {
                                            if (((bo) this).field_t.field_d < 250) {
                                              break L10;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L5;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (((bo) this).field_f[((bo) this).field_o] == 0) {
                                              ll discarded$4 = this.a(1, ((bo) this).field_o, 124);
                                              break L11;
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (((bo) this).field_f[((bo) this).field_o] == 0) {
                                              var3 = new mc();
                                              var3.field_c = (long)((bo) this).field_o;
                                              var2_int = 0;
                                              ((bo) this).field_v.a(var3, false);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          ((bo) this).field_o = ((bo) this).field_o + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L5;
                                          }
                                        }
                                        stackOut_21_0 = ((bo) this).field_o;
                                        stackIn_22_0 = stackOut_21_0;
                                        continue L7;
                                      }
                                    }
                                  }
                                } else {
                                  L13: {
                                    if (stackIn_10_0 == 0) {
                                      ll discarded$5 = this.a(1, var4, 123);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    L15: {
                                      if (((bo) this).field_f[var4] == 0) {
                                        break L15;
                                      } else {
                                        var3.b(false);
                                        if (var5 == 0) {
                                          break L14;
                                        } else {
                                          break L15;
                                        }
                                      }
                                    }
                                    var2_int = 0;
                                    break L14;
                                  }
                                  var3 = ((bo) this).field_v.a((byte) -70);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            L16: while (true) {
                              stackOut_21_0 = ((bo) this).field_o;
                              stackIn_22_0 = stackOut_21_0;
                              if (stackIn_22_0 >= ((bo) this).field_q.field_m.length) {
                                break L5;
                              } else {
                                stackOut_23_0 = -1;
                                stackOut_23_1 = ~((bo) this).field_q.field_m[((bo) this).field_o];
                                stackIn_93_0 = stackOut_23_0;
                                stackIn_93_1 = stackOut_23_1;
                                stackIn_24_0 = stackOut_23_0;
                                stackIn_24_1 = stackOut_23_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_24_0 = stackIn_24_0;
                                  stackOut_24_1 = stackIn_24_1;
                                  stackIn_26_0 = stackOut_24_0;
                                  stackIn_26_1 = stackOut_24_1;
                                  L17: {
                                    if (stackIn_26_0 == stackIn_26_1) {
                                      ((bo) this).field_o = ((bo) this).field_o + 1;
                                      if (var5 == 0) {
                                        continue L16;
                                      } else {
                                        break L17;
                                      }
                                    } else {
                                      break L17;
                                    }
                                  }
                                  L18: {
                                    if (((bo) this).field_t.field_d < 250) {
                                      break L18;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L5;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (((bo) this).field_f[((bo) this).field_o] == 0) {
                                      ll discarded$4 = this.a(1, ((bo) this).field_o, 124);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (((bo) this).field_f[((bo) this).field_o] == 0) {
                                      var3 = new mc();
                                      var3.field_c = (long)((bo) this).field_o;
                                      var2_int = 0;
                                      ((bo) this).field_v.a(var3, false);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  ((bo) this).field_o = ((bo) this).field_o + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          L21: {
                            if (var2_int == 0) {
                              break L21;
                            } else {
                              ((bo) this).field_o = 0;
                              ((bo) this).field_l = false;
                              break L21;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    L22: {
                      if (((bo) this).field_p) {
                        break L22;
                      } else {
                        ((bo) this).field_v = null;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L22;
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((bo) this).field_v.c(false);
                    L23: while (true) {
                      L24: {
                        L25: {
                          if (null == var3) {
                            break L25;
                          } else {
                            var4 = (int)var3.field_c;
                            stackOut_56_0 = ((bo) this).field_f[var4];
                            stackOut_56_1 = 1;
                            stackIn_69_0 = stackOut_56_0;
                            stackIn_69_1 = stackOut_56_1;
                            stackIn_57_0 = stackOut_56_0;
                            stackIn_57_1 = stackOut_56_1;
                            if (var5 != 0) {
                              L26: while (true) {
                                if (stackIn_69_0 <= stackIn_69_1) {
                                  break L24;
                                } else {
                                  stackOut_70_0 = 0;
                                  stackOut_70_1 = ((bo) this).field_q.field_m[((bo) this).field_o];
                                  stackIn_93_0 = stackOut_70_0;
                                  stackIn_93_1 = stackOut_70_1;
                                  stackIn_71_0 = stackOut_70_0;
                                  stackIn_71_1 = stackOut_70_1;
                                  if (var5 != 0) {
                                    break L1;
                                  } else {
                                    stackOut_71_0 = stackIn_71_0;
                                    stackOut_71_1 = stackIn_71_1;
                                    stackIn_73_0 = stackOut_71_0;
                                    stackIn_73_1 = stackOut_71_1;
                                    L27: {
                                      L28: {
                                        if (stackIn_73_0 == stackIn_73_1) {
                                          ((bo) this).field_o = ((bo) this).field_o + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        } else {
                                          break L28;
                                        }
                                      }
                                      L29: {
                                        if (!((bo) this).field_u.c(-7614)) {
                                          break L29;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L24;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (((bo) this).field_f[((bo) this).field_o] != 1) {
                                          ll discarded$6 = this.a(2, ((bo) this).field_o, 126);
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (((bo) this).field_f[((bo) this).field_o] == 1) {
                                          break L31;
                                        } else {
                                          var3 = new mc();
                                          var3.field_c = (long)((bo) this).field_o;
                                          ((bo) this).field_v.a(var3, false);
                                          var2_int = 0;
                                          break L31;
                                        }
                                      }
                                      ((bo) this).field_o = ((bo) this).field_o + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    stackOut_68_0 = ((bo) this).field_q.field_m.length;
                                    stackOut_68_1 = ((bo) this).field_o;
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    continue L26;
                                  }
                                }
                              }
                            } else {
                              L32: {
                                if (stackIn_57_0 == stackIn_57_1) {
                                  break L32;
                                } else {
                                  ll discarded$7 = this.a(2, var4, 125);
                                  break L32;
                                }
                              }
                              L33: {
                                L34: {
                                  if (((bo) this).field_f[var4] != 1) {
                                    break L34;
                                  } else {
                                    var3.b(false);
                                    if (var5 == 0) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L33;
                              }
                              var3 = ((bo) this).field_v.a((byte) -70);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L35: while (true) {
                          stackOut_68_0 = ((bo) this).field_q.field_m.length;
                          stackOut_68_1 = ((bo) this).field_o;
                          stackIn_69_0 = stackOut_68_0;
                          stackIn_69_1 = stackOut_68_1;
                          if (stackIn_69_0 <= stackIn_69_1) {
                            break L24;
                          } else {
                            stackOut_70_0 = 0;
                            stackOut_70_1 = ((bo) this).field_q.field_m[((bo) this).field_o];
                            stackIn_93_0 = stackOut_70_0;
                            stackIn_93_1 = stackOut_70_1;
                            stackIn_71_0 = stackOut_70_0;
                            stackIn_71_1 = stackOut_70_1;
                            if (var5 != 0) {
                              break L1;
                            } else {
                              stackOut_71_0 = stackIn_71_0;
                              stackOut_71_1 = stackIn_71_1;
                              stackIn_73_0 = stackOut_71_0;
                              stackIn_73_1 = stackOut_71_1;
                              L36: {
                                if (stackIn_73_0 == stackIn_73_1) {
                                  ((bo) this).field_o = ((bo) this).field_o + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L36;
                                  }
                                } else {
                                  break L36;
                                }
                              }
                              L37: {
                                if (!((bo) this).field_u.c(-7614)) {
                                  break L37;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L24;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (((bo) this).field_f[((bo) this).field_o] != 1) {
                                  ll discarded$6 = this.a(2, ((bo) this).field_o, 126);
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (((bo) this).field_f[((bo) this).field_o] == 1) {
                                  break L39;
                                } else {
                                  var3 = new mc();
                                  var3.field_c = (long)((bo) this).field_o;
                                  ((bo) this).field_v.a(var3, false);
                                  var2_int = 0;
                                  break L39;
                                }
                              }
                              ((bo) this).field_o = ((bo) this).field_o + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      if (var2_int == 0) {
                        break L2;
                      } else {
                        ((bo) this).field_p = false;
                        ((bo) this).field_o = 0;
                        break L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  break L2;
                }
              }
              stackOut_92_0 = param0;
              stackOut_92_1 = 2;
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              break L1;
            }
            L40: {
              if (stackIn_93_0 == stackIn_93_1) {
                break L40;
              } else {
                ((bo) this).field_v = null;
                break L40;
              }
            }
            L41: {
              if (!((bo) this).field_n) {
                break L41;
              } else {
                if (k.a(0) >= ((bo) this).field_x) {
                  var2_ref = (ll) (Object) ((bo) this).field_m.b(44);
                  L42: while (true) {
                    L43: {
                      if (var2_ref == null) {
                        break L43;
                      } else {
                        if (var5 != 0) {
                          break L41;
                        } else {
                          L44: {
                            if (var2_ref.field_v) {
                              break L44;
                            } else {
                              L45: {
                                if (!var2_ref.field_B) {
                                  break L45;
                                } else {
                                  if (var2_ref.field_D) {
                                    var2_ref.b(false);
                                    if (var5 == 0) {
                                      break L44;
                                    } else {
                                      break L45;
                                    }
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                              var2_ref.field_B = true;
                              break L44;
                            }
                          }
                          var2_ref = (ll) (Object) ((bo) this).field_m.a(param0 + -3);
                          if (var5 == 0) {
                            continue L42;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                    ((bo) this).field_x = k.a(0) + 1000L;
                    break L41;
                  }
                } else {
                  break L41;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "bo.M(" + param0 + ')');
        }
    }

    final byte[] b(int param0, int param1) {
        ll var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        try {
          L0: {
            L1: {
              var3 = this.a(0, param1, 121);
              if (param0 == 20396) {
                break L1;
              } else {
                bo.a(62, -68, (java.awt.Canvas) null, 86);
                break L1;
              }
            }
            if (var3 != null) {
              var4 = var3.c(true);
              var3.b(false);
              stackOut_6_0 = (byte[]) var4;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (byte[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var3_ref, "bo.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final t a(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        t stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_53_0 = null;
        t stackIn_59_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_52_0 = null;
        t stackOut_58_0 = null;
        t stackOut_2_0 = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            if (null == ((bo) this).field_q) {
              L1: {
                if (((bo) this).field_g != null) {
                  break L1;
                } else {
                  if (((bo) this).field_u.b((byte) 119)) {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (t) (Object) stackIn_11_0;
                  } else {
                    ((bo) this).field_g = (ll) (Object) ((bo) this).field_u.a(false, 255, (byte) 0, ((bo) this).field_i, true);
                    break L1;
                  }
                }
              }
              if (((bo) this).field_g.field_v) {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                return (t) (Object) stackIn_17_0;
              } else {
                L2: {
                  if (param0 == 0) {
                    break L2;
                  } else {
                    byte[] discarded$2 = ((bo) this).b(120, 16);
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var2_array = ((bo) this).field_g.c(true);
                    if (((bo) this).field_g instanceof fd) {
                      break L4;
                    } else {
                      try {
                        L5: {
                          if (null != var2_array) {
                            ((bo) this).field_q = new t(var2_array, ((bo) this).field_B, ((bo) this).field_z);
                            break L5;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          L7: {
                            var3 = decompiledCaughtException;
                            ((bo) this).field_u.b(0);
                            ((bo) this).field_q = null;
                            if (!((bo) this).field_u.b((byte) 119)) {
                              break L7;
                            } else {
                              ((bo) this).field_g = null;
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((bo) this).field_g = (ll) (Object) ((bo) this).field_u.a(false, 255, (byte) 0, ((bo) this).field_i, true);
                          break L6;
                        }
                        stackOut_33_0 = null;
                        stackIn_34_0 = stackOut_33_0;
                        return (t) (Object) stackIn_34_0;
                      }
                      if (((bo) this).field_k != null) {
                        fd discarded$3 = ((bo) this).field_t.a(param0 + -116, ((bo) this).field_i, var2_array, ((bo) this).field_k);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  try {
                    L8: {
                      if (var2_array != null) {
                        ((bo) this).field_q = new t(var2_array, ((bo) this).field_B, ((bo) this).field_z);
                        if (((bo) this).field_j == ((bo) this).field_q.field_f) {
                          break L8;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L9: {
                      L10: {
                        var3 = decompiledCaughtException;
                        ((bo) this).field_q = null;
                        if (((bo) this).field_u.b((byte) 119)) {
                          break L10;
                        } else {
                          ((bo) this).field_g = (ll) (Object) ((bo) this).field_u.a(false, 255, (byte) 0, ((bo) this).field_i, true);
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((bo) this).field_g = null;
                      break L9;
                    }
                    stackOut_52_0 = null;
                    stackIn_53_0 = stackOut_52_0;
                    return (t) (Object) stackIn_53_0;
                  }
                  break L3;
                }
                L11: {
                  ((bo) this).field_g = null;
                  if (null != ((bo) this).field_r) {
                    ((bo) this).field_f = new byte[((bo) this).field_q.field_i];
                    break L11;
                  } else {
                    break L11;
                  }
                }
                stackOut_58_0 = ((bo) this).field_q;
                stackIn_59_0 = stackOut_58_0;
                break L0;
              }
            } else {
              stackOut_2_0 = ((bo) this).field_q;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var2, "bo.A(" + param0 + ')');
        }
        return stackIn_59_0;
    }

    final static void a(int param0, int param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            try {
              L1: {
                var4 = param2.getGraphics();
                pk.field_O.a(10, param0, param1, var4);
                var4.dispose();
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var4_ref = (Exception) (Object) decompiledCaughtException;
                param2.repaint();
                break L2;
              }
            }
            L3: {
              if (param3 == -2) {
                break L3;
              } else {
                field_A = null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4_ref2;
            stackOut_7_1 = new StringBuilder().append("bo.H(").append(param0).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L4;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, jb param5, int param6, int param7, ve param8, ve param9, int param10, int param11, ve param12, int param13, jb param14, int param15, int param16, int param17, int param18, int param19) {
        RuntimeException var20 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              oi.field_a = param14;
              ko.field_u = param5;
              hh.a(param7, param11, param17, param18, -120);
              gj.a(param9, param6, param2, -20140);
              da.a(param15, param3, param8, -120, param13, param12);
              if (param4 == -1) {
                break L1;
              } else {
                bo.c(-91);
                break L1;
              }
            }
            b.a(param0, param1, (byte) -66);
            kb.a(param19, param16, param10, (byte) -118);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var20 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var20;
            stackOut_5_1 = new StringBuilder().append("bo.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param5 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param8 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param9 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param10).append(',').append(param11).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param12 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param13).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param14 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param15 + ',' + param16 + ',' + param17 + ',' + param18 + ',' + param19 + ')');
        }
    }

    private final ll a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_62_0 = null;
        byte stackIn_80_0 = 0;
        byte stackIn_80_1 = 0;
        Object stackIn_94_0 = null;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        Object stackIn_106_0 = null;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        Object stackIn_143_0 = null;
        Object stackIn_150_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_44_0 = null;
        Object stackOut_29_0 = null;
        Object stackOut_61_0 = null;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        Object stackOut_142_0 = null;
        byte stackOut_79_0 = 0;
        byte stackOut_79_1 = 0;
        Object stackOut_93_0 = null;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        Object stackOut_105_0 = null;
        Object stackOut_56_0 = null;
        Object stackOut_149_0 = null;
        var10 = TetraLink.field_J;
        try {
          try {
            L0: {
              var4 = (Object) (Object) (ll) (Object) ((bo) this).field_m.a((long)param1, (byte) -43);
              if (var4 == null) {
                break L0;
              } else {
                if (param0 != 0) {
                  break L0;
                } else {
                  if (((ll) var4).field_D) {
                    break L0;
                  } else {
                    if (((ll) var4).field_v) {
                      ((ll) var4).b(false);
                      var4 = null;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
            L1: {
              if (null == var4) {
                L2: {
                  if (param0 != 0) {
                    if (1 == param0) {
                      if (((bo) this).field_r == null) {
                        throw new RuntimeException();
                      } else {
                        var4 = (Object) (Object) ((bo) this).field_t.a(((bo) this).field_r, param1, 81);
                        break L2;
                      }
                    } else {
                      L3: {
                        if (2 != param0) {
                          break L3;
                        } else {
                          if (((bo) this).field_r != null) {
                            if (((bo) this).field_f[param1] == -1) {
                              if (!((bo) this).field_u.c(-7614)) {
                                var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, false);
                                if (var10 == 0) {
                                  break L2;
                                } else {
                                  break L3;
                                }
                              } else {
                                stackOut_44_0 = null;
                                stackIn_45_0 = stackOut_44_0;
                                return (ll) (Object) stackIn_45_0;
                              }
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } else {
                    L4: {
                      if (null == ((bo) this).field_r) {
                        break L4;
                      } else {
                        if (((bo) this).field_f[param1] == -1) {
                          break L4;
                        } else {
                          var4 = (Object) (Object) ((bo) this).field_t.a((byte) -120, ((bo) this).field_r, param1);
                          if (var10 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      if (((bo) this).field_u.b((byte) 119)) {
                        break L5;
                      } else {
                        var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, true);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackOut_29_0 = null;
                    stackIn_30_0 = stackOut_29_0;
                    return (ll) (Object) stackIn_30_0;
                  }
                }
                ((bo) this).field_m.a((long)param1, -110, (mc) var4);
                break L1;
              } else {
                break L1;
              }
            }
            if (param2 > 117) {
              if (((ll) var4).field_v) {
                stackOut_61_0 = null;
                stackIn_62_0 = stackOut_61_0;
                return (ll) (Object) stackIn_62_0;
              } else {
                var5 = ((ll) var4).c(true);
                if (var4 instanceof fd) {
                  L6: {
                    if (null == var5) {
                      break L6;
                    } else {
                      if (var5.length > 2) {
                        co.field_r.reset();
                        co.field_r.update(var5, 0, -2 + var5.length);
                        var6_int = (int)co.field_r.getValue();
                        if (~((bo) this).field_q.field_u[param1] == ~var6_int) {
                          L7: {
                            L8: {
                              if (((bo) this).field_q.field_e == null) {
                                break L8;
                              } else {
                                if (((bo) this).field_q.field_e[param1] == null) {
                                  break L8;
                                } else {
                                  var7_ref_byte__ = ((bo) this).field_q.field_e[param1];
                                  var8 = qb.a(var5, (byte) -89, var5.length - 2, 0);
                                  var9 = 0;
                                  L9: while (true) {
                                    if (64 <= var9) {
                                      break L8;
                                    } else {
                                      stackOut_122_0 = ~var7_ref_byte__[var9];
                                      stackOut_122_1 = ~var8[var9];
                                      stackIn_130_0 = stackOut_122_0;
                                      stackIn_130_1 = stackOut_122_1;
                                      stackIn_123_0 = stackOut_122_0;
                                      stackIn_123_1 = stackOut_122_1;
                                      if (var10 != 0) {
                                        break L7;
                                      } else {
                                        if (stackIn_123_0 != stackIn_123_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L9;
                                          } else {
                                            break L8;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_129_0 = var5[var5.length - 1] & 255;
                            stackOut_129_1 = 65280 & var5[-2 + var5.length] << -1403728376;
                            stackIn_130_0 = stackOut_129_0;
                            stackIn_130_1 = stackOut_129_1;
                            break L7;
                          }
                          var7 = stackIn_130_0 + stackIn_130_1;
                          if (var7 != (65535 & ((bo) this).field_q.field_k[param1])) {
                            throw new RuntimeException();
                          } else {
                            L10: {
                              if (((bo) this).field_f[param1] == 1) {
                                break L10;
                              } else {
                                L11: {
                                  if (((bo) this).field_f[param1] == 0) {
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                ((bo) this).field_f[param1] = (byte) 1;
                                break L10;
                              }
                            }
                            L12: {
                              if (((ll) var4).field_D) {
                                break L12;
                              } else {
                                ((ll) var4).b(false);
                                break L12;
                              }
                            }
                            stackOut_142_0 = var4;
                            stackIn_143_0 = stackOut_142_0;
                            return (ll) (Object) stackIn_143_0;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  throw new RuntimeException();
                } else {
                  try {
                    L13: {
                      L14: {
                        if (null == var5) {
                          break L14;
                        } else {
                          if (var5.length > 2) {
                            co.field_r.reset();
                            co.field_r.update(var5, 0, var5.length + -2);
                            var6_int = (int)co.field_r.getValue();
                            if (~((bo) this).field_q.field_u[param1] == ~var6_int) {
                              L15: {
                                if (((bo) this).field_q.field_e == null) {
                                  break L15;
                                } else {
                                  if (null == ((bo) this).field_q.field_e[param1]) {
                                    break L15;
                                  } else {
                                    var7_ref_byte__ = ((bo) this).field_q.field_e[param1];
                                    var8 = qb.a(var5, (byte) -89, -2 + var5.length, 0);
                                    var9 = 0;
                                    L16: while (true) {
                                      if (64 <= var9) {
                                        break L15;
                                      } else {
                                        stackOut_79_0 = var7_ref_byte__[var9];
                                        stackOut_79_1 = var8[var9];
                                        stackIn_99_0 = stackOut_79_0;
                                        stackIn_99_1 = stackOut_79_1;
                                        stackIn_80_0 = stackOut_79_0;
                                        stackIn_80_1 = stackOut_79_1;
                                        if (var10 != 0) {
                                          decompiledRegionSelector0 = 0;
                                          break L13;
                                        } else {
                                          if (stackIn_80_0 == stackIn_80_1) {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L16;
                                            } else {
                                              break L15;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              ((bo) this).field_u.field_h = 0;
                              ((bo) this).field_u.field_d = 0;
                              decompiledRegionSelector0 = 1;
                              break L13;
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            break L14;
                          }
                        }
                      }
                      throw new RuntimeException();
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L17: {
                      var6 = (RuntimeException) (Object) decompiledCaughtException;
                      ((bo) this).field_u.b(0);
                      ((ll) var4).b(false);
                      if (((ll) var4).field_D) {
                        if (((bo) this).field_u.b((byte) 119)) {
                          break L17;
                        } else {
                          var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, true);
                          ((bo) this).field_m.a((long)param1, -118, (mc) var4);
                          break L17;
                        }
                      } else {
                        break L17;
                      }
                    }
                    stackOut_93_0 = null;
                    stackIn_94_0 = stackOut_93_0;
                    return (ll) (Object) stackIn_94_0;
                  }
                  L18: {
                    L19: {
                      if (decompiledRegionSelector0 == 0) {
                        break L19;
                      } else {
                        var5[var5.length - 2] = (byte)(((bo) this).field_q.field_k[param1] >>> 929261416);
                        var5[var5.length - 1] = (byte)((bo) this).field_q.field_k[param1];
                        if (null != ((bo) this).field_r) {
                          fd discarded$1 = ((bo) this).field_t.a(-49, param1, var5, ((bo) this).field_r);
                          stackOut_98_0 = -2;
                          stackOut_98_1 = ~((bo) this).field_f[param1];
                          stackIn_99_0 = stackOut_98_0;
                          stackIn_99_1 = stackOut_98_1;
                          break L19;
                        } else {
                          break L18;
                        }
                      }
                    }
                    if (stackIn_99_0 != stackIn_99_1) {
                      ((bo) this).field_f[param1] = (byte) 1;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L20: {
                    if (((ll) var4).field_D) {
                      break L20;
                    } else {
                      ((ll) var4).b(false);
                      break L20;
                    }
                  }
                  stackOut_105_0 = var4;
                  stackIn_106_0 = stackOut_105_0;
                  return (ll) (Object) stackIn_106_0;
                }
              }
            } else {
              stackOut_56_0 = null;
              stackIn_57_0 = stackOut_56_0;
              return (ll) (Object) stackIn_57_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L21: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((bo) this).field_f[param1] = (byte) -1;
              ((ll) var4).b(false);
              if (!((ll) var4).field_D) {
                break L21;
              } else {
                if (((bo) this).field_u.b((byte) 119)) {
                  break L21;
                } else {
                  var4 = (Object) (Object) ((bo) this).field_u.a(false, ((bo) this).field_i, (byte) 2, param1, true);
                  ((bo) this).field_m.a((long)param1, -76, (mc) var4);
                  break L21;
                }
              }
            }
            stackOut_149_0 = null;
            stackIn_150_0 = stackOut_149_0;
            return (ll) (Object) stackIn_150_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw oi.a((Throwable) var4, "bo.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    bo(int param0, sk param1, sk param2, th param3, ke param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        ((bo) this).field_m = new dj(16);
        ((bo) this).field_o = 0;
        ((bo) this).field_w = new je();
        ((bo) this).field_x = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((bo) this).field_i = param0;
                ((bo) this).field_r = param1;
                if (null == ((bo) this).field_r) {
                  break L2;
                } else {
                  ((bo) this).field_l = true;
                  ((bo) this).field_v = new je();
                  if (TetraLink.field_J == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((bo) this).field_l = false;
              break L1;
            }
            L3: {
              ((bo) this).field_z = param6;
              ((bo) this).field_B = param5;
              ((bo) this).field_n = param8;
              ((bo) this).field_j = param7;
              ((bo) this).field_t = param4;
              ((bo) this).field_k = param2;
              ((bo) this).field_u = param3;
              if (null != ((bo) this).field_k) {
                ((bo) this).field_g = (ll) (Object) ((bo) this).field_t.a((byte) 111, ((bo) this).field_k, ((bo) this).field_i);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("bo.<init>(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Next";
        field_C = new je();
        field_y = 0.0f;
    }
}
