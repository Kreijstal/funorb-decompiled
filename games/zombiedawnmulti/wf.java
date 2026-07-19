/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wf extends ae {
    private int field_p;
    private boolean field_i;
    private int field_l;
    private int field_o;
    static int field_m;
    private int field_j;
    int field_q;
    static String field_k;
    private int field_s;
    static int field_t;
    static String field_r;
    static String field_n;

    final static void a(int param0, int param1, int param2) {
        em.field_O[param0] = cr.b(em.field_O[param0], 1 << -32 + param1);
        if (param2 != -1) {
            field_k = (String) null;
        }
    }

    final static void a(int param0) {
        if (param0 != 6835) {
          return;
        } else {
          L0: {
            lo.field_g = new cj(0L, (cj) null);
            if (tb.field_u) {
              lo.field_g.a((byte) 50, ql.field_b);
              break L0;
            } else {
              break L0;
            }
          }
          lo.field_g.a((byte) 50, pd.field_b);
          de.field_b = new qh(ne.field_vb, lo.field_g);
          qe.field_k = new cj(0L, (cj) null);
          qe.field_k.a((byte) 50, de.field_b.field_c);
          qe.field_k.a((byte) 50, kj.field_u);
          wn.a((byte) 3);
          return;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        oo.d(-24 + (this.field_p >> -1850046096) + -param2, -24 + -param0 + (this.field_s >> -1529194096), 1 - -((-param3 + this.field_f) / 5), 16711680, 128);
        if (!param1) {
            qd var6 = (qd) null;
            this.a(106, (qd) null);
        }
    }

    final static int a(hf param0, hf param1, int param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 32475) {
                break L1;
              } else {
                field_t = 10;
                break L1;
              }
            }
            var4 = (String) null;
            stackOut_2_0 = mg.a(false, param0, 0, param1, (String) null, 0, (byte) -92);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("wf.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, qd param1) {
        uj discarded$18 = null;
        uj discarded$19 = null;
        uj discarded$20 = null;
        uj discarded$21 = null;
        uj discarded$22 = null;
        uj discarded$23 = null;
        uj discarded$24 = null;
        uj discarded$25 = null;
        uj discarded$26 = null;
        uj discarded$27 = null;
        uj discarded$28 = null;
        uj discarded$29 = null;
        uj discarded$30 = null;
        uj discarded$31 = null;
        uj discarded$32 = null;
        uj discarded$33 = null;
        uj discarded$34 = null;
        boolean discarded$35 = false;
        RuntimeException var3 = null;
        int var3_int = 0;
        id var3_ref = null;
        wb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        wb var8 = null;
        wb stackIn_112_0 = null;
        wb stackIn_113_0 = null;
        wb stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        qd stackIn_116_0 = null;
        qd stackIn_117_0 = null;
        qd stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        qd stackIn_121_0 = null;
        int stackIn_121_1 = 0;
        qd stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        qd stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_134_2 = null;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_111_0 = null;
        wb stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        wb stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        qd stackOut_115_0 = null;
        qd stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        qd stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        qd stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        qd stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        int stackOut_122_2 = 0;
        qd stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (this.field_i) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      if (this.field_s != -1) {
                        break L4;
                      } else {
                        if (this.field_p != -1) {
                          break L4;
                        } else {
                          param1.b(this.field_q, param1.field_k.a(320, param0 + 2), this.field_j, param1.field_k.a(true, 240), -99);
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L5: {
                      if (this.field_s != -1) {
                        break L5;
                      } else {
                        param1.a(50, this.field_j, this.field_l, this.field_q);
                        if (var7 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    param1.b(this.field_q, this.field_p, this.field_j, this.field_s, -46);
                    break L3;
                  }
                  this.field_f = this.field_f + 50;
                  this.field_i = true;
                  param1.a(false, (ae) (this));
                  discarded$18 = nm.b(-127, 67);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L6: {
                L7: {
                  L8: {
                    L9: {
                      L10: {
                        L11: {
                          L12: {
                            L13: {
                              L14: {
                                L15: {
                                  L16: {
                                    L17: {
                                      L18: {
                                        L19: {
                                          L20: {
                                            L21: {
                                              L22: {
                                                var3_int = this.field_q;
                                                if (var3_int == 9) {
                                                  break L22;
                                                } else {
                                                  if (var3_int == 10) {
                                                    break L21;
                                                  } else {
                                                    L23: {
                                                      if (var3_int != 16) {
                                                        break L23;
                                                      } else {
                                                        if (var7 == 0) {
                                                          break L20;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    L24: {
                                                      if (var3_int != 17) {
                                                        break L24;
                                                      } else {
                                                        if (var7 == 0) {
                                                          break L19;
                                                        } else {
                                                          break L24;
                                                        }
                                                      }
                                                    }
                                                    L25: {
                                                      if (7 != var3_int) {
                                                        break L25;
                                                      } else {
                                                        if (var7 == 0) {
                                                          break L18;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    if (-5 == (var3_int ^ -1)) {
                                                      break L17;
                                                    } else {
                                                      L26: {
                                                        if (var3_int != 3) {
                                                          break L26;
                                                        } else {
                                                          if (var7 == 0) {
                                                            break L16;
                                                          } else {
                                                            break L26;
                                                          }
                                                        }
                                                      }
                                                      L27: {
                                                        if (var3_int != 14) {
                                                          break L27;
                                                        } else {
                                                          if (var7 == 0) {
                                                            break L15;
                                                          } else {
                                                            break L27;
                                                          }
                                                        }
                                                      }
                                                      L28: {
                                                        if (var3_int != 13) {
                                                          break L28;
                                                        } else {
                                                          if (var7 == 0) {
                                                            break L14;
                                                          } else {
                                                            break L28;
                                                          }
                                                        }
                                                      }
                                                      if ((var3_int ^ -1) == -9) {
                                                        break L13;
                                                      } else {
                                                        L29: {
                                                          if (var3_int != 11) {
                                                            break L29;
                                                          } else {
                                                            if (var7 == 0) {
                                                              break L12;
                                                            } else {
                                                              break L29;
                                                            }
                                                          }
                                                        }
                                                        L30: {
                                                          if (1 != var3_int) {
                                                            break L30;
                                                          } else {
                                                            if (var7 == 0) {
                                                              break L11;
                                                            } else {
                                                              break L30;
                                                            }
                                                          }
                                                        }
                                                        L31: {
                                                          if (-3 != (var3_int ^ -1)) {
                                                            break L31;
                                                          } else {
                                                            if (var7 == 0) {
                                                              break L10;
                                                            } else {
                                                              break L31;
                                                            }
                                                          }
                                                        }
                                                        L32: {
                                                          if (-6 != (var3_int ^ -1)) {
                                                            break L32;
                                                          } else {
                                                            if (var7 == 0) {
                                                              break L9;
                                                            } else {
                                                              break L32;
                                                            }
                                                          }
                                                        }
                                                        L33: {
                                                          if (-16 != (var3_int ^ -1)) {
                                                            break L33;
                                                          } else {
                                                            if (var7 == 0) {
                                                              break L8;
                                                            } else {
                                                              break L33;
                                                            }
                                                          }
                                                        }
                                                        if (var3_int != 18) {
                                                          break L6;
                                                        } else {
                                                          if (var7 == 0) {
                                                            break L7;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              discarded$19 = nm.b(-126, 81);
                                              if (var7 == 0) {
                                                break L6;
                                              } else {
                                                break L21;
                                              }
                                            }
                                            discarded$20 = nm.b(-126, 83);
                                            if (var7 == 0) {
                                              break L6;
                                            } else {
                                              break L20;
                                            }
                                          }
                                          discarded$21 = nm.b(param0 ^ -128, 84);
                                          if (var7 == 0) {
                                            break L6;
                                          } else {
                                            break L19;
                                          }
                                        }
                                        discarded$22 = nm.b(param0 + -127, 75);
                                        if (var7 == 0) {
                                          break L6;
                                        } else {
                                          break L18;
                                        }
                                      }
                                      discarded$23 = nm.b(-127, 46);
                                      if (var7 == 0) {
                                        break L6;
                                      } else {
                                        break L17;
                                      }
                                    }
                                    discarded$24 = nm.b(-127, 46);
                                    if (var7 == 0) {
                                      break L6;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  discarded$25 = nm.b(param0 + -128, 46);
                                  if (var7 == 0) {
                                    break L6;
                                  } else {
                                    break L15;
                                  }
                                }
                                discarded$26 = nm.b(param0 + -128, 92);
                                if (var7 == 0) {
                                  break L6;
                                } else {
                                  break L14;
                                }
                              }
                              discarded$27 = nm.b(-128, 85);
                              if (var7 == 0) {
                                break L6;
                              } else {
                                break L13;
                              }
                            }
                            discarded$28 = nm.b(-127, 35);
                            if (var7 == 0) {
                              break L6;
                            } else {
                              break L12;
                            }
                          }
                          discarded$29 = nm.b(param0 ^ -126, 86);
                          if (var7 == 0) {
                            break L6;
                          } else {
                            break L11;
                          }
                        }
                        discarded$30 = nm.b(-127, 67);
                        if (var7 == 0) {
                          break L6;
                        } else {
                          break L10;
                        }
                      }
                      discarded$31 = nm.b(-127, 46);
                      if (var7 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                    discarded$32 = nm.b(-126, 17);
                    if (var7 == 0) {
                      break L6;
                    } else {
                      break L8;
                    }
                  }
                  discarded$33 = nm.b(param0 ^ -127, 80);
                  if (var7 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
                discarded$34 = nm.b(-128, 46);
                break L6;
              }
              L34: {
                L35: {
                  L36: {
                    L37: {
                      var6 = this.field_q;
                      if ((var6 ^ -1) != -12) {
                        break L37;
                      } else {
                        if (var7 == 0) {
                          break L36;
                        } else {
                          break L37;
                        }
                      }
                    }
                    L38: {
                      if (var6 != 12) {
                        break L38;
                      } else {
                        if (var7 == 0) {
                          break L35;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L39: {
                      if ((var6 ^ -1) != -8) {
                        break L39;
                      } else {
                        if (var7 == 0) {
                          break L34;
                        } else {
                          break L39;
                        }
                      }
                    }
                    L40: {
                      L41: {
                        L42: {
                          L43: {
                            L44: {
                              if ((var6 ^ -1) != -5) {
                                break L44;
                              } else {
                                if (var7 == 0) {
                                  L45: {
                                    var4 = op.field_m.a(this.field_l, false);
                                    stackOut_111_0 = (wb) (var4);
                                    stackIn_113_0 = stackOut_111_0;
                                    stackIn_112_0 = stackOut_111_0;
                                    if (-35 != (this.field_o ^ -1)) {
                                      stackOut_113_0 = (wb) ((Object) stackIn_113_0);
                                      stackOut_113_1 = 0;
                                      stackIn_114_0 = stackOut_113_0;
                                      stackIn_114_1 = stackOut_113_1;
                                      break L45;
                                    } else {
                                      stackOut_112_0 = (wb) ((Object) stackIn_112_0);
                                      stackOut_112_1 = 1;
                                      stackIn_114_0 = stackOut_112_0;
                                      stackIn_114_1 = stackOut_112_1;
                                      break L45;
                                    }
                                  }
                                  stackIn_114_0.field_Hb = stackIn_114_1 != 0;
                                  if (var7 == 0) {
                                    break L1;
                                  } else {
                                    break L43;
                                  }
                                } else {
                                  break L44;
                                }
                              }
                            }
                            if (13 == var6) {
                              break L43;
                            } else {
                              L46: {
                                if (-10 != (var6 ^ -1)) {
                                  break L46;
                                } else {
                                  if (var7 == 0) {
                                    break L42;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              if (10 == var6) {
                                break L42;
                              } else {
                                if ((var6 ^ -1) == -16) {
                                  break L41;
                                } else {
                                  if (17 != var6) {
                                    break L1;
                                  } else {
                                    if (var7 == 0) {
                                      break L40;
                                    } else {
                                      break L36;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L47: {
                            stackOut_115_0 = (qd) (param1);
                            stackIn_117_0 = stackOut_115_0;
                            stackIn_116_0 = stackOut_115_0;
                            if (this.field_o != 36) {
                              stackOut_117_0 = (qd) ((Object) stackIn_117_0);
                              stackOut_117_1 = 0;
                              stackIn_118_0 = stackOut_117_0;
                              stackIn_118_1 = stackOut_117_1;
                              break L47;
                            } else {
                              stackOut_116_0 = (qd) ((Object) stackIn_116_0);
                              stackOut_116_1 = 1;
                              stackIn_118_0 = stackOut_116_0;
                              stackIn_118_1 = stackOut_116_1;
                              break L47;
                            }
                          }
                          ((qd) (Object) stackIn_118_0).b(stackIn_118_1 != 0, 0, this.field_s, this.field_p);
                          if (var7 == 0) {
                            break L1;
                          } else {
                            break L42;
                          }
                        }
                        var5 = op.field_m.a((byte) 32, this.field_j, 1000);
                        param1.a((byte) -111, this.field_s, this.field_q, var5, this.field_p);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L41;
                        }
                      }
                      L48: {
                        stackOut_120_0 = (qd) (param1);
                        stackOut_120_1 = this.field_p;
                        stackIn_122_0 = stackOut_120_0;
                        stackIn_122_1 = stackOut_120_1;
                        stackIn_121_0 = stackOut_120_0;
                        stackIn_121_1 = stackOut_120_1;
                        if (32 != this.field_o) {
                          stackOut_122_0 = (qd) ((Object) stackIn_122_0);
                          stackOut_122_1 = stackIn_122_1;
                          stackOut_122_2 = 0;
                          stackIn_123_0 = stackOut_122_0;
                          stackIn_123_1 = stackOut_122_1;
                          stackIn_123_2 = stackOut_122_2;
                          break L48;
                        } else {
                          stackOut_121_0 = (qd) ((Object) stackIn_121_0);
                          stackOut_121_1 = stackIn_121_1;
                          stackOut_121_2 = 1;
                          stackIn_123_0 = stackOut_121_0;
                          stackIn_123_1 = stackOut_121_1;
                          stackIn_123_2 = stackOut_121_2;
                          break L48;
                        }
                      }
                      ((qd) (Object) stackIn_123_0).a(stackIn_123_1, stackIn_123_2 != 0, this.field_s, (byte) -40, this.field_j);
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L40;
                      }
                    }
                    L49: {
                      if ((this.field_s ^ -1) == 0) {
                        break L49;
                      } else {
                        discarded$35 = param1.b(this.field_p, -106, this.field_s, this.field_j);
                        if (var7 == 0) {
                          break L1;
                        } else {
                          break L49;
                        }
                      }
                    }
                    param1.c(this.field_p, 68);
                    break L1;
                  }
                  param1.c(this.field_j, op.field_m.a((byte) 32, this.field_j, 500), -2);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L35;
                  }
                }
                param1.b(this.field_j, 0, op.field_m.a((byte) 32, this.field_j, 750));
                if (var7 == 0) {
                  break L1;
                } else {
                  break L34;
                }
              }
              var3_ref = op.field_m.a(this.field_l, (byte) 33);
              if (!(var3_ref instanceof wb)) {
                break L1;
              } else {
                if (37 == this.field_o) {
                  var8 = (wb) ((Object) var3_ref);
                  var8.field_ib = this.field_j;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L50: {
              if (param0 == 0) {
                break L50;
              } else {
                wf.a(11);
                break L50;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L51: {
            var3 = decompiledCaughtException;
            stackOut_131_0 = (RuntimeException) (var3);
            stackOut_131_1 = new StringBuilder().append("wf.D(").append(param0).append(',');
            stackIn_133_0 = stackOut_131_0;
            stackIn_133_1 = stackOut_131_1;
            stackIn_132_0 = stackOut_131_0;
            stackIn_132_1 = stackOut_131_1;
            if (param1 == null) {
              stackOut_133_0 = (RuntimeException) ((Object) stackIn_133_0);
              stackOut_133_1 = (StringBuilder) ((Object) stackIn_133_1);
              stackOut_133_2 = "null";
              stackIn_134_0 = stackOut_133_0;
              stackIn_134_1 = stackOut_133_1;
              stackIn_134_2 = stackOut_133_2;
              break L51;
            } else {
              stackOut_132_0 = (RuntimeException) ((Object) stackIn_132_0);
              stackOut_132_1 = (StringBuilder) ((Object) stackIn_132_1);
              stackOut_132_2 = "{...}";
              stackIn_134_0 = stackOut_132_0;
              stackIn_134_1 = stackOut_132_1;
              stackIn_134_2 = stackOut_132_2;
              break L51;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_134_0), stackIn_134_2 + ')');
        }
    }

    wf() {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        super.a(param2 + 32, param1);
        if (param6 != 255) {
        }
        this.field_j = param7;
        this.field_p = param4;
        this.field_i = false;
        this.field_o = param3;
        this.field_q = param6;
        if (param2 != -32) {
            this.field_o = 121;
        }
        this.field_l = param5;
        this.field_s = param0;
        if (this.field_l == 65535) {
            this.field_l = -1;
        }
        if ((this.field_p ^ -1) == -65536) {
            this.field_p = -1;
        }
        if (!((this.field_s ^ -1) != -65536)) {
            this.field_s = -1;
        }
    }

    public static void c(int param0) {
        field_k = null;
        field_r = null;
        if (param0 != 17) {
            field_k = (String) null;
        }
        field_n = null;
    }

    final void a(byte param0) {
        super.a((byte) -86);
        dg.field_K.a((br) (this), false);
        if (param0 > -47) {
            qd var3 = (qd) null;
            this.a(96, (qd) null);
        }
    }

    static {
        field_k = "Yes";
        field_t = 1;
        field_r = "Please remove <%0> from your ignore list first.";
        field_n = "Log in / Create account";
    }
}
