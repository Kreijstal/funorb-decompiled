/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p extends lc {
    private ua field_r;
    private byte[] field_v;
    private int field_t;
    static u field_g;
    private rn field_k;
    private ti field_f;
    private ua field_o;
    private byte[] field_u;
    private ci field_p;
    static int[] field_A;
    private ar field_w;
    private int field_z;
    private int field_j;
    static boolean field_n;
    static String field_y;
    private jc field_l;
    private int field_q;
    private pf field_h;
    private boolean field_x;
    private pf field_i;
    private boolean field_m;
    private long field_e;
    private boolean field_s;

    final void c(int param0) {
        if (!(null != ((p) this).field_r)) {
            return;
        }
        ((p) this).field_m = true;
        if (param0 != 255) {
            jc discarded$0 = this.a(21, -34, 75);
        }
        if (null == ((p) this).field_h) {
            ((p) this).field_h = new pf();
        }
    }

    final void b(boolean param0) {
        jc var2 = null;
        int var2_int = 0;
        oh var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        byte stackIn_9_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_31_0 = 0;
        byte stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_127_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_131_1 = 0;
        int stackOut_8_0 = 0;
        byte stackOut_8_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_30_0 = 0;
        byte stackOut_40_0 = 0;
        int stackOut_40_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_65_0 = 0;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!param0) {
            break L0;
          } else {
            ((p) this).field_l = null;
            break L0;
          }
        }
        L1: {
          if (((p) this).field_h == null) {
            break L1;
          } else {
            if (null != ((p) this).a(6)) {
              L2: {
                if (!((p) this).field_x) {
                  break L2;
                } else {
                  var2_int = 1;
                  var3 = ((p) this).field_h.d(0);
                  L3: while (true) {
                    L4: {
                      L5: {
                        L6: {
                          if (var3 == null) {
                            break L6;
                          } else {
                            var4 = (int)var3.field_b;
                            stackOut_8_0 = 0;
                            stackOut_8_1 = ((p) this).field_u[var4];
                            stackIn_17_0 = stackOut_8_0;
                            stackIn_17_1 = stackOut_8_1;
                            stackIn_9_0 = stackOut_8_0;
                            stackIn_9_1 = stackOut_8_1;
                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_17_0 <= stackIn_17_1) {
                                  break L5;
                                } else {
                                  stackOut_18_0 = -1;
                                  stackIn_31_0 = stackOut_18_0;
                                  stackIn_19_0 = stackOut_18_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_19_0 != ~((p) this).field_p.field_n[((p) this).field_q]) {
                                          break L9;
                                        } else {
                                          ((p) this).field_q = ((p) this).field_q + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (((p) this).field_k.field_d < 250) {
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
                                        if (((p) this).field_u[((p) this).field_q] == 0) {
                                          jc discarded$6 = this.a(1, 0, ((p) this).field_q);
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (((p) this).field_u[((p) this).field_q] != 0) {
                                          break L12;
                                        } else {
                                          var3 = new oh();
                                          var3.field_b = (long)((p) this).field_q;
                                          var2_int = 0;
                                          ((p) this).field_h.a((byte) -113, var3);
                                          break L12;
                                        }
                                      }
                                      ((p) this).field_q = ((p) this).field_q + 1;
                                      if (var5 == 0) {
                                        break L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    stackOut_16_0 = ~((p) this).field_q;
                                    stackOut_16_1 = ~((p) this).field_p.field_n.length;
                                    stackIn_17_0 = stackOut_16_0;
                                    stackIn_17_1 = stackOut_16_1;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                if (stackIn_9_0 != stackIn_9_1) {
                                  break L13;
                                } else {
                                  jc discarded$7 = this.a(1, 0, var4);
                                  break L13;
                                }
                              }
                              L14: {
                                L15: {
                                  if (((p) this).field_u[var4] != 0) {
                                    break L15;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                                var3.b((byte) -76);
                                break L14;
                              }
                              var3 = ((p) this).field_h.a((byte) -71);
                              if (var5 == 0) {
                                continue L3;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L16: while (true) {
                          stackOut_133_0 = ~((p) this).field_q;
                          stackOut_133_1 = ~((p) this).field_p.field_n.length;
                          stackIn_131_0 = stackOut_133_0;
                          stackIn_131_1 = stackOut_133_1;
                          if (stackIn_131_0 <= stackIn_131_1) {
                            break L5;
                          } else {
                            stackOut_129_0 = -1;
                            stackIn_31_0 = stackOut_129_0;
                            stackIn_130_0 = stackOut_129_0;
                            if (var5 != 0) {
                              break L4;
                            } else {
                              stackOut_130_0 = stackIn_130_0;
                              stackIn_127_0 = stackOut_130_0;
                              L17: {
                                if (stackIn_127_0 != ~((p) this).field_p.field_n[((p) this).field_q]) {
                                  break L17;
                                } else {
                                  ((p) this).field_q = ((p) this).field_q + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                if (((p) this).field_k.field_d < 250) {
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
                                if (((p) this).field_u[((p) this).field_q] == 0) {
                                  jc discarded$8 = this.a(1, 0, ((p) this).field_q);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              L20: {
                                if (((p) this).field_u[((p) this).field_q] != 0) {
                                  break L20;
                                } else {
                                  var3 = new oh();
                                  var3.field_b = (long)((p) this).field_q;
                                  var2_int = 0;
                                  ((p) this).field_h.a((byte) -113, var3);
                                  break L20;
                                }
                              }
                              ((p) this).field_q = ((p) this).field_q + 1;
                              if (var5 == 0) {
                                continue L16;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      stackOut_30_0 = var2_int;
                      stackIn_31_0 = stackOut_30_0;
                      break L4;
                    }
                    L21: {
                      if (stackIn_31_0 != 0) {
                        ((p) this).field_q = 0;
                        ((p) this).field_x = false;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L22: {
                if (((p) this).field_m) {
                  break L22;
                } else {
                  ((p) this).field_h = null;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L22;
                  }
                }
              }
              var2_int = 1;
              var3 = ((p) this).field_h.d(0);
              L23: while (true) {
                L24: {
                  L25: {
                    L26: {
                      if (var3 == null) {
                        break L26;
                      } else {
                        var4 = (int)var3.field_b;
                        stackOut_40_0 = ((p) this).field_u[var4];
                        stackOut_40_1 = 1;
                        stackIn_51_0 = stackOut_40_0;
                        stackIn_51_1 = stackOut_40_1;
                        stackIn_41_0 = stackOut_40_0;
                        stackIn_41_1 = stackOut_40_1;
                        if (var5 != 0) {
                          L27: while (true) {
                            if (stackIn_51_0 <= stackIn_51_1) {
                              break L25;
                            } else {
                              stackOut_52_0 = ((p) this).field_p.field_n[((p) this).field_q];
                              stackIn_66_0 = stackOut_52_0;
                              stackIn_53_0 = stackOut_52_0;
                              if (var5 != 0) {
                                break L24;
                              } else {
                                L28: {
                                  L29: {
                                    if (stackIn_53_0 == 0) {
                                      ((p) this).field_q = ((p) this).field_q + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L29;
                                      }
                                    } else {
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (((p) this).field_w.c((byte) -98)) {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L25;
                                      } else {
                                        break L30;
                                      }
                                    } else {
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    if (((p) this).field_u[((p) this).field_q] == 1) {
                                      break L31;
                                    } else {
                                      jc discarded$9 = this.a(2, 0, ((p) this).field_q);
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    if (((p) this).field_u[((p) this).field_q] != 1) {
                                      var3 = new oh();
                                      var3.field_b = (long)((p) this).field_q;
                                      ((p) this).field_h.a((byte) -113, var3);
                                      var2_int = 0;
                                      break L32;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  ((p) this).field_q = ((p) this).field_q + 1;
                                  if (var5 == 0) {
                                    break L28;
                                  } else {
                                    break L25;
                                  }
                                }
                                stackOut_50_0 = ~((p) this).field_q;
                                stackOut_50_1 = ~((p) this).field_p.field_n.length;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                continue L27;
                              }
                            }
                          }
                        } else {
                          L33: {
                            if (stackIn_41_0 != stackIn_41_1) {
                              jc discarded$10 = this.a(2, 0, var4);
                              break L33;
                            } else {
                              break L33;
                            }
                          }
                          L34: {
                            L35: {
                              if (((p) this).field_u[var4] != 1) {
                                break L35;
                              } else {
                                var3.b((byte) -70);
                                if (var5 == 0) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            var2_int = 0;
                            break L34;
                          }
                          var3 = ((p) this).field_h.a((byte) -71);
                          if (var5 == 0) {
                            continue L23;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    L36: while (true) {
                      stackOut_110_0 = ~((p) this).field_q;
                      stackOut_110_1 = ~((p) this).field_p.field_n.length;
                      stackIn_108_0 = stackOut_110_0;
                      stackIn_108_1 = stackOut_110_1;
                      if (stackIn_108_0 <= stackIn_108_1) {
                        break L25;
                      } else {
                        stackOut_106_0 = ((p) this).field_p.field_n[((p) this).field_q];
                        stackIn_66_0 = stackOut_106_0;
                        stackIn_107_0 = stackOut_106_0;
                        if (var5 != 0) {
                          break L24;
                        } else {
                          stackOut_107_0 = stackIn_107_0;
                          stackIn_104_0 = stackOut_107_0;
                          L37: {
                            if (stackIn_104_0 == 0) {
                              ((p) this).field_q = ((p) this).field_q + 1;
                              if (var5 == 0) {
                                continue L36;
                              } else {
                                break L37;
                              }
                            } else {
                              break L37;
                            }
                          }
                          L38: {
                            if (((p) this).field_w.c((byte) -98)) {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L25;
                              } else {
                                break L38;
                              }
                            } else {
                              break L38;
                            }
                          }
                          L39: {
                            if (((p) this).field_u[((p) this).field_q] == 1) {
                              break L39;
                            } else {
                              jc discarded$11 = this.a(2, 0, ((p) this).field_q);
                              break L39;
                            }
                          }
                          L40: {
                            if (((p) this).field_u[((p) this).field_q] != 1) {
                              var3 = new oh();
                              var3.field_b = (long)((p) this).field_q;
                              ((p) this).field_h.a((byte) -113, var3);
                              var2_int = 0;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          ((p) this).field_q = ((p) this).field_q + 1;
                          if (var5 == 0) {
                            continue L36;
                          } else {
                            break L25;
                          }
                        }
                      }
                    }
                  }
                  stackOut_65_0 = var2_int;
                  stackIn_66_0 = stackOut_65_0;
                  break L24;
                }
                if (stackIn_66_0 == 0) {
                  break L1;
                } else {
                  ((p) this).field_q = 0;
                  ((p) this).field_m = false;
                  break L1;
                }
              }
            } else {
              return;
            }
          }
        }
        L41: {
          if (!((p) this).field_s) {
            break L41;
          } else {
            if (pr.a(14274) >= ((p) this).field_e) {
              var2 = (jc) (Object) ((p) this).field_f.c(77);
              L42: while (true) {
                L43: {
                  L44: {
                    if (var2 == null) {
                      break L44;
                    } else {
                      if (var5 != 0) {
                        break L43;
                      } else {
                        L45: {
                          L46: {
                            if (!var2.field_u) {
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
                            if (var2.field_t) {
                              break L47;
                            } else {
                              var2.field_t = true;
                              if (var5 == 0) {
                                break L45;
                              } else {
                                break L47;
                              }
                            }
                          }
                          if (var2.field_q) {
                            var2.b((byte) -60);
                            break L45;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                        var2 = (jc) (Object) ((p) this).field_f.a(false);
                        if (var5 == 0) {
                          continue L42;
                        } else {
                          break L44;
                        }
                      }
                    }
                  }
                  ((p) this).field_e = pr.a(14274) - -1000L;
                  break L43;
                }
                break L41;
              }
            } else {
              break L41;
            }
          }
        }
    }

    final void a(byte param0) {
        oh var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        byte stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != ((p) this).field_h) {
          if (((p) this).a(param0 + -59) != null) {
            var2 = ((p) this).field_i.d(0);
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    var3 = (int)var2.field_b;
                    stackOut_6_0 = ~var3;
                    stackOut_6_1 = -1;
                    stackIn_22_0 = stackOut_6_0;
                    stackIn_22_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          L5: {
                            if (stackIn_7_0 > stackIn_7_1) {
                              break L5;
                            } else {
                              if (((p) this).field_p.field_a <= var3) {
                                break L5;
                              } else {
                                if (((p) this).field_p.field_n[var3] == 0) {
                                  break L5;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          var2.b((byte) -85);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          if (((p) this).field_u[var3] == 0) {
                            jc discarded$4 = this.a(1, 0, var3);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (((p) this).field_u[var3] != -1) {
                            break L7;
                          } else {
                            jc discarded$5 = this.a(2, 0, var3);
                            break L7;
                          }
                        }
                        if (((p) this).field_u[var3] == 1) {
                          var2.b((byte) -90);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var2 = ((p) this).field_i.a((byte) -71);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_21_0 = param0;
                stackOut_21_1 = 65;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                break L1;
              }
              L8: {
                if (stackIn_22_0 == stackIn_22_1) {
                  break L8;
                } else {
                  ((p) this).c(-101);
                  break L8;
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

    final static void d(int param0) {
        gm.field_m.a(lp.field_v.field_K - (ns.field_pb ? 42 + (pe.field_K - -2) : 0), 18, (byte) 39, 0, 0);
        sf.field_f.a(42 + pe.field_K, 24, (byte) 42, 0, -40 + (lp.field_v.field_K - (pe.field_K - -2)));
        ls.field_a.a(lp.field_v.field_K, 20, 0, 2, -122, lp.field_v.field_mb + -20, pe.field_K);
    }

    final ci a(int param0) {
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null == ((p) this).field_p) {
          L0: {
            if (null != ((p) this).field_l) {
              break L0;
            } else {
              if (!((p) this).field_w.c(27356)) {
                ((p) this).field_l = (jc) (Object) ((p) this).field_w.a(true, 255, (byte) 0, -2057056416, ((p) this).field_j);
                break L0;
              } else {
                return null;
              }
            }
          }
          if (!((p) this).field_l.field_u) {
            L1: {
              L2: {
                var5 = ((p) this).field_l.e((byte) 50);
                var2 = var5;
                if (((p) this).field_l instanceof ak) {
                  break L2;
                } else {
                  try {
                    L3: {
                      if (var5 != null) {
                        ((p) this).field_p = new ci(var5, ((p) this).field_z, ((p) this).field_v);
                        break L3;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var3 = decompiledCaughtException;
                      ((p) this).field_w.b((byte) -91);
                      ((p) this).field_p = null;
                      if (((p) this).field_w.c(27356)) {
                        break L4;
                      } else {
                        ((p) this).field_l = (jc) (Object) ((p) this).field_w.a(true, 255, (byte) 0, -2057056416, ((p) this).field_j);
                        if (var4 != 0) {
                          break L4;
                        } else {
                          return null;
                        }
                      }
                    }
                    ((p) this).field_l = null;
                    return null;
                  }
                  if (null == ((p) this).field_o) {
                    break L1;
                  } else {
                    ak discarded$1 = ((p) this).field_k.a(((p) this).field_j, ((p) this).field_o, -51, var5);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              try {
                L5: {
                  if (var5 != null) {
                    ((p) this).field_p = new ci(var5, ((p) this).field_z, ((p) this).field_v);
                    if (~((p) this).field_t != ~((p) this).field_p.field_e) {
                      throw new RuntimeException();
                    } else {
                      break L5;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                L6: {
                  var3 = decompiledCaughtException;
                  ((p) this).field_p = null;
                  if (((p) this).field_w.c(27356)) {
                    break L6;
                  } else {
                    ((p) this).field_l = (jc) (Object) ((p) this).field_w.a(true, 255, (byte) 0, -2057056416, ((p) this).field_j);
                    if (var4 != 0) {
                      break L6;
                    } else {
                      return null;
                    }
                  }
                }
                ((p) this).field_l = null;
                return null;
              }
              break L1;
            }
            L7: {
              if (param0 == 6) {
                break L7;
              } else {
                field_y = null;
                break L7;
              }
            }
            L8: {
              if (null == ((p) this).field_r) {
                break L8;
              } else {
                ((p) this).field_u = new byte[((p) this).field_p.field_a];
                break L8;
              }
            }
            ((p) this).field_l = null;
            return ((p) this).field_p;
          } else {
            return null;
          }
        } else {
          return ((p) this).field_p;
        }
    }

    final int a(int param0, byte param1) {
        jc var3 = (jc) (Object) ((p) this).field_f.a((long)param0, -25064);
        if (var3 != null) {
            return var3.e(0);
        }
        int var4 = -32 / ((param1 - -3) / 58);
        return 0;
    }

    public static void b(byte param0) {
        field_g = null;
        field_y = null;
        if (param0 != 114) {
            p.d(24);
        }
        field_A = null;
    }

    final byte[] a(byte param0, int param1) {
        jc var3 = this.a(0, 0, param1);
        if (var3 == null) {
            return null;
        }
        int var5 = 84 % ((param0 - -51) / 33);
        byte[] var4 = var3.e((byte) 109);
        var3.b((byte) -60);
        return var4;
    }

    private final jc a(int param0, int param1, int param2) {
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
        byte stackIn_46_0 = 0;
        byte stackIn_46_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_60_1 = 0;
        byte stackIn_77_0 = 0;
        byte stackIn_77_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        Object stackIn_92_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        byte stackOut_76_0 = 0;
        byte stackOut_76_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        Object stackOut_91_0 = null;
        byte stackOut_45_0 = 0;
        byte stackOut_45_1 = 0;
        int stackOut_59_0 = 0;
        int stackOut_59_1 = 0;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            int discarded$2 = ((p) this).a(55, (byte) -28);
            break L0;
          }
        }
        L1: {
          var4 = (Object) (Object) (jc) (Object) ((p) this).field_f.a((long)param2, -25064);
          if (var4 == null) {
            break L1;
          } else {
            if (param0 != 0) {
              break L1;
            } else {
              if (((jc) var4).field_q) {
                break L1;
              } else {
                if (((jc) var4).field_u) {
                  ((jc) var4).b((byte) -76);
                  var4 = null;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        L2: {
          if (var4 != null) {
            break L2;
          } else {
            L3: {
              L4: {
                if (param0 != 0) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      if (((p) this).field_r == null) {
                        break L6;
                      } else {
                        if (((p) this).field_u[param2] != -1) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (!((p) this).field_w.c(param1 ^ 27356)) {
                      var4 = (Object) (Object) ((p) this).field_w.a(true, ((p) this).field_j, (byte) 2, -2057056416, param2);
                      if (var10 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    } else {
                      return null;
                    }
                  }
                  var4 = (Object) (Object) ((p) this).field_k.a(param2, ((p) this).field_r, 1);
                  if (var10 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L7: {
                if (param0 != 1) {
                  break L7;
                } else {
                  if (null != ((p) this).field_r) {
                    var4 = (Object) (Object) ((p) this).field_k.a(((p) this).field_r, param2, 13514);
                    if (var10 == 0) {
                      break L3;
                    } else {
                      break L7;
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
              L8: {
                if (param0 != 2) {
                  break L8;
                } else {
                  if (((p) this).field_r != null) {
                    if (-1 != ((p) this).field_u[param2]) {
                      throw new RuntimeException();
                    } else {
                      if (!((p) this).field_w.c((byte) -115)) {
                        var4 = (Object) (Object) ((p) this).field_w.a(false, ((p) this).field_j, (byte) 2, -2057056416, param2);
                        if (var10 == 0) {
                          break L3;
                        } else {
                          break L8;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    throw new RuntimeException();
                  }
                }
              }
              throw new RuntimeException();
            }
            ((p) this).field_f.a((oh) var4, -120, (long)param2);
            break L2;
          }
        }
        if (!((jc) var4).field_u) {
          var5 = ((jc) var4).e((byte) 82);
          if (var4 instanceof ak) {
            try {
              L9: {
                L10: {
                  if (var5 == null) {
                    break L10;
                  } else {
                    if (2 < var5.length) {
                      ti.field_k.reset();
                      ti.field_k.update(var5, 0, var5.length + -2);
                      var6_int = (int)ti.field_k.getValue();
                      if (((p) this).field_p.field_f[param2] == var6_int) {
                        L11: {
                          L12: {
                            if (null == ((p) this).field_p.field_j) {
                              break L12;
                            } else {
                              if (((p) this).field_p.field_j[param2] == null) {
                                break L12;
                              } else {
                                var7_ref_byte__ = ((p) this).field_p.field_j[param2];
                                var8 = dp.a(var5, var5.length + -2, param1 ^ -26131, 0);
                                var9 = 0;
                                L13: while (true) {
                                  if (var9 >= 64) {
                                    break L12;
                                  } else {
                                    stackOut_76_0 = var8[var9];
                                    stackOut_76_1 = var7_ref_byte__[var9];
                                    stackIn_82_0 = stackOut_76_0;
                                    stackIn_82_1 = stackOut_76_1;
                                    stackIn_77_0 = stackOut_76_0;
                                    stackIn_77_1 = stackOut_76_1;
                                    if (var10 != 0) {
                                      break L11;
                                    } else {
                                      if (stackIn_77_0 != stackIn_77_1) {
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
                              }
                            }
                          }
                          stackOut_81_0 = (var5[var5.length + -2] & 255) << 8;
                          stackOut_81_1 = -(var5[var5.length + -1] & 255);
                          stackIn_82_0 = stackOut_81_0;
                          stackIn_82_1 = stackOut_81_1;
                          break L11;
                        }
                        var7 = stackIn_82_0 - stackIn_82_1;
                        if (~var7 == ~(((p) this).field_p.field_v[param2] & 65535)) {
                          L14: {
                            if (1 == ((p) this).field_u[param2]) {
                              break L14;
                            } else {
                              L15: {
                                if (((p) this).field_u[param2] == 0) {
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              ((p) this).field_u[param2] = (byte) 1;
                              break L14;
                            }
                          }
                          L16: {
                            if (!((jc) var4).field_q) {
                              ((jc) var4).b((byte) -70);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          stackOut_91_0 = var4;
                          stackIn_92_0 = stackOut_91_0;
                          break L9;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L17: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                ((p) this).field_u[param2] = (byte) -1;
                ((jc) var4).b((byte) -124);
                if (((jc) var4).field_q) {
                  if (!((p) this).field_w.c(27356)) {
                    var4 = (Object) (Object) ((p) this).field_w.a(true, ((p) this).field_j, (byte) 2, -2057056416, param2);
                    ((p) this).field_f.a((oh) var4, 81, (long)param2);
                    break L17;
                  } else {
                    return null;
                  }
                } else {
                  break L17;
                }
              }
              return null;
            }
            return (jc) (Object) stackIn_92_0;
          } else {
            try {
              L18: {
                L19: {
                  if (var5 == null) {
                    break L19;
                  } else {
                    if (2 >= var5.length) {
                      break L19;
                    } else {
                      ti.field_k.reset();
                      ti.field_k.update(var5, 0, var5.length - 2);
                      var6_int = (int)ti.field_k.getValue();
                      if (var6_int == ((p) this).field_p.field_f[param2]) {
                        L20: {
                          if (null == ((p) this).field_p.field_j) {
                            break L20;
                          } else {
                            if (((p) this).field_p.field_j[param2] == null) {
                              break L20;
                            } else {
                              var7_ref_byte__ = ((p) this).field_p.field_j[param2];
                              var8 = dp.a(var5, -2 + var5.length, param1 ^ -26131, 0);
                              var9 = 0;
                              L21: while (true) {
                                if (64 <= var9) {
                                  break L20;
                                } else {
                                  stackOut_45_0 = var7_ref_byte__[var9];
                                  stackOut_45_1 = var8[var9];
                                  stackIn_60_0 = stackOut_45_0;
                                  stackIn_60_1 = stackOut_45_1;
                                  stackIn_46_0 = stackOut_45_0;
                                  stackIn_46_1 = stackOut_45_1;
                                  if (var10 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L18;
                                  } else {
                                    if (stackIn_46_0 != stackIn_46_1) {
                                      throw new RuntimeException();
                                    } else {
                                      var9++;
                                      if (var10 == 0) {
                                        continue L21;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((p) this).field_w.field_a = 0;
                        ((p) this).field_w.field_p = 0;
                        decompiledRegionSelector0 = 1;
                        break L18;
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L22: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                ((p) this).field_w.b((byte) -91);
                ((jc) var4).b((byte) -68);
                if (((jc) var4).field_q) {
                  if (!((p) this).field_w.c(27356)) {
                    var4 = (Object) (Object) ((p) this).field_w.a(true, ((p) this).field_j, (byte) 2, -2057056416, param2);
                    ((p) this).field_f.a((oh) var4, 64, (long)param2);
                    break L22;
                  } else {
                    break L22;
                  }
                } else {
                  break L22;
                }
              }
              return null;
            }
            L23: {
              L24: {
                if (decompiledRegionSelector0 == 0) {
                  break L24;
                } else {
                  var5[var5.length + -2] = (byte)(((p) this).field_p.field_v[param2] >>> 8);
                  var5[-1 + var5.length] = (byte)((p) this).field_p.field_v[param2];
                  if (((p) this).field_r == null) {
                    break L23;
                  } else {
                    ak discarded$3 = ((p) this).field_k.a(param2, ((p) this).field_r, -61, var5);
                    stackOut_59_0 = -2;
                    stackOut_59_1 = ~((p) this).field_u[param2];
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    break L24;
                  }
                }
              }
              if (stackIn_60_0 != stackIn_60_1) {
                ((p) this).field_u[param2] = (byte) 1;
                break L23;
              } else {
                break L23;
              }
            }
            L25: {
              if (((jc) var4).field_q) {
                break L25;
              } else {
                ((jc) var4).b((byte) -128);
                break L25;
              }
            }
            return (jc) var4;
          }
        } else {
          return null;
        }
    }

    p(int param0, ua param1, ua param2, ar param3, rn param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
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
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
        ((p) this).field_f = new ti(16);
        ((p) this).field_q = 0;
        ((p) this).field_i = new pf();
        ((p) this).field_e = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((p) this).field_j = param0;
                ((p) this).field_r = param1;
                if (((p) this).field_r != null) {
                  break L2;
                } else {
                  ((p) this).field_x = false;
                  if (!ShatteredPlansClient.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((p) this).field_x = true;
              ((p) this).field_h = new pf();
              break L1;
            }
            L3: {
              ((p) this).field_z = param5;
              ((p) this).field_t = param7;
              ((p) this).field_k = param4;
              ((p) this).field_v = param6;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param8) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L3;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L3;
              }
            }
            L4: {
              ((p) this).field_s = stackIn_7_1 != 0;
              ((p) this).field_w = param3;
              ((p) this).field_o = param2;
              if (null == ((p) this).field_o) {
                break L4;
              } else {
                ((p) this).field_l = (jc) (Object) ((p) this).field_k.a(((p) this).field_j, ((p) this).field_o, 1);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("p.<init>(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param5).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param7 + 44 + param8 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new u();
        field_y = "<%0> has joined your game.";
    }
}
