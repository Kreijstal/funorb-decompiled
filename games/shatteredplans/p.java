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
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ((p) this).field_r) {
              return;
            } else {
              L1: {
                ((p) this).field_m = true;
                if (param0 == 255) {
                  break L1;
                } else {
                  jc discarded$2 = this.a(21, -34, 75);
                  break L1;
                }
              }
              L2: {
                if (null != ((p) this).field_h) {
                  break L2;
                } else {
                  ((p) this).field_h = new pf();
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "p.E(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        RuntimeException var2 = null;
        jc var2_ref = null;
        int var2_int = 0;
        oh var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_13_0 = 0;
        byte stackIn_13_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_46_0 = 0;
        byte stackIn_59_0 = 0;
        int stackIn_59_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_95_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        byte stackOut_12_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_45_0 = 0;
        byte stackOut_58_0 = 0;
        int stackOut_58_1 = 0;
        int stackOut_72_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_94_0 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                ((p) this).field_l = null;
                break L1;
              }
            }
            L2: {
              if (((p) this).field_h == null) {
                break L2;
              } else {
                if (null != ((p) this).a(6)) {
                  L3: {
                    if (!((p) this).field_x) {
                      break L3;
                    } else {
                      var2_int = 1;
                      var3 = ((p) this).field_h.d(0);
                      L4: while (true) {
                        L5: {
                          L6: {
                            L7: {
                              if (null == var3) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_b;
                                stackOut_12_0 = 0;
                                stackOut_12_1 = ((p) this).field_u[var4];
                                stackIn_24_0 = stackOut_12_0;
                                stackIn_24_1 = stackOut_12_1;
                                stackIn_13_0 = stackOut_12_0;
                                stackIn_13_1 = stackOut_12_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_24_0 <= stackIn_24_1) {
                                      break L6;
                                    } else {
                                      stackOut_25_0 = -1;
                                      stackIn_46_0 = stackOut_25_0;
                                      stackIn_26_0 = stackOut_25_0;
                                      if (var5 != 0) {
                                        break L5;
                                      } else {
                                        stackOut_26_0 = stackIn_26_0;
                                        stackIn_28_0 = stackOut_26_0;
                                        L9: {
                                          L10: {
                                            if (stackIn_28_0 != ~((p) this).field_p.field_n[((p) this).field_q]) {
                                              break L10;
                                            } else {
                                              ((p) this).field_q = ((p) this).field_q + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            }
                                          }
                                          L11: {
                                            if (((p) this).field_k.field_d < 250) {
                                              break L11;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L6;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          L12: {
                                            if (((p) this).field_u[((p) this).field_q] == 0) {
                                              jc discarded$4 = this.a(1, 0, ((p) this).field_q);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (((p) this).field_u[((p) this).field_q] != 0) {
                                              break L13;
                                            } else {
                                              var3 = new oh();
                                              var3.field_b = (long)((p) this).field_q;
                                              var2_int = 0;
                                              ((p) this).field_h.a((byte) -113, var3);
                                              break L13;
                                            }
                                          }
                                          ((p) this).field_q = ((p) this).field_q + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_23_0 = ~((p) this).field_q;
                                        stackOut_23_1 = ~((p) this).field_p.field_n.length;
                                        stackIn_24_0 = stackOut_23_0;
                                        stackIn_24_1 = stackOut_23_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_13_0 != stackIn_13_1) {
                                      break L14;
                                    } else {
                                      jc discarded$5 = this.a(1, 0, var4);
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (((p) this).field_u[var4] != 0) {
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
                                    var3.b((byte) -76);
                                    break L15;
                                  }
                                  var3 = ((p) this).field_h.a((byte) -71);
                                  if (var5 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_23_0 = ~((p) this).field_q;
                              stackOut_23_1 = ~((p) this).field_p.field_n.length;
                              stackIn_24_0 = stackOut_23_0;
                              stackIn_24_1 = stackOut_23_1;
                              if (stackIn_24_0 <= stackIn_24_1) {
                                break L6;
                              } else {
                                stackOut_25_0 = -1;
                                stackIn_46_0 = stackOut_25_0;
                                stackIn_26_0 = stackOut_25_0;
                                if (var5 != 0) {
                                  break L5;
                                } else {
                                  stackOut_26_0 = stackIn_26_0;
                                  stackIn_28_0 = stackOut_26_0;
                                  L18: {
                                    if (stackIn_28_0 != ~((p) this).field_p.field_n[((p) this).field_q]) {
                                      break L18;
                                    } else {
                                      ((p) this).field_q = ((p) this).field_q + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  L19: {
                                    if (((p) this).field_k.field_d < 250) {
                                      break L19;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  L20: {
                                    if (((p) this).field_u[((p) this).field_q] == 0) {
                                      jc discarded$4 = this.a(1, 0, ((p) this).field_q);
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (((p) this).field_u[((p) this).field_q] != 0) {
                                      break L21;
                                    } else {
                                      var3 = new oh();
                                      var3.field_b = (long)((p) this).field_q;
                                      var2_int = 0;
                                      ((p) this).field_h.a((byte) -113, var3);
                                      break L21;
                                    }
                                  }
                                  ((p) this).field_q = ((p) this).field_q + 1;
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
                          if (stackIn_46_0 != 0) {
                            ((p) this).field_q = 0;
                            ((p) this).field_x = false;
                            break L22;
                          } else {
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
                    if (((p) this).field_m) {
                      break L23;
                    } else {
                      ((p) this).field_h = null;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L23;
                      }
                    }
                  }
                  var2_int = 1;
                  var3 = ((p) this).field_h.d(0);
                  L24: while (true) {
                    L25: {
                      L26: {
                        L27: {
                          if (null == var3) {
                            break L27;
                          } else {
                            var4 = (int)var3.field_b;
                            stackOut_58_0 = ((p) this).field_u[var4];
                            stackOut_58_1 = 1;
                            stackIn_71_0 = stackOut_58_0;
                            stackIn_71_1 = stackOut_58_1;
                            stackIn_59_0 = stackOut_58_0;
                            stackIn_59_1 = stackOut_58_1;
                            if (var5 != 0) {
                              L28: while (true) {
                                if (stackIn_71_0 <= stackIn_71_1) {
                                  break L26;
                                } else {
                                  stackOut_72_0 = ((p) this).field_p.field_n[((p) this).field_q];
                                  stackIn_95_0 = stackOut_72_0;
                                  stackIn_73_0 = stackOut_72_0;
                                  if (var5 != 0) {
                                    break L25;
                                  } else {
                                    stackOut_73_0 = stackIn_73_0;
                                    stackIn_75_0 = stackOut_73_0;
                                    L29: {
                                      L30: {
                                        if (stackIn_75_0 == 0) {
                                          ((p) this).field_q = ((p) this).field_q + 1;
                                          if (var5 == 0) {
                                            break L29;
                                          } else {
                                            break L30;
                                          }
                                        } else {
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (((p) this).field_w.c((byte) -98)) {
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
                                        if (((p) this).field_u[((p) this).field_q] == 1) {
                                          break L32;
                                        } else {
                                          jc discarded$6 = this.a(2, 0, ((p) this).field_q);
                                          break L32;
                                        }
                                      }
                                      L33: {
                                        if (((p) this).field_u[((p) this).field_q] != 1) {
                                          var3 = new oh();
                                          var3.field_b = (long)((p) this).field_q;
                                          ((p) this).field_h.a((byte) -113, var3);
                                          var2_int = 0;
                                          break L33;
                                        } else {
                                          break L33;
                                        }
                                      }
                                      ((p) this).field_q = ((p) this).field_q + 1;
                                      if (var5 == 0) {
                                        break L29;
                                      } else {
                                        break L26;
                                      }
                                    }
                                    stackOut_70_0 = ~((p) this).field_q;
                                    stackOut_70_1 = ~((p) this).field_p.field_n.length;
                                    stackIn_71_0 = stackOut_70_0;
                                    stackIn_71_1 = stackOut_70_1;
                                    continue L28;
                                  }
                                }
                              }
                            } else {
                              L34: {
                                if (stackIn_59_0 != stackIn_59_1) {
                                  jc discarded$7 = this.a(2, 0, var4);
                                  break L34;
                                } else {
                                  break L34;
                                }
                              }
                              L35: {
                                L36: {
                                  if (((p) this).field_u[var4] != 1) {
                                    break L36;
                                  } else {
                                    var3.b((byte) -70);
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
                              var3 = ((p) this).field_h.a((byte) -71);
                              if (var5 == 0) {
                                continue L24;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        L37: while (true) {
                          stackOut_70_0 = ~((p) this).field_q;
                          stackOut_70_1 = ~((p) this).field_p.field_n.length;
                          stackIn_71_0 = stackOut_70_0;
                          stackIn_71_1 = stackOut_70_1;
                          if (stackIn_71_0 <= stackIn_71_1) {
                            break L26;
                          } else {
                            stackOut_72_0 = ((p) this).field_p.field_n[((p) this).field_q];
                            stackIn_95_0 = stackOut_72_0;
                            stackIn_73_0 = stackOut_72_0;
                            if (var5 != 0) {
                              break L25;
                            } else {
                              stackOut_73_0 = stackIn_73_0;
                              stackIn_75_0 = stackOut_73_0;
                              L38: {
                                if (stackIn_75_0 == 0) {
                                  ((p) this).field_q = ((p) this).field_q + 1;
                                  if (var5 == 0) {
                                    continue L37;
                                  } else {
                                    break L38;
                                  }
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (((p) this).field_w.c((byte) -98)) {
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
                                if (((p) this).field_u[((p) this).field_q] == 1) {
                                  break L40;
                                } else {
                                  jc discarded$6 = this.a(2, 0, ((p) this).field_q);
                                  break L40;
                                }
                              }
                              L41: {
                                if (((p) this).field_u[((p) this).field_q] != 1) {
                                  var3 = new oh();
                                  var3.field_b = (long)((p) this).field_q;
                                  ((p) this).field_h.a((byte) -113, var3);
                                  var2_int = 0;
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                              ((p) this).field_q = ((p) this).field_q + 1;
                              if (var5 == 0) {
                                continue L37;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                      }
                      stackOut_94_0 = var2_int;
                      stackIn_95_0 = stackOut_94_0;
                      break L25;
                    }
                    if (stackIn_95_0 == 0) {
                      break L2;
                    } else {
                      ((p) this).field_q = 0;
                      ((p) this).field_m = false;
                      break L2;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            L42: {
              if (!((p) this).field_s) {
                break L42;
              } else {
                if (pr.a(14274) >= ((p) this).field_e) {
                  var2_ref = (jc) (Object) ((p) this).field_f.c(77);
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
                              if (var2_ref.field_t) {
                                break L47;
                              } else {
                                var2_ref.field_t = true;
                                if (var5 == 0) {
                                  break L45;
                                } else {
                                  break L47;
                                }
                              }
                            }
                            if (var2_ref.field_q) {
                              var2_ref.b((byte) -60);
                              break L45;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                          var2_ref = (jc) (Object) ((p) this).field_f.a(false);
                          if (var5 == 0) {
                            continue L43;
                          } else {
                            break L44;
                          }
                        }
                      }
                    }
                    ((p) this).field_e = pr.a(14274) - -1000L;
                    break L42;
                  }
                } else {
                  break L42;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "p.A(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        oh var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        byte stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (null != ((p) this).field_h) {
              if (((p) this).a(param0 + -59) != null) {
                var2_ref = ((p) this).field_i.d(0);
                L1: while (true) {
                  L2: {
                    L3: {
                      if (var2_ref == null) {
                        break L3;
                      } else {
                        var3 = (int)var2_ref.field_b;
                        stackOut_7_0 = ~var3;
                        stackOut_7_1 = -1;
                        stackIn_35_0 = stackOut_7_0;
                        stackIn_35_1 = stackOut_7_1;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L4: {
                            L5: {
                              L6: {
                                if (stackIn_8_0 > stackIn_8_1) {
                                  break L6;
                                } else {
                                  if (((p) this).field_p.field_a <= var3) {
                                    break L6;
                                  } else {
                                    if (((p) this).field_p.field_n[var3] == 0) {
                                      break L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              var2_ref.b((byte) -85);
                              if (var4 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                            L7: {
                              if (((p) this).field_u[var3] == 0) {
                                jc discarded$2 = this.a(1, 0, var3);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                            L8: {
                              if (((p) this).field_u[var3] != -1) {
                                break L8;
                              } else {
                                jc discarded$3 = this.a(2, 0, var3);
                                break L8;
                              }
                            }
                            if (((p) this).field_u[var3] == 1) {
                              var2_ref.b((byte) -90);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          var2_ref = ((p) this).field_i.a((byte) -71);
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    stackOut_34_0 = param0;
                    stackOut_34_1 = 65;
                    stackIn_35_0 = stackOut_34_0;
                    stackIn_35_1 = stackOut_34_1;
                    break L2;
                  }
                  L9: {
                    if (stackIn_35_0 == stackIn_35_1) {
                      break L9;
                    } else {
                      ((p) this).c(-101);
                      break L9;
                    }
                  }
                  break L0;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "p.G(" + param0 + ')');
        }
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        qr stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        qr stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        qr stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException decompiledCaughtException = null;
        qr stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        qr stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        qr stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        try {
          L0: {
            L1: {
              stackOut_0_0 = gm.field_m;
              stackOut_0_1 = lp.field_v.field_K;
              stackIn_3_0 = stackOut_0_0;
              stackIn_3_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (!ns.field_pb) {
                stackOut_3_0 = (qr) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_1_0 = (qr) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 42 + (pe.field_K - -2);
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                break L1;
              }
            }
            ((qr) (Object) stackIn_4_0).a(stackIn_4_1 - stackIn_4_2, 18, (byte) 39, 0, 0);
            sf.field_f.a(42 + pe.field_K, param0, (byte) 42, 0, -40 + (lp.field_v.field_K - (pe.field_K - -2)));
            ls.field_a.a(lp.field_v.field_K, 20, 0, 2, -122, lp.field_v.field_mb + -20, pe.field_K);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "p.I(" + param0 + ')');
        }
    }

    final ci a(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ci stackIn_3_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_47_0 = null;
        ci stackIn_55_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_46_0 = null;
        ci stackOut_54_0 = null;
        Object stackOut_12_0 = null;
        ci stackOut_2_0 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (null == ((p) this).field_p) {
              L1: {
                if (null != ((p) this).field_l) {
                  break L1;
                } else {
                  if (!((p) this).field_w.c(27356)) {
                    ((p) this).field_l = (jc) (Object) ((p) this).field_w.a(true, 255, (byte) 0, -2057056416, ((p) this).field_j);
                    break L1;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    return (ci) (Object) stackIn_9_0;
                  }
                }
              }
              if (!((p) this).field_l.field_u) {
                L2: {
                  L3: {
                    var2_array = ((p) this).field_l.e((byte) 50);
                    if (((p) this).field_l instanceof ak) {
                      break L3;
                    } else {
                      try {
                        L4: {
                          if (null != var2_array) {
                            ((p) this).field_p = new ci(var2_array, ((p) this).field_z, ((p) this).field_v);
                            break L4;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L5: {
                          L6: {
                            var3 = decompiledCaughtException;
                            ((p) this).field_w.b((byte) -91);
                            ((p) this).field_p = null;
                            if (((p) this).field_w.c(27356)) {
                              break L6;
                            } else {
                              ((p) this).field_l = (jc) (Object) ((p) this).field_w.a(true, 255, (byte) 0, -2057056416, ((p) this).field_j);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          ((p) this).field_l = null;
                          break L5;
                        }
                        stackOut_26_0 = null;
                        stackIn_27_0 = stackOut_26_0;
                        return (ci) (Object) stackIn_27_0;
                      }
                      if (null == ((p) this).field_o) {
                        break L2;
                      } else {
                        ak discarded$1 = ((p) this).field_k.a(((p) this).field_j, ((p) this).field_o, -51, var2_array);
                        if (var4 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  try {
                    L7: {
                      if (var2_array != null) {
                        ((p) this).field_p = new ci(var2_array, ((p) this).field_z, ((p) this).field_v);
                        if (~((p) this).field_t != ~((p) this).field_p.field_e) {
                          throw new RuntimeException();
                        } else {
                          break L7;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L8: {
                      L9: {
                        var3 = decompiledCaughtException;
                        ((p) this).field_p = null;
                        if (((p) this).field_w.c(27356)) {
                          break L9;
                        } else {
                          ((p) this).field_l = (jc) (Object) ((p) this).field_w.a(true, 255, (byte) 0, -2057056416, ((p) this).field_j);
                          if (var4 == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                      ((p) this).field_l = null;
                      break L8;
                    }
                    stackOut_46_0 = null;
                    stackIn_47_0 = stackOut_46_0;
                    return (ci) (Object) stackIn_47_0;
                  }
                  break L2;
                }
                L10: {
                  if (param0 == 6) {
                    break L10;
                  } else {
                    field_y = null;
                    break L10;
                  }
                }
                L11: {
                  if (null == ((p) this).field_r) {
                    break L11;
                  } else {
                    ((p) this).field_u = new byte[((p) this).field_p.field_a];
                    break L11;
                  }
                }
                ((p) this).field_l = null;
                stackOut_54_0 = ((p) this).field_p;
                stackIn_55_0 = stackOut_54_0;
                break L0;
              } else {
                stackOut_12_0 = null;
                stackIn_13_0 = stackOut_12_0;
                return (ci) (Object) stackIn_13_0;
              }
            } else {
              stackOut_2_0 = ((p) this).field_p;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "p.C(" + param0 + ')');
        }
        return stackIn_55_0;
    }

    final int a(int param0, byte param1) {
        jc var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3 = (jc) (Object) ((p) this).field_f.a((long)param0, -25064);
            if (null == var3) {
              var4 = -32 / ((param1 - -3) / 58);
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = var3.e(0);
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3_ref, "p.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_g = null;
              field_y = null;
              if (param0 == 114) {
                break L1;
              } else {
                p.d(24);
                break L1;
              }
            }
            field_A = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "p.B(" + param0 + ')');
        }
    }

    final byte[] a(byte param0, int param1) {
        jc var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            var3 = this.a(0, 0, param1);
            if (null != var3) {
              var5 = 84 % ((param0 - -51) / 33);
              var4 = var3.e((byte) 109);
              var3.b((byte) -60);
              stackOut_3_0 = (byte[]) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3_ref, "p.D(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
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
        Object stackIn_31_0 = null;
        Object stackIn_57_0 = null;
        Object stackIn_66_0 = null;
        byte stackIn_85_0 = 0;
        byte stackIn_85_1 = 0;
        Object stackIn_101_0 = null;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        Object stackIn_112_0 = null;
        byte stackIn_129_0 = 0;
        byte stackIn_129_1 = 0;
        int stackIn_136_0 = 0;
        int stackIn_136_1 = 0;
        Object stackIn_149_0 = null;
        Object stackIn_156_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_30_0 = null;
        Object stackOut_56_0 = null;
        Object stackOut_65_0 = null;
        byte stackOut_128_0 = 0;
        byte stackOut_128_1 = 0;
        int stackOut_135_0 = 0;
        int stackOut_135_1 = 0;
        Object stackOut_148_0 = null;
        byte stackOut_84_0 = 0;
        byte stackOut_84_1 = 0;
        Object stackOut_100_0 = null;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        Object stackOut_111_0 = null;
        Object stackOut_155_0 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          try {
            L0: {
              if (param1 == 0) {
                break L0;
              } else {
                int discarded$2 = ((p) this).a(55, (byte) -28);
                break L0;
              }
            }
            L1: {
              var4 = (Object) (Object) (jc) (Object) ((p) this).field_f.a((long)param2, -25064);
              if (null == var4) {
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
                          stackOut_30_0 = null;
                          stackIn_31_0 = stackOut_30_0;
                          return (jc) (Object) stackIn_31_0;
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
                            stackOut_56_0 = null;
                            stackIn_57_0 = stackOut_56_0;
                            return (jc) (Object) stackIn_57_0;
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
            if (((jc) var4).field_u) {
              stackOut_65_0 = null;
              stackIn_66_0 = stackOut_65_0;
              return (jc) (Object) stackIn_66_0;
            } else {
              var5 = ((jc) var4).e((byte) 82);
              if (var4 instanceof ak) {
                L9: {
                  if (null == var5) {
                    break L9;
                  } else {
                    if (2 < var5.length) {
                      ti.field_k.reset();
                      ti.field_k.update(var5, 0, var5.length + -2);
                      var6_int = (int)ti.field_k.getValue();
                      if (((p) this).field_p.field_f[param2] == var6_int) {
                        L10: {
                          L11: {
                            if (null == ((p) this).field_p.field_j) {
                              break L11;
                            } else {
                              if (((p) this).field_p.field_j[param2] == null) {
                                break L11;
                              } else {
                                var7_ref_byte__ = ((p) this).field_p.field_j[param2];
                                var8 = dp.a(var5, var5.length + -2, param1 ^ -26131, 0);
                                var9 = 0;
                                L12: while (true) {
                                  if (var9 >= 64) {
                                    break L11;
                                  } else {
                                    stackOut_128_0 = var8[var9];
                                    stackOut_128_1 = var7_ref_byte__[var9];
                                    stackIn_136_0 = stackOut_128_0;
                                    stackIn_136_1 = stackOut_128_1;
                                    stackIn_129_0 = stackOut_128_0;
                                    stackIn_129_1 = stackOut_128_1;
                                    if (var10 != 0) {
                                      break L10;
                                    } else {
                                      if (stackIn_129_0 != stackIn_129_1) {
                                        throw new RuntimeException();
                                      } else {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L12;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_135_0 = (var5[var5.length + -2] & 255) << 1021580552;
                          stackOut_135_1 = -(var5[var5.length + -1] & 255);
                          stackIn_136_0 = stackOut_135_0;
                          stackIn_136_1 = stackOut_135_1;
                          break L10;
                        }
                        var7 = stackIn_136_0 - stackIn_136_1;
                        if (~var7 == ~(((p) this).field_p.field_v[param2] & 65535)) {
                          L13: {
                            if (1 == ((p) this).field_u[param2]) {
                              break L13;
                            } else {
                              L14: {
                                if (((p) this).field_u[param2] == 0) {
                                  break L14;
                                } else {
                                  break L14;
                                }
                              }
                              ((p) this).field_u[param2] = (byte) 1;
                              break L13;
                            }
                          }
                          L15: {
                            if (!((jc) var4).field_q) {
                              ((jc) var4).b((byte) -70);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          stackOut_148_0 = var4;
                          stackIn_149_0 = stackOut_148_0;
                          return (jc) (Object) stackIn_149_0;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      break L9;
                    }
                  }
                }
                throw new RuntimeException();
              } else {
                try {
                  L16: {
                    L17: {
                      if (null == var5) {
                        break L17;
                      } else {
                        if (2 >= var5.length) {
                          break L17;
                        } else {
                          ti.field_k.reset();
                          ti.field_k.update(var5, 0, var5.length - 2);
                          var6_int = (int)ti.field_k.getValue();
                          if (var6_int == ((p) this).field_p.field_f[param2]) {
                            L18: {
                              if (null == ((p) this).field_p.field_j) {
                                break L18;
                              } else {
                                if (((p) this).field_p.field_j[param2] == null) {
                                  break L18;
                                } else {
                                  var7_ref_byte__ = ((p) this).field_p.field_j[param2];
                                  var8 = dp.a(var5, -2 + var5.length, param1 ^ -26131, 0);
                                  var9 = 0;
                                  L19: while (true) {
                                    if (64 <= var9) {
                                      break L18;
                                    } else {
                                      stackOut_84_0 = var7_ref_byte__[var9];
                                      stackOut_84_1 = var8[var9];
                                      stackIn_105_0 = stackOut_84_0;
                                      stackIn_105_1 = stackOut_84_1;
                                      stackIn_85_0 = stackOut_84_0;
                                      stackIn_85_1 = stackOut_84_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L16;
                                      } else {
                                        if (stackIn_85_0 != stackIn_85_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L19;
                                          } else {
                                            break L18;
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
                            break L16;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L20: {
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    ((p) this).field_w.b((byte) -91);
                    ((jc) var4).b((byte) -68);
                    if (((jc) var4).field_q) {
                      if (!((p) this).field_w.c(27356)) {
                        var4 = (Object) (Object) ((p) this).field_w.a(true, ((p) this).field_j, (byte) 2, -2057056416, param2);
                        ((p) this).field_f.a((oh) var4, 64, (long)param2);
                        break L20;
                      } else {
                        break L20;
                      }
                    } else {
                      break L20;
                    }
                  }
                  stackOut_100_0 = null;
                  stackIn_101_0 = stackOut_100_0;
                  return (jc) (Object) stackIn_101_0;
                }
                L21: {
                  L22: {
                    if (decompiledRegionSelector0 == 0) {
                      break L22;
                    } else {
                      var5[var5.length + -2] = (byte)(((p) this).field_p.field_v[param2] >>> 793013800);
                      var5[-1 + var5.length] = (byte)((p) this).field_p.field_v[param2];
                      if (((p) this).field_r == null) {
                        break L21;
                      } else {
                        ak discarded$3 = ((p) this).field_k.a(param2, ((p) this).field_r, -61, var5);
                        stackOut_103_0 = -2;
                        stackOut_103_1 = ~((p) this).field_u[param2];
                        stackIn_105_0 = stackOut_103_0;
                        stackIn_105_1 = stackOut_103_1;
                        break L22;
                      }
                    }
                  }
                  if (stackIn_105_0 != stackIn_105_1) {
                    ((p) this).field_u[param2] = (byte) 1;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L23: {
                  if (((jc) var4).field_q) {
                    break L23;
                  } else {
                    ((jc) var4).b((byte) -128);
                    break L23;
                  }
                }
                stackOut_111_0 = var4;
                stackIn_112_0 = stackOut_111_0;
                return (jc) (Object) stackIn_112_0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L24: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((p) this).field_u[param2] = (byte) -1;
              ((jc) var4).b((byte) -124);
              if (((jc) var4).field_q) {
                if (((p) this).field_w.c(27356)) {
                  break L24;
                } else {
                  var4 = (Object) (Object) ((p) this).field_w.a(true, ((p) this).field_j, (byte) 2, -2057056416, param2);
                  ((p) this).field_f.a((oh) var4, 81, (long)param2);
                  break L24;
                }
              } else {
                break L24;
              }
            }
            stackOut_155_0 = null;
            stackIn_156_0 = stackOut_155_0;
            return (jc) (Object) stackIn_156_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw r.a((Throwable) var4, "p.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    p(int param0, ua param1, ua param2, ar param3, rn param4, int param5, byte[] param6, int param7, boolean param8) {
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
              ((p) this).field_s = param8;
              ((p) this).field_w = param3;
              ((p) this).field_o = param2;
              if (null != ((p) this).field_o) {
                ((p) this).field_l = (jc) (Object) ((p) this).field_k.a(((p) this).field_j, ((p) this).field_o, 1);
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
            stackOut_10_1 = new StringBuilder().append("p.<init>(").append(param0).append(',');
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
          throw r.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
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
