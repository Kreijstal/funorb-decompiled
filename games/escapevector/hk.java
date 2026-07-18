/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends ob {
    private byte[] field_f;
    private int field_p;
    static String[] field_r;
    private byte[] field_g;
    private int field_l;
    private f field_m;
    private int field_s;
    private sb field_t;
    private jg field_o;
    private oa field_y;
    private ib field_q;
    private kk field_k;
    private jg field_x;
    private boolean field_v;
    private cn field_e;
    private cn field_u;
    private boolean field_j;
    private int field_z;
    static int field_n;
    private long field_h;
    private boolean field_i;
    static te[] field_w;

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        oa var2_ref = null;
        hg var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_13_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_96_0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_12_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_95_0 = 0;
        var5 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 < -21) {
                break L1;
              } else {
                byte[] discarded$5 = ((hk) this).a((byte) -107, 43);
                break L1;
              }
            }
            L2: {
              if (null == ((hk) this).field_u) {
                break L2;
              } else {
                if (null != ((hk) this).a(29192)) {
                  L3: {
                    if (!((hk) this).field_v) {
                      break L3;
                    } else {
                      var2_int = 1;
                      var3 = ((hk) this).field_u.a(false);
                      L4: while (true) {
                        L5: {
                          L6: {
                            L7: {
                              if (var3 == null) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_e;
                                stackOut_12_0 = ((hk) this).field_f[var4];
                                stackIn_24_0 = stackOut_12_0;
                                stackIn_13_0 = stackOut_12_0;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_24_0 >= ~((hk) this).field_z) {
                                      break L6;
                                    } else {
                                      stackOut_25_0 = ((hk) this).field_m.field_i[((hk) this).field_z];
                                      stackIn_46_0 = stackOut_25_0;
                                      stackIn_26_0 = stackOut_25_0;
                                      if (var5 != 0) {
                                        break L5;
                                      } else {
                                        stackOut_26_0 = stackIn_26_0;
                                        stackIn_28_0 = stackOut_26_0;
                                        L9: {
                                          L10: {
                                            if (stackIn_28_0 == 0) {
                                              ((hk) this).field_z = ((hk) this).field_z + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                          L11: {
                                            if (250 <= ((hk) this).field_k.field_f) {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L6;
                                              } else {
                                                break L11;
                                              }
                                            } else {
                                              break L11;
                                            }
                                          }
                                          L12: {
                                            if (0 != ((hk) this).field_f[((hk) this).field_z]) {
                                              break L12;
                                            } else {
                                              oa discarded$6 = this.a(((hk) this).field_z, 1, 23874);
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (((hk) this).field_f[((hk) this).field_z] != 0) {
                                              break L13;
                                            } else {
                                              var3 = new hg();
                                              var3.field_e = (long)((hk) this).field_z;
                                              ((hk) this).field_u.a(-12328, var3);
                                              var2_int = 0;
                                              break L13;
                                            }
                                          }
                                          ((hk) this).field_z = ((hk) this).field_z + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_23_0 = ~((hk) this).field_m.field_i.length;
                                        stackIn_24_0 = stackOut_23_0;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_13_0 == 0) {
                                      oa discarded$7 = this.a(var4, 1, 23874);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((hk) this).field_f[var4] != 0) {
                                        break L16;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    var3.c((byte) -53);
                                    break L15;
                                  }
                                  var3 = ((hk) this).field_u.b((byte) 70);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_23_0 = ~((hk) this).field_m.field_i.length;
                              stackIn_24_0 = stackOut_23_0;
                              if (stackIn_24_0 >= ~((hk) this).field_z) {
                                break L6;
                              } else {
                                stackOut_25_0 = ((hk) this).field_m.field_i[((hk) this).field_z];
                                stackIn_46_0 = stackOut_25_0;
                                stackIn_26_0 = stackOut_25_0;
                                if (var5 != 0) {
                                  break L5;
                                } else {
                                  stackOut_26_0 = stackIn_26_0;
                                  stackIn_28_0 = stackOut_26_0;
                                  L18: {
                                    if (stackIn_28_0 == 0) {
                                      ((hk) this).field_z = ((hk) this).field_z + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (250 <= ((hk) this).field_k.field_f) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L19;
                                      }
                                    } else {
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (0 != ((hk) this).field_f[((hk) this).field_z]) {
                                      break L20;
                                    } else {
                                      oa discarded$6 = this.a(((hk) this).field_z, 1, 23874);
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (((hk) this).field_f[((hk) this).field_z] != 0) {
                                      break L21;
                                    } else {
                                      var3 = new hg();
                                      var3.field_e = (long)((hk) this).field_z;
                                      ((hk) this).field_u.a(-12328, var3);
                                      var2_int = 0;
                                      break L21;
                                    }
                                  }
                                  ((hk) this).field_z = ((hk) this).field_z + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_45_0 = var2_int;
                          stackIn_46_0 = stackOut_45_0;
                          break L5;
                        }
                        L22: {
                          if (stackIn_46_0 == 0) {
                            break L22;
                          } else {
                            ((hk) this).field_z = 0;
                            ((hk) this).field_v = false;
                            break L22;
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
                  L23: {
                    if (((hk) this).field_j) {
                      break L23;
                    } else {
                      ((hk) this).field_u = null;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L23;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((hk) this).field_u.a(false);
                  L24: while (true) {
                    L25: {
                      L26: {
                        L27: {
                          if (null == var3) {
                            break L27;
                          } else {
                            var4 = (int)var3.field_e;
                            stackOut_58_0 = ~((hk) this).field_f[var4];
                            stackOut_58_1 = -2;
                            stackIn_71_0 = stackOut_58_0;
                            stackIn_71_1 = stackOut_58_1;
                            stackIn_59_0 = stackOut_58_0;
                            stackIn_59_1 = stackOut_58_1;
                            if (var5 != 0) {
                              L28: while (true) {
                                if (stackIn_71_0 <= stackIn_71_1) {
                                  break L26;
                                } else {
                                  stackOut_72_0 = ((hk) this).field_m.field_i[((hk) this).field_z];
                                  stackIn_96_0 = stackOut_72_0;
                                  stackIn_73_0 = stackOut_72_0;
                                  if (var5 != 0) {
                                    break L25;
                                  } else {
                                    stackOut_73_0 = stackIn_73_0;
                                    stackIn_75_0 = stackOut_73_0;
                                    L29: {
                                      L30: {
                                        if (stackIn_75_0 != 0) {
                                          break L30;
                                        } else {
                                          ((hk) this).field_z = ((hk) this).field_z + 1;
                                          if (var5 == 0) {
                                            break L29;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      L31: {
                                        if (((hk) this).field_t.b(20)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L26;
                                          } else {
                                            break L31;
                                          }
                                        } else {
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (((hk) this).field_f[((hk) this).field_z] == 1) {
                                          break L32;
                                        } else {
                                          oa discarded$8 = this.a(((hk) this).field_z, 2, 23874);
                                          break L32;
                                        }
                                      }
                                      L33: {
                                        if (1 != ((hk) this).field_f[((hk) this).field_z]) {
                                          var3 = new hg();
                                          var3.field_e = (long)((hk) this).field_z;
                                          var2_int = 0;
                                          ((hk) this).field_u.a(-12328, var3);
                                          break L33;
                                        } else {
                                          break L33;
                                        }
                                      }
                                      ((hk) this).field_z = ((hk) this).field_z + 1;
                                      if (var5 == 0) {
                                        break L29;
                                      } else {
                                        break L26;
                                      }
                                    }
                                    stackOut_70_0 = ~((hk) this).field_z;
                                    stackOut_70_1 = ~((hk) this).field_m.field_i.length;
                                    stackIn_71_0 = stackOut_70_0;
                                    stackIn_71_1 = stackOut_70_1;
                                    continue L28;
                                  }
                                }
                              }
                            } else {
                              L34: {
                                if (stackIn_59_0 == stackIn_59_1) {
                                  break L34;
                                } else {
                                  oa discarded$9 = this.a(var4, 2, 23874);
                                  break L34;
                                }
                              }
                              L35: {
                                L36: {
                                  if (((hk) this).field_f[var4] != 1) {
                                    break L36;
                                  } else {
                                    var3.c((byte) -24);
                                    if (var5 == 0) {
                                      break L35;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                                var2_int = 0;
                                break L35;
                              }
                              var3 = ((hk) this).field_u.b((byte) 70);
                              if (var5 == 0) {
                                continue L24;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        L37: while (true) {
                          stackOut_70_0 = ~((hk) this).field_z;
                          stackOut_70_1 = ~((hk) this).field_m.field_i.length;
                          stackIn_71_0 = stackOut_70_0;
                          stackIn_71_1 = stackOut_70_1;
                          if (stackIn_71_0 <= stackIn_71_1) {
                            break L26;
                          } else {
                            stackOut_72_0 = ((hk) this).field_m.field_i[((hk) this).field_z];
                            stackIn_96_0 = stackOut_72_0;
                            stackIn_73_0 = stackOut_72_0;
                            if (var5 != 0) {
                              break L25;
                            } else {
                              stackOut_73_0 = stackIn_73_0;
                              stackIn_75_0 = stackOut_73_0;
                              L38: {
                                if (stackIn_75_0 != 0) {
                                  break L38;
                                } else {
                                  ((hk) this).field_z = ((hk) this).field_z + 1;
                                  if (var5 == 0) {
                                    continue L37;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              L39: {
                                if (((hk) this).field_t.b(20)) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L26;
                                  } else {
                                    break L39;
                                  }
                                } else {
                                  break L39;
                                }
                              }
                              L40: {
                                if (((hk) this).field_f[((hk) this).field_z] == 1) {
                                  break L40;
                                } else {
                                  oa discarded$8 = this.a(((hk) this).field_z, 2, 23874);
                                  break L40;
                                }
                              }
                              L41: {
                                if (1 != ((hk) this).field_f[((hk) this).field_z]) {
                                  var3 = new hg();
                                  var3.field_e = (long)((hk) this).field_z;
                                  var2_int = 0;
                                  ((hk) this).field_u.a(-12328, var3);
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                              ((hk) this).field_z = ((hk) this).field_z + 1;
                              if (var5 == 0) {
                                continue L37;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                      }
                      stackOut_95_0 = var2_int;
                      stackIn_96_0 = stackOut_95_0;
                      break L25;
                    }
                    if (stackIn_96_0 == 0) {
                      break L2;
                    } else {
                      ((hk) this).field_j = false;
                      ((hk) this).field_z = 0;
                      break L2;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L42: {
              if (!((hk) this).field_i) {
                break L42;
              } else {
                if (td.b(128) < ((hk) this).field_h) {
                  break L42;
                } else {
                  var2_ref = (oa) (Object) ((hk) this).field_q.a(false);
                  L43: while (true) {
                    L44: {
                      if (var2_ref == null) {
                        break L44;
                      } else {
                        if (var5 != 0) {
                          break L42;
                        } else {
                          L45: {
                            L46: {
                              if (!var2_ref.field_u) {
                                break L46;
                              } else {
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L46;
                                }
                              }
                            }
                            L47: {
                              if (var2_ref.field_s) {
                                break L47;
                              } else {
                                var2_ref.field_s = true;
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            if (!var2_ref.field_r) {
                              throw new RuntimeException();
                            } else {
                              var2_ref.c((byte) -117);
                              break L45;
                            }
                          }
                          var2_ref = (oa) (Object) ((hk) this).field_q.a((byte) 62);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((hk) this).field_h = td.b(128) + 1000L;
                    break L42;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "hk.F(" + param0 + ')');
        }
    }

    final byte[] a(byte param0, int param1) {
        oa var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        try {
          L0: {
            var3 = this.a(param1, 0, 23874);
            if (null == var3) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              if (param0 <= -9) {
                var4 = var3.a(true);
                var3.c((byte) -81);
                stackOut_8_0 = (byte[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3_ref, "hk.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final int a(int param0, int param1) {
        oa var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((hk) this).field_q = null;
                break L1;
              }
            }
            var3 = (oa) (Object) ((hk) this).field_q.a((long)param1, -1);
            if (null != var3) {
              stackOut_6_0 = var3.g(100);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3_ref, "hk.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void b(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ((hk) this).field_x) {
              return;
            } else {
              L1: {
                var2_int = -123 / ((53 - param0) / 42);
                ((hk) this).field_j = true;
                if (null != ((hk) this).field_u) {
                  break L1;
                } else {
                  ((hk) this).field_u = new cn();
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) (Object) runtimeException, "hk.J(" + param0 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (bj.e((byte) 113)) {
              if (he.field_u == null) {
                return;
              } else {
                if (param0 == 2) {
                  if (!he.field_u.b(0)) {
                    return;
                  } else {
                    if (he.field_u.a((byte) -119)) {
                      if (dd.field_h == null) {
                        dd.field_h = ci.a(5, 0, -1, 2);
                        return;
                      } else {
                        if (dd.field_h.field_j == null) {
                          return;
                        } else {
                          L1: {
                            ld.field_h = pn.a(dd.field_h.field_j, he.field_u, ld.field_h, bj.field_B, (byte) 112);
                            if (se.field_b != null) {
                              break L1;
                            } else {
                              se.field_b = ve.a(1, he.field_u, fi.field_j, dd.field_h.field_j);
                              break L1;
                            }
                          }
                          L2: {
                            if (null == se.field_b) {
                              break L2;
                            } else {
                              dd.field_h = null;
                              he.field_u = null;
                              break L2;
                            }
                          }
                          break L0;
                        }
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "hk.L(" + param0 + ')');
        }
    }

    final f a(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        f stackIn_3_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_53_0 = null;
        f stackIn_58_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_33_0 = null;
        Object stackOut_52_0 = null;
        f stackOut_57_0 = null;
        f stackOut_2_0 = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            if (((hk) this).field_m == null) {
              L1: {
                if (null == ((hk) this).field_y) {
                  if (((hk) this).field_t.c(20)) {
                    stackOut_10_0 = null;
                    stackIn_11_0 = stackOut_10_0;
                    return (f) (Object) stackIn_11_0;
                  } else {
                    ((hk) this).field_y = (oa) (Object) ((hk) this).field_t.a(255, true, (byte) 0, ((hk) this).field_s, (byte) 0);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (((hk) this).field_y.field_u) {
                stackOut_16_0 = null;
                stackIn_17_0 = stackOut_16_0;
                return (f) (Object) stackIn_17_0;
              } else {
                L2: {
                  var2_array = ((hk) this).field_y.a(true);
                  if (param0 == 29192) {
                    break L2;
                  } else {
                    int discarded$2 = hk.a((byte) 93, -10, 70);
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    if (((hk) this).field_y instanceof cm) {
                      break L4;
                    } else {
                      try {
                        L5: {
                          if (var2_array != null) {
                            ((hk) this).field_m = new f(var2_array, ((hk) this).field_p, ((hk) this).field_g);
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
                            ((hk) this).field_t.b((byte) -125);
                            ((hk) this).field_m = null;
                            if (!((hk) this).field_t.c(20)) {
                              break L7;
                            } else {
                              ((hk) this).field_y = null;
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((hk) this).field_y = (oa) (Object) ((hk) this).field_t.a(255, true, (byte) 0, ((hk) this).field_s, (byte) 0);
                          break L6;
                        }
                        stackOut_33_0 = null;
                        stackIn_34_0 = stackOut_33_0;
                        return (f) (Object) stackIn_34_0;
                      }
                      if (((hk) this).field_o != null) {
                        cm discarded$3 = ((hk) this).field_k.a(var2_array, ((hk) this).field_s, param0 ^ 29194, ((hk) this).field_o);
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
                      if (null != var2_array) {
                        ((hk) this).field_m = new f(var2_array, ((hk) this).field_p, ((hk) this).field_g);
                        if (~((hk) this).field_m.field_n == ~((hk) this).field_l) {
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
                        ((hk) this).field_m = null;
                        if (!((hk) this).field_t.c(20)) {
                          break L10;
                        } else {
                          ((hk) this).field_y = null;
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((hk) this).field_y = (oa) (Object) ((hk) this).field_t.a(255, true, (byte) 0, ((hk) this).field_s, (byte) 0);
                      break L9;
                    }
                    stackOut_52_0 = null;
                    stackIn_53_0 = stackOut_52_0;
                    return (f) (Object) stackIn_53_0;
                  }
                  break L3;
                }
                L11: {
                  ((hk) this).field_y = null;
                  if (null == ((hk) this).field_x) {
                    break L11;
                  } else {
                    ((hk) this).field_f = new byte[((hk) this).field_m.field_k];
                    break L11;
                  }
                }
                stackOut_57_0 = ((hk) this).field_m;
                stackIn_58_0 = stackOut_57_0;
                break L0;
              }
            } else {
              stackOut_2_0 = ((hk) this).field_m;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "hk.E(" + param0 + ')');
        }
        return stackIn_58_0;
    }

    private final oa a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var6_int = 0;
        int var7_int = 0;
        byte[] var7 = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_54_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_89_1 = 0;
        Object stackIn_103_0 = null;
        Object stackIn_112_0 = null;
        byte stackIn_133_0 = 0;
        byte stackIn_133_1 = 0;
        Object stackIn_147_0 = null;
        int stackIn_152_0 = 0;
        int stackIn_152_1 = 0;
        Object stackIn_159_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_53_0 = null;
        Object stackOut_60_0 = null;
        byte stackOut_132_0 = 0;
        byte stackOut_132_1 = 0;
        Object stackOut_146_0 = null;
        int stackOut_151_0 = 0;
        int stackOut_151_1 = 0;
        Object stackOut_158_0 = null;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_88_0 = 0;
        int stackOut_88_1 = 0;
        Object stackOut_102_0 = null;
        Object stackOut_111_0 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (oa) (Object) ((hk) this).field_q.a((long)param0, -1);
              if (null == var4) {
                break L1;
              } else {
                if (param1 != 0) {
                  break L1;
                } else {
                  if (((oa) var4).field_r) {
                    break L1;
                  } else {
                    if (!((oa) var4).field_u) {
                      break L1;
                    } else {
                      ((oa) var4).c((byte) -16);
                      var4 = null;
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (null == var4) {
                L3: {
                  L4: {
                    if (param1 != 0) {
                      break L4;
                    } else {
                      L5: {
                        if (((hk) this).field_x == null) {
                          break L5;
                        } else {
                          if (-1 != ((hk) this).field_f[param0]) {
                            var4 = (Object) (Object) ((hk) this).field_k.a(((hk) this).field_x, param2 ^ 23908, param0);
                            if (var10 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (((hk) this).field_t.c(20)) {
                          break L6;
                        } else {
                          var4 = (Object) (Object) ((hk) this).field_t.a(((hk) this).field_s, true, (byte) 0, param0, (byte) 2);
                          if (var10 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      stackOut_26_0 = null;
                      stackIn_27_0 = stackOut_26_0;
                      return (oa) (Object) stackIn_27_0;
                    }
                  }
                  L7: {
                    if (param1 != 1) {
                      break L7;
                    } else {
                      if (((hk) this).field_x == null) {
                        throw new RuntimeException();
                      } else {
                        var4 = (Object) (Object) ((hk) this).field_k.a((byte) -127, ((hk) this).field_x, param0);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  if (param1 != 2) {
                    throw new RuntimeException();
                  } else {
                    if (((hk) this).field_x != null) {
                      if (((hk) this).field_f[param0] != -1) {
                        throw new RuntimeException();
                      } else {
                        L8: {
                          if (((hk) this).field_t.b(20)) {
                            break L8;
                          } else {
                            var4 = (Object) (Object) ((hk) this).field_t.a(((hk) this).field_s, false, (byte) 0, param0, (byte) 2);
                            if (var10 == 0) {
                              break L3;
                            } else {
                              break L8;
                            }
                          }
                        }
                        stackOut_53_0 = null;
                        stackIn_54_0 = stackOut_53_0;
                        return (oa) (Object) stackIn_54_0;
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                }
                ((hk) this).field_q.a((hg) var4, 10901, (long)param0);
                break L2;
              } else {
                break L2;
              }
            }
            if (((oa) var4).field_u) {
              stackOut_60_0 = null;
              stackIn_61_0 = stackOut_60_0;
              return (oa) (Object) stackIn_61_0;
            } else {
              L9: {
                if (param2 == 23874) {
                  break L9;
                } else {
                  f discarded$2 = ((hk) this).a(1);
                  break L9;
                }
              }
              var5 = ((oa) var4).a(true);
              if (!(var4 instanceof cm)) {
                try {
                  L10: {
                    L11: {
                      if (var5 == null) {
                        break L11;
                      } else {
                        if (var5.length <= 2) {
                          break L11;
                        } else {
                          qf.field_m.reset();
                          qf.field_m.update(var5, 0, var5.length - 2);
                          var6_int = (int)qf.field_m.getValue();
                          if (~var6_int != ~((hk) this).field_m.field_l[param0]) {
                            throw new RuntimeException();
                          } else {
                            L12: {
                              if (((hk) this).field_m.field_h == null) {
                                break L12;
                              } else {
                                if (null != ((hk) this).field_m.field_h[param0]) {
                                  var7 = ((hk) this).field_m.field_h[param0];
                                  var8 = vn.a(var5, 0, -2 + var5.length, 0);
                                  var9 = 0;
                                  L13: while (true) {
                                    if (var9 >= 64) {
                                      break L12;
                                    } else {
                                      stackOut_132_0 = var8[var9];
                                      stackOut_132_1 = var7[var9];
                                      stackIn_152_0 = stackOut_132_0;
                                      stackIn_152_1 = stackOut_132_1;
                                      stackIn_133_0 = stackOut_132_0;
                                      stackIn_133_1 = stackOut_132_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L10;
                                      } else {
                                        if (stackIn_133_0 != stackIn_133_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L13;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L12;
                                }
                              }
                            }
                            ((hk) this).field_t.field_g = 0;
                            ((hk) this).field_t.field_d = 0;
                            decompiledRegionSelector0 = 1;
                            break L10;
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L14: {
                    var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((hk) this).field_t.b((byte) -110);
                    ((oa) var4).c((byte) -86);
                    if (((oa) var4).field_r) {
                      if (((hk) this).field_t.c(param2 + -23854)) {
                        break L14;
                      } else {
                        var4 = (Object) (Object) ((hk) this).field_t.a(((hk) this).field_s, true, (byte) 0, param0, (byte) 2);
                        ((hk) this).field_q.a((hg) var4, 10901, (long)param0);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  stackOut_146_0 = null;
                  stackIn_147_0 = stackOut_146_0;
                  return (oa) (Object) stackIn_147_0;
                }
                L15: {
                  L16: {
                    if (decompiledRegionSelector0 == 0) {
                      break L16;
                    } else {
                      var5[var5.length - 2] = (byte)(((hk) this).field_m.field_q[param0] >>> -1549180536);
                      var5[var5.length + -1] = (byte)((hk) this).field_m.field_q[param0];
                      if (null != ((hk) this).field_x) {
                        cm discarded$3 = ((hk) this).field_k.a(var5, param0, param2 ^ 23872, ((hk) this).field_x);
                        stackOut_151_0 = ~((hk) this).field_f[param0];
                        stackOut_151_1 = -2;
                        stackIn_152_0 = stackOut_151_0;
                        stackIn_152_1 = stackOut_151_1;
                        break L16;
                      } else {
                        break L15;
                      }
                    }
                  }
                  if (stackIn_152_0 != stackIn_152_1) {
                    ((hk) this).field_f[param0] = (byte) 1;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L17: {
                  if (((oa) var4).field_r) {
                    break L17;
                  } else {
                    ((oa) var4).c((byte) -86);
                    break L17;
                  }
                }
                stackOut_158_0 = var4;
                stackIn_159_0 = stackOut_158_0;
                break L0;
              } else {
                try {
                  L18: {
                    L19: {
                      if (null == var5) {
                        break L19;
                      } else {
                        if (2 < var5.length) {
                          qf.field_m.reset();
                          qf.field_m.update(var5, 0, var5.length - 2);
                          var6_int = (int)qf.field_m.getValue();
                          if (var6_int == ((hk) this).field_m.field_l[param0]) {
                            L20: {
                              L21: {
                                if (((hk) this).field_m.field_h == null) {
                                  break L21;
                                } else {
                                  if (((hk) this).field_m.field_h[param0] == null) {
                                    break L21;
                                  } else {
                                    var7 = ((hk) this).field_m.field_h[param0];
                                    var8 = vn.a(var5, 0, var5.length - 2, param2 + -23874);
                                    var9 = 0;
                                    L22: while (true) {
                                      if (var9 >= 64) {
                                        break L21;
                                      } else {
                                        stackOut_81_0 = ~var7[var9];
                                        stackOut_81_1 = ~var8[var9];
                                        stackIn_89_0 = stackOut_81_0;
                                        stackIn_89_1 = stackOut_81_1;
                                        stackIn_82_0 = stackOut_81_0;
                                        stackIn_82_1 = stackOut_81_1;
                                        if (var10 != 0) {
                                          break L20;
                                        } else {
                                          if (stackIn_82_0 == stackIn_82_1) {
                                            var9++;
                                            if (var10 == 0) {
                                              continue L22;
                                            } else {
                                              break L21;
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
                              stackOut_88_0 = var5[-2 + var5.length] << 2066150792 & 65280;
                              stackOut_88_1 = -(255 & var5[-1 + var5.length]);
                              stackIn_89_0 = stackOut_88_0;
                              stackIn_89_1 = stackOut_88_1;
                              break L20;
                            }
                            var7_int = stackIn_89_0 - stackIn_89_1;
                            if (var7_int != (((hk) this).field_m.field_q[param0] & 65535)) {
                              throw new RuntimeException();
                            } else {
                              L23: {
                                if (((hk) this).field_f[param0] != 1) {
                                  L24: {
                                    if (((hk) this).field_f[param0] != 0) {
                                      break L24;
                                    } else {
                                      break L24;
                                    }
                                  }
                                  ((hk) this).field_f[param0] = (byte) 1;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L25: {
                                if (!((oa) var4).field_r) {
                                  ((oa) var4).c((byte) -93);
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                              stackOut_102_0 = var4;
                              stackIn_103_0 = stackOut_102_0;
                              break L18;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L26: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    ((hk) this).field_f[param0] = (byte) -1;
                    ((oa) var4).c((byte) -92);
                    if (((oa) var4).field_r) {
                      if (!((hk) this).field_t.c(20)) {
                        var4 = (Object) (Object) ((hk) this).field_t.a(((hk) this).field_s, true, (byte) 0, param0, (byte) 2);
                        ((hk) this).field_q.a((hg) var4, 10901, (long)param0);
                        break L26;
                      } else {
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  stackOut_111_0 = null;
                  stackIn_112_0 = stackOut_111_0;
                  return (oa) (Object) stackIn_112_0;
                }
                return (oa) (Object) stackIn_103_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw t.a((Throwable) var4, "hk.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (oa) (Object) stackIn_159_0;
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        hg var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            if (null == ((hk) this).field_u) {
              return;
            } else {
              if (((hk) this).a(29192) == null) {
                return;
              } else {
                L1: {
                  if (param0 == -1) {
                    break L1;
                  } else {
                    byte[] discarded$3 = ((hk) this).a((byte) -27, -44);
                    break L1;
                  }
                }
                var2_ref = ((hk) this).field_e.a(false);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var2_ref == null) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_e;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (var3 >= ((hk) this).field_m.field_k) {
                                    break L7;
                                  } else {
                                    if (((hk) this).field_m.field_i[var3] != 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.c((byte) -57);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((hk) this).field_f[var3] != 0) {
                                break L8;
                              } else {
                                oa discarded$4 = this.a(var3, 1, param0 ^ -23875);
                                break L8;
                              }
                            }
                            L9: {
                              if (((hk) this).field_f[var3] == -1) {
                                oa discarded$5 = this.a(var3, 2, 23874);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            if (((hk) this).field_f[var3] != 1) {
                              break L5;
                            } else {
                              var2_ref.c((byte) -118);
                              break L5;
                            }
                          }
                          var2_ref = ((hk) this).field_e.b((byte) 70);
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var2, "hk.K(" + param0 + ')');
        }
    }

    final static ed a(mf param0, boolean param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        ed stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        ed stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                hk.c((byte) 80);
                break L1;
              }
            }
            if (uc.a(param0, 116, param3, param2)) {
              stackOut_6_0 = je.b(100);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (ed) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("hk.H(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_r = null;
              if (param0 == 8) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            field_w = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "hk.M(" + param0 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = hi.field_o;
              if (param0 == 122) {
                break L1;
              } else {
                hk.b(91);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (s.field_I.length <= var3_int) {
                    break L4;
                  } else {
                    var5 = jj.field_a[var3_int];
                    stackOut_5_0 = 0;
                    stackIn_16_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var8 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (stackIn_6_0 <= var5) {
                            break L6;
                          } else {
                            var4 = var4 + je.field_b;
                            if (var8 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var6 = ee.a(98, s.field_I[var3_int], true);
                        var4 = var4 + hn.field_s;
                        var7 = -(var6 >> 2455489) + rn.field_e;
                        if (!fl.a(param1, (en.field_k << -568138623) + ok.field_a, param0 ^ -123, var4, -fe.field_k + var7, (fe.field_k << 54019649) + var6, param2)) {
                          var4 = var4 + (hn.field_s + (en.field_k << -1476189695) + ok.field_a);
                          break L5;
                        } else {
                          stackOut_11_0 = var5;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0;
                        }
                      }
                      var3_int++;
                      if (var8 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_15_0 = -1;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "hk.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_16_0;
    }

    hk(int param0, jg param1, jg param2, sb param3, kk param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((hk) this).field_q = new ib(16);
        ((hk) this).field_z = 0;
        ((hk) this).field_e = new cn();
        ((hk) this).field_h = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((hk) this).field_s = param0;
                ((hk) this).field_x = param1;
                if (null == ((hk) this).field_x) {
                  break L2;
                } else {
                  ((hk) this).field_v = true;
                  ((hk) this).field_u = new cn();
                  if (EscapeVector.field_A == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((hk) this).field_v = false;
              break L1;
            }
            L3: {
              ((hk) this).field_l = param7;
              ((hk) this).field_o = param2;
              ((hk) this).field_k = param4;
              ((hk) this).field_t = param3;
              ((hk) this).field_g = param6;
              ((hk) this).field_p = param5;
              ((hk) this).field_i = param8;
              if (((hk) this).field_o != null) {
                ((hk) this).field_y = (oa) (Object) ((hk) this).field_k.a(((hk) this).field_o, 106, ((hk) this).field_s);
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
            stackOut_10_1 = new StringBuilder().append("hk.<init>(").append(param0).append(',');
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
          throw t.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new String[]{"Belter Award", "Moon Runner", "Moon Raker", "Hero of Earth", "Star Pilot", "Ace Pilot", "Fuel Filler", "Tough Destroyer", "Speed Nitwit", "Speed Freak", "Speed Demon", "Power Pilot", "Spirit of Vengeance", "Force King", "Seeker Shaker", "Flak Dancer", "Seeker Slingshot", "G Force", "Belter Award (Normal)", "Moon Runner (Normal)", "Moon Raker (Normal)", "Hero of Earth (Normal)", "High Octane", "Ore Crusher", "Cold Fusion", "Saviour of Earth", "Heroic Pilot", "Ultimate Pilot", "Total Annihilation", "Virtual Reality", "Bouncing Around", "Free Fall"};
        ld.a(50, (byte) -6);
    }
}
