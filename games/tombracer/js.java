/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class js extends dr {
    private ppa field_h;
    private int field_e;
    private hha field_q;
    private qda field_u;
    private ji field_p;
    private byte[] field_n;
    private int field_t;
    private int field_j;
    private byte[] field_o;
    static int field_l;
    static ft field_g;
    private ss field_i;
    static jea field_d;
    private ppa field_s;
    private dla field_k;
    private int field_m;
    private boolean field_r;
    private vna field_f;
    private vna field_b;
    private boolean field_w;
    private boolean field_v;
    private long field_c;

    final byte[] a(int param0, byte param1) {
        hha var3 = this.a(0, -116, param0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.b((byte) -126);
        if (param1 != -39) {
            return (byte[]) null;
        }
        var3.p(param1 + 124);
        return var4;
    }

    final void b(int param0) {
        hha discarded$6 = null;
        hha discarded$7 = null;
        hha discarded$8 = null;
        hha discarded$9 = null;
        hha discarded$10 = null;
        hha discarded$11 = null;
        int var2_int = 0;
        hha var2 = null;
        vg var3 = null;
        int var4 = 0;
        int var5 = 0;
        vg var6 = null;
        vg var7 = null;
        byte stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_42_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        boolean stackIn_71_0 = false;
        int stackIn_81_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        int stackIn_129_0 = 0;
        int stackIn_129_1 = 0;
        int stackIn_130_0 = 0;
        int stackIn_130_1 = 0;
        byte stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_128_0 = 0;
        int stackOut_128_1 = 0;
        int stackOut_129_0 = 0;
        int stackOut_129_1 = 0;
        int stackOut_41_0 = 0;
        int stackOut_41_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        boolean stackOut_70_0 = false;
        int stackOut_80_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        L0: {
          L1: {
            var5 = TombRacer.field_G ? 1 : 0;
            if (null != this.field_f) {
              if (this.a(true) == null) {
                return;
              } else {
                L2: {
                  if (this.field_w) {
                    break L2;
                  } else {
                    L3: {
                      if (this.field_r) {
                        break L3;
                      } else {
                        this.field_f = null;
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = this.field_f.f(param0 ^ -936);
                    L4: while (true) {
                      L5: {
                        L6: {
                          if (var3 == null) {
                            break L6;
                          } else {
                            var4 = (int)var3.field_d;
                            stackOut_11_0 = this.field_n[var4];
                            stackOut_11_1 = 1;
                            stackIn_21_0 = stackOut_11_0;
                            stackIn_21_1 = stackOut_11_1;
                            stackIn_12_0 = stackOut_11_0;
                            stackIn_12_1 = stackOut_11_1;
                            if (var5 != 0) {
                              L7: while (true) {
                                if (stackIn_21_0 >= stackIn_21_1) {
                                  break L5;
                                } else {
                                  stackOut_22_0 = -1;
                                  stackOut_22_1 = this.field_k.field_c[this.field_m] ^ -1;
                                  stackIn_82_0 = stackOut_22_0;
                                  stackIn_82_1 = stackOut_22_1;
                                  stackIn_23_0 = stackOut_22_0;
                                  stackIn_23_1 = stackOut_22_1;
                                  if (var5 != 0) {
                                    break L0;
                                  } else {
                                    L8: {
                                      L9: {
                                        if (stackIn_23_0 != stackIn_23_1) {
                                          break L9;
                                        } else {
                                          this.field_m = this.field_m + 1;
                                          if (var5 == 0) {
                                            break L8;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                      L10: {
                                        if (this.field_u.b(-21)) {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L5;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          break L10;
                                        }
                                      }
                                      L11: {
                                        if (this.field_n[this.field_m] != 1) {
                                          discarded$6 = this.a(2, 126, this.field_m);
                                          break L11;
                                        } else {
                                          break L11;
                                        }
                                      }
                                      L12: {
                                        if (-2 != (this.field_n[this.field_m] ^ -1)) {
                                          var6 = new vg();
                                          var6.field_d = (long)this.field_m;
                                          this.field_f.b((byte) -96, var6);
                                          var2_int = 0;
                                          break L12;
                                        } else {
                                          break L12;
                                        }
                                      }
                                      this.field_m = this.field_m + 1;
                                      if (var5 == 0) {
                                        break L8;
                                      } else {
                                        break L5;
                                      }
                                    }
                                    stackOut_20_0 = this.field_k.field_c.length ^ -1;
                                    stackOut_20_1 = this.field_m ^ -1;
                                    stackIn_21_0 = stackOut_20_0;
                                    stackIn_21_1 = stackOut_20_1;
                                    continue L7;
                                  }
                                }
                              }
                            } else {
                              L13: {
                                if (stackIn_12_0 == stackIn_12_1) {
                                  break L13;
                                } else {
                                  discarded$7 = this.a(2, -52, var4);
                                  break L13;
                                }
                              }
                              L14: {
                                L15: {
                                  if (-2 != (this.field_n[var4] ^ -1)) {
                                    break L15;
                                  } else {
                                    var3.p(41);
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
                              var3 = this.field_f.e(116);
                              if (var5 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                        L16: while (true) {
                          stackOut_132_0 = this.field_k.field_c.length ^ -1;
                          stackOut_132_1 = this.field_m ^ -1;
                          stackIn_130_0 = stackOut_132_0;
                          stackIn_130_1 = stackOut_132_1;
                          if (stackIn_130_0 >= stackIn_130_1) {
                            break L5;
                          } else {
                            stackOut_128_0 = -1;
                            stackOut_128_1 = this.field_k.field_c[this.field_m] ^ -1;
                            stackIn_82_0 = stackOut_128_0;
                            stackIn_82_1 = stackOut_128_1;
                            stackIn_129_0 = stackOut_128_0;
                            stackIn_129_1 = stackOut_128_1;
                            if (var5 != 0) {
                              break L0;
                            } else {
                              stackOut_129_0 = stackIn_129_0;
                              stackOut_129_1 = stackIn_129_1;
                              stackIn_126_0 = stackOut_129_0;
                              stackIn_126_1 = stackOut_129_1;
                              L17: {
                                if (stackIn_126_0 != stackIn_126_1) {
                                  break L17;
                                } else {
                                  this.field_m = this.field_m + 1;
                                  if (var5 == 0) {
                                    continue L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                if (this.field_u.b(-21)) {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L5;
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                if (this.field_n[this.field_m] != 1) {
                                  discarded$8 = this.a(2, 126, this.field_m);
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              L20: {
                                if (-2 != (this.field_n[this.field_m] ^ -1)) {
                                  var6 = new vg();
                                  var6.field_d = (long)this.field_m;
                                  this.field_f.b((byte) -96, var6);
                                  var2_int = 0;
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              this.field_m = this.field_m + 1;
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
                          this.field_m = 0;
                          this.field_r = false;
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
                var2_int = 1;
                var3 = this.field_f.f(-80);
                L22: while (true) {
                  L23: {
                    L24: {
                      if (var3 == null) {
                        break L24;
                      } else {
                        var4 = (int)var3.field_d;
                        stackOut_41_0 = this.field_n[var4] ^ -1;
                        stackOut_41_1 = -1;
                        stackIn_51_0 = stackOut_41_0;
                        stackIn_51_1 = stackOut_41_1;
                        stackIn_42_0 = stackOut_41_0;
                        stackIn_42_1 = stackOut_41_1;
                        if (var5 != 0) {
                          L25: while (true) {
                            if (stackIn_51_0 >= stackIn_51_1) {
                              break L23;
                            } else {
                              stackOut_52_0 = -1;
                              stackOut_52_1 = this.field_k.field_c[this.field_m] ^ -1;
                              stackIn_82_0 = stackOut_52_0;
                              stackIn_82_1 = stackOut_52_1;
                              stackIn_53_0 = stackOut_52_0;
                              stackIn_53_1 = stackOut_52_1;
                              if (var5 != 0) {
                                break L0;
                              } else {
                                L26: {
                                  L27: {
                                    if (stackIn_53_0 == stackIn_53_1) {
                                      this.field_m = this.field_m + 1;
                                      if (var5 == 0) {
                                        break L26;
                                      } else {
                                        break L27;
                                      }
                                    } else {
                                      break L27;
                                    }
                                  }
                                  L28: {
                                    if (-251 < (this.field_i.field_b ^ -1)) {
                                      break L28;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L23;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  L29: {
                                    if (0 != this.field_n[this.field_m]) {
                                      break L29;
                                    } else {
                                      discarded$9 = this.a(1, param0 ^ -988, this.field_m);
                                      break L29;
                                    }
                                  }
                                  L30: {
                                    if (0 == this.field_n[this.field_m]) {
                                      var7 = new vg();
                                      var7.field_d = (long)this.field_m;
                                      var2_int = 0;
                                      this.field_f.b((byte) -91, var7);
                                      break L30;
                                    } else {
                                      break L30;
                                    }
                                  }
                                  this.field_m = this.field_m + 1;
                                  if (var5 == 0) {
                                    break L26;
                                  } else {
                                    break L23;
                                  }
                                }
                                stackOut_50_0 = this.field_m;
                                stackOut_50_1 = this.field_k.field_c.length;
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                continue L25;
                              }
                            }
                          }
                        } else {
                          L31: {
                            if (stackIn_42_0 != stackIn_42_1) {
                              break L31;
                            } else {
                              discarded$10 = this.a(1, param0 ^ -991, var4);
                              break L31;
                            }
                          }
                          L32: {
                            L33: {
                              if (this.field_n[var4] == 0) {
                                break L33;
                              } else {
                                var3.p(116);
                                if (var5 == 0) {
                                  break L32;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            var2_int = 0;
                            break L32;
                          }
                          var3 = this.field_f.e(124);
                          if (var5 == 0) {
                            continue L22;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    L34: while (true) {
                      stackOut_107_0 = this.field_m;
                      stackOut_107_1 = this.field_k.field_c.length;
                      stackIn_105_0 = stackOut_107_0;
                      stackIn_105_1 = stackOut_107_1;
                      if (stackIn_105_0 >= stackIn_105_1) {
                        break L23;
                      } else {
                        stackOut_103_0 = -1;
                        stackOut_103_1 = this.field_k.field_c[this.field_m] ^ -1;
                        stackIn_82_0 = stackOut_103_0;
                        stackIn_82_1 = stackOut_103_1;
                        stackIn_104_0 = stackOut_103_0;
                        stackIn_104_1 = stackOut_103_1;
                        if (var5 != 0) {
                          break L0;
                        } else {
                          stackOut_104_0 = stackIn_104_0;
                          stackOut_104_1 = stackIn_104_1;
                          stackIn_101_0 = stackOut_104_0;
                          stackIn_101_1 = stackOut_104_1;
                          L35: {
                            if (stackIn_101_0 == stackIn_101_1) {
                              this.field_m = this.field_m + 1;
                              if (var5 == 0) {
                                continue L34;
                              } else {
                                break L35;
                              }
                            } else {
                              break L35;
                            }
                          }
                          L36: {
                            if (-251 < (this.field_i.field_b ^ -1)) {
                              break L36;
                            } else {
                              var2_int = 0;
                              if (var5 == 0) {
                                break L23;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L37: {
                            if (0 != this.field_n[this.field_m]) {
                              break L37;
                            } else {
                              discarded$11 = this.a(1, param0 ^ -988, this.field_m);
                              break L37;
                            }
                          }
                          L38: {
                            if (0 == this.field_n[this.field_m]) {
                              var7 = new vg();
                              var7.field_d = (long)this.field_m;
                              var2_int = 0;
                              this.field_f.b((byte) -91, var7);
                              break L38;
                            } else {
                              break L38;
                            }
                          }
                          this.field_m = this.field_m + 1;
                          if (var5 == 0) {
                            continue L34;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                  }
                  if (var2_int == 0) {
                    break L1;
                  } else {
                    this.field_m = 0;
                    this.field_w = false;
                    break L1;
                  }
                }
              }
            } else {
              break L1;
            }
          }
          L39: {
            L40: {
              if (!this.field_v) {
                break L40;
              } else {
                if ((this.field_c ^ -1L) < (bva.b((byte) -107) ^ -1L)) {
                  break L40;
                } else {
                  var2 = (hha) ((Object) this.field_p.d(param0 + -1000));
                  L41: while (true) {
                    L42: {
                      if (var2 == null) {
                        break L42;
                      } else {
                        stackOut_70_0 = var2.field_m;
                        stackIn_81_0 = stackOut_70_0 ? 1 : 0;
                        stackIn_71_0 = stackOut_70_0;
                        if (var5 != 0) {
                          break L39;
                        } else {
                          L43: {
                            if (stackIn_71_0) {
                              break L43;
                            } else {
                              L44: {
                                if (!var2.field_k) {
                                  break L44;
                                } else {
                                  if (!var2.field_l) {
                                    throw new RuntimeException();
                                  } else {
                                    var2.p(46);
                                    if (var5 == 0) {
                                      break L43;
                                    } else {
                                      break L44;
                                    }
                                  }
                                }
                              }
                              var2.field_k = true;
                              break L43;
                            }
                          }
                          var2 = (hha) ((Object) this.field_p.c(20806));
                          if (var5 == 0) {
                            continue L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                    }
                    this.field_c = 1000L + bva.b((byte) -107);
                    break L40;
                  }
                }
              }
            }
            stackOut_80_0 = param0;
            stackIn_81_0 = stackOut_80_0;
            break L39;
          }
          stackOut_81_0 = stackIn_81_0;
          stackOut_81_1 = 1000;
          stackIn_82_0 = stackOut_81_0;
          stackIn_82_1 = stackOut_81_1;
          break L0;
        }
        L45: {
          if (stackIn_82_0 == stackIn_82_1) {
            break L45;
          } else {
            this.field_c = -79L;
            break L45;
          }
        }
    }

    final static void a(double param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -256) {
                break L1;
              } else {
                js.a(0.721841364009857, 28);
                break L1;
              }
            }
            L2: {
              if (param0 == ed.field_a) {
                break L2;
              } else {
                var3_int = 0;
                L3: while (true) {
                  L4: {
                    if (-257 >= (var3_int ^ -1)) {
                      break L4;
                    } else {
                      var4 = (int)(Math.pow((double)var3_int / 255.0, param0) * 255.0);
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          stackOut_7_0 = sk.field_c;
                          stackOut_7_1 = var3_int;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          if ((var4 ^ -1) < -256) {
                            stackOut_9_0 = (int[]) ((Object) stackIn_9_0);
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = 255;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            break L5;
                          } else {
                            stackOut_8_0 = (int[]) ((Object) stackIn_8_0);
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = var4;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            stackIn_10_2 = stackOut_8_2;
                            break L5;
                          }
                        }
                        stackIn_10_0[stackIn_10_1] = stackIn_10_2;
                        var3_int++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  ed.field_a = param0;
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "js.G(" + param0 + ',' + param1 + ')');
        }
    }

    final int b(int param0, int param1) {
        byte[] discarded$0 = null;
        if (param0 != 27079) {
            discarded$0 = this.a(115, (byte) -96);
        }
        hha var3 = (hha) ((Object) this.field_p.a((byte) -104, (long)param1));
        if (var3 == null) {
            return 0;
        }
        return var3.a((byte) -115);
    }

    final void c(int param0) {
        hha discarded$4 = null;
        hha discarded$5 = null;
        vg var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_f != null) {
          if (null == this.a(true)) {
            return;
          } else {
            var2 = this.field_b.f(-80);
            L0: while (true) {
              L1: {
                L2: {
                  if (var2 == null) {
                    break L2;
                  } else {
                    var3 = (int)var2.field_d;
                    stackOut_7_0 = 0;
                    stackOut_7_1 = var3;
                    stackIn_25_0 = stackOut_7_0;
                    stackIn_25_1 = stackOut_7_1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    if (var4 != 0) {
                      break L1;
                    } else {
                      L3: {
                        L4: {
                          L5: {
                            if (stackIn_8_0 > stackIn_8_1) {
                              break L5;
                            } else {
                              if ((this.field_k.field_l ^ -1) >= (var3 ^ -1)) {
                                break L5;
                              } else {
                                if ((this.field_k.field_c[var3] ^ -1) != -1) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                          var2.p(91);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          if (-1 == (this.field_n[var3] ^ -1)) {
                            discarded$4 = this.a(1, 124, var3);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (this.field_n[var3] == -1) {
                            discarded$5 = this.a(2, param0 + 28590, var3);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        if (1 == this.field_n[var3]) {
                          var2.p(71);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var2 = this.field_b.e(param0 ^ -28599);
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_24_0 = param0;
                stackOut_24_1 = -28613;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L1;
              }
              L8: {
                if (stackIn_25_0 == stackIn_25_1) {
                  break L8;
                } else {
                  this.field_s = (ppa) null;
                  break L8;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_d = null;
        if (param0 != -50) {
            field_g = (ft) null;
        }
    }

    final void a(byte param0) {
        if (!(null != this.field_h)) {
            return;
        }
        this.field_r = true;
        if (null == this.field_f) {
            this.field_f = new vna();
        }
        if (param0 != 115) {
            js.b((byte) 13);
        }
    }

    final dla a(boolean param0) {
        sga discarded$1 = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        if (this.field_k != null) {
          return this.field_k;
        } else {
          L0: {
            if (this.field_q != null) {
              break L0;
            } else {
              if (!this.field_u.d(-21)) {
                this.field_q = (hha) ((Object) this.field_u.a(this.field_j, true, 255, -21, (byte) 0));
                break L0;
              } else {
                return null;
              }
            }
          }
          L1: {
            if (param0) {
              break L1;
            } else {
              this.a((byte) -56);
              break L1;
            }
          }
          if (!this.field_q.field_m) {
            L2: {
              var7 = this.field_q.b((byte) -126);
              var6 = var7;
              var5 = var6;
              var2 = var5;
              if (!(this.field_q instanceof sga)) {
                try {
                  L3: {
                    if (var5 == null) {
                      throw new RuntimeException();
                    } else {
                      this.field_k = new dla(var7, this.field_t, this.field_o);
                      break L3;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var3 = decompiledCaughtException;
                    this.field_u.e(-1);
                    this.field_k = null;
                    if (!this.field_u.d(-21)) {
                      break L4;
                    } else {
                      this.field_q = null;
                      if (var4 != 0) {
                        break L4;
                      } else {
                        return null;
                      }
                    }
                  }
                  this.field_q = (hha) ((Object) this.field_u.a(this.field_j, true, 255, -21, (byte) 0));
                  return null;
                }
                if (this.field_s != null) {
                  discarded$1 = this.field_i.a(false, this.field_j, this.field_s, var7);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                try {
                  L5: {
                    if (var5 != null) {
                      this.field_k = new dla(var7, this.field_t, this.field_o);
                      if (this.field_k.field_a == this.field_e) {
                        break L5;
                      } else {
                        throw new RuntimeException();
                      }
                    } else {
                      throw new RuntimeException();
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L6: {
                    var3 = decompiledCaughtException;
                    this.field_k = null;
                    if (!this.field_u.d(-21)) {
                      break L6;
                    } else {
                      this.field_q = null;
                      if (var4 != 0) {
                        break L6;
                      } else {
                        return null;
                      }
                    }
                  }
                  this.field_q = (hha) ((Object) this.field_u.a(this.field_j, true, 255, -21, (byte) 0));
                  return null;
                }
                break L2;
              }
            }
            L7: {
              if (this.field_h != null) {
                this.field_n = new byte[this.field_k.field_l];
                break L7;
              } else {
                break L7;
              }
            }
            this.field_q = null;
            return this.field_k;
          } else {
            return null;
          }
        }
    }

    private final hha a(int param0, int param1, int param2) {
        sga discarded$1 = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        Exception var7 = null;
        RuntimeException var7_ref = null;
        int var7_int = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        hha var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte stackIn_48_0 = 0;
        byte stackIn_48_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        Object stackIn_61_0 = null;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_92_0 = 0;
        int stackIn_92_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        byte stackOut_91_0 = 0;
        int stackOut_91_1 = 0;
        byte stackOut_47_0 = 0;
        byte stackOut_47_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        Object stackOut_60_0 = null;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var12 = (hha) ((Object) this.field_p.a((byte) -124, (long)param2));
          var4 = var12;
          if (var12 == null) {
            break L0;
          } else {
            if (param0 != 0) {
              break L0;
            } else {
              if (var12.field_l) {
                break L0;
              } else {
                if (var12.field_m) {
                  var12.p(12);
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
          if (var4 != null) {
            break L1;
          } else {
            L2: {
              L3: {
                if ((param0 ^ -1) != -1) {
                  break L3;
                } else {
                  L4: {
                    if (null == this.field_h) {
                      break L4;
                    } else {
                      if (this.field_n[param2] != -1) {
                        var4 = this.field_i.a(15871, this.field_h, param2);
                        if (var11 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!this.field_u.d(-21)) {
                    var4 = this.field_u.a(param2, true, this.field_j, -21, (byte) 2);
                    if (var11 == 0) {
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
              if (param0 == 1) {
                if (this.field_h == null) {
                  throw new RuntimeException();
                } else {
                  var4 = this.field_i.a((byte) -50, param2, this.field_h);
                  break L2;
                }
              } else {
                L5: {
                  if ((param0 ^ -1) != -3) {
                    break L5;
                  } else {
                    if (this.field_h == null) {
                      throw new RuntimeException();
                    } else {
                      if ((this.field_n[param2] ^ -1) != 0) {
                        throw new RuntimeException();
                      } else {
                        if (!this.field_u.b(-21)) {
                          var4 = this.field_u.a(param2, false, this.field_j, -21, (byte) 2);
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        } else {
                          return null;
                        }
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            }
            this.field_p.a((long)param2, 118, (vg) (var4));
            break L1;
          }
        }
        if (!((hha) (var4)).field_m) {
          var18 = ((hha) (var4)).b((byte) -126);
          var13 = var18;
          var5 = var13;
          var6 = 8 / ((57 - param1) / 63);
          if (!(var4 instanceof sga)) {
            try {
              L6: {
                L7: {
                  if (var5 == null) {
                    break L7;
                  } else {
                    if (var18.length <= 2) {
                      break L7;
                    } else {
                      vf.field_g.reset();
                      vf.field_g.update(var5, 0, var18.length + -2);
                      var7_int = (int)vf.field_g.getValue();
                      if (var7_int == this.field_k.field_j[param2]) {
                        L8: {
                          if (this.field_k.field_h == null) {
                            break L8;
                          } else {
                            if (this.field_k.field_h[param2] == null) {
                              break L8;
                            } else {
                              var30 = this.field_k.field_h[param2];
                              var29 = fja.a(var18.length + -2, var18, 0, 8);
                              var10 = 0;
                              L9: while (true) {
                                if (-65 >= (var10 ^ -1)) {
                                  break L8;
                                } else {
                                  stackOut_77_0 = var29[var10] ^ -1;
                                  stackOut_77_1 = var30[var10] ^ -1;
                                  stackIn_92_0 = stackOut_77_0;
                                  stackIn_92_1 = stackOut_77_1;
                                  stackIn_78_0 = stackOut_77_0;
                                  stackIn_78_1 = stackOut_77_1;
                                  if (var11 != 0) {
                                    decompiledRegionSelector0 = 0;
                                    break L6;
                                  } else {
                                    if (stackIn_78_0 == stackIn_78_1) {
                                      var10++;
                                      if (var11 == 0) {
                                        continue L9;
                                      } else {
                                        break L8;
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
                        this.field_u.field_a = 0;
                        this.field_u.field_n = 0;
                        decompiledRegionSelector0 = 1;
                        break L6;
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
              var7_ref = (RuntimeException) (Object) decompiledCaughtException;
              this.field_u.e(-1);
              ((hha) (var4)).p(82);
              if (((hha) (var4)).field_l) {
                L10: {
                  if (!this.field_u.d(-21)) {
                    var4 = this.field_u.a(param2, true, this.field_j, -21, (byte) 2);
                    this.field_p.a((long)param2, 125, (vg) (var4));
                    break L10;
                  } else {
                    break L10;
                  }
                }
                return null;
              } else {
                return null;
              }
            }
            L11: {
              L12: {
                if (decompiledRegionSelector0 == 0) {
                  break L12;
                } else {
                  var5[-2 + var18.length] = (byte)(this.field_k.field_f[param2] >>> -490639832);
                  var5[-1 + var18.length] = (byte)this.field_k.field_f[param2];
                  if (null != this.field_h) {
                    discarded$1 = this.field_i.a(false, param2, this.field_h, var18);
                    stackOut_91_0 = this.field_n[param2];
                    stackOut_91_1 = 1;
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    break L12;
                  } else {
                    break L11;
                  }
                }
              }
              if (stackIn_92_0 == stackIn_92_1) {
                break L11;
              } else {
                this.field_n[param2] = (byte) 1;
                break L11;
              }
            }
            L13: {
              if (((hha) (var4)).field_l) {
                break L13;
              } else {
                ((hha) (var4)).p(125);
                break L13;
              }
            }
            return (hha) (var4);
          } else {
            try {
              L14: {
                L15: {
                  if (var5 == null) {
                    break L15;
                  } else {
                    if (2 >= var18.length) {
                      break L15;
                    } else {
                      vf.field_g.reset();
                      vf.field_g.update(var5, 0, var18.length - 2);
                      var7_int = (int)vf.field_g.getValue();
                      if ((var7_int ^ -1) == (this.field_k.field_j[param2] ^ -1)) {
                        L16: {
                          L17: {
                            if (null == this.field_k.field_h) {
                              break L17;
                            } else {
                              if (this.field_k.field_h[param2] != null) {
                                var27 = this.field_k.field_h[param2];
                                var28 = fja.a(-2 + var18.length, var18, 0, 8);
                                var10 = 0;
                                L18: while (true) {
                                  if (64 <= var10) {
                                    break L17;
                                  } else {
                                    stackOut_47_0 = var27[var10];
                                    stackOut_47_1 = var28[var10];
                                    stackIn_52_0 = stackOut_47_0;
                                    stackIn_52_1 = stackOut_47_1;
                                    stackIn_48_0 = stackOut_47_0;
                                    stackIn_48_1 = stackOut_47_1;
                                    if (var11 != 0) {
                                      break L16;
                                    } else {
                                      if (stackIn_48_0 == stackIn_48_1) {
                                        var10++;
                                        if (var11 == 0) {
                                          continue L18;
                                        } else {
                                          break L17;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L17;
                              }
                            }
                          }
                          stackOut_51_0 = 255 & var5[var18.length - 1];
                          stackOut_51_1 = 65280 & var5[var18.length - 2] << 1590165512;
                          stackIn_52_0 = stackOut_51_0;
                          stackIn_52_1 = stackOut_51_1;
                          break L16;
                        }
                        var8 = stackIn_52_0 + stackIn_52_1;
                        if ((65535 & this.field_k.field_f[param2] ^ -1) == (var8 ^ -1)) {
                          L19: {
                            if (1 != this.field_n[param2]) {
                              L20: {
                                if ((this.field_n[param2] ^ -1) != -1) {
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              this.field_n[param2] = (byte) 1;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          L21: {
                            if (((hha) (var4)).field_l) {
                              break L21;
                            } else {
                              ((hha) (var4)).p(70);
                              break L21;
                            }
                          }
                          stackOut_60_0 = var4;
                          stackIn_61_0 = stackOut_60_0;
                          break L14;
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                throw new RuntimeException();
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var7 = (Exception) (Object) decompiledCaughtException;
              this.field_n[param2] = (byte)-1;
              ((hha) (var4)).p(53);
              if (((hha) (var4)).field_l) {
                if (!this.field_u.d(-21)) {
                  var4 = this.field_u.a(param2, true, this.field_j, -21, (byte) 2);
                  this.field_p.a((long)param2, 117, (vg) (var4));
                  return null;
                } else {
                  return null;
                }
              } else {
                return null;
              }
            }
            return (hha) ((Object) stackIn_61_0);
          }
        } else {
          return null;
        }
    }

    js(int param0, ppa param1, ppa param2, qda param3, ss param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_p = new ji(16);
        this.field_m = 0;
        this.field_b = new vna();
        this.field_c = 0L;
        try {
          L0: {
            L1: {
              L2: {
                this.field_h = param1;
                this.field_j = param0;
                if (this.field_h != null) {
                  break L2;
                } else {
                  this.field_w = false;
                  if (!TombRacer.field_G) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_w = true;
              this.field_f = new vna();
              break L1;
            }
            L3: {
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
              ((js) (this)).field_v = stackIn_7_1 != 0;
              this.field_e = param7;
              this.field_i = param4;
              this.field_s = param2;
              this.field_t = param5;
              this.field_u = param3;
              this.field_o = param6;
              if (this.field_s == null) {
                break L4;
              } else {
                this.field_q = (hha) ((Object) this.field_i.a(15871, this.field_s, this.field_j));
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var10);
            stackOut_10_1 = new StringBuilder().append("js.<init>(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          L6: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          L7: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L7;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L7;
            }
          }
          L8: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          L9: {
            stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param5).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param6 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        field_g = new ft(1);
    }
}
